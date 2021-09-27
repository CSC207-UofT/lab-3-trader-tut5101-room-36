public class Lamborghini implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public Lamborghini() {
        this.maxSpeed = 100;
    }

    @Override
    public String sound() {
        return "Woonnnnn!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed++;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed--;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
