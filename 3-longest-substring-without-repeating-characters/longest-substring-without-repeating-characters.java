class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int maxlen=0;
        int n=s.length();
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch) && map.get(ch)>=l){
                l=map.get(ch)+1;
            }
            int len=r-l+1;
            maxlen=Math.max(maxlen,len);
            map.put(ch,r);

            r++;
        }
        return maxlen;

    }
}