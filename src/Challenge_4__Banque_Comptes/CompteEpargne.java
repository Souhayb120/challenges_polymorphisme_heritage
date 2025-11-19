package Challenge_4__Banque_Comptes;

public class CompteEpargne extends Compte{
    public void appliquerInteret(){
        if(getSolde() == 1000){
            setSolde(getSolde() + 30);
        }
    }
}
