import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main<T> {

    public static void main(String[] args) {

        // 1 задание
        Integer[] array = new Integer[2];
        array[0] = 1;
        array[1] = 2;

        System.out.println(array[0] + " " + array[1]);

        changeTwoElementsOfArray (0, 1, array);
        System.out.println("After swapping elements: ");
        
        System.out.println(array[0] + " " + array[1]);

        // 2 задание
        String[] array2 = new String[] {"Mама", "Папа"};

        List<?> arrayList = new ArrayList<>();
        arrayList = convertingArrayToArrayList(array2);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));


    }

    // метод для выполнения 1 задания
    public static <T> void changeTwoElementsOfArray(int firstIndex, int secondIndex, T[] array) {
        T firstElement = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = firstElement;
    }

    // метод для выполнения 2 задания
    public static <T> List<T> convertingArrayToArrayList(T[] array) {
        return Arrays.asList(array);
    }
}
