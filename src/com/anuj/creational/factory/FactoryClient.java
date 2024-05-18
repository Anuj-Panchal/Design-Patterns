package com.anuj.creational.factory;

public class FactoryClient {
    private ILogger logger;

    public FactoryClient(LoggerFactory loggerFactory) {
        this.logger = loggerFactory.createLogger();
    }

    public ILogger getLogger() {
        return logger;
    }
}
