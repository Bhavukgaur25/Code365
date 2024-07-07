package Day_89.Bhavuk;
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count = numBottles;  // Start with the initial number of bottles
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            int newBottles = emptyBottles / numExchange;
            int remainder = emptyBottles % numExchange;
            count += newBottles;
            emptyBottles = newBottles + remainder;
        }

        return count;
    }
}
