import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by nl21995 on 21-10-2016.
 */
public class ResourceBundlePropertyFile {

    public static void main(String[] args) {
        Locale locale = new Locale("DE","DE");
//        Locale locale = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("Resourcebundle", locale);
        System.out.println(rb.getString("sausage"));
    }
}
