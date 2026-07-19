class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> indices = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch  == c)
                indices.add(i);
        }
        int[] result = new int[s.length()];
         for (int i = 0; i < s.length(); i++) {
            int min = Integer.MAX_VALUE;
              for (int j = 0; j < indices.size(); j++) {
                    min = Math.min(min, Math.abs(indices.get(j) - i));
         }

            result[i] = min;
        }
        return result;
    }
}