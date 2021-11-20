package serviceGame;

public class FastPlayer implements Movable {
    private int startSpeed;
    private int speedStep;
    private int sumSpeed;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
        this.sumSpeed = startSpeed;
    }

    @Override
    public int getSpeed() {
        int temp = sumSpeed;
        sumSpeed = sumSpeed + speedStep;
        return temp;
    }

    public static void main(String[] args) {
        FastPlayer fastPlayer = new FastPlayer(10, 5);
        System.out.println(fastPlayer.getSpeed());
        System.out.println(fastPlayer.getSpeed());
        System.out.println(fastPlayer.getSpeed());
        System.out.println(fastPlayer.getSpeed());


    }
}
