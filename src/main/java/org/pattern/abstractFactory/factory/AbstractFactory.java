package main.java.org.pattern.abstractFactory.factory;
import main.java.org.pattern.abstractFactory.* ;

/**создаем абстрактЗавод, где пропис те сущности, которые будут криетится этот абстрактный класс будут наследовать заводы по группам, то есть, каждый завод
 отвечает за создание спец. группы, но ТОЛЬКО спецзавод делает спец сущности, до этого на уроне абстракции*/
public abstract class AbstractFactory {

   public abstract BMW creatBMW();

    public abstract Volkswagen creatVW();

    public abstract Mersedes creatMersedes();

}
