import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemE
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int n = Integer.parseInt(in[0]) + 1;
        int m = Integer.parseInt(in[1]);
        in = reader.readLine().split(" ");
        String[] in2 = reader.readLine().split(" ");
        int[] count = new int[n];

        for (int i = 0; i < m; ++i)
        {
            --count[Integer.parseInt(in[i])];
            ++count[Integer.parseInt(in2[i])];
        }

        for (int i = 1; i < n; ++i) writer.write(count[i] + " ");

        reader.close();
        writer.flush(); writer.close();
    }
}