import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemH
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int n = Integer.parseInt(in[0]) + 1;
        int m = Integer.parseInt(in[1]);
        int[][] matrix = new int[n][n];
        int index, node;

        for (int i = 1; i < n; ++i)
        {
            index = 1;
            for (int j = 1; j < n; ++j)
            {
                if (i == j) continue;
                if (ProblemH.gcd(i, j) == 1) matrix[i][index++] = j;
            }
        }

        for (int i = 0; i < m; ++i)
        {
            in = reader.readLine().split(" ");
            node = Integer.parseInt(in[0]);
            index = Integer.parseInt(in[1]);

            if (index > n) writer.write("-1");
            else if (matrix[node][index] == 0) writer.write("-1");
            else writer.write(matrix[node][index] + "");
            if (i == m - 1) break;
            writer.newLine();
        }

        reader.close();
        writer.flush(); writer.close();
    }

    public static int gcd(int a, int b)
    {return (b == 0) ? a : gcd(b, a % b);}
}