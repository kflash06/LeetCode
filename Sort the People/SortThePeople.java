class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int j = 0; j<names.length-1; j++){
                for(int i = 0; i<names.length-1-j; i++){
                    if(heights[i]<heights[i+1]){
                        String t = names[i+1];
                        names[i+1] = names[i];
                        names[i] = t;
                        int tt = heights[i+1];
                        heights[i+1] = heights[i];
                        heights[i] = tt;
                    }
                }
        }
         
         return names;
    }
}