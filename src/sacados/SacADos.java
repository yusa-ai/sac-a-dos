package sacados;

import objets.Objet;
import objets.Objets;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SacADos {
    private final String chemin;
    private Double poidsMax;
    private Objets objets;

    public SacADos(String chemin, double poidsMax) {
        this.chemin = chemin;
        this.poidsMax = poidsMax;
    }

    public void resoudre(IMethode methode) {
        if (objets == null)
            parse(chemin);

        methode.resoudre(this);
    }

    private void parse(String chemin) {
        try {
            Scanner sc = new Scanner(new File(chemin));

            objets = new Objets();
            // Stocke les objets
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(" ; ");
                objets.add(new Objet(s[0], Double.parseDouble(s[1]), Double.parseDouble(s[2])));
            }

            sc.close();
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }

    public double getPoidsMax() {
        return poidsMax;
    }

    public Objets getObjets() {
        return objets;
    }

    public void setPoidsMax(double poidsMax) {
        this.poidsMax = poidsMax;
    }
}
