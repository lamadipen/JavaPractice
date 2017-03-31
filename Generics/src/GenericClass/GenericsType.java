package GenericClass;

/**
 * Created by dipen on 3/29/2017.
 */
public class GenericsType<E> {
    private E t;

    public E get() {
        return t;
    }

    public void set(E t) {
        this.t = t;
    }

    public static void main(String args[]){
        GenericsType<String> type = new GenericsType();
        type.set("Dipen");
        //compile time type checking prevent class cast exception
        //type.set(new Integer(1));
        String str = (String) type.get();
        System.out.println("Non Generic Class");

    }

}
