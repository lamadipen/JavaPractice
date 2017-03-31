package GenericsWildcards;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dipen on 3/30/2017.
 */
public class GenericsLowerboundedWildcard {

    public static void main(String [] args)
    {

    }

    public static void addIntegers(List<? super Integer> list){
       list = new ArrayList<Integer>();
       list = new ArrayList<Number>();
       list = new ArrayList<Object>();
    }
}
