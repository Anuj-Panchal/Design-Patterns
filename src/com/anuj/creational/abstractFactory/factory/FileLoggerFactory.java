package com.anuj.creational.abstractFactory.factory;

import com.anuj.creational.abstractFactory.logger.FileLogger;
import com.anuj.creational.abstractFactory.logger.ILogger;
import com.anuj.creational.abstractFactory.user.FileUser;
import com.anuj.creational.abstractFactory.user.IUser;

public class FileLoggerFactory implements ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new FileLogger();
    }

    @Override
    public IUser createUser() {
        return new FileUser();
    }
}
