package HausaufgabenTag1;

import HausaufgabenTag1.PKW;

public class Main {
    // Variable setzung der Printline Funktion
    static void print(String text) { System.out.println(text); }

    public static void main(String[] args) {
        // Variableverteilung
        String trennung = "************************************************************";
        String copyright = "© 2022 | Coded by Aljoscha";
        String oMarke = "| Marke: ";
        String oModell = " | Modell: ";
        String oPS = " | PS: ";


        // Attribute vergabe
        PKW pkw1 = new PKW( "Wartburg","353", 50);
        PKW pkw2 = new PKW("VW", "Lupo", 50);
        PKW pkw3 = new PKW("Chevrolet", "Bel Air", 250);

        // String Vereinfachung

        String printpkw1 =  (oMarke + pkw1.getMarke() + oModell + pkw1.getModell() + oPS + pkw1.getPs());
        String printpkw2 =  (oMarke + pkw2.getMarke() + oModell + pkw2.getModell() + oPS + pkw2.getPs());
        String printpkw3 =  (oMarke + pkw3.getMarke() + oModell + pkw3.getModell() + oPS + pkw3.getPs());


        // Output
        print("Folgende Autos stehen zur Verfügung");
        print(trennung);
        print(printpkw1);
        print(printpkw2);
        print(printpkw3);
        print(trennung);
        print(copyright);

    }

}
