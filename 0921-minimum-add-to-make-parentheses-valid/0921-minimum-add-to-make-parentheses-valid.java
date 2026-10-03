import java.util.*;
class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        
        while(true)
        {
            s=s.replace("()","");
            if(!s.contains("()")) break;
        }
        return s.length();
    }
}