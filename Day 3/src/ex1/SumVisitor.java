package families.behavioral.demo4_visitor.ex2;

public class SumVisitor implements Visitor {

    private int sum = 0;

    @Override
    public void visit(VisitableInteger vs) {
        int num = vs.getValue();

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum : " + sum);

    }

    public int getLettersCount() {
        return sum;
    }

}
