
@SuppressWarnings("serial")
public class PurchaseException extends Exception {
	
	private String reason;
	private double currentBalance;
	
	public PurchaseException(String reason, double currentBalance) {
		
		this.reason = reason;
		this.currentBalance = currentBalance;
	}
	
	
	public String getReason() {
		return this.reason;
	}
	
	public double getMaxAvailable() {
		return this.currentBalance;
	}

}
