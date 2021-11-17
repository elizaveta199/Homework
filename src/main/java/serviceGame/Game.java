package serviceGame;

import java.util.Arrays;

public class Game {
    boolean isGreenLight;
    int maxSpeed;

    public Game(boolean isGreenLight, int maxSpeed) {
        this.isGreenLight = isGreenLight;
        this.maxSpeed = maxSpeed;
    }

    public String[] winnersNames(String[] players) {
        int size = 0;

        if (!this.isGreenLight) {
            for (int i = 0, j = 1; i < players.length; i++) {
                String winners = players[i];
                String[] parts = winners.split(" ");
                int speed = Integer.parseInt(parts[j]);
                if (speed <= this.maxSpeed) {
                    size = size + 1;
                    System.out.println(size);
                }
            }
            String[] names = new String[size];

            for (int i = 0, j = 1, k = 0; i < players.length; i++) {
                String winners = players[i];
                String[] parts = winners.split(" ");
                int speed = Integer.parseInt(parts[j]);
                if (speed <= this.maxSpeed) {
                    names[k] = parts[j - 1];
                    k = k + 1;
                }
            }
            System.out.println(Arrays.toString(names));
            return names;
        } else {
            size = players.length;
            String[] names = new String[size];
            for (int i = 0, j = 1, k = 0; i < players.length; i++) {
                String winners = players[i];
                String[] parts = winners.split(" ");
                names[k] = parts[j - 1];
                k = k + 1;
            }
            return names;
        }
    }

    public int getCountOutOfTheGame(int[] game) {
        int x = 0;
        if (!this.isGreenLight) {
            for (int speed : game) {
                if (speed > this.maxSpeed) {
                    x++;
                }
            }
        }
        return x;
    }

    public int[] getSpeedOutOfTheGame(int[] game) {
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] > this.maxSpeed) {
                x++;
            }
        }
        int[] speed = new int[x];
        int[] speed2 = {};
        if (!this.isGreenLight) {
            for (int i = 0, p = 0; i < game.length; i++) {
                if (game[i] > this.maxSpeed) {
                    speed[p] = game[i];
                    p = p + 1;
                }
            }
            return speed;
        } else {
          //  System.out.println("Выбывших нет");
        }
        return speed2;
    }

    public int[] getSpeedSurvivors(int[] game) {
        int x = 0;
        for (int i = 0; i < game.length; i++) {
            if (game[i] <= this.maxSpeed) {
                x++;
            }
        }

        if (!this.isGreenLight) {
            int[] speed = new int[x];
            for (int i = 0, p = 0; i < game.length; i++) {
                if (game[i] <= this.maxSpeed) {
                    speed[p] = game[i];
                    p = p + 1;
                }
            }
            return speed;
        } else return game;
    }

}