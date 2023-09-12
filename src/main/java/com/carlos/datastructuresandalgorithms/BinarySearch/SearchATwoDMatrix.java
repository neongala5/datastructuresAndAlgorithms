package com.carlos.datastructuresandalgorithms.BinarySearch;

class SearchATwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        // you can imagine its just one long array instead to make it easier.
        int left = 0;
        int right = (rows * columns) - 1;

        while(left <= right) {
            int midPointIndex = (left + right) /2;
            int midpointValue = matrix[midPointIndex / columns][midPointIndex % columns];

            if(midpointValue == target) {
                return true;
            } else if(midpointValue < target){
                left = midPointIndex + 1;
            } else if(midpointValue > target) {
                right = midPointIndex -1;
            }
        }
        return false;
    }
}