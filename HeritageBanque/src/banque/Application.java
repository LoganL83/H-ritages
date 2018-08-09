package banque;

public class Application {

    
    public static void main(String[] args) {
       
    	MainAccount accountMainPierre = new MainAccount();
    	PELAccount accountPELAurelia = new PELAccount();
    	
    	accountMainPierre.setSolde(500);
    	accountMainPierre.setNom("Brogard");
    	accountMainPierre.setPrenom("Pierre");
    	
    	accountPELAurelia.setSolde(200);
    	accountPELAurelia.setNom("Perrot");
    	accountPELAurelia.setPrenom("Aurelia");
    	
    	double montant = 50;
    	
    	accountMainPierre.setSolde(accountMainPierre.getSolde() - montant);
    	accountPELAurelia.setSolde(accountPELAurelia.getSolde() + montant);
    	
    	System.out.println("Le compte de " + accountMainPierre.getPrenom() + " " + accountMainPierre.getNom() + " s'�l�ve � " + 
    			accountMainPierre.getSolde() + " �");
    	System.out.println("Le compte PEL de " + accountPELAurelia.getPrenom() + " " + accountPELAurelia.getNom() + " s'�l�ve � " + 
    			accountPELAurelia.getSolde() + " �");
    	
    }

}