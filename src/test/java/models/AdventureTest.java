package models;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdventureTest {
    @Test
    public void startGame_getResponse_play() throws Exception {
        Adventure testAdventure = new Adventure ();
        assertEquals("a", testAdventure.Adventure());
    }
}