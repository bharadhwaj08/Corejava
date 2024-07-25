package framework;
 
public interface Shopfactory {
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isprime);
	public NormalAcc getnewNormalAccount(int accNo,String accNm, float charges, float deliverycharges );
	//NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliverycharges);
}
 
	 
 



