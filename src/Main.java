public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы 1 часть!");


        for (int i = 0; i <= 10; i++) {
            System.out.println(" Итерация цикла" + i);
        }
        for (int y = 10; y >= 1; y--) {
            System.out.println("Итерация цикла" + y);
        }

        for (int e = 0; e <= 17; e = e + 2) {
            System.out.println(" Чётные числа " + e);
        }
        for (int a = 10; a >= -10; a--) {
            System.out.println(" Итерация по убыванию" + a);
        }
        // задание 2.1
        for (int b = 1904; b <= 2096; b = b + 4) {
            System.out.println(b + " год является високосным");
        }
        // задание 2.2
        int stockpiling=29000;
        int total=0;
        for(int s=1;s<=12;s++){total = total+stockpiling;
            System.out.println(" Месяц " + s + " сумма накоплений равна "+ total+ " рублей");}
    }
}