package histoire;

import personnage.Commercant;
import personnage.Humain;
import personnage.Ronin;
import personnage.Yakusa;

public class HistoireTP4 {
    public static void main(String[] args) {
        Humain prof = new Humain("Prof","Kombucha", 54);
        prof.direBonjour();
        prof.acheter("une Boisson", 12);
        prof.boire();
        prof.acheter("un jeu", 2);
        prof.acheter("un Kimono", 50);

        Commercant marco = new Commercant("Marco", 20);
        marco.direBonjour();
        int argentperdu = marco.seFaireExtorquer();
        marco.recevoir(15);
        marco.boire();

        Yakusa yaku = new Yakusa("Yaku Le noir", "whisky", 30, "Warsong");
        yaku.direBonjour();
        yaku.extorque(marco);

        Ronin roro = new Ronin("Roro", "shochu", 60);
        roro.direBonjour();
        roro.donner(marco);

        roro.duel(yaku);


    }
}
