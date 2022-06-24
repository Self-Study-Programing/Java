package java2;

import java.io.*;
import java.util.Scanner;

public abstract class FileHandler {
    protected File phoneBook = new File("/Users/seonghun/공부/spring/network/src/java2/phoneBook.txt");
    protected Scanner scanner = new Scanner(System.in);
    protected int[] letter = new int[15];
    protected BufferedReader reader = new BufferedReader(new FileReader(phoneBook));
    protected FileInputStream fis = new FileInputStream(phoneBook);
    protected BufferedReader in = new BufferedReader(new InputStreamReader(fis));
    protected FileOutputStream fos = null;
    protected PrintWriter out = null;

    public FileHandler() throws FileNotFoundException {
    }

    public void InitializationLetter() throws IOException {
        int result = 0;
        String text;
        while ((text = reader.readLine()) != null) {
            result++;
            char first = text.charAt(0);
            int position = convertChar(first);
            letter[position] = result;
        }

        for(int i=0; i<14; i++){
            if(letter[i] == 0){
                while(letter[i] == 0){
                    int k=1;
                    letter[i] = letter[i-k];
                }
            }
        }
    }
    public int convertChar(char character){
        if (character <= '\uB097') {
            return 0; // ㄱ
        } else if (character <= '\uB2E3') {
            return 1; // ㄴ
        } else if (character <= '\uB77B') {
            return 2; // ㄷ
        } else if (character <= '\uB9C7') {
            return 3; // ㄹ
        } else if (character <= '\uBC13') {
            return 4; // ㅁ
        } else if (character <= '\uC0AB') {
            return 5; // ㅂ
        } else if (character <= '\uC543') {
            return 6; // ㅅ
        } else if (character <= '\uC78F') {
            return 7; // ㅇ
        } else if (character <= '\uCC38') {
            return 8; // ㅈ
        } else if (character <= '\uCE73') {
            return 9; // ㅊ
        } else if (character <= '\uD0BF') {
            return 10; // ㅋ
        } else if (character <= '\uD30B') {
            return 11; // ㅌ
        } else if (character <= '\uD557') {
            return 12; // ㅍ
        } else if (character <= '\uD7A3') {
            return 13; // ㅎ
        }
        return -1; // impossibility
    }
    public void setStream() throws IOException {
        out.flush();
        fos.flush();
        in.close();
    }

    public abstract void run() throws IOException;
}
