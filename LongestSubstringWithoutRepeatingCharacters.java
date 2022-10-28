class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left = 0, right = 0, maxWindowSize = -1;
    if(s.length() == 0 || s.length() == 1){ return s.length(); }
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    while(left < s.length() && right < s.length()){
        if(!map.containsKey(s.charAt(right))){
            map.put(s.charAt(right), 1);
            right++;
            maxWindowSize = Math.max(maxWindowSize, right - left);
        }
        else{
            map.remove(s.charAt(left));
            left++;
        }
    }
    return maxWindowSize;
  }
}