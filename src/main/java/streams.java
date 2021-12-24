import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class streams implements Runnable{
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));
        int age = Integer.parseInt(bufferedReader.readLine().trim());
        int []array = Arrays.stream(bufferedReader.readLine().replaceAll("\\s+$","")
                .split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(number(array));
     /*   bufferedWriter.write("hello there");
        bufferedWriter.newLine();
        bufferedWriter.write(String.valueOf(age));*/

        bufferedWriter.close();
        bufferedReader.close();
    }
    public static int number(int []array) {
        int num = (IntStream.of(array).filter(s->(s!=IntStream.of(array).max()
            .getAsInt())).max().getAsInt());
        return num;
    }

    @Override
    public void run() {
        int [] array = {22,33, 44, 55 ,66};
        System.out.println(number(array));
    }
}
