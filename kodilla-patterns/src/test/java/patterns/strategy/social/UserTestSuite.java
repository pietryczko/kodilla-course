package patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User john = new ZGeneration("John Pete");
        User anny = new YGeneration("Anny Nowak");
        User olaf = new Millenials("Olaf Jacob");

        //When
        String johnPost = john.sharePost();
        String annyPost = anny.sharePost();
        String olafPost = olaf.sharePost();

        //Then
        assertEquals("You send snapchat", johnPost);
        assertEquals("You post a tweet", annyPost);
        assertEquals("You share post", olafPost);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User john = new ZGeneration("John Pete");

        //When
        john.sharePost();
        john.setSocialPublisher(new TwitterPublisher());
        String johnPost = john.sharePost();

        //Then
        assertEquals("You post a tweet", johnPost);
    }
}
