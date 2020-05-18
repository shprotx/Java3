package Lesson1;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    public ArrayList<T> fruits;
    private String typeBox;

    public Box() {
        fruits = new ArrayList<T>();
    }

    public float getWeight() {
        float m = 0;
        for(int i = 0; i < fruits.size(); i++) {
            m += fruits.get(i).weight;
        }
        return m * fruits.size();
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight())
            return true;
        else
            return false;
    }

    public void intersperse(Box box) {
        if (this.typeBox.equals(box.typeBox) || box.typeBox == null) {
            for (int i = 0; i < this.fruits.size(); i++)
                box.fruits.add(this.fruits.get(i));
        }

    }

    public void addFruit(T fruit, int count) {
        for(int i = 0; i < count; i++)
            this.fruits.add(fruit);
        this.typeBox = fruit.type;
    }
}
