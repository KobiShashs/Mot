package families.behavioral.demo4_visitor.ex2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<VisitableInteger> words = new ArrayList<>();
        words.add(new VisitableInteger(3));
        words.add(new VisitableInteger(4));
		words.add(new VisitableInteger(5));
		words.add(new VisitableInteger(6));


        FactorialVisitor v1 = new FactorialVisitor();
        SumVisitor v2 = new SumVisitor();

        for (VisitableInteger vs : words) {
            vs.accept(v1);
            vs.accept(v2);
        }

    }
}
