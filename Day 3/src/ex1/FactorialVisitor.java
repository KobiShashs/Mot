package families.behavioral.demo4_visitor.ex2;

public class FactorialVisitor implements Visitor {

    private int sum = 1;

    public void visit(VisitableInteger vs) {
        int num = vs.getValue();

        for (int i = 2; i <= num; i++) {
            sum *= i;
        }

        System.out.println("Fact : " + sum);

    }

    public int getSum() {
        return sum;

    }

}
