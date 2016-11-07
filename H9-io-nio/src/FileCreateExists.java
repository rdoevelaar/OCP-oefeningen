import java.io.File;
import java.io.IOException;

/**
 * Created by nl21995 on 26-10-2016.
 */
public class FileCreateExists {
    public static void main(String[] args) {
        File f = new File("henk");  // als ie niet bestaat, dan ook NIET maken.
                                    // als ie wel bestaat, dan refereren.
        Boolean b=null;
        try {
            System.out.println("File exists: " + f.exists());
            b = f.createNewFile();
            System.out.println("Created file: " + b);
            System.out.println("Pad: " + f.getAbsolutePath());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (!b) {
                b = f.delete();
                System.out.println("Deleted: " + b);
            }
        }
    }


}
