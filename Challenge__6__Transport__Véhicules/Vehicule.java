package Challenge__6__Transport__Véhicules;

public class Vehicule {
    protected String marque;
    protected int modele;

    public Vehicule(String marque , int model){
        this.marque = marque;
        this.modele = model;
    }

    public Vehicule() {
    }

    public void demarrer(){
        System.out.println("car demarrer !!");
    }
}
