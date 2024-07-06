package Day_88.Bhavuk;

class Solution {
    public int passThePillow(int n, int time) {
        int start = 1;
        int end = n;
        int cycle = time / (n - 1);
        int remainder = time % (n - 1);

        if (cycle % 2 == 0) {
            return start + remainder;
        }
        return end - remainder;
    }
}