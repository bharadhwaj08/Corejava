package framework;

public class NormalAcc extends ShopAcc{
private float deliverycharges;
	
	public void bookproduct(float charges) {
		
	}
	
	

	public NormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges);
		this.deliverycharges = deliverycharges;
	}



	@Override
	public String toString() {
		return "NormalAcc [deliverycharges=" + deliverycharges + "]";
	}

	public float getDeliverycharges() {
		return deliverycharges;
	}

	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
}
