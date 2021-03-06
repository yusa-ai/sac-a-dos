package objets;

public class Objet implements Comparable<Objet> {
    private final String nom;
    private final double valeur;
    private double poids;

    /**
     * Initialise un objet
     *
     * @param nom Le nom de l'objet
     * @param poids Le poids de l'objet
     * @param valeur La valeur de l'objet
     */
    public Objet(String nom, double poids, double valeur) {
        this.nom = nom;
        this.poids = poids;
        this.valeur = valeur;
    }

    public String getNom() {
        return nom;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getValeur() {
        return valeur;
    }

    /**
     * Permet la comparaison de deux objets selon le ratio valeur/poids requis pour la méthode gloutonne
     *
     * @param o L'objet comparé à cette instance d'objet
     * @return L'entier résultat de la comparaison
     */
    @Override
    public int compareTo(Objet o) {
        double difference = (valeur / poids) - (o.valeur / o.poids);
        int r = difference >= 0.0 ? (int) Math.ceil(difference) : (int) Math.floor(difference);
        return r * -1; // tri décroissant méthode gloutonne
    }

    @Override
    public String toString() {
        return nom + " : poids " + poids + ", valeur " + valeur;
    }
}
