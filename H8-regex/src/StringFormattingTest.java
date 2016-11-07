/**
 * Created by nl21995 on 18-10-2016.
 */
class KvkNummer {
    private Long kvknummer;
    public KvkNummer(long kvknummer) {
        this.kvknummer = kvknummer;
    }

    public KvkNummer(String kvknummer) {
        this.kvknummer = Long.parseLong(kvknummer);
    }

    @Override
    public String toString() {
        return String.format("%010d", kvknummer);
    }
}

public class StringFormattingTest {

    public static void main(String[] args) {
        KvkNummer k = new KvkNummer("92349239424123123");
        System.out.println(k);
    }
}
