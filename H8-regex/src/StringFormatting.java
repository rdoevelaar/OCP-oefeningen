import java.util.Locale;

/**
 * Created by nl21995 on 20-10-2016.
 */
public class StringFormatting {

    public static void main(String[] args) {
        //  %[arg_index$][flags][width][.precision]conversion char
        // arg_index begint bij 1 (niet bij 0)
        // flags:
        // - left justify
        // + include sign (+/-)
        // 0 pad with zeroes
        // , locale specific group separation
        // ( enclose negative numbers in parentheses
        System.out.println(String.format("%1$s", "ho1", "ho2")); // index begint bij 1

        System.out.println(String.format("%1$-10s","links"));  // width is minimaal aantal karakters dat afgedrukt moet worden.
        System.out.println(String.format("%1$-10s","linksenditismeerdan10"));  // width is minimaal aantal karakters dat afgedrukt moet worden.
        System.out.println(String.format("%1$10s","rechts"));
        System.out.println(String.format("%1$(10d",-3)); // (=negatief tussen haakjes (zonder teken). + voor sign geen effect
        System.out.println(String.format("%1$0(10d",-3)); // 0 = padding met zeroes.
        System.out.println(String.format("%1$,(10d",300000)+ Locale.getDefault().getDisplayName()); // locale specific group sep.

        // Precision: voor floating point
        System.out.println(String.format("%1$3.2f",123.4567));
        // conversion chars:
        // b boolean
        // c char
        // d integer
        // f floating point
        // s string
        System.out.println(String.format("%b",false));
        System.out.println(String.format("%c",'a'));


    }
}
