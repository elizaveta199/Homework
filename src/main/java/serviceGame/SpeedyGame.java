package serviceGame;
public class SpeedyGame extends Game1 {
    private int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight); // вызов конструктора родителя
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean isFailed(int speed) {
        boolean isLight = getLight();
        return isLight || speed <= getMaxSpeed();
    }
}


