package Challenge__7__Jeux_Vidéo__Personnages;

public class Guerrier extends Personnage{

    public Guerrier(String nom , String pointdeVue){
        this.nom = nom;
        this.pointsDeVie = pointdeVue;
    }

    @Override
    public void attaquer() {
        System.out.println(this.nom + " " + this.pointsDeVie);
    }
}
