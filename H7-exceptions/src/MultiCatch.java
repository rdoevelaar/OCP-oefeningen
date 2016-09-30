import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by nl21995 on 30-9-2016.
 */
public class MultiCatch {
    public void couldThrowAnException() throws IOException, SQLException {}

    public static void main(String[] args) throws IOException, SQLException {
        MultiCatch mc = new MultiCatch();
        try {
            mc.couldThrowAnException();
            int fail= 1/(1-1); // Iets anders dan IOException of SQLException.
        } catch (Exception e) {
            System.out.println("Catched exception: " + e);
            System.out.println(e.getClass());
            throw e;

        }
    }
}
