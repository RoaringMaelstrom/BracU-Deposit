//Assignment Task 02: Matrix Compression
class AssgnTask2 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //AssignmentTask 2
    public static Integer[][] compressMatrix(Integer[][] matrix)
    {
        int columnSize = matrix.length;
        int rowSize = matrix[0].length;
        if (columnSize % 2 != 0 || rowSize % 2 != 0) return null;
        int l = 0;
        Integer[][] answer = new Integer[columnSize / 2][rowSize / 2];

        for (int i = 0; i < columnSize; i += 2)
        {
            int k = 0;
            for (int j = 0; j < rowSize; j += 2)
                answer[l][k++] = (matrix[i][j] + matrix[i][j + 1] + matrix[i + 1][j] + matrix[i + 1][j + 1]);
            l++;
        }
        return answer;
    }
    //Method over

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 3, 5, 2 },
                { -2, 0, 6, -3 }
        };
        System.out.println("Given Matrix: ");
        Arr.print2D(matrix);

        System.out.println("\nExpected Output:");
        System.out.print("| 14 | 22 |\n| 2  | 10 |\n");

        System.out.print("\nYour Output:\n");
        Integer[][] returnedArray = compressMatrix(matrix);
        Arr.print2D(returnedArray);
    }
}
