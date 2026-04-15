public class Rechteck {
    double hoehe;
    double breite;

    // (setSeiten) -> Signatur
    void setSeiten() {
        hoehe = 0;
        breite = 0;
    }

    // (setSeiten, double) -> Signatur
    void setSeiten(double seite) {
        hoehe = seite;
        breite = seite;
    }

    // (setSeiten, int, int) -> Signatur
    void setSeiten(int h, int b) {
        hoehe = h;
        breite = b;
    }

    // (setSeiten, double, double) -> Signatur
    void setSeiten(double h, double b) {
        hoehe = h;
        breite = b;
    }



    public static void main(String[] args) {
        Rechteck a = new Rechteck();
        a.setSeiten(42, 42);

        System.out.println("Rechteck: " + a.hoehe + "/" + a.breite);
    }
}
