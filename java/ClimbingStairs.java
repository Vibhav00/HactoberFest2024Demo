class Solution {
    public int climbStairs(int n) {
   
     int[] arr = new int[n+1];
     return climbStrairsNew(n,arr);
    }
    public int climbStrairsNew(int n , int[] arr){
    if(n==2)
    return 2;
    if(n==1 )
    return 1;
    if(arr[n]!=0)
      return arr[n];
    arr[n]=  climbStrairsNew(n-1,arr) + climbStrairsNew(n-2,arr);
    return arr[n];
    }
}
