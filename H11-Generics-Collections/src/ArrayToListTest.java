import util.ArrayUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nl21995 on 7-11-2016.
 */
public class ArrayToListTest {
    public static void main(String[] args) {
        // Een List gemaakt met de toList methode vanuit een array blijft synchroon
        // met het array.
        String[] sa = {"vier","een","twee","drie"};
        List<String> stringList = Arrays.asList(sa);  // fixed-size !
        System.out.println("Array: ");
        ArrayUtil.showArray(sa);
        System.out.println("List: ");
        System.out.println(stringList);

        // Wijziging in array en list doorvoeren...
        sa[0] = "Achttien";  // Wijzig het array
        stringList.set(3, "laatste");  // Wijzig de List
        System.out.println("Array: ");
        ArrayUtil.showArray(sa);
        System.out.println("List: ");
        System.out.println(stringList);
    }
}
