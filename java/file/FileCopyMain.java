package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileCopyMain {
    public static void main(String[] args) {
        try {
            File fl = new File("/Users/seonghun/Desktop/사과.png");
            FileInputStream fls = new FileInputStream(fl);

            FileOutputStream fos = new FileOutputStream("/Users/seonghun/Desktop/a.png");
            byte[] bytes = new byte[1024];
            int readbit = 0;
            while ((readbit = fls.read(bytes)) != -1) {
                fos.write(bytes, 0, readbit);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
