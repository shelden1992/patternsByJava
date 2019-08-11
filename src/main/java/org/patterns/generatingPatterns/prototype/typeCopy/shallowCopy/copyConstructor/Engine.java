package main.java.org.patterns.generatingPatterns.prototype.typeCopy.shallowCopy.copyConstructor;

public class Engine {

    public int values;

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder("Engine{");
        sb.append("values=").append(values);
        sb.append('}');
        return sb.toString();
    }

    public Engine(int values) {
        this.values=values;
    }
}
