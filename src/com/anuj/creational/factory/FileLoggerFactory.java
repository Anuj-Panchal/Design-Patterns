package com.anuj.creational.factory;

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }
}
