import java.util.Scanner;

public class BirthdayCongratulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Дима";

        System.out.print("Введите возраст Димы: ");
        int age = scanner.nextInt();

        System.out.println(name + ",");
        System.out.println("Поздравляю тебя с днем рождения!");

        if (age > 0) {
            System.out.println("Тебе сегодня исполняется " + age + " лет!");
        } else {
            System.out.println("Пусть этот день принесет тебе радость, независимо от возраста!");
        }

        System.out.println("Желаю тебе:");
        System.out.println("- Здоровья, счастья и удачи,");
        System.out.println("- Ярких моментов и впечатлений,");
        System.out.println("- Исполнения всех твоих желаний!");
        System.out.println("С праздником! 🎉🎂");

        scanner.close();
    }
}