// Time Complexity :O(Log(M*N))
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :Yes
//Still confused about the index conversion, need to think deeper on the question.


// Your code here along with comments explaining your approach in three sentences only
// I made use of the solution discussed in class.
// We can treat the 2D matrix as a 1D array and apply binary search on it. 
// We can calculate the mid index and convert it back to row
//  and column index using the number of columns in the matrix. 
// We can then compare the mid value with the target and adjust 
// the low and high pointers accordingly until we find the target or the search space is empty.

public class SearchinMatrix {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows=matrix.length;
        int cols=matrix[0].length;

        int low=0;
        int high=rows*cols-1;

        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int midval=matrix[mid/cols][mid%cols]; //we get index convert it back to row*column 

            if(midval==target)
            {
                return true;
            }
            if(midval<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return false;
        
    }
}
}
