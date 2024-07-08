package Day_90.Bhavuk;

class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList();
        for(int i =1; i<=n; i++){
            list.add(i);
        }
        int i = 0;
        int length = list.size();
        while(length!=1){
            list.remove((i+k-1)%list.size());
            i=(i+k-1)%length;
            length = list.size();
        }
        return list.get(0);

    }
}