package com.anuj.creational.factory;

public class CustomLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new CustomLogger();
    }
}
