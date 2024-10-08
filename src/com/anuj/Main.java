package com.anuj;

import com.anuj.behavioural.chainOfResponsibility.ISupportHandler;
import com.anuj.behavioural.chainOfResponsibility.L1SupportHandler;
import com.anuj.behavioural.chainOfResponsibility.L2SupportHandler;
import com.anuj.behavioural.chainOfResponsibility.L3SupportHandler;
import com.anuj.behavioural.command.Command;
import com.anuj.behavioural.command.CommandManager;
import com.anuj.behavioural.command.TextEditor;
import com.anuj.behavioural.command.WriteCommand;
import com.anuj.behavioural.observer.ChatMediator;
import com.anuj.behavioural.observer.ChatRoom;
import com.anuj.behavioural.observer.ChatUser;
import com.anuj.behavioural.observer.User;
import com.anuj.creational.prototype.Circle;
import com.anuj.creational.prototype.IShape;
import com.anuj.creational.prototype.ShapeClient;
import com.anuj.structural.adapter.IPrinter;
import com.anuj.structural.adapter.PrinterAdapter;
import com.anuj.structural.adapter.legacy.LegacyPrinter;
import com.anuj.structural.bridge.*;
import com.anuj.structural.composite.Developer;
import com.anuj.structural.composite.Employee;
import com.anuj.structural.composite.Manager;
import com.anuj.structural.composite.Team;
import com.anuj.structural.decorator.ICoffee;
import com.anuj.structural.decorator.MilkCoffeeDecorator;
import com.anuj.structural.decorator.PlainCoffee;
import com.anuj.structural.decorator.SugarCoffeeDecorator;
import com.anuj.structural.facade.AirController;
import com.anuj.structural.facade.CarEngineFacade;
import com.anuj.structural.facade.FuelInjector;
import com.anuj.structural.facade.Ignition;
import com.anuj.structural.flyweight.ITree;
import com.anuj.structural.flyweight.factory.ITreeFactory;
import com.anuj.structural.flyweight.factory.TreeFactory;
import com.anuj.structural.proxy.Image;
import com.anuj.structural.proxy.ProxyImage;
import com.anuj.structural.proxy.RealImage;

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
//        IShape circle = new Circle("red");
//        ShapeClient shapeClient = new ShapeClient(circle);
//
//        IShape redCircle = shapeClient.getShape();
//        redCircle.draw();

        //decorator pattern
//        ICoffee myCoffee = new PlainCoffee();
//        System.out.println("Price: " + myCoffee.getPrice());
//        System.out.println("Description: " + myCoffee.getDescription());
//
//        myCoffee = new MilkCoffeeDecorator(myCoffee);
//        System.out.println("Price: " + myCoffee.getPrice());
//        System.out.println("Description: " + myCoffee.getDescription());
//
//        myCoffee = new SugarCoffeeDecorator(myCoffee);
//        System.out.println("Price: " + myCoffee.getPrice());
//        System.out.println("Description: " + myCoffee.getDescription());

        //adapter pattern
//        IPrinter printer = new PrinterAdapter(new LegacyPrinter());
//        printer.print();

        //Proxy pattern
//        Image image = new ProxyImage();
//        image.display();

        //Facade Pattern
//        CarEngineFacade carEngineFacade = new CarEngineFacade(new AirController(), new FuelInjector(), new Ignition());
//        carEngineFacade.startEngine();
//        System.out.println("=======================");
//        carEngineFacade.stopEngine();

        //Bridge Pattern
//        ICarRegion carRegion = new SlaviaIndiaRegion();
//        ICar car = new Slavia(carRegion);
//
//        System.out.println("Is Indian Slavia right handed? " + car.isRightHanded());
//
//        System.out.println("========================");
//
//        carRegion = new SlaviaUSRegion();
//        car = new Slavia(carRegion);
//
//        System.out.println("Is US Slavia right handed? " + car.isRightHanded());

        // Composite Design Pattern
//        Employee dev1 = new Developer("dev1", 1);
//        Employee dev2 = new Developer("dev2", 2);
//
//        Employee manager = new Manager("manager", 3);
//
//        Team engineeringTeam = new Team();
//        Team managementTeam = new Team();
//
//        engineeringTeam.addEmployee(dev1);
//        engineeringTeam.addEmployee(dev2);
//
//        managementTeam.addEmployee(manager);
//
//        Team company = new Team();
//        company.addEmployee(engineeringTeam);
//        company.addEmployee(managementTeam);
//
//        company.showEmployeeDetails();

        //Flyweight Design Pattern
//        ITreeFactory treeFactory = new TreeFactory();
//        ITree tree1 = treeFactory.getTree("Oak", "Green", "Rough");
//        tree1.plantTree(10, 20);
//
//        ITree tree2 = treeFactory.getTree("Pine", "Green", "Smooth");
//        tree2.plantTree(15, 25);
//
//        ITree tree3 = treeFactory.getTree("Oak", "Green", "Rough");
//        tree3.plantTree(30, 40);
//
//        ITree tree4 = treeFactory.getTree("Birch", "White", "Smooth");
//        tree4.plantTree(50, 60);
//
//        // Even though we requested two Oaks with the same properties, only one object was created and shared.
//        System.out.println("Number of distinct tree objects: " + treeFactory.getTotalObjects());

        //Chain of Responsibility
//        ISupportHandler l3SupportHandler = new L3SupportHandler();
//        ISupportHandler l2SupportHandler = new L2SupportHandler(l3SupportHandler);
//        ISupportHandler l1SupportHandler = new L1SupportHandler(l2SupportHandler);
//
//        l1SupportHandler.handleIssue("Issue with severity: 2", 3);

        //Command Pattern
//        TextEditor textEditor = new TextEditor();
//
//        Command writeCommand = new WriteCommand(textEditor);
//        CommandManager commandManager = new CommandManager();
//
//        writeCommand.setText("Hello");
//        commandManager.execute(writeCommand);
//        System.out.println(textEditor.getContent());
//
//        writeCommand.setText(" World!");
//        commandManager.execute(writeCommand);
//        System.out.println(textEditor.getContent());
//
//        writeCommand.setText(" Anuj");
//        commandManager.execute(writeCommand);
//        System.out.println(textEditor.getContent());
//
//        commandManager.undo();
//        System.out.println(textEditor.getContent());

        //Mediator Pattern
        ChatMediator chatMediator = new ChatRoom();

        User user1 = new ChatUser("user1");
        User user2 = new ChatUser("user2");
        User user3 = new ChatUser("user3");
        User user4 = new ChatUser("user4");

        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);
        chatMediator.addUser(user4);

        user1.sendMessage(chatMediator, "Hello from " + user1.getUserName());
    }
}
