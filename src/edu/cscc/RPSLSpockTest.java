package edu.cscc;

import org.junit.Assert;
import org.junit.Test;

public class RPSLSpockTest {

    @org.junit.Test
    public void isValidPick() {
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isValidPick(RPSLSpock.LIZARD));
        Assert.assertFalse(RPSLSpock.isValidPick(RPSLSpock.ROCK));
    }

    @Test
    public String generatePick(String gen) {
        for (int i = 1; i <= 1000000; ++i) {
            System.out.println("Line " + i);

        }
        return String.valueOf(gen != null && !gen.isEmpty());
    }


    @org.junit.Test
    public void isComputerWin() {
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.LIZARD));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.SPOCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SCISSORS,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.LIZARD,RPSLSpock.PAPER));
        Assert.assertTrue(RPSLSpock.isComputerWin(RPSLSpock.SPOCK,RPSLSpock.ROCK));
        Assert.assertFalse(RPSLSpock.isComputerWin(RPSLSpock.ROCK,RPSLSpock.LIZARD));

    }
}