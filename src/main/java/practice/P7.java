package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class P7 {
    public static void main(String[] args) {
        List<String> command = new ArrayList<>();
        command.add("ffmpeg");
        command.add("=-version");
        //command.add("-version");
        try {
            Process process = new ProcessBuilder(command).start();
            process.waitFor();
            if(process.exitValue()!=0){
                System.out.println("Error occured");
                BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                reader.lines().forEach(e-> System.out.println(e));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
