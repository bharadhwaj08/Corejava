package mainmethod;

import applications.GSnormalacc;
import applications.GSprimeAcc;
import applications.GSshopfactory;

public class Client {
	public static void main(String[] args) {
		GSshopfactory  obj =new GSshopfactory();
		
		GSprimeAcc ga=(GSprimeAcc)obj.getNewPrimeAccount(12, "java", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSnormalacc ge=(GSnormalacc)obj.getnewNormalAccount(13, "spring", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}

}
