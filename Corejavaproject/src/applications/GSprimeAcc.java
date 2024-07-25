package applications;
import framework.PrimeAcc;
public class GSprimeAcc extends PrimeAcc {
	public GSprimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}
	
	public void bookproduct(float cahrges) {
		System.out.println("dear prime user,your product charges are :"+getCharges());
	}

	@Override
	public String toString() {
		return "GSPrime [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getAccNm()=" + getAccNo() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


}
