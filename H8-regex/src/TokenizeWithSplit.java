/**
 * Split doorloopt in 1x alle sourcedata en vult een array met de tokens.
 * De delimiters kunnen meerdere karakters zijn, te matchen met een regex.
 *
 * Als je veel data moet doorzoeken en stoppen wilt zodra je gevonden hebt wat
 * je zocht, kun je beter tokenizen met de Scanner class <code>java.util.Scanner</code>
 */
public class TokenizeWithSplit {

    public static void main(String[] args) {
        String sourcedata = "jaja.neenee.zozo.achja..48";
        System.out.println("Split op: " + sourcedata);

        String[] tokens = sourcedata.split("\\."); // escape de punt om 'm als letterlijke punt te laten werken.
        for (String token:tokens) {
            System.out.println(">"+token+"<");
        }
    }
}
