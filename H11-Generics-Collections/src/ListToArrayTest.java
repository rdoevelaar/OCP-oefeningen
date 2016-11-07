import util.ArrayUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nl21995 on 7-11-2016.
 */
public class ListToArrayTest {
    public static void main(String[] args) {
        List<String> sl = new ArrayList<>();
        sl.add("vier");
        sl.add("twee");
        sl.add("een");
        sl.add("drie");

        String[] sa = {};
        sa = sl.toArray(sa);
        System.out.println("List: "+ sl);
        ArrayUtil.showArray(sa);
        sl.add(1,"Henk");  // Vervang element 1 door "Henk". Werkt dit door ni het array?
        System.out.println("List na wijziging: "+ sl);
        ArrayUtil.showArray(sa); // Nee!

        // Array nogmaals maken
        System.out.println("Array na nogmaals toArray():");
        sa = sl.toArray(sa);
        ArrayUtil.showArray(sa);       // Nu dus wel!
    }
}
