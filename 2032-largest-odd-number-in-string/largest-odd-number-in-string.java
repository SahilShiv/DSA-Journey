class Solution {
    public String largestOddNumber(String num) {
        int ele=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0')%2!=0){
                ele=i;
                break;
            }
        }
        int j=0;
        while(j<=ele && num.charAt(j)=='0'){
            j++;
        }

        return num.substring(j,ele+1);
    }
}