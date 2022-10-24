package fr.uvsq.cprog.roguelike;

import static fr.uvsq.cprog.roguelike.RogueLikeApp.ROGUE_LIKE_APP;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RogueLikeAppTest {
    @Test
    public void testGreetings() {
        assertEquals(ROGUE_LIKE_APP.getGreetings(), "Hello !");
    }
}
