class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int max=0;
        for(int i=0;i<=candies.length-1;i++){
            if(candies[i] > max){
                max=candies[i];
            }}
        ArrayList <Boolean> list = new ArrayList<>();
        for(int i=0;i<=candies.length-1;i++){
            if((candies[i]+extraCandies) >= max){
                list.add(i, true);
            }
            else{
                list.add(i, false);
            }
        }
        return list;
    }
}