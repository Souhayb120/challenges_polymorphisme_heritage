package Challenge_4__Banque_Comptes;

public class CompteCourant extends Compte{
    private int overdraft_limit = -100;

    public int getOverdraft_limit() {
        return overdraft_limit;
    }

    public void setOverdraft_limit(int overdraft_limit) {
        this.overdraft_limit = overdraft_limit;
    }
}
