//Convert a time in 12-hour AM/PM format to military(24-hour) time.
// Solved by BrunoRijo in 16-08-2022 at 13:50

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String timeConversion(String s) {
        if ((Integer.parseInt(s.substring(0, 2)) == 12) ){
            if(s.endsWith("PM")) return s.replaceAll("PM", "");
            else return s.replaceFirst(
                            s.substring(0, 2),"00")                            
                            .replaceAll("AM", "");
        } else {
            if(s.endsWith("PM")) return s.replaceFirst(s.substring(0, 2),""
                +(Integer.parseInt(s.substring(0, 2)) + 12))
                .replaceAll("PM", "");
            else return s.replaceAll("AM", "");
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

