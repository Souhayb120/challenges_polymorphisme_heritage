package Challenge_1_Formes_Géométriques;

public class Rectangle extends Form {
    private double largeur;
    private double hauteur;

    public Rectangle(double largeur , double hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerAire(){
        return largeur * hauteur;
    }
}
