import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nl21995 on 24-10-2016.
 */
public class Opgave8_1 {
    public static void main(String[] args) {
        String regex = "\\d*";
        String source = "ab34ef";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(source);
        boolean b = false;
        while (b=m.find()) {
            System.out.print("s"+m.start() + "g"+m.group());
        }
    }
}
