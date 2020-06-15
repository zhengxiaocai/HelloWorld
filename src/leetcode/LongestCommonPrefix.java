package leetcode;

public class LongestCommonPrefix {
    // https://leetcode-cn.com/problems/longest-common-prefix/
    public String longestCommonPrefix(String[] strs) {
        int minLenStr = strs[1].length();
        for (String str : strs) {
            if (minLenStr > str.length()) {
                minLenStr = str.length();
            }
        }
        String result = "";
        for (int i = 0; i < minLenStr; i++) {
            
        }
    }
}
