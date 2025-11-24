package personnage;

public class Commercant extends Humain{
    public Commercant(String nom, int quantiteArgent) {
        super(nom, "tea", quantiteArgent);
    }

    public int seFaireExtorquer(){
        int montantPerdu = getQuantiteArgent();
        perdreArgent(montantPerdu);
        System.out.println("J'ai tout perdu! Le monde est trop injuste...");
        return montantPerdu;
    }

    public void recevoir(int argent){
        System.out.println(argent + " sous ! Je te remercie généreux donateur!");
        gagnerArgent(argent);
    }
}
