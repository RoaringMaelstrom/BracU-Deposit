import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemB
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int n = Integer.parseInt(in[0]);
        int m = Integer.parseInt(in[1]);
        in = reader.readLine().split(" ");
        String in2[] = reader.readLine().split(" ");
        String[] in3 = reader.readLine().split(" ");
        Edge[] span = new Edge[n];
        Edge temp;

        for (int i = 0; i < m; ++i)
        {
            if (span[Integer.parseInt(in[i]) - 1] == null) span[Integer.parseInt(in[i]) - 1] = new Edge(Integer.parseInt(in2[i]), Integer.parseInt(in3[i]));
            else
            {
                for (temp = span[Integer.parseInt(in[i]) - 1]; temp.nEdge != null; temp = temp.nEdge)
                {}
                temp.nEdge = new Edge(Integer.parseInt(in2[i]), Integer.parseInt(in3[i]));
            }
        }

        for (int i = 0; i <= n; ++i)
        {
            writer.write(i + 1 + ": ");
            for (temp = span[i]; temp != null; temp = temp.nEdge) writer.write("(" + (temp.destination) + "," + (temp.weight) + ")");
            if (i == n - 1) break;
            writer.newLine();
        }

        reader.close();
        writer.flush(); writer.close();
    }
}

class Edge
{
    public int destination;
    public int weight;
    public Edge nEdge;

    public Edge (int destination, int weight)
    {this.destination = destination; this.weight = weight;}
}