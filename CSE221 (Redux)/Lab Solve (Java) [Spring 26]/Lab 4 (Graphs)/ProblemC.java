import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemC
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int[][] matrix = new int[n][n];
        int items;

        for (int i = 0; i < n; ++i)
        {
            in = reader.readLine().split(" ");
            items = Integer.parseInt(in[0]) + 1;
            for (int j = 1;j < items; ++j) matrix[i][Integer.parseInt(in[j])] = 1;
        }

        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j) writer.write(matrix[i][j] + " ");
            if (i == n - 1) break;
            writer.newLine();
        }

        reader.close();
        writer.flush(); writer.close();
    }
}