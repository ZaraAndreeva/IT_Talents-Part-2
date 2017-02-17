package call;

public class CallDemo {

	public static void main(String[] args) {
		
		GSM gsm1 = new GSM();
		gsm1.model = "Samsung S7 Edge";
		gsm1.hasSimCard = true;
		gsm1.insertSimCard("0894475422");		
		
		System.out.println("The first GSM: ");
		System.out.println("The model is: " + gsm1.model);
		System.out.println("Does it have sim card: " + gsm1.hasSimCard);
		System.out.println("The mobile number is: " + gsm1.simMobileNumber);
		System.out.println();
		
		GSM gsm2 = new GSM();
		gsm2.model = "Iphone 7";
		gsm2.hasSimCard = true;
		gsm2.insertSimCard("0896750520");
		
		System.out.println("The second GSM: ");
		System.out.println("The model is: " + gsm2.model);
		System.out.println("Does it have sim card: " + gsm2.hasSimCard);
		System.out.println("The mobile number is: " + gsm2.simMobileNumber);
		System.out.println();
		
		gsm1.price = 0.20;
		gsm2.price = 0.20;
		System.out.println("A price for a minute: " + gsm1.price + " lv");
		System.out.println();
		
		gsm1.call(gsm2, 5);
		System.out.println("The duration of the call: " + gsm1.outgoingCallsDuration + " minutes");
		System.out.println("The sum for the call is: " + gsm1.getSumForCall());
		System.out.println();
		
		gsm1.printInfoForTheLastOutgoingCall();
		gsm2.printInfoForTheLastIncomingCall();
		System.out.println();
		
		gsm1.removeSimCard();
		gsm1.call(gsm2, 2);
		
		gsm1.insertSimCard(gsm1.simMobileNumber);
		
		gsm2.removeSimCard();
		gsm1.call(gsm2, 5);
		
		gsm2.insertSimCard("0894475422");
		gsm2.call(gsm1, 5);		
		

	}

}
