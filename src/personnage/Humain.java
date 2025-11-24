package personnage;

public class Humain {
    private String nom;
    private String boissonFav;
    private int quantiteArgent;

    public Humain(String nom, String boissonFav, int quantiteArgent) {
        this.nom = nom;
        this.boissonFav = boissonFav;
        this.quantiteArgent = quantiteArgent;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantiteArgent() {
        return quantiteArgent;
    }

    public void direBonjour(){
        System.out.println("Bonjour, je m'appelle " + nom + " et j'aime boire du " + boissonFav);
    }

    public void boire(){
        System.out.println("Mmmm, Un bon verre de " + boissonFav + "! GLOUPS !");
    }

    public void acheter(String Bien, int prix){
        if (prix-quantiteArgent >= 0) {
            System.out.println("J'ai " +quantiteArgent+ "sous en poche. Je vais pouvoir m'offrir " + Bien + " a " + prix + " sous");
            quantiteArgent -= prix;
        }
        else {
            System.out.println("Je n'ai plus que " + quantiteArgent + " sous en poche, Je ne peux meme pas m'offrir " + Bien + " a " + prix + " sous");
        }
    }

    public void gagnerArgent(int gain){
        quantiteArgent += gain;
    }

    public void perdreArgent(int perte){
        quantiteArgent -= perte;
    }


}
