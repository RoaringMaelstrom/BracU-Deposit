class AssgnTask4 {
    public static void rotateSecret(Character[][] board)
    {
        int y = (board.length - 1) / 2;
        int count = 1;
        for (; y > -1; --y)
        {
            if (count % 2 == 0)
            {
            evenRotate(board, y, y, count);
            evenRotate(board, y, y + 2 * count - 1, count);
            }

            else oddRotate(board, y, y, count);
            ++count;
        }
    }

    private static void evenRotate (Character[][] board, int row, int col, int count)
    {
        int y = row;
        int boundary = y + 2 * count - 1;
        int a = 0;
        char temp = board[row][col];
        char swap;
        for (int w = count*4 - 2; w > 0;)
        {
            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (col == boundary) break;
                ++col;
                ++a;
            }

            if (w == 0) break;

            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (row == boundary) break;
                ++row;
                ++a;
            }

            if (w == 0) break;

            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (col == y) break;
                --col;
                ++a;
            }

            if (w == 0) break;

            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (row == y) break;
                --row;
                ++a;
            }

            if (w == 0) break;
        }
    }

    private static void oddRotate (Character[][] board, int row, int col, int count)
    {
        int y = row;
        int boundary = y + 2 * count - 1;
        int a = 0;
        char temp = board[row][col];
        char swap;
        for (int w = count*8 - 4; w > 0;)
        {
            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (col == boundary) {break;}
                ++col;
                ++a;
            }

            if (w == 0) break;

            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (row == boundary) break;
                ++row;
                ++a;
            }

            if (w == 0) break;

            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (col == y) break;
                --col;
                ++a;
            }

            if (w == 0) break;

            for(;true;)
            {
                if (a == count)
                {
                    swap = board[row][col];
                    board[row][col] = temp;
                    temp = swap;
                    a = 0;
                    --w;
                }

                if (row == y) break;
                --row;
                ++a;
            }

            if (w == 0) break;
        }
    }
    // Method Over
    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        System.out.print("===========Test#1===========\n");
        Character[][] board = {
                { 'T', 'A', 'U', 'S' },
                { 'A', 'R', 'I', '.' },
                { 'D', 'T', 'T', 'N' },
                { 'S', 'C', 'F', 'U' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        Character[][] outputBoard = {
                { 'D', 'A', 'T', 'A' },
                { 'S', 'T', 'R', 'U' },
                { 'C', 'T', 'I', 'S' },
                { 'F', 'U', 'N', '.' }
        };
        System.out.print("DATASTRUCTISFUN.\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 1 Success");
        else
            System.out.println("Test 1 FAILED");

        System.out.print("\n===========Test#2===========\n");

        board = new Character[][] {
                { 'O', 'R', 'I', 'R', 'N', 'P' },
                { 'G', 'S', 'A', 'A', 'L', 'R' },
                { 'L', 'M', 'N', 'O', 'N', 'Y' },
                { 'A', 'H', 'U', 'O', 'O', 'P' },
                { 'T', 'F', 'C', 'T', 'H', 'S' },
                { 'E', 'D', 'Y', 'O', 'C', 'K' }
        };
        System.out.println("Given Board: ");
        Arr.print2D(board);

        System.out.println("\nExpected Output:");
        outputBoard = new Character[][] {
                { 'A', 'L', 'G', 'O', 'R', 'I' },
                { 'T', 'H', 'M', 'S', 'A', 'R' },
                { 'E', 'F', 'U', 'N', 'A', 'N' },
                { 'D', 'C', 'O', 'O', 'L', 'P' },
                { 'Y', 'T', 'H', 'O', 'N', 'R' },
                { 'O', 'C', 'K', 'S', 'P', 'Y' }
        };
        System.out.print("ALGORITHMSAREFUNANDCOOLPYTHONROCKSPY\n");
        Arr.print2D(outputBoard);

        System.out.print("\nYour Output:\n");
        rotateSecret(board);
        Arr.print2D(board);

        if (Arr.compare2D(outputBoard, board))
            System.out.print("Test 2 Success");
        else
            System.out.println("Test 2 FAILED");
    }
}
