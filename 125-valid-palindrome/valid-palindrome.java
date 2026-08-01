class Solution {
    public boolean isPalindrome(String s) {

        ArrayList<Character> characters = new ArrayList<>();

        // Step 1: Build a cleaned list
        for (int i = 0; i < s.length(); i++) {

            char currentCharacter = Character.toLowerCase(s.charAt(i));

            if (Character.isLetterOrDigit(currentCharacter)) {
                characters.add(currentCharacter);
            }
        }

        // Step 2: Compare from both ends
        int left = 0;
        int right = characters.size() - 1;

        while (left < right) {

            if (characters.get(left) != characters.get(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}