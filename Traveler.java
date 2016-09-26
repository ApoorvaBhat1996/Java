
public class Traveler {
	int TravelerID;
	int BaggageAmount;
	int ExpiryYear;
	boolean NOCStatus;
	
	Traveler(int TravelerID,int BaggageAmount,int ExpiryYear, boolean NOCStatus){
      
		this.TravelerID=TravelerID;
		this.BaggageAmount=BaggageAmount;
		this.ExpiryYear=ExpiryYear;
		this.NOCStatus=NOCStatus;
		
	
	}

	public int getTravelerID() {
		return TravelerID;
	}

	public int getBaggageAmount() {
		return BaggageAmount;
	}

	public int getExpiryYear() {
		return ExpiryYear;
	}

	public boolean isNOCStatus() {
		return true;
	}

}
