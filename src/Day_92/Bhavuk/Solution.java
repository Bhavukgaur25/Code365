package Day_92.Bhavuk;
class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String i : logs){
            if(i.charAt(0)=='.'){
                if(i.length()==3 && count != 0){
                    count--;
                }
            }
            else{
                count++;
            }
        }
        return count;

    }
}