import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ProblemF
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] in = reader.readLine().split(" ");
        int border = Integer.parseInt(in[0]);
        in = reader.readLine().split(" ");
        int x = Integer.parseInt(in[1]);
        int y = Integer.parseInt(in[0]);
        int count = 0;

        if (y > 1)
        {
            if (x > 1) {writer.write((y - 1) +" " + (x - 1) + "\n"); ++count;}
            writer.write((y - 1) +" " + (x) + "\n"); ++count;
            if (x < border) {writer.write((y - 1) +" " + (x + 1) + "\n"); ++count;}
        }

        if (x > 1) {writer.write(y +" " + (x - 1) + "\n"); ++count;}
        if (x < border) {writer.write(y +" " + (x + 1) + "\n"); ++count;}

        if (y < border)
        {
            if (x > 1) {writer.write((y + 1) +" " + (x - 1) + "\n"); ++count;}
            writer.write((y + 1) +" " + (x) + "\n"); ++count;
            if (x < border) {writer.write((y + 1) +" " + (x + 1)); ++count;}
        }

        System.out.println(count);
        reader.close();
        writer.flush(); writer.close();
    }
}