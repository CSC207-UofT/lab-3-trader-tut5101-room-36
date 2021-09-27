/* A class that is about car's speed implements the given interfaces.
 */
public class Car implements Drivable, Tradable {
    private int max_speed;

    /**
     * Construct a Car gives the max_speed value of 10.
     */
    public Car() {
        this.max_speed = 10;
    }

    /**
     * Let the car speed up by 1.
     */
    @Override
    public void upgradeSpeed() {
        this.max_speed++;
    }

    /**
     * Let the car slow down by 1.
     */
    @Override
    public void downgradeSpeed() {
        this.max_speed--;
    }

    /**
     * Finds out the car's current max speed.
     *
     * @return max_speed.
     */
    @Override
    public int getMaxSpeed() {
        return this.max_speed;
    }

    /**
     * Get's the car's price.
     *
     * @return the car's price.
     */
    @Override
    public int getPrice() {
        return 100;
    }

    /**
     * Creates a string of the car's max speed..
     *
     * @return the max speed of the car in a string.
     */
    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.max_speed +")";
    }
}
