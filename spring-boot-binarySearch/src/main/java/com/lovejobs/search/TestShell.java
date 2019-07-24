package com.lovejobs.search;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestShell {
    public static void main(String[] args) {

        Process process = null;
        try {
            process = Runtime.getRuntime().exec("youtube1-dl -dsfalsj https://www.hotstar.com/sports/cricket/icc-cricket-world-cup-england-and-wales-2019/south-africa-vs-bangladesh-m190711/match-clips/more-on-epic-moment-with-miandad/1260005636");
            int exitValue = process.waitFor();
            if(0!=exitValue){
                System.out.println("错误");
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
