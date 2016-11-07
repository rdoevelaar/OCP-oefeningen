import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by nl21995 on 27-10-2016.
 */
public class PathTest {
    public static void main(String[] args) {
        Path p = Paths.get("c:\\tmp\\");
        Path p2 = Paths.get("sub\\file.txt");
        System.out.println(p.getNameCount());
        System.out.println(p.resolve(p2));

        // p505 oef 2
        Path absolute1 = Paths.get("/home/java");
        Path absolute3 = Paths.get("/home/java/temp/file.bat");
        System.out.println(absolute3.relativize(absolute1));

        Path p3 = Paths.get("/home/java/..");
        Path p4 = Paths.get("/../file.bat");
        System.out.println(p3.relativize(p4));
    }
}
