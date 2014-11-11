package me.shenalsenarath;


import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        HazelcastInstance hz1 = Hazelcast . newHazelcastInstance ();
        HazelcastInstance hz2 = Hazelcast . newHazelcastInstance ();
        HazelcastInstance hz3 = Hazelcast . newHazelcastInstance ();
        HazelcastInstance hz4 = Hazelcast . newHazelcastInstance ();

    }
}
