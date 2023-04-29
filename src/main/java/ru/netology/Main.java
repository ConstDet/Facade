package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        System.out.println("Сложение: " + binOps.sum("1001", "1100"));
        System.out.println("Умножение: " + binOps.mult("1001", "1100"));
    }
}