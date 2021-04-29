package ru.job4j.tracker.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String rsl = "Неизвестное слово - " + eng;
        System.out.println(rsl);
        return "Неизвестное слово - " + eng;
    }
    public static void main(String[] args) {
      DummyDic result = new DummyDic();
      result.engToRus("");
    }
}
