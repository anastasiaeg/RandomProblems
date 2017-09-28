package LinkedIn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShortestWordDistance {
	public static void main(String[] args) {
		String[] words = {"practice", "makes", "perfect", "coding", "makes", "practice", "practice", "perfect"};
//		int one = shortestDistance(words, "coding", "practice");
//		int two = shortestDistance(words, "makes", "coding");
		String[] words2 = {"a", "b"};
		int three = shortestDistance1(words, "makes", "perfect");
		System.out.println("" + three);
	}
	
	public static int shortestDistance(String[] words, String word1, String word2) {
		int shortest = Integer.MAX_VALUE;
		int indexOne = -1, indexTwo = -1;
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				indexOne = i;
			}
			if (words[i].equals(word2)) {
				indexTwo = i;
			}
			
			if (indexTwo != -1 && indexOne != -1 && Math.abs(indexTwo - indexOne) < shortest) {
				shortest = Math.abs(indexTwo - indexOne);
			}
		}
		return shortest;
	}
	
	public static int shortestDistance1(String[] words, String word1, String word2) {

	    HashMap<String, ArrayList<Integer>> hm;
        hm = new HashMap<String, ArrayList<Integer>>();
        for (int i = 0; i < words.length; i++) {
            ArrayList<Integer> al = null;
            if (hm.get(words[i]) == null) {
                al = new ArrayList<Integer>();
            } else {
                al = hm.get(words[i]);
            }
            al.add(i);
            hm.put(words[i], al);
        }
        int shortest = Integer.MAX_VALUE;
        Object[] al1 = hm.get(word1).toArray(), al2 = hm.get(word2).toArray();
        Arrays.sort(al1);
        Arrays.sort(al2);
        for (int i = 0; i < al1.length; i++) {
        	System.out.print(al1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < al2.length; i++) {
        	System.out.print(al2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < al1.length; i++) {
        	for (int j = 0; j < al2.length; j++) {
        		if (Math.abs((int)al1[i] - (int)al2[j]) < shortest) {
        			shortest = Math.abs((int)al1[i] - (int)al2[j]);
        		}
        	}
        }
		return shortest;
	}
	
	
}
