class Solution {
    int minCount(int[] freq){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
            mini=Math.min(mini,freq[i]);
            }
        }
        return mini;
    }

       int maxCount(int[] freq){
        int maxi=0;
        for(int i=0;i<26;i++){
            maxi=Math.max(maxi,freq[i]);
        }
        return maxi;
    }
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int beauty=maxCount(freq)-minCount(freq);
                sum+=beauty;
            }
        }
        return sum;
    }
}