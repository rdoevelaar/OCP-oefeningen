import java.io.IOException;

/**
 * Created by nl21995 on 30-9-2016.
 */

class CloseWithException implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new IOException("Closing...");
    }
}

public class SuppressedException {
    // Exception while closing.
    public static void main(String[] args) {

        try (One one = new One(); CloseWithException cwe = new CloseWithException()) {
            throw new Exception("Try again");
        } catch (Exception e) {
            System.out.println("Catched: " + e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Suppressed: " + t);
            }
        } finally {
            System.out.println("Finally again");
        }
    }

}
