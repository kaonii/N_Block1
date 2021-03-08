public class DemoWiederholungApp {

    // public static => hinnehmen
    // void rückgabetyp => liefert nichts
    // main => name
    // Parameter String[] args
    public static void main(String[] args) {

        //sout
        System.out.println("Hallo am Freitag");

        // Datentypen
        // Primitiven Datentypen (klein geschrieben)
        int ganzzahl = 56; // ganzzahl (deklaration & initialisierung gemeinsam)
        float gleitkommawert = (float) 3.1415; // cast => wandelt einen Typ um
        double pi = 3.1415; // genauere Variante von float
        byte smallValue = 100; // byte -127 ... 128
        boolean ja_oder_nein = true; // true / false
        char character = 'A'; // EIN Zeichen zuweisen, einfaches Hochkomma
        // keine primitive Datentyp
        String text = "Heute ist Freitag, Unterricht bis 12:30, 2 geplante Pausen";

        // Was können diese Datentypen

        int result = 56 * 2;
        System.out.println("result = " + result); //soutv
        System.out.println("result / 10 = " + result / 10);
        int rest = 112 % 10;
        System.out.println("rest von 112 / 10 = " + rest);

        // Ziffernsumme von 112 ==> 1 + 1 + 2 = 4
        /*
            112 % 10 = 2 (x)
            112 / 10 = 11
            11 % 10 = 1 (x)
            11 / 10 = 1
            1 % 10 = 1 (x)
            1 / 10 = 0
            7 + 8 + 9 = 24
            987 % 10 = 7 (x)
            987 / 10 = 98
            98 % 10 = 8 (x)
            98 / 10 = 9
            9 % 10 = 9 (x)
            9 / 10 = 0
         */

        int number = 987;
        int ziffersumme = 0;
        ziffersumme = ziffersumme + (number % 10); // 0 + 7 = 7
        number = number / 10; // number = 98
        ziffersumme = ziffersumme + (number % 10); // 7 + 8 = 15
        number = number / 10; // number = 9
        ziffersumme = ziffersumme + (number % 10); // 15 + 9 = 24
        number = number / 10; // number = 0
        System.out.println("ziffersumme = " + ziffersumme);

        System.out.println("berechneZiffernsumme(987) = " + berechneZiffernsumme(987));
        System.out.println("berechneZiffernsumme(543) = " + berechneZiffernsumme(543));
        System.out.println("berechneZiffernsumme(532) = " + berechneZiffernsumme(532));

    }
    // public static
    // Rückgabetype: void = keine Rückgabe // Datentyp
    // name: klein geschrieben
    // Parameter: entweder keine / Auflistung von Variablen

    /*
        1. Was soll die Methode genau machen / Auftrag? ==> daraus den Namen ableiten
        2. Was braucht die Methode, um ihren Auftrag auszuführen? ==> daraus Parameter ableiten
        3. Was muss die Methode an den Auftraggeber zurückliefern? ==> daraus den Rückgabetyp ableiten
        single purpose
     */

    public static int berechneZiffernsumme(int value) { // Method signature
        int ziffersumme = 0;
        ziffersumme = ziffersumme + (value % 10); // 0 + 7 = 7
        value = value / 10; // number = 98
        ziffersumme = ziffersumme + (value % 10); // 7 + 8 = 15
        value = value / 10; // number = 9
        ziffersumme = ziffersumme + (value % 10); // 15 + 9 = 24
        value = value / 10; // number = 0

        return ziffersumme;
    }
}
