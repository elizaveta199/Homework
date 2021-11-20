package serviceGame;

public class GameManager {
    private Game1 game;

    public GameManager(Game1 game) {
        this.game = game;
    }

    public int playAllGames(int[] speed) {
        int result = 0;
        for (int i = 0; i < speed.length; i++) {
            if (game.isFailed(speed[i])) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }

    public int loser(Movable p1, Movable p2, Game1 game, int rounds) {
        for (int i = 0; i < rounds; i++) {
            if (!game.isFailed(p1.getSpeed())) {
                return -1;
            } else if (!game.isFailed(p2.getSpeed())) {
                return 1;
            }
        }
        return 0;
    }

}
