class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[] count = new int[26]; // for 'a' to 'z'

        // Step 1: Count characters in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Step 2: Try to construct ransomNote
        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;

            // If any count goes negative → not enough letters
            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
