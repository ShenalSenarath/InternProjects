package me.shenalsenarath.rest.library.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import me.shenalsenarath.rest.library.dto.Book;


@XmlRootElement
@XmlSeeAlso(Book.class)
public class Books {
	 private static final long serialVersionUID = 1L;
     public Books() {
      super();
  }
  public Books(Collection<? extends Book> c) {
      super(c);
  }
  @XmlElement(name = "book")
  public List<Book> getBooks() {
      return this;
  }
  public void setBooks(List<Book> books) {
      this.addAll(books);
  }

}
