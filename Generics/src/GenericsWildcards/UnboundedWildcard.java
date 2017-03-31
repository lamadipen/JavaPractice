package GenericsWildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dipen on 3/30/2017.
 */
public class UnboundedWildcard {

    /**
     *
     * @param list
     *
     * Sometimes we have a situation where we want our generic method to be working with all types,
     * in this case unbounded wildcard can be used. Its same as using <? extends Object>.
     *
     * We can provide List<String> or List<Integer> or any other type of Object list argument to the
     * printData method. Similar to upper bound list, we are not allowed to add anything to the list.
     */
    public static void printData(List<?> list)
    {
        for(Object n : list){
           System.out.println(n);
        }

    }
    public static void main(String [] args)
    {
        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        printData(numberList);
    }

}
