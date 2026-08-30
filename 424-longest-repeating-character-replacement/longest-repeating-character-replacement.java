class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq=new int[26];
        int maxfreq=0;
        int maxWindow=0;
        int left=0;
        for(int rig=0;rig<s.length();rig++){
            freq[s.charAt(rig)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(rig)-'A']);

            int windowlen=rig-left+1;
            
            if(windowlen-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;

            }

            windowlen=rig-left+1;
            maxWindow=Math.max(windowlen,maxWindow);


        }
        return maxWindow;
    }   
}