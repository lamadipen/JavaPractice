package GenericsAndInheritance;

/**
 * Created by dipen on 3/29/2017.
 */
public class GenericsInheritance {
    /**
     *We know that Java inheritance allows us to assign a variable A to another variable B if A is subclass of B.
     * So we might think that any generic type of A can be assigned to generic type of B, but it’s not the case.
     * **/
    public static void main(String[] args) {
        String str = "abc";
        Object obj = new Object();
        obj = str; // works because String is-a Object, inheritance in java

        MyClass<String> myClass1 = new MyClass<String>();
        MyClass<Object> myClass2 = new MyClass<Object>();
        //// compilation error since MyClass<String> is not a MyClass<Object>
        //myClass2=myClass1;

        obj = myClass1;
        obj = myClass2;
    }
    public static class MyClass<T>{}
}
