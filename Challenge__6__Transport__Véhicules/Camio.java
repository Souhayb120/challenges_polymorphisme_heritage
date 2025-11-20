package Challenge__6__Transport__Véhicules;

public class Camio extends Vehicule{


    public Camio(String marque , int model){
        this.marque = marque;
        this.modele = model;
    }
    @Override

    public void demarrer(){
        System.out.println("Camio marque "+ marque + " modele " + modele + " est demarrer");
    }
}
