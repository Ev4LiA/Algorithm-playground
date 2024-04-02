package org.example.daily_challenge;

import java.util.HashMap;

public class April2024 {
    // 58. Length of Last Word
    public int lengthOfLastWord(String s) {
        String[] parts = s.split("\\s+");
        return parts[parts.length - 1].length();
    }

    // 205. Isomorphic Strings
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                } else {
                    return false;
                }
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
