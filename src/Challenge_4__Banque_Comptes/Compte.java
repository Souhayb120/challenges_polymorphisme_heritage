package Challenge_4__Banque_Comptes;

public class Compte {
    private int numero;
    private double solde;

    public Compte(int numero , double solde){
        this.numero = numero;
        this.solde = solde;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    public Compte() {
    }

    public void verser(double mantant,int Rib){
        System.out.println("le mantant " + mantant + " has successfully trensfer to compte " + Rib );
        double left = solde - mantant;
        System.out.println("money left " + left);
    }

    public void retirer(double mantant){
        if(solde >= mantant){
            solde = solde - mantant;
            System.out.println("retirer " + mantant + " successfully !!");
        }else{
            System.out.println("sold insufussant");
        }

    }
}
