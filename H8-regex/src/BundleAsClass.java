import java.util.ListResourceBundle;

/**
 * Created by nl21995 on 21-10-2016.
 */
public class BundleAsClass extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"Key1", "This is the contents of Key 1."}
        };
    }
}
