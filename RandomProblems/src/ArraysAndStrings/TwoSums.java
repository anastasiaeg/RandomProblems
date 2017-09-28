package ArraysAndStrings;

import java.util.Hashtable;

public class TwoSums {
	public static void main(String[] args) {
		int[] stuff = {2, 7, 11, 15};
		System.out.println(twoSums(stuff, 9)[1]);
	}
	
	public static int[] twoSums(int[] nums, int target) {
		int[] output = new int[2];
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (ht.contains(target - nums[i])) {
				output[0] = ht.get(target - nums[i]);
				output[1] = i + 1;
				return output;
			}
			ht.put(nums[i], i + 1);
		}
		return output;
	}
}
