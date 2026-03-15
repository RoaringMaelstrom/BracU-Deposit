//Assignment Task 01: Row Rotation Policy
class AssgnTask1 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    // AssignmentTask1
    public static Integer rowRotation(Integer examWeek, String[][] matrix)
    {
        int rotationCounter = 1;
        int columnSize = matrix.length;
        int rowSize = matrix[0].length;
        String[] tempStore = new String[rowSize];
        while (rotationCounter < examWeek)
        {
            for (int i = 0; i < rowSize; i++) tempStore[i] = matrix[columnSize - 1][i];
            for (int k = columnSize - 2; k > -1; k--)
                for (int i = 0; i < rowSize; i++) matrix[k + 1][i] = matrix[k][i];
            for (int i = 0; i < rowSize; i++) matrix[0][i] = tempStore[i];
            rotationCounter++;
        }
        Arr.print2D(matrix);
        for (int r = 0; r < columnSize; r++)
            for (int c = 0; c < rowSize; c++)
                if (matrix[r][c] == "AA") return (c + 1);
        return -1;
    }
    //Method Over

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        String[][] seatStatus = {
                { "A", "B", "C", "D", "E" },
                { "F", "G", "H", "I", "J" },
                { "K", "L", "M", "N", "O" },
                { "P", "Q", "R", "S", "T" },
                { "U", "V", "W", "X", "Y" },
                { "Z", "AA", "BB", "CC", "DD" }
        };
        System.out.println("Given Seat Status: ");
        Arr.print2D(seatStatus);

        System.out.println("\nExpected Output:");
        System.out.println("| U  | V  | W  | X  | Y  | ");
        System.out.println("| Z  | AA | BB | CC | DD | ");
        System.out.println("| A  | B  | C  | D  | E  | ");
        System.out.println("| F  | G  | H  | I  | J  | ");
        System.out.println("| K  | L  | M  | N  | O  | ");
        System.out.println("| P  | Q  | R  | S  | T  | ");
        System.out.println("Your friend AA will be on row 2");

        System.out.print("\nYour Output:\n");
        Integer examWeek = 3;
        // This following should print modified seat status after rotation and return
        // the current exam week
        Integer rowNumber = rowRotation(examWeek, seatStatus);
        // The following should print Your friend AA will be on row 2
        System.out.println("Your friend AA will be on row " + rowNumber);
    }
}
