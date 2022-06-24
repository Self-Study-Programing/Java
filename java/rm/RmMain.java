package rm;

import java.io.File;
import java.util.Scanner;

public class RmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();

            String operator = input.split(" ")[0];
            String filePath = input.split(" ")[1];

            if (!"rm".equals(operator)) {
                System.out.println("명령어가 잘못되었습니다.");
            }

            File file = new File(filePath);
            if (file.exists()) {
                System.out.println("정말 삭제하시겠습니까(Y,N): ");
                String answer = scanner.nextLine();

                if ("Y".equals(answer) || "y".equals(answer)) {
                    file.delete();
                    System.out.println("삭제되었습니다");
                } else {
                    System.out.println("취소되었습니다");
                }
                System.exit(0);
            } else {
                System.out.println("파일이 존재하지 않거나, 삭제될 수 없습니다");
            }
        }
    }
}
