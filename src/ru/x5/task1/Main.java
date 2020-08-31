package ru.x5.task1;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = input.nextInt();
        input.close();
        int lastdigit = num%10;
        System.out.println("Последняя цифра введённого числа: "+lastdigit);
        }
    }
