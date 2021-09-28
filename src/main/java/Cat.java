public class Cat implements Domesticatable, Tradable {

    public String sound() {
        return "Meow!";
    }

    @Override
    public int getPrice() {
        return 5;
    }


}

