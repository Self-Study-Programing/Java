package ex0519J;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
    private final Scanner scanner;

    public Divider(){
        this.scanner = new Scanner(System.in);
    }
    private int calculate(int value1, int value2){
        return value1 / value2;
    }
    private void saveResult(String str,int value1, int value2, int result){
        File file = new File(str);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            if (!file.exists()) {
                file.createNewFile();
            }
            writer.write(value1 + " / " + value2 + " = " + result);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            if(wrier) {
                writer.close();
            }
        }
    }
    public void excute(){
        try{
            System.out.println("두 점수를 입력하세요.");
            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();

            int result = calculate(value1, value2);
            System.out.printf("%d / %d = %d\n", value1, value2, result);

            System.out.println("프로그램을 종료합니다.");

            saveResult("/Users/seonghun/공부/spring/network/src/ex0519J/divide.txt", value1, value2, result);
        }catch(InputMismatchException e) {
            System.out.println("문자가 아닌 숫자를 입력하세요.");
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        new Divider().excute();
    }
}
