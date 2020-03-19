public class PrimitiveTraining {

    // TODO 1 : Change the method 'integer' to return the expected result : int 42
    public static int integer() {
        int number = 42 ;
        return number;
    }

    // TODO 2 : Create a method 'str', result expected : String "Hello"

    public static String str() {
        final String hello = "Hello";
        return hello;
    }
    // TODO 3 : Create a method 'real', result expected : double 3.14

    public static double real() {
        final double doubleNum = 3.14;
        return doubleNum;
    }
    // TODO 4 : Create a method 'bool', result expected : boolean false

    public static boolean bool() {
        boolean boolFalse = false;
        return boolFalse;
    }

    // TODO 5 : Create a method 'nothing', no result expected
    public static String nothing() {
        String s = null;
        return s;
    }
}