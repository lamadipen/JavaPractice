package GenericsBoundedTypeParameters;

/**
 * Created by dipen on 3/29/2017.
 */
public class BoundedTypeParameters {
    /**
     * Suppose we want to restrict the type of objects that can be used in the parameterized type,
     * for example in a method that compares two objects and we want to make sure that the accepted
     * objects are Comparables. To declare a bounded type parameter, list the type parameter’s name,
     * followed by the extends keyword, followed by its upper bound, similar like below method.
     * The invocation of these methods is similar to unbounded method except that if we will try to
     * use any class that is not Comparable, it will throw compile time error.
     * Bounded type parameters can be used with methods as well as classes and interfaces.
     * Java Generics supports multiple bounds also, i.e <T extends A & B & C>. In this case A can be an
     *  interface or class. If A is class then B and C should be interfaces.
     *  We can’t have more than one class in multiple bounds.
     * **/
    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }
}
