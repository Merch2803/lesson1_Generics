import java.util.ArrayList;

public class Box<T> {
    ArrayList<T> arrayList = new ArrayList<>();

    public float getWeight(ArrayList<T> arrayList) {
        if (arrayList.size() == 0) {
            return 0.f;
        }

        if (arrayList.get(0) instanceof Apple) {
            return arrayList.size() * 1.0f;
        }

        return arrayList.size() * 1.5f;
    }

    public boolean compare(ArrayList<T> arrayList) {

        return getWeight(this.arrayList) == getWeight(arrayList);

    }

    public void addFruitToTheBox(ArrayList<T> arrayList) {
        if (this.arrayList.size() == 0) {
            this.arrayList.addAll(arrayList);
            return;
        }

        if (this.arrayList.get(0) instanceof Apple && arrayList.get(0) instanceof Apple ||
            this.arrayList.get(0) instanceof Orange && arrayList.get(0) instanceof Orange) {
            this.arrayList.addAll(arrayList);
            return;
        }
        else {
            System.out.println("В одной коробке должны быть фрукты одного типа!");
        }
    }

}

