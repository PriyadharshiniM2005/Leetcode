// Last updated: 2/9/2026, 4:11:27 PM
class Solution {
    public List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>>result=new ArrayList<>();
    int j=0;
    List<Integer>  x=new ArrayList<>();
    subset(result,x,arr,j);
    return result;
    }
    public static void subset(List<List<Integer>> result,List<Integer>current,int[] arr,int j){
        result.add(new ArrayList<>(current));
        for(int i=j;i<arr.length;i++){
            current.add(arr[i]);
            subset(result,current,arr,i+1);
            current.remove(current.size()-1);
        }
    }
}