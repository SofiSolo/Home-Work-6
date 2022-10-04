public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Задание 1
        int salary = 30_564;
        int total = 0;
        int i = 0;
        for (; total < 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(" Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);
        System.out.println(i);

        //задание 2
        int b = 0;
        while (b < 10) {
            b++;
            System.out.print(b + " ");
        }
        System.out.println();

        for (int c = 10; c >= 1; c--) {
            System.out.print(c + " ");
        }
        //задание 3
        int population = 12_000_000;
        double birthRate = (double) 17 / 1000;
        double deathRate = (double) 8 / 1000;
        for (int c = 1; c <= 10; c++) {
            population = population + (int) (population * birthRate) - (int) (population * deathRate);
            System.out.println(" Год -" + c + " прирост населения:" + population);
        }
        // заданиие 2.1

        int Salary = 15000;
        int monthSalary = Salary * 7 / 100;
        int Total = 0;
        while (Salary <= 12_000_000) {
            Salary = Salary + monthSalary;
            Total++;
            System.out.println("Месяц " + Total + " накопления составляют " + Salary + " рублей");
        }
        //задание 2.2
        int cash = 15000;
        int monthCash = Salary * 7 / 100;
        int g = 0;
        while (cash <= 12_000_000) {
            cash = cash + monthCash;
            g++;
            if(g % 6 == 0){
            System.out.println("Месяц " + g + " накопления составляют " + cash + " рублей");
        }}

    }
}









       






