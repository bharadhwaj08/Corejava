package applications;
import framework.NormalAcc;

public class GSnormalacc extends NormalAcc{
	public GSnormalacc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges, deliverycharges);
		// TODO Auto-generated constructor stub
	}
	public void bookproduct(float charges) {
		System.out.println("dear normal account user . your product charges are :"+getCharges()+"delivery charges"+getDeliverycharges());
	}
}