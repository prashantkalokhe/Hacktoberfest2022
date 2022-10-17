class Solution {
    public boolean valid(String s,int flag) {
        int i=0;
            int j=s.length()-1;
            if(j==0)
                    return true;
            while(i<=j)
            {
                    if(s.charAt(i)!=s.charAt(j))
                    {
                            
                            if(flag==1)
                                    return false;
                            
                            flag=1;
                           boolean p=valid(s.substring(i+1,j+1),1);
                            
                            boolean f=valid(s.substring(i,j),1);
                           
                            if(p==false && f==false)
                                    return false;
                            else
                                    return true;
                            
                    }
                    else
                    {
                            i++;
                            j--;
                    }
            }
            return true;
    
}
    public boolean validPalindrome(String s) {
       boolean m=valid(s,0);
        if(m==true)
            return true;
        else
            return false;
    
}
}
