package enum1;

enum Bike
{
	KTM,Pulsar,R15,Splendear;
}

public class Example3 {

	public static void main(String[] args) {
		Bike b = Bike.KTM;
		switch(b)
		{
		case Pulsar:
			System.out.println("You choose Pulsar");
			break;
		case KTM:
			System.out.println("You choose KTM");
			break;
		case R15:
			System.out.println("You choose R15");
			break;
		case Splendear:
			System.out.println("You choose Splendear");
			break;
			
		default:
			System.out.println("Invalid Case");
		}

	}

}