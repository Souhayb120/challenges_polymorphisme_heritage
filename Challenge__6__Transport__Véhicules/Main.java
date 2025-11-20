package Challenge__6__Transport__Véhicules;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Vehicule v = new Camio("camayo" , 1999);
Vehicule moto = new Moto("motoGP" , 2994);
Vehicule voiture = new Voiture("bmw" , 2012);

v.demarrer();
moto.demarrer();
voiture.demarrer();
    }
}