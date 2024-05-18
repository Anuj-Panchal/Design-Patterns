package com.anuj.creational.abstractFactory.factory;

import com.anuj.creational.abstractFactory.logger.ILogger;
import com.anuj.creational.abstractFactory.user.IUser;

public interface ILoggerFactory {
    ILogger createLogger();

    IUser createUser();
}
