package ex0512J;

import java.io.File;
import java.util.Scanner;

public class FileProjectCreateAndDelete {
    private File file;
    public void create(String str) {
        this.fileName(str);
        boolean created = file.mkdir();
        deleteCompare(created);
        print(created);
    }

    public void deleteCompare(boolean v){
        if(v == false) file.delete();
    }

    public void print(boolean v){
        System.out.println(v ? "디렉토리가 생성되었습니다." : "디렉토리가 삭제되었습니다.");
    }

    public void fileName(String str) {
        file = new File("/Users/seonghun/공부/filestudy/" + str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileProjectCreateAndDelete fileProjectCreateAndDelete = new FileProjectCreateAndDelete();
        String str = scanner.next();
        fileProjectCreateAndDelete.create(str);
    }
}
