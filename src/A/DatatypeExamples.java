package A;

public class DatatypeExamples {
    public static void main(String[] args) {
        System.out.println("A few examples of data types:");

        int length;
        int width;
        int result;
        float result2;

        length = 5;
        width = 7;

        result = length * width;

        System.out.println("The area is: " + result +"cm²");

        int a, b, c;
        a = 7;
        b = 5;
        c = 3;

        result = a / b;
        System.out.println("result = a / b = 7 / 5 = " + result + "");
        
        result = a = b * 3;
        System.out.println("a = " + a);
        System.out.println("result = 5 * 3 = " + result);

        /*
        a + b = 4 + 5 = 9
        a - b = 4 - 5 = -1
        a * b
        a / b
        a % b
         */

        a = 4;
        b = 5;

        result = a + b ;
        System.out.println("a + b = " + a + " + " + b + " = " + result);

        result = a - b ;
        System.out.println("a - b = " + a + " - " + b + " = " + result);

        result = a * b ;
        System.out.println("a - b = " + a + " * " + b + " = " + result);

        result = a / b ;
        System.out.println("a - b = " + a + " / " + b + " = " + result);

        result = a % b ;
        System.out.println("a - b = " + a + " % " + b + " = " + result);

        a = 11;
        b = 3;

        result = a + b ;
        System.out.println("a + b = " + a + " + " + b + " = " + result);

        result = a - b ;
        System.out.println("a - b = " + a + " - " + b + " = " + result);

        result = a * b ;
        System.out.println("a - b = " + a + " * " + b + " = " + result);

        result = a / b ;
        System.out.println("a - b = " + a + " / " + b + " = " + result);

        result = a % b ;
        System.out.println("a - b = " + a + " % " + b + " = " + result);

        float x, y;
        x = 5;
        y = 3;

        result2 = x + y;
        System.out.println("x + y = " + x + " + " + y + " = " + ( x + y));

        result2 = x - y;
        System.out.println("x - y = " + x + " - " + y + " = " + result2);

        result2 = x * y;
        System.out.println("x * y = " + x + " * " + y + " = " + result2);

        result2 = x / y;
        System.out.println("x / y = " + x + " / " + y + " = " + result2);

        result2 = x % y;
        System.out.println("x % y = " + x + " % " + y + " = " + result2);


    }
}
