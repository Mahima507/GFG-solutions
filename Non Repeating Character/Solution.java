class Solution {
    // Function to find the first non-repeating character in a string.
    char nonrepeatingCharacter(String s) {
        HashSet<Character> duplicateChars = new HashSet<>();
        HashSet<Character> uniqueChars = new HashSet<>();
        
        for (char c : s.toCharArray()) {
            if (!duplicateChars.contains(c)) {
                if (uniqueChars.contains(c)) {
                    uniqueChars.remove(c);
                    duplicateChars.add(c);
                } else {
                    uniqueChars.add(c);
                }
            }
        }

        if (uniqueChars.isEmpty()) {
            return '$';
        }

        for (char c : s.toCharArray()) {
            if (uniqueChars.contains(c)) {
                return c;
            }
        }
        return '$';
    }
}
