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

    public void duel(Yakusa yaku){
        System.out.println("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand! ");
        if (honneur*2 > yaku.getReputations()*2){
            System.out.println("Je t'ai eu petit yakusa!!!!!");
            int argent  = yaku.perdre();
            gagnerArgent(argent);
            honneur++;
        }
        else {
            System.out.println("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
            yaku.gagner(getQuantiteArgent());
        }
    }
}
