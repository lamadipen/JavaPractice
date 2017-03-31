package GenericsWildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dipen on 3/30/2017.
 */
public class GenericsUpperBound {

    public static double sumWithOutUpperBound(List<Number> list)
    {
        double sum=0;

        for(Number n : list){
            sum += n.doubleValue();
        }

        return sum;
    }

    public static double sumWithUpperBound(List<? extends Number> list)
    {
        double sum=0;

        for(Number n : list){
            sum += n.doubleValue();
        }

        return sum;
    }


    public static void main(String [] args)
    {
        List<Number> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        sumWithOutUpperBound(numberList);

        List<Integer> integerList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        //Generics does not support inheritance
        //List<Number> is not List<Integer>
        //sumWithOutUpperBound(integerList);

        /** this works Upper bounded wildcards are used to relax the restriction on the type of variable in a method
         *  We use generics wildcard with extends keyword and the upper bound class or interface
         *  that will allow us to pass argument of upper bound or it’s subclasses types.
          */
        sumWithUpperBound(numberList);
        sumWithUpperBound(integerList);

    }

}
