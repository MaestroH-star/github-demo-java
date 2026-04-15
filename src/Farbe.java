public class Farbe {
    int rot;
    int gruen;
    int blau;

    Farbe() {
        this(0);
        System.out.println("Default-Konstruktor aufgerufen!");
    }

    Farbe(int grauWert) {
        this(grauWert, grauWert, grauWert);
        System.out.println("Konstruktor mit Grauwerten aufgerufen!");
    }

    Farbe(int r, int g, int b) {
        System.out.println("Konstruktor mit Farbwerten aufgerufen!");
        rot = r;
        gruen = g;
        blau = b;
    }

    public static void main(String[] args) {
        Farbe farbe1 = new Farbe(12, 24, 48);
        Farbe farbe2 = new Farbe();
        Farbe farbe3 = new Farbe(255);

        System.out.println("Farbe1: " + farbe1.rot + "/" + farbe1.gruen + "/" + farbe1.blau);
        System.out.println("Farbe2: " + farbe2.rot + "/" + farbe2.gruen + "/" + farbe2.blau);
        System.out.println("Farbe3: " + farbe3.rot + "/" + farbe3.gruen + "/" + farbe3.blau);
    }
}
