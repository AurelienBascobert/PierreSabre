package personnage;

public class Ronin extends Humain{
    private int honneur = 1;
    public Ronin(String nom, String boissonFav, int quantiteArgent) {
        super(nom, boissonFav, quantiteArgent);
    }

    public void donner(Commercant commercant){
        int don = getQuantiteArgent()/10;
        System.out.println(commercant.getNom() + " prend ces "+ don + " sous");
        commercant.recevoir(don);
        perdreArgent(don);
    }
}
