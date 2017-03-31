package GenericClass;

/**
 * Created by dipen on 3/29/2017.
 */
public class GenericsTypeOld {
    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    /**
     * @param args
     * we have to use type casting and it can produce ClassCastException at runtime.
     */
    public static void main(String args[]){
        GenericsTypeOld type = new GenericsTypeOld();
        type.set("Dipen");
        type.set(new Integer(1));
        String str = (String) type.get();
        System.out.println("Non Generic Class");

    }
}
