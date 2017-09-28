package ArraysAndStrings;

import java.util.Hashtable;

public class Prefix {
	public static void main(String[] args) {
		String[] thing = {"prefix" , "pre"};
		System.out.println(longestCommonPrefix(thing));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        int max = Integer.MIN_VALUE;
        String maxS = "";
        
        for (int i = 0; i < strs.length; i++) {
        	int t = 0;
            for (int j = 0; j < strs[i].length(); j++) {
            	String curr = strs[i].substring(0, j + 1);
                int x = ht.getOrDefault(curr, 0);
                if (j == 0) {
                	t = x + 1;
                }
                if (x + 1 < t) {
                	break;
                }
            	ht.put(curr, x + 1);
            	if (max < x + 1 || (max == x + 1 && maxS.length() < curr.length())) {
            		max = x + 1;
            		maxS = curr;
            	}
            }
        }
        return max == 1 && strs.length != 1 ? "" : maxS;
    }
}
