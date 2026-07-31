class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    void mergeSort(int[] arr, int l, int r){
        if(l>=r) return;
        int m = (l+r)/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }
    void merge(int[] arr, int l, int m, int r){
        ArrayList<Integer> tmp = new ArrayList<>();
        int i = l, j = m+1;

        while(i<=m && j<=r){
            if(arr[i] <= arr[j]) tmp.add(arr[i++]);
            else tmp.add(arr[j++]);
        }

        while(i<=m) tmp.add(arr[i++]);
        while(j<=r) tmp.add(arr[j++]);

        for(i = l; i<=r; i++) arr[i] = tmp.get(i-l);
    }
}