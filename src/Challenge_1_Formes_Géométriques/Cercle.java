package Challenge_1_Formes_Géométriques;

public class Cercle extends Form {
    private double rayon;

    public Cercle(double rayon){
        this.rayon = rayon;
    }
    @Override
    public double calculerAire(){
        double P = 3.14;
        return P * (rayon * rayon);
    }
}
