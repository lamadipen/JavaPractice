package GenericCollection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //classCastExceptionTest();
        genericTest();
    }

    /**
     * code compiles fine but throws ClassCastException at runtime
     * because we are trying to cast Object in the list to String
     * whereas one of the element is of type Integer.
     **/
    public static void classCastExceptionTest()
    {
        List list = new ArrayList();
        list.add(1);
        list.add("Dipen");

        for (Object obj: list) {
            String str = (String) obj;
        }

    }

    /**
     * we have specified that the type of elements in the list will be String.
     * So if we try to add any other type of object in the list, the program will
     * throw compile time error. Also notice that in for loop, we don’t need type
     * casting of the element in the list, hence removing the ClassCastException at runtime.
     * **/
    public static void genericTest()
    {
        List<String> list = new ArrayList();
        // compite time checking throws compile time error
        //list.add(1);
        list.add("Dipen");

        for (String obj: list) {
            String str = obj;
        }

    }
}
