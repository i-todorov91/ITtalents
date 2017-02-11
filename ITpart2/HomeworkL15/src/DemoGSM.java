
public class DemoGSM {

	public static void main(String[] args) {
		
		GSM one = new GSM();
		GSM two = new GSM();
		
		one.insertSimCard("0888654321");
		two.insertSimCard("0878657453");
		
		one.call(two, 2);
		
		one.printInfoForTheLastOutgoingCall();
		two.printInfoForTheLastIncomingCall();
		
	}
}

