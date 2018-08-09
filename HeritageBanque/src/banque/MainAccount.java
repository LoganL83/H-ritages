package banque;

public class MainAccount extends Account {

	public void transfertAccount(double montant, double soldeDebiteur, double soldeCrediteur) {
		
		
		soldeDebiteur = soldeDebiteur - montant;
		soldeCrediteur = soldeCrediteur + montant;
	}

}