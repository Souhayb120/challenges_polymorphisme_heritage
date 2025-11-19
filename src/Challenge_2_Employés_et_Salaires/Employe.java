package Challenge_2_Employés_et_Salaires;

public class Employe {
    private String nom;
    private double salaireBase;


    public Employe(String nom , double salaireBase){
        this.nom = nom;
        this.salaireBase = salaireBase;
    }

    public Employe() {
    }

    public String getNom() {
        return nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public double calculerSalaire(){
        return 0;
    }

}
