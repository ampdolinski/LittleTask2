import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        System.out.println("Podaj liczbę, do jakiej mam wyświetlić listę: ");
        System.out.println("Enter the size (as number) of how long list of consecutive numbers you want me to show you: ");

        Scanner scanner = new Scanner(System.in);

        int sizeOfList = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= sizeOfList; i++) {
            System.out.println(i);
        }
    }
}