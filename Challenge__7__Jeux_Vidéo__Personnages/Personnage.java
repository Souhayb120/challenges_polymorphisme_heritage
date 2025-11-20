package Challenge__7__Jeux_Vidéo__Personnages;

public class Personnage {
//    Personnage : nom, pointsDeVie, méthode attaquer().
protected String nom;
 protected String pointsDeVie;

  public Personnage(String nom , String pointsDeVie){
      this.nom = nom;
      this.pointsDeVie = pointsDeVie;
  }

    public Personnage() {
    }

    public void attaquer(){
        System.out.println( "Attacker" );
    }

}
