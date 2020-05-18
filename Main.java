package Lesson1;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.addFruit(new Apple(), 5);
        box2.addFruit(new Orange(), 4);

        System.out.println(box1.compare(box2));

        box2.intersperse(box3);

        System.out.println(box2.compare(box3));


    }
}
