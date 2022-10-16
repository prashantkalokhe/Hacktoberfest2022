import java.util.Scanner;

public class Reversedstring {  
    public static void reverseString(String str){  
        char ch[]=str.toCharArray();  
        String rev="";  
        for(int i=ch.length-1;i>=0;i--){  
            rev+=ch[i];  
        }  
        System.out.println("Reversed string: "+rev);
    }  
    public static void changeCase(String s)
    {
       char c = 0;
       int len = s.length();
       StringBuffer strBuffer = new StringBuffer(len);
       for (int i = 0; i < len; i++) {
           c = s.charAt(i);
           if (Character.isUpperCase(c)) {
              c = Character.toLowerCase(c);
           }
           else if (Character.isLowerCase(c)) 
           {
              c = Character.toUpperCase(c);
           }
           strBuffer.append(c);
       }
       System.out.println("Converting case: "+strBuffer.toString()); 
    }
    public static void compare(String s1, String s2)
    {
       System.out.println("S1 = S2 : "+s1.equals(s2));
    }
    public static void append(String s1, String s2)
    {
       String result = s1.trim()+s2.trim(); 
       System.out.println("Result:"+result);

    }
  public static void main(String arg[])
  {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter string 1: ");
       String s1 = sc.nextLine();
       System.out.println("Enter string 2: ");
       String s2 = sc.nextLine();
       changeCase(s1);
       changeCase(s2);
       reverseString(s1);
       reverseString(s2);
       System.out.println("Reversing string 1: "+s1); 
       System.out.println("Reversing string 2: "+s2); 
       compare(s1, s2);
       append(s1, s2);

 }
}