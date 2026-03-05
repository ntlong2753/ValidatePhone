import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneManage isValid = new PhoneManage();
        String number;
        while(true) {
            System.out.print("nhập số điện thoại: ");
            number = scanner.nextLine();
            System.out.println("--- BẮT ĐẦU KIỂM TRA ---");
            if (!isValid.checkPhone(number)) {
                System.out.println("[SUCCESS] " + number + " không là số điện thoại hợp lệ.");
                continue;
            }
            break;
        }
        System.out.println("[SUCCESS] " + number + " là số điện thoại hợp lệ.");
    }
}
