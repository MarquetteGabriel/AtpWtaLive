package fr.gmarquette.aptwtalive.model.season;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class LevelTest {

    @Test
    public void getPointsByRank()
    {
        Level level = new Level();
        int points = level.getPointsByRank(TournamentCategory.ATP_GRAND_CHELEM, Rounds.FINALS);
        assertNotEquals(2000, points);
        assertEquals(1300, points);
    }
}