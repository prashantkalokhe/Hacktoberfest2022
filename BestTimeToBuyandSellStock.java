import java.util.*;
public class Main
{
    public static int maxReturn(int[] prices){
        int l=0;
        int diff=0;
        int n=prices.length;
        for(int r=1;r<n;r++){
            
            if((prices[r]-prices[l])<0){
                l=r;
            }else{
                diff=Math.max(diff,prices[r]-prices[l]);
            }
        }
        return diff;
    }
	public static void main(String[] args) {
     int[] arr={7,1,5,3,6,4};
     Main obj=new Main();
     int max=obj.maxReturn(arr);
     System.out.println(max);
	}
}

