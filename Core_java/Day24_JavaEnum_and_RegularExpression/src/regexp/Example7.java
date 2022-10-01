package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example7 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("job");
		Matcher m = p.matcher("Java Programming is enough to get a job in IT industry");
		while(m.find())
		{
			System.out.printf("Pattern found from : "+m.start()+ " to "+(m.end()-1));
		}
		System.out.println("Nothing");
	}

}