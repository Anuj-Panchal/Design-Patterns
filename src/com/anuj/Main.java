package com.anuj;

import com.anuj.creational.prototype.Circle;
import com.anuj.creational.prototype.IShape;
import com.anuj.creational.prototype.ShapeClient;

public class Main {

    public static void main(String[] args) {

        //Simple Factory
        //ILogger logger = SimpleFactory.getLogger(0);
        //System.out.println(logger.toString());

        //Factory
//        LoggerFactory factory = new CustomLoggerFactory();
//        FactoryClient factoryClient = new FactoryClient(factory);
//        ILogger logger = factoryClient.getLogger();
//        System.out.println(logger);

        //Abstract Factory
//        ILoggerFactory iLoggerFactory = new FileLoggerFactory();
//        FactoryClient factoryClient = new FactoryClient(iLoggerFactory);
//        ILogger logger = factoryClient.getLogger();
//        IUser user = factoryClient.getUser();
//        System.out.println("Logger: " + logger);
//        System.out.println("User: " + user);

        //Builder Pattern
//        Map<String, String> params = new HashMap<>();
//        params.put("param1", "value1");
//        String payload = "payload";
//        IHttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
//        IHttpRequest httpRequest = httpRequestBuilder
//                .addParams(params)
//                .addHeader("header1", "value1")
//                .addPayload(payload)
//                .build();
//        httpRequest.sendRequest();

        //Singleton
//        ICacheManager cacheManager1 = CacheManager.getInstance();
//        ICacheManager cacheManager2 = CacheManager.getInstance();
//
//        cacheManager1.addToCache("key", "singleton");
//        System.out.println(cacheManager2.getFromCache("key"));

        //Prototype
        IShape circle = new Circle("red");
        ShapeClient shapeClient = new ShapeClient(circle);

        IShape redCircle = shapeClient.getShape();
        redCircle.draw();
    }
}
