package com.anuj.creational.abstractFactory.factory;

import com.anuj.creational.abstractFactory.logger.ConsoleLogger;
import com.anuj.creational.abstractFactory.logger.ILogger;
import com.anuj.creational.abstractFactory.user.ConsoleUser;
import com.anuj.creational.abstractFactory.user.IUser;

public class ConsoleLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ConsoleLogger();
    }

    @Override
    public IUser createUser() {
        return new ConsoleUser();
    }
}
