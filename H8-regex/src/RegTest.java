import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nl21995 on 16-10-2016.
 */
public class RegTest {
    private static void matchtester(String pattern, String source) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        System.out.println("\nsource: " + source);
        System.out.println(" index: 01234567890123456789\n");
        System.out.println("expression: " + m.pattern());
        System.out.print("match positions: ");
        while (m.find()) {
            System.out.print(m.start() + " ");
        }
        System.out.println("");
    }

    //        Search, parse, and replace strings by using regular expressions, using expression patterns for matching limited
    //        to:.(dot),*(star), +(plus),?,\d,\D,\s,\S,\w,\W,\b.\B,[],().
    /*
        java.util.regex
        Maak eerst een pattern met Pattern.compile(pattern)
        Maak daarna een matcher met pattern.matcher(sourcedata)
        Vind de matches met matcher.find() en de posities met matcher.start() en matcher.end() en matcher.group()

       \d digits
       \D NON-digits
       \s whitespace (tab, newline, carriagereturn of formfeed)
       \S NON-whitespace
       \w word character: any word character (a-z en A-Z, digits or _ )
       \W Non-word characrer (everything else)
       \b word boundary (tussen /w en non-/w en andersom (incl regeleinde))
       \B NON-word boundary (twee \w's of twee non\w's)

       [] Character class: [a-fA-F] = alles wat in a-f valt, lower-of uppercase
       () Matching Group
       . any character
       * zero or more instances
       + one or more instances
       ? 0 of 1 instances

       greedy / relucant / posessive: je hoeft alleen greedy te weten (p440) en dat zijn de *, + en ? quantifiers
       op zichzelf.

     */
    public static void main(String[] args) {

        // Elk karakter in de source wordt maar 1x ge-consumed.
        matchtester("aba", "ababababa"); // levert dus matches op op 0 en 4.

//        \d any digit  \s any whitespace character      \w any word character (a-z en A-Z, digits or _
        matchtester("\\d", "abc1def2jklop1");  // decimalen
        matchtester("\\D", "123Q2");  // alles behalve decimalen

        matchtester("\\b", "&pr#nt"); // Word boundary: tussen /w en not /w (en end of string)
        matchtester("\\B", "&pr#nt"); // NOT Word boundary: dus 2 nevenliggende /w of juist 2 not /w

        matchtester("[Cc]", "Character class"); //Upper of lowercase. op 0, 5 en 10
//        * = zero or more times
        matchtester("A*", "BBB");
        matchtester("CAV*U*", "CA"); // V 0 of meer, U 0 of meer.

        matchtester("\\s","tab(\t), newline(\n), carriagereturn(\r) of formfeed\f");

        matchtester("A?", "AAAA"); // ?=0 of 1 keer

        matchtester("A.?", "AVAN"); // . = any character

        matchtester("A.+B.", "AVANBAS"); // . = any character, + = 1 of meer keren

        matchtester("((A)(B)C)", "ABC");

        matchtester("\\.\\.a","lala..a"); // escape metacharacters om ze letterlijk te laten gelden. (in het pattern, geldt niet voor de source string)
    }
}
