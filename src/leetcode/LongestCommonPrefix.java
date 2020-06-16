package leetcode;

public class LongestCommonPrefix {
    // https://leetcode-cn.com/problems/longest-common-prefix/
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].equals("")) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int minLenStr = strs[0].length();
        for (String str : strs) {
            if (minLenStr > str.length()) {
                minLenStr = str.length();
            }
        }
        String result = "";
        char cur = 'a';
        for (int i = 0; i < minLenStr; i++) {
            boolean mark = true;
            for (int j = 0; j < strs.length; j++) {
                char[] c = strs[j].toCharArray();
                cur = (strs[0].toCharArray())[i];
                if (cur != c[i]) {
                    mark = false;
                }
            }

            if (mark) {
                result += (char) cur;
            }else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = {"flower", "flow", "flight"};
        String[] s1 = {""};
        String[] s2 = {};
        String[] s3 = {"a", "b"};
        LongestCommonPrefix obj = new LongestCommonPrefix();
//        System.out.println(obj.longestCommonPrefix(s));
//        System.out.println(obj.longestCommonPrefix(s1));
//        System.out.println(obj.longestCommonPrefix(s2));
        System.out.println(obj.longestCommonPrefix(s3));
    }
}
