package file;

import java.io.*;
import java.net.Socket;

public class FileCopyClient {
    public static void main(String[] args) throws IOException {
        File fl = new File("/Users/seonghun/Desktop/사과.png");
        FileInputStream fls = new FileInputStream(fl);

        Socket sc = new Socket("127.0.0.1", 5050);
        OutputStream os = sc.getOutputStream();
        BufferedOutputStream bor = new BufferedOutputStream(os);
        DataOutputStream dos = new DataOutputStream(bor);

        byte[] bytes = new byte[1024];
        int readbit = 0;
        while ((readbit = fls.read(bytes)) != -1) {
            // 파일 전송
            dos.write(bytes, 0, readbit);
        }
    }
}
