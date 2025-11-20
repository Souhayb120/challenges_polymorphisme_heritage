package Challenge__6__Transport__Véhicules;

public class Moto extends Vehicule{


    public Moto(String marque , int model){
        this.marque = marque;
        this.modele = model;
    }
    @Override

    public void demarrer(){
        System.out.println("Moto marque "+ marque + " modele " + modele + " est demarrer");
    }
}
