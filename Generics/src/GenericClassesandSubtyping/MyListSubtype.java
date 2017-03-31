package GenericClassesandSubtyping;

import java.util.List;

/**
 * Created by dipen on 3/29/2017.
 *
 * The subtyping relationship is preserved as long as we don’t change the type argument, below shows
 * an example of multiple type parameters.
 * The subtypes of List<String> can be MyList<String,Object>, MyList<String,Integer> and so on.
 */
public interface MyListSubtype<E,T> extends ListDemo<E>{
}
