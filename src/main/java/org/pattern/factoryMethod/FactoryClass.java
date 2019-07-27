package main.java.org.pattern.factoryMethod;


/**
 Фабричный метод, мы создаем не на прямую обьект, а с помощью фабр метод, метод, который возвращает сущность, абстрактную -
 хорошо запомнить !abstract - abstract!, данный класс наслед конкретными фарикой, который возвращает конкретную сущность.
 */

public abstract class FactoryClass {
    public abstract Car getCar(String name, String mark, int id, int volumeEngine);
}
