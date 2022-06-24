package R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RMain {
    public static void indexSet(LinkedList list[]){
        list[0] = new LinkedList("가위");
        list[1] = new LinkedList("바위");
        list[2] = new LinkedList("보");
        list[0].setNext(list[1]);
        list[1].setNext(list[2]);
        list[2].setNext(list[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> array = new ArrayList<>(Arrays.asList("가위", "바위","보"));
        int record[] = new int[3];
        Compare com = new Compare();
        Random random = new Random();

        // list 세팅
        LinkedList list[] = new LinkedList[3];
        indexSet(list);

        while(true) {
            // 입력
            System.out.print("[기위, 바위, 보]: ");
            String want = sc.nextLine();
            int arrNum = array.indexOf(want);

            // 그만하기
            if(want.equals("quit")){
                System.out.println("종료되었습니다");
                break;
            }

            // 컴퓨터
            int computer = random.nextInt(3);
            random.setSeed(System.currentTimeMillis());
            System.out.println(array.get(computer));

            // 비교
            int value = com.compare(array.get(computer), list[arrNum]);
            record[value]++;

            // 결과 확인
            System.out.println(record[0] + "승 " + record[1] + "무 " + record[2] + "패");
        }
    }
}
