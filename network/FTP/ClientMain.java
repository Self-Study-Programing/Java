package FTP;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            Socket sc = new Socket("10.80.162.147",5050);

            Output_Message out = new Output_Message(sc);
            out.start();

            Input_Message in = new Input_Message(sc);
            in.start();

//            br.readLine();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
