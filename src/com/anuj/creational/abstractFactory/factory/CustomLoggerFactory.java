package com.anuj.creational.abstractFactory.factory;

import com.anuj.creational.abstractFactory.logger.CustomLogger;
import com.anuj.creational.abstractFactory.logger.ILogger;
import com.anuj.creational.abstractFactory.user.CustomUser;
import com.anuj.creational.abstractFactory.user.IUser;

public class CustomLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new CustomLogger();
    }

    @Override
    public IUser createUser() {
        return new CustomUser();
    }
}
