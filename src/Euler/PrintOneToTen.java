package Euler;

public class PrintOneToTen {
    public static void main(String[] args) {


        System.out.println("printing 1 to 10 psvm");

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("/ printing 1 to 10 psvm");

        System.out.println();

        System.out.println("printing 1 to 10 method");

        returnOneToTen();

        System.out.println("/ printing 1 to 10 method");

    } // psvm

    private static void returnOneToTen() {
        for (int i = 1; i < 10; i++) {

            System.out.println(i);
        }
    }


} // pc
