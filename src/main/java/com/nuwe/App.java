package com.nuwe;

class App {

    public static String longestCommonPrefix(String[] strs) {
        int common = 0;
        while (common < strs[0].length()) {
            char c = strs[0].charAt(common);
            for (int i = 1; i < strs.length; i++) {
                if (common >= strs[i].length() || strs[i].charAt(common) != c) {
                    return strs[0].substring(0, common);
                }
            }
            common++;
        }
        return strs[0].substring(0, common);
    }
}