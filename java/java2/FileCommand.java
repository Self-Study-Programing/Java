package java2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCommand extends FileHandler {

    public FileCommand() throws FileNotFoundException {
        super();
    }

    @Override
    public void run() throws IOException {
        while (true) {
            System.out.println("추가: /write, 삭제: /delete, 검색: /search, 종료: /exit");
            String cmd = scanner.nextLine();

            switch (cmd){
                case "/write":
                    new FileWrite().run();
                    break;
                case "/delete":
                    new FileDelete().run();
                    break;
                case "/search":
                    new FileSearch().run();
                    break;
                case "/exit":
                    new FileExit().run();
                    break;
                default:
                    System.out.println("잘못된 명령어 입니다");
            }

        }
    }
}
