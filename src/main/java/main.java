import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę, do jakiej mam wyświetlić listę: ");
        Scanner scanner = new Scanner(System.in);

        int liczba = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= liczba; i++) {
            System.out.println(i);
        }
    }
}