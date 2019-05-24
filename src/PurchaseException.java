
@SuppressWarnings("serial")
public class PurchaseException extends Exception {
	
	private String reason;
	private double currentBalance;
	
	//Constructor
	public PurchaseException(String reason, double currentBalance) {
		this.reason = reason;
		this.currentBalance = currentBalance;
	}
	
	
	//Gets reason
	public String getReason() {
		return this.reason;
	}
	
	
	//Gets max available balance
	public double getMaxAvailable() {
		return this.currentBalance;
	}
}
