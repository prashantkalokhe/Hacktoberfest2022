// Problem Link: https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/

class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n%2 == 0) 
            sb.append("a".repeat(n-1)).append("b");                  
        else 
            sb.append("a".repeat(n));
        return sb.toString();
    }
}
