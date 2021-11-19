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
}
