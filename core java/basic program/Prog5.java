// FileReader class used to read the values for existing file
import java.io.*;
public class Prog5 {
    public static void main(String arr[]) throws IOException
    {
        FileReader fr=new FileReader("input.txt");
        BufferedReader br=new BufferedReader(fr);
        String str=br.readLine();
        System.out.println("print file content:"+str);
    }
}
