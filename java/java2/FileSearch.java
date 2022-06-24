package java2;

import java.io.*;

public class FileSearch extends FileHandler{
    public FileSearch() throws FileNotFoundException {
        super();
    }

    @Override
    public void run() throws IOException {
        System.out.print("찾을 이름을 입력해주세요: ");
        String nameOrPhone = scanner.nextLine();

        String thisLine = "";
        int i = 0;

        while ((thisLine = in.readLine()) != null) {
            if(thisLine.split(" ")[0].contains(nameOrPhone) || thisLine.split(" ")[1].contains(nameOrPhone)){
                System.out.println(thisLine);
                i++;
            }
        }
        if(i == 0){
            System.out.println("존재하지 않습니다");
        }
    }
}
