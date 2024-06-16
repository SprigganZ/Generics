package kz.marlen;

public class App {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox1.transferFruitsTo(appleBox2);

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес appleBox2: " + appleBox2.getWeight());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес orangeBox: " + orangeBox.getWeight());

        System.out.println("Сравнение appleBox2 и orangeBox: " + appleBox2.compare(orangeBox));
    }
}
