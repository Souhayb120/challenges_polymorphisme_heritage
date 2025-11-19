package Challenge_2_Employés_et_Salaires;

public class EmployeCommission extends Employe {
    private int ventes;
    private double commission;

    public EmployeCommission(int ventes , double commission){
        this.ventes = ventes;
        this.commission = commission;
    }


    @Override
    public double calculerSalaire(){
        return   ventes * commission ;
    }
}
