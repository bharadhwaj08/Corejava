package framework;
                                                 
public abstract class PrimeAcc extends ShopAcc {
	private boolean isPrime;
	private static final float deliverycharge=0;
	
	
	public boolean isPrime() {
		return isPrime;
	}
	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public static float getDeliverycharge() {
		return deliverycharge;
	}
	
	
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", isPrime()=" + isPrime() + "]";
	}
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}
	public void bookproduct(float charges) {
		
	}
}

	
	

	
	
	


