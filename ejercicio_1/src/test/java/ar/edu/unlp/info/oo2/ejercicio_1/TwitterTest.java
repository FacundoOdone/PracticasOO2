package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
    
    Twitter twitter;
    
    @BeforeEach
    void setUp() throws Exception {
        twitter = new Twitter(); 
    }
    
    @Test
    void testTwitter() throws Exception {
    	twitter.addUser("Pepe");
    	twitter.addTweet(null, "Pepe es una persona muy grandota");
    	assertEquals(1,twitter.getTweets().size());
    	assertThrows(Exception.class, () -> twitter.addUser("Pepe"));
    }
    
}
