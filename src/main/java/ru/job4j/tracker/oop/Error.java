package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(){
    }
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }
    public void printInfo() {
        System.out.println();
        System.out.println("Ошибка " + active);
        System.out.println("Статус " + status);
        System.out.println("Сообщение " + message);
    }
    public static void main(String[] args) {
        Error err = new Error();
        Error error = new Error(true,10,"online");
        err.printInfo();
        error.printInfo();
    }
}

