package com.anuj.creational.abstractFactory;

import com.anuj.creational.abstractFactory.factory.ILoggerFactory;
import com.anuj.creational.abstractFactory.logger.ILogger;
import com.anuj.creational.abstractFactory.user.IUser;

public class FactoryClient {
    private final ILogger logger;

    private final IUser user;

    public FactoryClient(ILoggerFactory iLoggerFactory) {
        this.logger = iLoggerFactory.createLogger();
        this.user = iLoggerFactory.createUser();
    }

    public ILogger getLogger() {
        return logger;
    }

    public IUser getUser() {
        return user;
    }
}
