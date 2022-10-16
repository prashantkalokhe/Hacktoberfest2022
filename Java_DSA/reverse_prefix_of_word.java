class Solution {
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i ) == ch)
            {
                for(int j=i;j>=0;j--)
                {
                  sb.append(word.charAt(j));  
                }
                for(int k=i+1;k<word.length();k++)
                {
                    sb.append(word.charAt(k));
                }
                if(sb.length() == word.length())
                break;
            }
            
        }
        if(sb.length() == 0)
            return word;
        return sb.toString();
        
    }
   public static void main(String[] args){
      System.out.println(reversePrefix("abcdefd", 'd'));
   }
}
