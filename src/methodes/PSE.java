package methodes;

import objets.Objets;
import sacados.SacADos;
import utilitaires.BSTree;

public class PSE extends Methode {
    private Objets contenu;
    private double poids;
    private double valeur;

    public void resoudre(SacADos sac) {
        BSTree bt = new BSTree(sac);

        contenu = bt.solution();
        poids = contenu.getPoids();
        valeur = contenu.getValeur();
    }

    public void afficher() {
        afficher(contenu, poids, valeur);
        //System.out.println(bt); // Affichage des noeuds terminaux
    }
}
