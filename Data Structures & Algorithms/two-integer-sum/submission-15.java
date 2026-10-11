class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] indexMap = new int[nums.length][2];

        for(int i = 0; i<nums.length; i++) {
            indexMap[i][0] = nums[i];
            indexMap[i][1] = i;
        }

        Arrays.sort(indexMap, (a, b) -> Integer.compare(a[0], b[0]));

        int left = 0;
        int right = indexMap.length - 1;

        while(left < right) {
        int currentSum = indexMap[left][0] + indexMap[right][0];
        if(currentSum < target){
            left++;
        }
        else if(currentSum > target) {
            right--;
        }
        else{
            int index1 = indexMap[left][1];
            int index2 = indexMap[right][1];
            if(index1 < index2) {
                return new int[]{index1, index2};
            }
            if(index1 > index2) {
                return new int[]{index2, index1};
            }
            
        }

        
        }

        return new int[0];
    }
}
