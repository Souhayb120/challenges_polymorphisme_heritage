package Challenge_2_Employés_et_Salaires;

import Challenge_1_Formes_Géométriques.Cercle;
import Challenge_1_Formes_Géométriques.Form;
import Challenge_1_Formes_Géométriques.Rectangle;
import Challenge_1_Formes_Géométriques.Triangle;

public class Main {
    public static void main(String[] args) {
        Employe[] employes = {
                new EmployeHoraire(4,2),
                new EmployeCommission(3, 4),
                new Admin("sami")
        };

for(Employe employe : employes){
    System.out.println("salaire est : " + employe.calculerSalaire());
}

    }
}