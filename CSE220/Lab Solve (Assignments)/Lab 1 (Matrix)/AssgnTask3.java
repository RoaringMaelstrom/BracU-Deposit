//Assignment Task 03: Game Arena
class AssgnTask3 {

    // Complete this method so that it gives the Expected Output
    // YOU ONLY HAVE TO SUBMIT THIS METHOD, NO OTHER DRIVER CODE
    //AssignmentTask3
    public static void playGame(Integer[][] arena)
    {
        int columnSize = arena.length;
        int rowSize = arena[0].length;
        int point = 0;
        for (int r = 0; r < columnSize; r++)
            {
            for (int c = 0; c < rowSize; c++)
                {
                if (arena[r][c] != 0 && arena[r][c] % 50 == 0)
                    {
                    if (r == 0)
                        if (arena[r + 1][c] == 2) point += 2;

                    else if (r == (columnSize - 1))
                        if (arena[r - 1][c] == 2) point += 2;

                    else
                    {
                        if (arena[r - 1][c] == 2) point += 2;
                        if (arena[r + 1][c] == 2) point += 2;
                    }

                    if (c == 0)
                        if (arena[r][c + 1] == 2) point += 2;

                    else if (c == (rowSize - 1))
                        if (arena[r][c - 1] == 2) point += 2;

                    else {
                        if (arena[r][c - 1] == 2) point += 2;
                        if (arena[r][c + 1] == 2) point += 2;
                    }
                }
            }
        }
        System.out.print("Points gained: " + point + ". ");
        if (point < 10) System.out.println("Your team is out.");
        else System.out.println("Your team has survived the game.");
    }
    //Method Over

    // DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args) {
        Integer[][] arena = {
                { 0, 2, 2, 0 },
                { 50, 1, 2, 0 },
                { 2, 2, 2, 0 },
                { 1, 100, 2, 0 }
        };
        System.out.println("Given Arena: ");
        Arr.print2D(arena);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 6. Your team is out.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena);

        System.out.print("\n======================\n");

        Integer[][] arena1 = {
                { 0, 2, 2, 0, 2 },
                { 1, 50, 2, 1, 100 },
                { 2, 2, 2, 0, 2 },
                { 0, 200, 2, 0, 0 }
        };
        System.out.println("\nGiven Arena: ");
        Arr.print2D(arena1);

        System.out.println("\nExpected Output:");
        System.out.print("Points Gained: 14. Your team has survived the game.\n");

        System.out.print("\nYour Output:\n");
        playGame(arena1);
    }
}
