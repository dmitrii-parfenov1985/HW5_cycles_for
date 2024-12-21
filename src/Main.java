public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 2");
        for (int u = 10; u >= 1; u = u - 1) {
            System.out.println(u + " ");
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int u = 10; u >= -10; u = u - 1) {
            System.out.println(u);
        }
        System.out.println();
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " Год является високосным");
        }
        System.out.println();
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        // В этой задаче есть вопрос. В уроке дается одно объяснение, а в разборе другое (более сложное для меня, так как есть новые ввоодные. Какого придерживаться?
        System.out.println();
        System.out.println("Задача 9");
        total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }

        System.out.println();
        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++ ) {
            System.out.printf("%d x %d = %d%n", 2, i, i * 2);
        }
        //В 10 задаче я ничего не понял, но сделал по шаблону из разбора. В уроке про форматирование printf ни слова.
    }
}