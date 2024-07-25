package applications;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.Shopfactory;

public  class GSshopfactory implements Shopfactory {
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
		PrimeAcc primeacc=new GSprimeAcc(accNo, accNm,charges,isPrime);
		return primeacc;
	}
@Override
	public NormalAcc getnewNormalAccount(int accNo, String accNm, float charges, float deliverycharges) {
		NormalAcc normalacc=new GSnormalacc(accNo,accNm,charges,deliverycharges);
		return normalacc;
	}

}
