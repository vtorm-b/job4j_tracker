package ru.job4j.tracker.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра.11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " Введите число от 1 до 3 :");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            count = count - matches;
                   if (matches < 1 || matches > 3 || matches > count) {
                    System.out.println("Ввели неверное число");
                    System.out.println("Остаток: " + count);
                } else {
                    turn = !turn;
                    count = count - matches;
                }
                if (!turn) {
                    System.out.println("Выиграл первый игрок!");
                } else {
                    System.out.println("Выиграл второй игрок!");
                }
            }
        }
    }



