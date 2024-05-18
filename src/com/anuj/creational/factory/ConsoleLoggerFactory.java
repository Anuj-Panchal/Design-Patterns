package com.anuj.creational.factory;

public class ConsoleLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ConsoleLogger();
    }
}
