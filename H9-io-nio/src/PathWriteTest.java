import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * Created by nl21995 on 27-10-2016.
 */
public class PathWriteTest {

    public static void main(String[] args) throws IOException {
        Path dir = Paths.get("c:\\tmp\\ergens");        // pad voor directories
        Path bestand = Paths.get("testbestand.txt");    // pad voor bestand
        Files.createDirectories(dir);                   // NIO: File.mkdirs()
        Path absoluut = dir.resolve(bestand);           // Volledige absolute bestandsnaam samenstellen.
        if (Files.deleteIfExists(absoluut)) {
            System.out.println("File is verwijderd want bestond al.");
        } else {
            System.out.println("File bestaat nog niet.");
        }
        Files.createFile(absoluut);                     // bestand aanmaken met volledige pad ervoor.
        System.out.println(absoluut);
        System.out.println("Bestaat '"+ absoluut.toString() + "'? " + Files.exists(absoluut));
        FileWriter fw = new FileWriter(absoluut.toFile());
        fw.write("Een beetje data a day keeps the doctor away");
        fw.flush();fw.close();

        // Aangemaakte bestand kopieren naar andere subdir
        Path nieuweDir = Paths.get("c:\\tmp\\ergensanders");
        Files.createDirectories(nieuweDir);
        Files.copy(absoluut, nieuweDir.resolve("kopietje.txt"), StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);

    }
}
