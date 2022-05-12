package ex0512J;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {
    public void studyFileData() throws Exception{
        File file = new File("/Users/seonghun/공부/filestudy/a.txt");
        File file2 = new File("/Users/seonghun/공부/filestudy/none.txt");
        File file3 = new File("/Users/seonghun/공부/filestudy");

        // 파일이 물리적으로 존재 여부
        boolean exist = file.exists();
        System.out.println("파일의 물리적 존재 여부");
        System.out.println(file.getName() + " " + exist);
        System.out.println(file2.getName() + " " + file2.exists());
        System.out.println(file3.getName() + " " + file3.exists());
        System.out.println();

        //        파일, 디렉토리 판단
        boolean bFile = file.isFile();
        boolean bDir = file.isDirectory();
        System.out.println("파일, 디렉토리 판단");
        System.out.println(file.getName() + " " + bFile + " " + bDir);
        System.out.println(file2.getName() + " " + file2.isFile() + " " + file2.isDirectory());
        System.out.println(file3.getName() + " " + file3.isFile() + " " + file3.isDirectory());
        System.out.println();

        //        파일의 경로
        File file4 = new File("../hello.jpg");
        String path = file4.getPath();
        String absoluePath = file4.getAbsolutePath();
        String canonicalPath = file4.getCanonicalPath();

        System.out.println("파일의 경로");
        System.out.println("getPath():" + " " + path);
        System.out.println("getAbsolutePath():" + " " + absoluePath);
        System.out.println("getCannonicalPath():" + " " + canonicalPath);
        System.out.println();

        //        파일의 크기
        long size = file.length();
        System.out.println("파일의 크기");
        System.out.println(file.getName() + " " + bFile + " " + size);
        System.out.println(file2.getName() + " " + file2.isFile() + " " + file2.length());
        System.out.println(file3.getName() + " " + file3.isFile() + " " + file3.length());
        System.out.println();

        //        수정된 시간
        long time =  file.lastModified();
        System.out.println("파일의 크기");
        System.out.println(file.getName() + " " + bFile + " " + formatDate(convertToDate(time)));
        System.out.println(file2.getName() + " " + file2.isFile() + " " + formatDate(convertToDate(file2.lastModified())));
        System.out.println(file3.getName() + " " + file3.isFile() + " " + formatDate(convertToDate(file3.lastModified())));
        System.out.println();
    }

    public void studyManage()throws Exception{
        File file = new File("/Users/seonghun/공부/filestudy/hello.txt");
        
        boolean created =  file.createNewFile();
        System.out.println("파일 생성");
        System.out.println(file.getName() + " " + created);
        System.out.println();

        boolean deleted = file.delete();
        System.out.println("파일 삭제");
        System.out.println(file.getName() + " " + deleted);
        System.out.println();

        File dir = new File("/Users/seonghun/공부/filestudy/subDir");
        created = dir.mkdir();
        System.out.println("디렉토리 생성");
        System.out.println(file.getName() + " " + created);
        System.out.println();
//        dir.mkdirs()

        deleted = dir.delete();
        System.out.println("디렉토리 삭제");
        System.out.println(file.getName() + " " + deleted);
        System.out.println();

        File original = new File("/Users/seonghun/공부/filestudy/a.txt");
        File target = new File("/Users/seonghun/공부/filestudy/abc.txt");
        original.renameTo(target);
    }

    public void studyList(){
        File dir = new File("/Users/seonghun/공부/filestudy");
        String[] list = dir.list();

        for(String name : list){
            System.out.println(name);
        }

        File[] listFiles = dir.listFiles();
        for(File file : listFiles){
            System.out.println(file);
        }
    }

    public Date convertToDate(long unixTime){
        return new Date(unixTime);
    }

    public String formatDate(Date date) {
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      return dateFormat.format(date);
    }

    public static void main(String[] args) throws Exception{
        FileStudy fileStudy = new FileStudy();
//        fileStudy.studyFileData();
//        fileStudy.studyManage();
        fileStudy.studyList();
    }
}
