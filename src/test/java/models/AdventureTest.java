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
    public void rejectMission_gameEndMessage_messageEndProgram () throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(null, testAdventure.rejectMission());
    }
    @Test
    public void acceptMission_gameStart_nextGameStep() throws Exception {
        Adventure testAdventure = new Adventure();
        assertEquals(null, testAdventure.acceptMission());
    }
}