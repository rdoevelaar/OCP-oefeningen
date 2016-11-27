package exc13_2;

/**
 * Created by nl21995 on 27-11-2016.
 */
public class Excercise13_2 extends Thread {
    private StringBuffer sb;

    public Excercise13_2(StringBuffer sb) {
        this.sb = sb;
    }

    public void run() {
        synchronized(sb) {
            System.out.println("Tread: " + currentThread().getName());
            for (int i=0;i < 99; i++) {
                System.out.print(sb);
            }
            System.out.println(sb);
            char c = sb.charAt(0);c++;
            System.out.println("Char wordt: " + c);
            sb.setCharAt(0, c);
        }
    }

    public static void main(String[] args) {
        StringBuffer testbuffer = new StringBuffer();
        testbuffer.insert(0,'A');
        System.out.println("Testbuffer = " + testbuffer);

        new Excercise13_2(testbuffer).start();
        new Excercise13_2(testbuffer).start();
        new Excercise13_2(testbuffer).start();
    }
}


