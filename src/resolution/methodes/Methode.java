package resolution.methodes;

import objet.Objet;
import sacados.IMethode;

import java.text.DecimalFormat;
import java.util.List;

public abstract class Methode implements IMethode {
    protected static void quicksort(List<Objet> l) {
        resolution.algorithmes.Quicksort.quicksort(l, 0, l.size() - 1);
    }

    /**
     * Affiche le résultat d'une méthode de résolution du sac à dos
     * @param contenu Les objets composant le sac à dos à l'issue de la méthode
     * @param valeur La valeur totale du sac à dos
     * @param poids Le poids total du sac à dos
     */
    protected static void afficher(List<Objet> contenu, double poids, double valeur) {
        DecimalFormat df = new DecimalFormat();
        df.setMinimumFractionDigits(2);
        df.setMaximumFractionDigits(2);

        System.out.println("Contenu du sac :");
        for (Objet objet : contenu)
            System.out.printf("%s, poids %5s, valeur %5s\n", objet.getNom(),
                    df.format(objet.getPoids()), df.format(objet.getValeur()));

        System.out.println();
        System.out.println("Poids total : " + df.format(poids) + ", valeur totale : " + df.format(valeur));
        System.out.println();
    }
}