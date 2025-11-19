package Challenge_2_Employés_et_Salaires;

import Challenge_1_Formes_Géométriques.Form;

public class Admin extends Employe {
    private String name;
    private double adminSalaire;

    public Admin(String name){
        this.name = name;
        this.adminSalaire = 120.00;
    }

    @Override
    public double calculerSalaire(){
        return  adminSalaire + 1200;
    }
}
