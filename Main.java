import AbstractFactoryPattern.*;
import MomentoPattern.Editor;
import MomentoPattern.History;
import SingletonPattern.ConfigurationManagement;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        //executeAbstractFactoryPattern();
        //executeSingletonPattern();
        executeMomentoPatter();
    }

    private static void executeAbstractFactoryPattern(){
        System.out.println("Abstract Factory Pattern");

        ICar car = CarFactory.carFactory(CarFactory.Cartype.Tesla);
        CarSuggestor carSuggestor = new CarSuggestor(car);
        carSuggestor.whatCarsIsThis();
    }

    private static void executeSingletonPattern(){
        System.out.println("Singleton Pattern");

        ConfigurationManagement configuration = ConfigurationManagement.getInstance();
        String prop = configuration.getProperty("learned");

        System.out.println("Prop is " + prop);
    }

    private static void executeMomentoPatter(){
        System.out.println("Momento Pattern");

        Editor editor = new Editor();
        History history =  new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }
}