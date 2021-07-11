
public class ElectricityBill {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		CalculateBill cb = new CalculateBill();
		
		cb.setBill(225);
		cb.calcBill();
		cb.printBill();

	}

}
class CalculateBill{
	double billAmount;
	int noofunits;
	
	void calcBill() {
		if( noofunits<= 100) {
			billAmount = noofunits * 1.20;
		}
		else if(noofunits > 100 && noofunits <= 300) {
			billAmount = 100 * 1.20 + (noofunits - 100) * 2;
		}
		else if(noofunits > 300) {
			billAmount = 100 * 1.20 + 200 * 2 + (noofunits - 300) * 3;
		}
	}
	
	void setBill(int unit) {
		noofunits = unit;
	}
	void printBill() {
		System.out.println("Bill Generated for " + noofunits + " units is : Rs." +billAmount);
	}
}
