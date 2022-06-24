package java2;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileWrite extends FileHandler{
    public static File outFile = new File("/Users/seonghun/공부/spring/network/src/java2/$$$$$$$$.txt");
    public FileWrite() throws FileNotFoundException {
        super();
        fos = new FileOutputStream(outFile);
        out = new PrintWriter(fos);
    }
    public List<String> readFileSome(int num, int end) throws IOException {
        BufferedReader reader = Files.newBufferedReader(Paths.get(phoneBook.getCanonicalPath()), StandardCharsets.UTF_8);
        List<String> line = reader.lines().skip(num).limit(end-num).collect(Collectors.toList());
        return line;
    }
    public int previousnNavigation(List<String> line, String name){
        int pot = 0;

        for(int i=0; i<line.size(); i++) {
            if (name.compareTo(line.get(i).split(" ")[0]) >= 0) {
                pot++;
            }
        }
        return pot;
    }
    private void writeFile(int put, String str) throws IOException {
        String thisLine = "";

        int i = 1;

        //파일 내용을 한라인씩 읽어 삽입될 라인이 오면 문자열을 삽입
        while ((thisLine = in.readLine()) != null) {
            out.println(thisLine);
            if (i == put)
                out.println(str);
            i++;
        }

        phoneBook.delete();
        outFile.renameTo(new File("/Users/seonghun/공부/spring/network/src/java2/phoneBook.txt"));
    }

    @Override
    public void run() throws IOException {
        InitializationLetter();
        System.out.print("이름을 입력해주세요: ");
        String name = scanner.nextLine();
        System.out.print("전화번호를 입력해주세요: ");
        String phone = scanner.nextLine();

        int ArrayNum = convertChar(name.charAt(0)); // 모음 위치 찾기
        List<String> value = null;
        int put = 0;

        if(ArrayNum != 0) {
            value = readFileSome(letter[ArrayNum - 1], letter[ArrayNum]);
            put = previousnNavigation(value, name);
            writeFile(put+letter[ArrayNum-1], name+" "+phone);
        }else if(ArrayNum == 0){
            value = readFileSome(0, letter[ArrayNum]);
            put = previousnNavigation(value, name);
            writeFile(put, name+" "+phone);
        }

        System.out.println(name+"님이 추가되었습니다.");

        setStream();
    }
}
