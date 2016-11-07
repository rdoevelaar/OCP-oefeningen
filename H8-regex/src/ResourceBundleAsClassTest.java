import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by nl21995 on 21-10-2016.
 */
public class ResourceBundleAsClassTest {
    public static void main(String[] args) {
//        Locale locale = Locale.getDefault();
        Locale locale = new Locale("de","de");
        ResourceBundle rb = ResourceBundle.getBundle("BundleAsClass", locale);
        System.out.println(rb.getString("Key1"));
    }
}
