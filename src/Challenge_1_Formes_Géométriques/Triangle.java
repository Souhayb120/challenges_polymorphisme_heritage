package Challenge_1_Formes_Géométriques;

public class Triangle extends Form{
    private double base;
    private double height;

    public Triangle(double base , double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculerAire(){
        return (base * height) / 2;
    }

}
