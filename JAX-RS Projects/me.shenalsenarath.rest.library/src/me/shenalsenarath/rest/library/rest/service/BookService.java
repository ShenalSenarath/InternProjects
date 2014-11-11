package me.shenalsenarath.rest.library.rest.service;

import me.shenalsenarath.rest.library.dto.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ejb.*;

@Path("/book")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Stateless
public class BookService {
	@PersistenceContext(unitName="LibraryServer_JAXRS")
    EntityManager entityManager;
    @Context
    private UriInfo uriInfo;

    @POST
    public Response createBook(Book book) {        
          entityManager.persist(book);
          URI uri = uriInfo.getAbsolutePathBuilder().path(book.getId().toString()).build();
          return Response.created(uri).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteBook(@PathParam("id") String id) {
          entityManager.remove(entityManager.find(Book.class, id));
          return Response.noContent().build();
    }

    @GET
    @Path("{id}")
    public Response getBook(@PathParam("id") String id) {
          Book book = entityManager.find(Book.class, id);
          if (book == null) {
                 throw new NotFoundException();
          }
          return Response.ok(book).build();
    }

    @GET
    public Books getBooks() {               
          TypedQuery<Book> query = entityManager.createNamedQuery("Book.findAll",Book.class);
          Books books=new Books(query.getResultList());
          return books;
          //return Response.ok(books).build();
    }
}
