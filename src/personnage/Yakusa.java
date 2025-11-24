package personnage;

public class Yakusa extends Humain{
    private String clan;
    private int reputations = 0;

    public Yakusa(String nom, String boissonFav, int quantiteArgent, String clan) {
        super(nom, boissonFav, quantiteArgent);
        this.clan = clan;
    }

    public void extorque(Commercant commercant){
        System.out.println("Tiens, tiens, ne serait ce pas un faible marchand qui passe par la ?");
        System.out.println(commercant.getNom() + ", si tu tien a ta vie donne moi ta bourse. ");
        int argentVoler = commercant.seFaireExtorquer();
        gagnerArgent(argentVoler);
        System.out.println("J'ai piqué "+ argentVoler + " sous de " + commercant.getNom() + ", ce qui me fait " + getQuantiteArgent() + " sous dans ma poche. HI ! HI !");
    }


}
