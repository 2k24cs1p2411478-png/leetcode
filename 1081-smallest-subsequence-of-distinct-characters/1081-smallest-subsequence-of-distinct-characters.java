class Solution {
    public String smallestSubsequence(String s) {
       int[] freq = new int[126];
       boolean[] visit = new boolean[126];
       for(char ch : s.toCharArray())
        freq[ch]++;
        ArrayList<Character> st = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(visit[ch] == true){
                freq[ch]--;
                continue;
            }
            int size = st.size();
            while( size > 0){
                char tmp = st.get(size - 1);
                if(tmp > ch && freq[tmp] > 0){
                    st.remove(size - 1);
                    visit[tmp] = false;
                }
                else{
                    break;
                }
                size--;
            }
            st.add(ch);
            visit[ch] = true;
            freq[ch]--;
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : st)
            sb.append(ch);
        return sb.toString();
       
    }
}