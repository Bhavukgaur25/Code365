package Day_91.Bhavuk;

class Solution {
    public double averageWaitingTime(int[][] customers) {
        long totalWaitingTime = 0;
        long currMinute = customers[0][0];
        for(int i  =0; i<customers.length; i++){
            int arrivalTime = customers[i][0];
            if(currMinute<arrivalTime){
                currMinute = arrivalTime;
            }
            currMinute += customers[i][1];
            totalWaitingTime += currMinute-arrivalTime;
        }
        double avgTime = (double)totalWaitingTime/customers.length;
        return avgTime;
    }
}