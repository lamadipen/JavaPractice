package com.dipen.reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by dipen on 4/15/2017.
 * https://www.mkyong.com/java/how-to-use-reflection-to-call-java-method-at-runtime/
 */
public class ReflectApp {

    public static void main(String[] args) {
        //no paramater
        Class noparams[] = {};

        //int parameter
        Class[] paramInt = new Class[1];
        paramInt[0] = Integer.TYPE;

        try {
            //loading the AppTest at runtime
            Class cls = Class.forName( "com.dipen.model.AppTest");
            Object obj = cls.newInstance();

            Method method = cls.getDeclaredMethod("printIt",null);
            method.invoke(obj,null);

            //call the printItString method, pass a String param
            method = cls.getDeclaredMethod("printItString", String.class);
            method.invoke(obj, new String("dipen"));

            //call the printItInt method, pass a int param
            method = cls.getDeclaredMethod("printItInt", paramInt);
            method.invoke(obj, 234);

            //call the setCounter method, pass a int param
            method = cls.getDeclaredMethod("setCounter", paramInt);
            method.invoke(obj, 777);

            //call the printCounter method
            method = cls.getDeclaredMethod("printCounter", noparams);
            method.invoke(obj, null);



        } catch (ClassNotFoundException| IllegalAccessException |InstantiationException |NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }

}
