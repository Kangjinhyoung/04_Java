package pkg3.dto;

import java.util.Scanner;

public class LYSCalculator implements Calculator {
    @Override
    public int plus(int a, int b) {
        int result = a + b;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public int minus(int a, int b) {
        int result = a - b;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public int multi(int a, int b) {
        int result = a * b;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public int div(int a, int b) {
        int result = a / b;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public int mod(int a, int b) {
        int result = a % b;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public int pow(int a, int b) {
        int result = (int) Math.pow(a, b);
        // for (int i=0; i<b; i++) a =  a*a;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public double areaOfCircle(double r) {
        double result = PI * Math.pow(r, 2);
//        double result = PI * r * r;
        if (result > MAX_NUM) result = MAX_NUM;
        if (result < MIN_NUM) result = MIN_NUM;
        return result;
    }

    @Override
    public String toBinary(int num) {
        if (num > MAX_NUM) num = MAX_NUM;
        if (num < MIN_NUM) num = MIN_NUM;
        String result = toBinary(num);
        return result;
    }

    @Override
    public String toHexadecimal(int num) {
        if (num > MAX_NUM) num = MAX_NUM;
        if (num < MIN_NUM) num = MIN_NUM;
        String result = toHexadecimal(num);
        return result;
    }

    public static void display() {
        System.out.println("LYS Calculator");
        System.out.println("--------------------");
        System.out.println("1. Plus");
        System.out.println("2. Minus");
        System.out.println("3. Multiple");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Pow");
        System.out.println("7. Area of Circle");
        System.out.println("8. ToBinary");
        System.out.println("9. ToHexadecimal");
        System.out.println("0. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        display();
    }
}