// Create a piglatin converter. If the word begins with a vowel then just add yay 
// to the end of the word. If it begins with a consonant or grp of consonants then 
// remove the consonant or grp of consonants to the end of the word and then add yay
//trouble
//oubletray
import java.io.*;
class Q2Piglatin
{
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string");
        String n = br.readLine();
        int l=n.length();
        int f=1;
        int i;
        int a=0;
        String w1="";
        String w2="";
        String w3="";
        for(i=0;i<l;i++)
        {
            char ch=n.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           { 
            f=1;
            a=i;
            System.out.println(i);
            break;
        }
    }
        if(f==1)
        {
            w1=n.substring(a,l);
            w2=n.substring(0,a);
            
        }
        System.out.println(w1+w2+"ay");
    }
}
    
