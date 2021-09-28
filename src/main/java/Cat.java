public class Cat implements Domesticatable, Tradable{
    private int age;

    public Cat() {this.age = 1;}

    public void addAge() {
        this.age++;
    }

    public void subtractAge() {
        this.age--;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isKitten() {
        if (age > 1) {
            return false;
        } else { return true; }
    }

    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public int getPrice() {
        if (isKitten()) {
            return 10;
        } else {
            return 5;
        }
    }
}
