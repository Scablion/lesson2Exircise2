import java.util.Scanner;

public class Practicum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя:");
        String name = scanner.nextLine();
        PersonAccount user = new PersonAccount(name);

        System.out.println("Хотите открыть счёт в RUB?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int command = scanner.nextInt();
        if (command == 1) {
            user.moneyRUB = 0.0;
        }

        System.out.println("Хотите открыть счёт в USD?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyUSD = 0.0;
        }

        System.out.println("Хотите открыть счёт в EUR?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        command = scanner.nextInt();
        if (command == 1) {
            user.moneyEUR = 0.0;
        }

        System.out.println("Поздравляем, аккаунт для пользователя " + user.name + " создан.");
        System.out.println("Открытые счета:");
        if (user.moneyRUB == 0.0) {
            System.out.println(user.moneyRUB + " - RUB");
        }
        if (user.moneyUSD == 0.0) {
            System.out.println(user.moneyUSD +  " - USD");
        }
        if (user.moneyEUR == 0.0) {
            System.out.println(user.moneyEUR + " - EUR");
        }

    }
}

class PersonAccount {
    String name;      // имя и фамилия
    double moneyRUB = -1;  // счёт в рублях
    double moneyUSD = -1;  // счёт в долларах
    double moneyEUR = -1;  // счёт в евро


    PersonAccount(String userName) {
        name = userName;
    }
}