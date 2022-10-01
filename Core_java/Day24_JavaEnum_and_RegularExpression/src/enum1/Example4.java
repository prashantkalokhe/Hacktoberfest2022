package enum1;

interface pizza
{
	void display();
}
enum size implements pizza
{
	small,medium,large,extralarge;
	
	public void display()
	{
		System.out.println("Size is : " +this);
	}
}

public class Example4 {

	public static void main(String[] args) {
		size.large.display();
	}
}

