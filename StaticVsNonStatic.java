package pies;
public class StaticVsNonStatic {
    public static void main(String[] args) {
        System.out.println(quotient(5, 2)); //call to a static method
        StaticVsNonStatic s = new StaticVsNonStatic(); //create object for non-static method
        System.out.println(s.quotientV2(5, 2)); //call to non-static method
    }
    static int quotient(int a, int b) {
        return a / b; //static method
    }
    int quotientV2(int a, int b) {
        return a / b; //non-static method
    }
}

//Non-static: Method belongs to an object
//Static: Method belongs to a class
