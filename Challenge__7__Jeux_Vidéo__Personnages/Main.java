package Challenge__7__Jeux_Vidéo__Personnages;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


Personnage[] personnages = {
        new Mage("mage","attack with his magic"),
        new Guerrier("Gurrier","attack with stong punsh"),
        new Archer("Archer", "attack with his arrows ")
};

for(Personnage personnage : personnages){
    personnage.attaquer();
}



    }
}