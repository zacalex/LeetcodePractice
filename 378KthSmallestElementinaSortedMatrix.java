class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix[0].length == 0) return -1;
        int r = matrix.length;
        int c = matrix[0].length;
        int low = matrix[0][0];
        int high = matrix[r - 1][c - 1];
        while(low < high){
            int count = 0;
            int mid = low + (high - low)/2;
            int j = c - 1;
            for(int i = 0; i < r; i++){
                while(j >= 0 && matrix[i][j] > mid) j--;
                count += j + 1;
            }
            if(count < k) low = mid + 1;
            else high = mid;
            
        }
        return low;
    }
}