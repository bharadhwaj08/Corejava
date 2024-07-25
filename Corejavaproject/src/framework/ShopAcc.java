package framework;

public  abstract class ShopAcc {
	private int  accNo;
	private String  accNum;
	private float  charges;
	
	public ShopAcc(int accNo, String accNum, float charges) {
		super();
		this.accNo = accNo;
		this.accNum = accNum;
		this.charges = charges;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNum() {
		return accNum;
	}
	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	abstract public void bookproduct(float charges);
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNum=" + accNum + ", charges=" + charges + ", getAccNo()=" + getAccNo()
				+ ", getAccNum()=" + getAccNum() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	
	
	
}
