import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        StringBuffer sb = new StringBuffer(sc.nextLine());

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        System.out.print("Enter new character: ");
        char ch = sc.next().charAt(0);

        if (index >= 0 && index < sb.length()) {
            sb.setCharAt(index, ch);
            System.out.println("Updated word: " + sb);
        } else {
            System.out.println("Invalid index");
        }

        sc.close();
    }
}
