package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }
    public static void main(String[] args) {
      DummyDic result = new DummyDic();
      result.engToRus("word");
        System.out.println("Неизвестное слово - " + result);
    }
}
