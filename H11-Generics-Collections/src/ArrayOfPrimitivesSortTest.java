import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by nl21995 on 7-11-2016.
 */
public class ArrayOfPrimitivesSortTest {
    // Boek p 610: een array van primitives kun je niet sorteren met een Comparator.
    // Maar wat gebeurt er als je dat probeert?
    public static void main(String[] args) {
        int[] ia = {1,5,3,7,2,9};
        System.out.println("Unsorted array: ");
        showArray(ia);

        System.out.println("Sorted using Arrays.sort without comparator: ");
        Arrays.sort(ia);
        showArray(ia);

        System.out.println("Sorted with comparator: ");
        ArrayComparator ac = new ArrayComparator();
//        Arrays.sort(ia, ac); // <-- Compiler fout!

        // En dit dan?
        System.out.println("Integer-objects array using default sort: ");
        Integer[] ioa = {1,5,3,7,2,9};
        Arrays.sort(ioa);
        showArray(ioa);

        System.out.println("Integer objects array sorted with Comparator class:");
        Arrays.sort(ioa, ac);
        showArray(ioa);
    }

    private static void showArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    private static void showArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    static class ArrayComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);                            // Andersom sorteren voor herkenbaarheid.
        }
    }
}
