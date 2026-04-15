public class Quadrat {
    // <datentyp> <name> [= <srartwert>];
    double seitenLaenge = 0;

    // <rueckgabedatentyp> <name>(<parameterliste>) {
    //  ...
    //}
    Quadrat(double pSeitenlaenge) {
        seitenLaenge = pSeitenlaenge;
    }

    Quadrat() {

    }
/*
    void verandernSeitenLaenge(double seitenLaengeNeu) {
        seitenLaenge = seitenLaengeNeu;
    }

    double berechneFlaeche() {
        double ergebnis = seitenLaenge * seitenLaenge;
        return ergebnis;
    }

 */
    double berechneFlaeche() {
        return seitenLaenge * seitenLaenge;
    }
    void print() {
        //double seitenLaenge = 0;
        double ergebnis = this.berechneFlaeche();
        System.out.println("Quadrat (seitenLaenge = " + this.seitenLaenge + ", Flaeche = " + ergebnis + ")");
    }

    Quadrat doSomething() {
        return this;
    }

    public static void main(String[] args) {
        //Quadrat beispielVar = new Quadrat();
        //beispielVar.seitenLaenge = 12.0;
        //beispielVar.verandernSeitenLaenge(24.0);

        //double flaeche = beispielVar.berechneFlaeche();
        //System.out.println(flaeche);

        //Quadrat beispielVar2 = new Quadrat();
        //beispielVar2.seitenLaenge = 2;

        //double flaeche2 = beispielVar2.berechneFlaeche();
        //System.out.println(flaeche2);

        Quadrat ref1 = new Quadrat(1.0);
        Quadrat ref2;
        Quadrat ref3 = new Quadrat(3.0);

        ref2 = ref1;
        ref1.seitenLaenge = 12;
        ref2.seitenLaenge = 24;

        ref1.print();
        ref2.print();
        ref3.print();

        Quadrat ref4 = ref3.doSomething();
        if(ref4 == ref3) {
            System.out.println("Gleich!");
        }

        Quadrat r1 = new Quadrat(1.0), r2, r3;
        r3 = new Quadrat(3.0);
        r2 = r3;
        r3 = null;
        r1 = null;
        r2 = null;



    }
}
