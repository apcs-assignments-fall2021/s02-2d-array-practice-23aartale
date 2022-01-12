public class MyMain {

    // Returns the number of odd numbers in mat
    public static int countOdds(int[][] mat) {
        int counter = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                if (mat[row][col] % 2 != 0){
                    counter++;
                }
            }
        }
        return counter;
    }

    // Returns the largest value in mat
    public static int findLargest(int[][] mat) {
        int holder = Integer.MIN_VALUE;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat [row][col] > holder){
                    holder = mat [row][col];
                }
            }
        }
        return holder;
    }

    // Write a method that "left-shifts" each row in a 2D array.
    // This means that for each row, all the numbers should be
    // shifted to the left by 1, with wraparound (the first value
    // should wrap around to the last entry in the row)
    public static int[][] leftShift(int[][] mat) {
        for (int row = 0; row < mat.length; row++) {
            int temp = mat[row][0];
            for (int col = 0; col < mat[0].length -1 ; col++) {
                int hold = mat [row][col];
                mat [row][col] = mat[row][col+1];
                mat[row][col+1]= hold;
                if (col == mat[0].length){
                    mat[row][mat[0].length] = temp;
                }
                }
            }
        return mat;
    }

    // Creates a 2D array of size arraySize x arraySize
    // where each value is each to the sum of its row and col indexes
    public static int[][] arrayBuilder(int arraySize) {
        int mat [][] = new int [arraySize][arraySize];
            for (int row = 0; row < arraySize; row++){
                for (int col = 0; col < arraySize; col++){
                    mat[row][col] = row + col;
                }
            }
        return mat;
    }










    // Methods for the homework:

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        double adder = 0;
        double total = 0;
        double mult = mat.length * mat[0].length;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                adder += mat[row][col];
                total = adder / mult;
            }
        }
        return total;
    }

    // Returns the median of the 2D array mat
    // Remember that the array is sorted!
    public static double median(double[][] mat) {
        int row1 = mat.length;
        int col1 = mat[0].length;
        int row = mat.length / 2;
        int col = mat[0].length / 2;
        double median = 0;
        if (row1 % 2 != 0 && col1 % 2 != 0){
            median = mat[row][col];
        }
        if (row1 % 2 != 0 && col1 % 2 == 0){
            median = (mat[row][col-1] + mat[row][col]) / 2;
        }
        if (row1 % 2 == 0){
            median = (mat[row-1][col1-1] + mat[row][0]) / 2;
        }
        return median;
    }


    // Returns the mode of the 2D array mat
    // Remember that the array is sorted!
    public static double mode(double[][] mat) {
        int x = 0;
        int y = 0;f
        int counter = 1;
        int temp = 0;
        for (int row = 0; row < mat.length; row++){
            for (int col = 0; col < mat[0].length; col++){
                temp = counter;
                counter = 1;
                for (int i = 0; i < mat.length; i++){
                    for (int j = 0; j < mat[0].length; j++){
                        if (mat[row][col] == mat [i][j]){
                            counter += 1;
                            if (temp < counter){
                                x = row;
                                y = col;
                            }
                        }
                    }
                }
            }
        }
        return mat[x][y];
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}
