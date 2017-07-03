package algorithms;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i = 0, j = 0; j < s.length(); ++j) {
			// find it
			if(map.containsKey(s.charAt(j))) {
				i = Math.max(i, map.get(s.charAt(j)) + 1);
			}
			map.put(s.charAt(j), j);
			max = Math.max(max, j - i + 1);
		}
		return max;
	}
	
	public static void main(String[] args) {
		LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println(lswrc.lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lswrc.lengthOfLongestSubstring("bbbbb"));
		System.out.println(lswrc.lengthOfLongestSubstring("pwwkew"));
		System.out.println(lswrc.lengthOfLongestSubstring("abba"));
	}
	
}
