package com.anuj.creational.simpleFactory;

public class SimpleFactory {

    public static ILogger getLogger(int option) {
        return switch (option) {
            case 0 -> new CustomLogger();
            case 1 -> new ConsoleLogger();
            default -> new FileLogger();
        };
    }
}
