import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemA
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        int[][] matrix = new int[n][n];

        for (int i = 0; i < m; ++i)
        {
            in = reader.readLine().split(" ");
            matrix[Integer.parseInt(in[0]) - 1][Integer.parseInt(in[1]) - 1] = Integer.parseInt(in[2]);
        }

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j) writer.write(Integer.toString(matrix[i][j]) + " ");
            if (i == n-1) break;
            writer.newLine();
        }

        reader.close();
        writer.flush(); writer.close();
    }
}