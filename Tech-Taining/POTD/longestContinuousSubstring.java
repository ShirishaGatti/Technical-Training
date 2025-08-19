// class longestContinuousSubstring {
//     public int longestContinuousSubstring(String s) {
//         int count=1,i=0,j=1,max=1;
//         while(j<s.length()){
//             if(s.charAt(j)-s.charAt(j-1)==1){
//                 count++;
//             }
//             else{
//                 count=1;
//             }
//             max=Math.max(max,count);
//             j++;
//         }
//         return max;
//     }
// }


class Solution {
    public int longestContinuousSubstring(String s) {
        int count=1,i=0,j=1,max=1;
        while(j<s.length()){
            int first=s.charAt(i);
            int next=s.charAt(j);
         //   System.out.println(first+" "+next+" "+max);
            if((next-first)==count){
                max=Math.max(max,j-i+1);
                count++;
                j++;
               System.out.println(count);
            }
            else{

                count=1;
                i=j;
                j++;
            }
        }
        return max;
    }
}