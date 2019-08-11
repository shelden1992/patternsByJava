package main.java.org.patterns.generatingPatterns.prototype.typeCopy.deepCopy.serializable;

import java.io.Serializable;

public class Engine implements Serializable {
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
