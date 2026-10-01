package com.example.maven_github_demo;

public class Gradecalculator {

    public static int calculateTotal(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public static double calculateAverage(int n1, int n2, int n3) {
        return calculateTotal(n1, n2, n3) / 3.0;
    }

    public static boolean ispass(double average) {
        return average >= 10.0;
    }

    public static void main(String[] args) {
        int n1 = 75, n2 = 68, n3 = 82;

        int total = calculateTotal(n1, n2, n3);
        double average = calculateAverage(n1, n2, n3);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + (ispass(average) ? "pass" : "fail"));
    }
}
