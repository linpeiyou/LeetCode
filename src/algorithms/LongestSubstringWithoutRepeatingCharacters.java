package algorithms;

import java.util.HashMap;

/**
 * No3. 题目：
 * 给出一个string，求不带有重复字符的最长子串
 * 如"abcabcbb"，答案为"abc"，长度为3
 * 如"bbbbb"，答案为"b"，长度为1
 * 如"pwwkew"，答案为"wke"，长度为3
 * 
 * @author peige
 *
 */
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
