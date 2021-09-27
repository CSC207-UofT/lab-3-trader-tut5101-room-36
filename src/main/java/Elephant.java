public class Elephant implements Tradable, Domesticatable{

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String sound() {
        return "Trumpet and Rumble!";
    }

}
