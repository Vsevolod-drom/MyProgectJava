import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);
        int contin;
       do {
           System.out.print("Введите первое число: ");
           float num1 = console.nextFloat();
           console.nextLine();
           System.out.print("Введите действие (+, -, *, % и т.д.): ");
           String act = console.nextLine();
           System.out.print("Введите второе число: ");
           float num2 = console.nextFloat();

           double result = 0;

           switch (act) {
               case "+":
                   result = num1 + num2;
                   break;
               case "-":
                   result = num1 - num2;
                   break;
               case "*":
                   result = num1 * num2;
                   break;
               case "/":
                   result = num1 / num2;
                   break;
               case ":":
                   result = num1 / num2;
                   break;
               case "%":
                   result = num1 % num2;
                   break;
               case "^":
                   result = Math.pow(num1, num2);
                   break;
               default:
                   System.out.println("В базе нет такого действия!");
                   break;
           }
           System.out.println("Результат " + result);
           System.out.print("Продолжить вычесление Да = 1 Нет = 0: ");
           contin = console.nextInt();

       } while (contin == 1);

    }
}