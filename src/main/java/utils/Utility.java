package utils;

import java.io.*;

/**
 * @author 苍镜月
 * @version 1.0
 * @implNote
 */
public class Utility {
    private static String output = "";
    private static String input = "";
    public static BufferedWriter bw;
    public static BufferedReader br;

    public static String readLine() throws IOException {
        return br.readLine();
    }

    public static void write(String s) throws IOException {
        bw.write(s);
        bw.newLine();
    }

    public static void close() throws IOException {
        br.close();
        bw.close();
    }

    public static void setOutput(String output) throws IOException {
        Utility.output = output;
        bw = new BufferedWriter(new FileWriter(output));
    }

    public static void setInput(String input) throws FileNotFoundException {
        Utility.input = input;
        br = new BufferedReader(new FileReader(input));
    }
}
