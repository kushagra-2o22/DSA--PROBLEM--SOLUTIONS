// leetcode:-https://leetcode.com/problems/search-a-2d-matrix/description/

// Soloution

//USing binary search (think to convert hypotheticaly 2D to 1D matrix)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length,m=matrix[0].length;
       int low=0;
       int high=(n*m)-1;
       int mid=0,row=0,col=0;
       while(low<=high){
        mid=(low+high)/2;
        row=mid/m;
        col=mid%m;
        if(matrix[row][col]==target){
            return true;
        }else if(matrix[row][col]<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
       }
       return false;
    }
}
