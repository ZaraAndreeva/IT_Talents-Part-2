package call;

public class GSM {
	
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	double price;
	
	void insertSimCard(String newSimMobileNumber){
		if(newSimMobileNumber != null && !newSimMobileNumber.isEmpty() && newSimMobileNumber.charAt(0) == '0' && newSimMobileNumber.charAt(1) == '8' && newSimMobileNumber.length() == 10){
			simMobileNumber = newSimMobileNumber;
			hasSimCard = true;
		}
		else{
			System.out.println("The number is incorrect!");
		}
	}
	
	void removeSimCard(){
		hasSimCard = false;
	}
	
	void call(GSM receiver, int duration){
		if(duration > 0 && hasSimCard && receiver.hasSimCard && !receiver.simMobileNumber.equals(simMobileNumber)){
			System.out.println(model + " called " + receiver.model);
			outgoingCallsDuration += duration;
			Call call = new Call();
			call.duration = duration;
			call.caller = this;
			call.receiver = receiver;
			lastOutgoingCall = call;
			receiver.lastIncomingCall = lastOutgoingCall; 
			call.priceForAMinute = price;
		}
		else
		if(!receiver.hasSimCard && !receiver.simMobileNumber.equals(simMobileNumber)){
			System.out.println("The number you are trying to call is unavailable. Please, try again later.");
		}
		else
		if(!hasSimCard  && !receiver.simMobileNumber.equals(simMobileNumber)){
			System.out.println("You can't make calls. You don't have a sim card.");
		}
		else
		if(receiver.simMobileNumber.equals(simMobileNumber)){
			System.out.println("You are trying to call yourself.");
		}
	}
	
	double getSumForCall(){
		double sum = outgoingCallsDuration * price;
		return sum;
	}
	
	void printInfoForTheLastOutgoingCall(){
		if(lastOutgoingCall.receiver.simMobileNumber != null && lastOutgoingCall.caller.simMobileNumber != null){
			System.out.println("The last outgoing call for " + lastOutgoingCall.caller.model + " is: " + lastOutgoingCall.receiver.simMobileNumber);
//			System.out.println("The last outgoing call for " + lastOutgoingCall.receiver.model + " is: " + lastOutgoingCall.caller.simMobileNumber);
		}
		else{
			System.out.println("There is not an outgoing call.");
		}
	}
	
	void printInfoForTheLastIncomingCall(){
		if(lastIncomingCall.receiver.simMobileNumber != null){
			System.out.println("The last incoming call for " + lastIncomingCall.receiver.model + " is " + lastIncomingCall.caller.simMobileNumber);
//			System.out.println("The last incoming call for " + lastIncomingCall.caller.model + " is " + lastIncomingCall.receiver.simMobileNumber);
		}
		else{
			System.out.println("There is not an incoming call.");
		}
	}
	
}
