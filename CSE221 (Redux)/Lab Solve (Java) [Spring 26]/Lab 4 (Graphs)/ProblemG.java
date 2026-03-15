import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemG
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int yBorder = Integer.parseInt(in[1]) + 2;
        int xBorder = Integer.parseInt(in[0]) + 2;
        int knights = Integer.parseInt(in[2]);
        int[][] positions = new int[knights][2];
        boolean[][] truthtable = new boolean[xBorder][yBorder];
        int x, y;
        boolean hitmark = false;

        for (int i = 0; i < knights; ++i)
        {
            in = reader.readLine().split(" ");
            y = Integer.parseInt(in[1]);
            positions[i][1] = y;
            x = Integer.parseInt(in[0]);
            positions[i][0] = x;
            truthtable[x][y] = true;
        }

        for (int i = 0; i < knights; ++i)
        {
            x = positions[i][0];
            y = positions[i][1];

            if (x > 2)
            {
                if (y > 1)
                    if (truthtable[x - 2][y - 1]) {hitmark = true; break;}
                if (y < yBorder)
                    if (truthtable[x - 2][y + 1]) {hitmark = true; break;}
            }

            if (x > 1)
            {
                if (y > 2)
                    if (truthtable[x - 1][y - 2]) {hitmark = true; break;}
                if (y < yBorder - 2)
                    if (truthtable[x - 1][y + 2]) {hitmark = true; break;}
            }

            if (x < xBorder - 2)
            {
                if (y > 1)
                    if (truthtable[x + 2][y - 1]) {hitmark = true; break;}
                if (y < yBorder)
                    if (truthtable[x + 2][y + 1]) {hitmark = true; break;}
            }

            if (x < xBorder)
            {
                if (y > 2)
                    if (truthtable[x + 1][y - 2]) {hitmark = true; break;}
                if (y < yBorder - 2)
                    if (truthtable[x + 1][y + 2]) {hitmark = true; break;}
            }
        }

        if (hitmark) writer.write("YES");
        else {writer.write("NO");}
        reader.close();
        writer.flush(); writer.close();
    }
}