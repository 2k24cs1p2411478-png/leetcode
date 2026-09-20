class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String st = words[i];
            int sum = 0;
            for (int j = 0; j < st.length(); j++) {
                char ch = st.charAt(j);
                int index = ch - 'a';
                sum += weights[index];
            }
            int rem = sum % 26;
            char ans = (char) ('z' - rem);
            result.append(ans);
        }
        return result.toString();
    }
}