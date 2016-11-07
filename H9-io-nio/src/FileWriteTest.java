import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by nl21995 on 26-10-2016.
 */
public class FileWriteTest {

    public static void main(String[] args) throws IOException {
        File f = new File("schrijftest.txt");
        FileWriter fw = new FileWriter(f);    // nog geen createNewFile gedaan!
        fw.write("1234567890");
        fw.write("abcdef", 3,2);
        fw.flush();
        fw.close();

        File appendFile = new File ("appendtest.txt");
        FileWriter appendWriter = new FileWriter(appendFile, true);
        for (int i=0;i<=2;i++) {
            appendWriter.write("Regel " + i + String.format("%n"));
        }
        appendWriter.flush();
        appendWriter.close();
    }

}
