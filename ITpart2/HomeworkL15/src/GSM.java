
public class GSM {

	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	String lastIncomingCall;
	String lastOutgoingCall;
	
	void insertSimCard(String simMobileNumber){
		if (simMobileNumber.startsWith("08") && simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
			hasSimCard = true;
		}
	}
	
	void removeSimCard(){
		this.hasSimCard = false;
		this.simMobileNumber = null;
	}
	
	void call(GSM receiver, double duration){
		if (duration < 0 && duration >= 60) {
			return;
		}
		if (receiver.simMobileNumber.equals(this.simMobileNumber)) {
			return;
		}
		if (!receiver.hasSimCard || !this.hasSimCard) {
			return;
		}
		Call call = new Call();
        call.duration = duration;
        call.caller = this.simMobileNumber;
        call.receiver = receiver.simMobileNumber;
        this.lastOutgoingCall = receiver.simMobileNumber;
        receiver.lastIncomingCall = this.simMobileNumber;
        this.outgoingCallsDuration += call.duration;
	}
	
	double getSumForCall(){
		return this.outgoingCallsDuration*Call.priceForAMinute;
	}
	
	void printInfoForTheLastOutgoingCall(){
		if (this.lastOutgoingCall != null) {
			System.out.println(this.lastOutgoingCall);
		}
	}
	void printInfoForTheLastIncomingCall(){
		if (this.lastIncomingCall != null) {
			System.out.println(this.lastIncomingCall);
		}
	}
}
