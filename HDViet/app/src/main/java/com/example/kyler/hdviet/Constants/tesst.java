package com.example.kyler.hdviet.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by kyler on 06/07/2017.
 */

public class tesst {

    public static void main(String[] args) {
//        initCounting();
//        initHTML();
    }

    private static void initHTML(){
        String content = null;
        try {
            URL url = new URL("http://vietlott.vn/vi/choi/mega-6-45/thong-ke/");
            InputStream is = url.openStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ( (line = br.readLine()) != null)
                System.out.println(line);

            br.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(content);
    }

















    private static void initCounting(){
        long startTime = System.nanoTime();
        int[] data = new int[]{361, 167, 102, 381, 348, 305, 93, 78, 359, 196, 406, 162, 498, 73, 306, 445, 326, 66, 398, 53};
        int[] arrangedData = countingSort(data);
        int[] arrangedData2 = bubbleSort(data);
        String result = "";
        for (int i = 0; i < arrangedData.length; i++) {
            result = result + arrangedData[i];
            if (i < arrangedData.length - 1) {
                result += ", ";
            }
            if (i % 20 == 0) {
                result += "\n";
            }
        }
        long stopTime = System.nanoTime();
        System.out.print(result + "\n");
        System.out.println("Time execute: " + (double) (stopTime - startTime)/1000000 +"ms");
    }

    private static int[] countingSort(int[] statues) {
        int max = statues[0];
        int length = statues.length;
        int pos = 0;
        int[] oData = new int[statues.length];

        for (pos = 1; pos < length; pos++) {
            if (max < statues[pos]) max = statues[pos];
        }

        int[] tray = new int[max + 1];

        for (pos = 0; pos < max; pos++) {
            tray[pos] = 0;
        }

        for (pos = 0; pos < length; pos++) {
            tray[statues[pos]]++;
        }

        for (pos = 1; pos <= max; pos++) {
            tray[pos] = tray[pos] + tray[pos - 1];
        }

        for (pos = length - 1; pos >= 0; pos--) {
            oData[tray[statues[pos]] - 1] = statues[pos];
            if (pos != 0)
                tray[statues[pos]]--;
        }
        return oData;
    }

    private static int[] bubbleSort(int[] data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-1;j++){
                if(data[j]>data[j+1]){
                    data[j] = data[j]+data[j+1];
                    data[j+1] = data[j]-data[j+1];
                    data[j] = data[j]-data[j+1];
                }
            }
        }
        return data;
    }
}
