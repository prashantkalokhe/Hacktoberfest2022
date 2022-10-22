/* You are a professional robber planning to rob houses along a street. 
   Each house has acertain amount of monet stashed.
   The onlt constraint stopping you for robbing each of them is that each house have security systems connected and it will automatically contact the police
   if two ajacent houses were broken into on the same night.
   Considering the constarints determine the maximum amount of money you can rob tonight without alerting the police. 
*/

public class HouseRobber{
	public static void main(String[] args) {
		int[] arr = {2,45,8,7,98,24};
	  int maxAmount = robHouse(arr);
		System.out.println("Maximum amount that can be robbed : "+ maxAmount);
	}
	
	static int robHouse(int[] arr){
	    int prev = arr[0], curr = Math.max(arr[0], arr[1]);
	    
	    for(int i =2; i< arr.length; i++){
	        int temp = curr;
	        curr = Math.max(prev + arr[i], curr);
	        prev = temp;
	    }
	    return curr;
	}
}




//prints:-  Maximum amount that can be robbed : 143
