import java.util.TreeSet;

/**
 * Naar aanleiding van opgave 11.15 (p676)
 * Objecten die in een TreeSet worden geplaatst moeten de Comparable interface
 * implementeren.
 * Zo niet: dan runtime exception (en geen compiler error?)?
 *
 * Blijkbaar wordt het toe te voegen object runtime gecast naar Comparable.
 * En treedt er dus een ClassCastException op: Exception in thread "main" java.lang.ClassCastException: Dog cannot be cast to java.lang.Comparable
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<Integer> i = new TreeSet<Integer>();
        TreeSet<Dog> d = new TreeSet<Dog>();

        d.add(new Dog(1));
        d.add(new Dog(2)); d.add(new Dog(1));
        i.add(1); i.add(2); i.add(1);
        System.out.println(d.size() + " " + i.size());
    }

}

class Dog {int size; Dog(int s) {size = s;}}