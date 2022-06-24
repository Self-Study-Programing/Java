package java2;

import java.io.*;
import java.util.ArrayList;

public class FileDelete extends FileHandler {
    public static File outFile = new File("/Users/seonghun/공부/spring/network/src/java2/$$$$$$$$.txt");

    public FileDelete() throws FileNotFoundException {
        super();
        fos = new FileOutputStream(outFile);
        out = new PrintWriter(fos);
    }

    @Override
    public void run() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> e = new ArrayList<String>();
        int equal = 0;

        System.out.print("삭제 할 이름을 입력해주세요: ");
        String name = scanner.nextLine();
        String phone = "";

        String thisLine = "";
        while ((thisLine = in.readLine()) != null) {
            list.add(thisLine);
            if(thisLine.split(" ")[0].compareTo(name) == 0){
                equal++;
                e.add(thisLine);
            }
        }

        if(equal == 0){
            System.out.println("찾으시는 이름은 없습니다");
            return;
        }

        if(equal >= 2){
            e.forEach(System.out::println);
            System.out.print("전화번호를 입력해주세요: ");
            phone = scanner.nextLine();
        }

        for(int i = 0; i<list.size(); i++){
            String s = list.get(i);
            if(s.contains(e.get(0).split(" ")[0]) && s.contains(phone)){
                continue;
            }
            out.println(list.get(i));
        }

        setStream();

        phoneBook.delete();
        outFile.renameTo(new File("/Users/seonghun/공부/spring/network/src/java2/phoneBook.txt"));
    }
}
