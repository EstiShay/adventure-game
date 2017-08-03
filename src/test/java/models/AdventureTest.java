package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdventureTest {

    @Test
    public void Adventure_createsNewGame_instantiatesCorrectly() throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(true, testAdventure instanceof Adventure);
    }
    @Test
    public void startGame_storyProvided_null () throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(null, testAdventure.startGame());
    }
}