public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // Задание 1
        int salary=30_564;
        int total=0;
        int i=0;
        for(;total<2_459_000;i++){
            total=total+total/100;
            total=total+salary;
            System.out.println(" Месяц "+ i + " сумма накоплений равна "+ total + " рублей");}
        System.out.println( total);
        System.out.println( i);

        //задание 2
        int b=0;
        while (b<=10){
            b++;
            System.out.print(b  );}

        for(int c=10;c>=1;c--){
           System.out.print(c);}



       

    }
}



