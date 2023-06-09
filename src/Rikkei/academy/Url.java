package Rikkei.academy;

import java.util.Scanner;
import java.util.Stack;

public class Url {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Stack<String> stack = new Stack<>();
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập URL muốn truy cập\n" +
                    "2. Quay lại\n" +
                    "3. Thoát");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập URL muốn truy cập: ");
                    String url = sc.nextLine();
                    stack.push(url);
                    System.out.println("Truy cập thành công");
                    break;
                case 2:
                    if (!stack.isEmpty()){
                        stack.pop();
                        if (!stack.isEmpty()){
                        System.out.println("Bạn đã quay lại url --> "+stack.peek());
                        } else {
                            System.out.println("Bạn đã quay về hết cỡ.");
                        }
                    } else {
                        System.out.println("Không còn Url nào để quay lại.");
                    }
                    break;
                case 3:
                    System.exit(0);
            }
        } while (choice != 3);
    }
}
