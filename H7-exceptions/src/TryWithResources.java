/**
 * Created by nl21995 on 30-9-2016.
 */

class One implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Close - One");
    }
}

class Two implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Close - Two");
    }
}

public class TryWithResources {

    public static void main(String[] args) {
        // Basic flow.
        try (One one = new One(); Two two = new Two()) {  // Alleen ; om meerdere statements te scheiden
            System.out.println("Try");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("Catch");
        } finally {
            System.out.println("Finally");
        }
    }
}

