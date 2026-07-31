class Solution {
    public int minimumPushes(String word) {
        int pushes=0;
        int[] fre=new int[26];
        int n=word.length();
        for(int i=0;i<n;i++){
            char ch=word.charAt(i);
            fre[ch-'a']++;
        }
        Arrays.sort(fre);
        for(int i=25;i>=0;i--){
            int product = ((25-i)/8+1);
            pushes+=fre[i]* product;
        }
        return pushes;
    }
}