package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean eroractive, int erorstatus, String erormessage) {
        active = eroractive;
        status = erorstatus;
        message = erormessage;
    }

    public void printInfo() {
        System.out.println("Error active: " + this.active);
        System.out.println("Error status: " + this.status);
        System.out.println("Error message: " + this.message);
    }

    public static void main(String[] args) {
        Error errorsiml = new Error();
        Error errorparam1 = new Error(true, 404, "page not found");
        Error errorparam2 = new Error(false, 500, "Internal Server Error");
        errorsiml.printInfo();
        errorparam1.printInfo();
        errorparam2.printInfo();
    }
}
