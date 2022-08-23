package families.behavioral.demo4_visitor.ex2;

public class VisitableInteger {
    private int value;

    public VisitableInteger(int value){
        this.value=value;
    }

    public void accept(Visitor v){
        v.visit(this);
    }

    public int getValue(){
        return value;
    }
}
