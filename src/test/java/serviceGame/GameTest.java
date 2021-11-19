package serviceGame;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void playAllGamesInSpeedyGameCase1() {
        Game1 game = new SpeedyGame(false, 5);
        GameManager gm = new GameManager(game);

        int[] playersSpeed = {1, 6, 0, 9};
        int actual = gm.playAllGames(playersSpeed);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void playAllGamesInSpeedyGameCase2() {
        Game1 game = new SpeedyGame(false, 3);
        GameManager gm = new GameManager(game);

        int[] playersSpeed = {0, -7, 9, 9};
        int actual = gm.playAllGames(playersSpeed);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void playAllGamesInSpeedyGameCase3() {
        Game1 game = new SpeedyGame(true, 5);
        GameManager gm = new GameManager(game);

        int[] playersSpeed = {-6, 6, 0, 9};
        int actual = gm.playAllGames(playersSpeed);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void playAllGamesInGameCase1() {
        Game1 game = new Game1(false);
        GameManager gm = new GameManager(game);

        int[] playersSpeed = {1, 4, 0, 9};
        int actual = gm.playAllGames(playersSpeed);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void playAllGamesInGameCase2() {
        Game1 game = new Game1(false);
        GameManager gm = new GameManager(game);

        int[] playersSpeed = {0, 4, 0, 9};
        int actual = gm.playAllGames(playersSpeed);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void playAllGamesInGameCase3() {
        Game1 game = new Game1(true);
        GameManager gm = new GameManager(game);

        int[] playersSpeed = {0, 4, -6, 9};
        int actual = gm.playAllGames(playersSpeed);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase1() {
        SpeedyGame speedyGame = new SpeedyGame(false, 2);

        boolean actual = speedyGame.isFailed(8);
        boolean expected = false;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase2() {
        SpeedyGame speedyGame = new SpeedyGame(false, 6);

        boolean actual = speedyGame.isFailed(4);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase3() {
        SpeedyGame speedyGame = new SpeedyGame(false, 6);

        boolean actual = speedyGame.isFailed(-5);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase4() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);

        boolean actual = speedyGame.isFailed(0);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isFailedCase5() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);

        boolean actual = speedyGame.isFailed(8);
        boolean expected = true;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void winnersNamesCase1() {
        Game game = new Game(false, 4);

        String[] players = {"Kolya 7", "Dasha 9", "Ivan 3"};
        String[] actual = game.winnersNames(players);
        String[] expected = {"Ivan"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void winnersNamesCase2() {
        Game game = new Game(true, 0);

        String[] players = {"Kolya 7", "Dasha 9", "Ivan 3"};
        String[] actual = game.winnersNames(players);
        String[] expected = {"Kolya", "Dasha", "Ivan"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLoseCase1() {
        Game game = new Game(true, 4);

        int[] arr = {5, 0, 9, 7, 0, 6};
        int actual = game.getCountOutOfTheGame(arr);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindLoseCase2() {
        Game game = new Game(true, 4);

        int[] arr = {5, 0, 9, 7, 0, 6};
        int actual = game.getCountOutOfTheGame(arr);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedLoseCase1() {
        Game game = new Game(false, 4);

        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = game.getSpeedOutOfTheGame(arr);
        int[] expected = {5, 9, 7, 6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedLoseCase2() {
        Game game = new Game(true, -8);

        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = game.getSpeedOutOfTheGame(arr);
        int[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedWinCase1() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = new Game(false, 4).getSpeedSurvivors(arr);
        int[] expected = {0, 0};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindSpeedWinICase2() {
        int[] arr = {5, 0, 9, 7, 0, 6};
        int[] actual = new Game(true, 2).getSpeedSurvivors(arr);
        int[] expected = {5, 0, 9, 7, 0, 6};
        Assertions.assertArrayEquals(expected, actual);
    }
}




