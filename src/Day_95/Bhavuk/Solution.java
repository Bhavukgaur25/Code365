package Day_95.Bhavuk;

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,Integer> map = new TreeMap<>(Collections.reverseOrder());
        for(int i = 0; i<heights.length; i++){
            map.put(heights[i],i);
        }
        String[] arr = new String[names.length];
        int i = 0 ;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            arr[i++] = names[entry.getValue()];
        }
        return arr;
    }
}