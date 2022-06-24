package java2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExit extends FileHandler{

    public FileExit() throws FileNotFoundException {
    }

    @Override
    public void run() throws IOException {
        System.out.println("프로그램 종료");
        System.exit(0);
    }
}
