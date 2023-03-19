package homework;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        int a = 54;
        int b = 16;
      System.out.println(a + b);

        int c = 50;
        int d = 3;
      System.out.println(c / d);

      System.out.println(-5 + 8 * 6);
      System.out.println((55 + 9) % 9);

      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите переменную");
      int n = scanner.nextInt();
      System.out.println(n * n);

      int var1 = 0;
      int var2 = 1;
      int var3 = 2;
      int var4 = 3;
      int var5 = 4;
      int var6 = 5;
      int var7 = 6;
      int var8 = 7;
      int var9 = 8;
      int var10 = 9;
      int sum = var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9 + var10;
      double average = (double)sum / 10.0;
      System.out.println("Среднее значение " + average);

      double price_1 = 1000;
      double price_2 = 500;
      double discount = 100;
      double total = price_1 + price_2 - discount;
      double discountPercent = (discount / (price_1 + price_2)) * 100.0;
      System.out.println("Cумма со скидкой " + total + " евро");
      System.out.println("Скидка " + discountPercent + "%");
    }
}
