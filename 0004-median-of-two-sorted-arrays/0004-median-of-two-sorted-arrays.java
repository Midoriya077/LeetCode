class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        for(int i=nums1.length;i<arr.length;i++){
            arr[i]=nums2[i-nums1.length];
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            return arr[(arr.length-1)/2];
        }
        else{
            int a = (arr.length/2)-1;
            int b = (arr.length/2);
            return (arr[a]+arr[b])/2.0;
        }
        
        }
}