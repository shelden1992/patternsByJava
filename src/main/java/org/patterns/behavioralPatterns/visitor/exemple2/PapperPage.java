package main.java.org.patterns.behavioralPatterns.visitor.exemple2;

public class PapperPage implements Element {


    @Override
    public void print() {

        System.out.println("Start print PapperPage");
        for (int i = 0; i <1_000_000_000 ; i++) {
            if (i%100_000_000==0){
                System.out.println("Now printing");
            }

        }

        System.out.println("Finish");

    }

    @Override
    public void accept(Visitor visitor) {
visitor.visitor(this);
    }
}
