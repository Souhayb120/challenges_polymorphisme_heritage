package Challenge_2_Employés_et_Salaires;

public class EmployeHoraire extends Employe{
    private double heuresTravaillees;
    private double tauxHoraire;


   public EmployeHoraire(double heuresTravaillees , double tauxHoraire){
       this.heuresTravaillees = heuresTravaillees;
        this.tauxHoraire = tauxHoraire;
  }

  @Override
    public double calculerSalaire(){
       return heuresTravaillees * tauxHoraire;
  }

}
