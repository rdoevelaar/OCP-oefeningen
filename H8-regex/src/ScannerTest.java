import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest {
    public static void scan(String sourcedata, String delimiter, Pattern delimPattern) {
        System.out.println("--- S c a n  s t a r t i n g . . .  ---");
        System.out.println("Source data = '" + sourcedata + "'");
        Scanner s = new Scanner(sourcedata);
        if (delimiter != null) {
            s.useDelimiter(delimiter);
        } else if (delimPattern != null) {
            s.useDelimiter(delimPattern);
        }
        System.out.println("Delimiter = " + (delimiter != null ? delimiter : "spatie"));
        System.out.println("Delimiter pattern = " + (delimPattern != null ? delimPattern : "null"));
        while (s.hasNext()) {
            if (s.hasNextLong()) {
                System.out.print("long  : ");
            } else if (s.hasNextBoolean()) {
                System.out.print("bool  : ");
            } else {
                System.out.print("string: ");
            }
            System.out.println(s.next());
        }
        System.out.println("--- S c a n  c o m p l e t e ---");
    }

    public static void main(String[] args) {
        scan("aha beha ceha", null, null);
        scan("aha true false 493838483 34 mooi", null, null);
        scan("aha beha ceha", "a", null);
        scan("voor tab 1\tna tab 1\thenk, dit is het!", null, Pattern.compile("\\t"));

    }
}
