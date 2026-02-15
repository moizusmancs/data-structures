class Solution {

    public int countCharacters(String[] words, String chars) {

        int[] count = new int[26];
        for (char c : chars.toCharArray()) {
            count[c - 'a']++;
        }
        int total = 0;

        for (String word : words) {
            if (canForm(word, 0, count)) {
                total += word.length();
            }
        }

        return total;
    }

    private boolean canForm(String word, int index, int[] count) {

        if (index == word.length()) {
            return true;
        }

        char c = word.charAt(index);
        int pos = c - 'a';

        if (count[pos] == 0) {
            return false;
        }
        count[pos]--;

        boolean result = canForm(word, index + 1, count);
        count[pos]++;

        return result;
    }
}
