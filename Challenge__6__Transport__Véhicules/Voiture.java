package Challenge__6__Transport__Véhicules;

public class Voiture extends Vehicule{

public Voiture(String marque , int model){
    this.marque = marque;
    this.modele = model;
}
    @Override

    public void demarrer(){
        System.out.println("Voiture marque "+ marque + " modele " + modele + " est demarrer");
    }
}
