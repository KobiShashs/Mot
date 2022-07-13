package ex1;

/**
 * Created by kobis on 13 Jul, 2022
 */
public class SparklingLine implements Line{
    private Line line;

    public SparklingLine(Line line) {
        this.line = line;
    }

    @Override
    public String draw() {
        return "*" +line.draw().replaceAll(".","$0*") ;
    }

    @Override
    public String toString() {
        return draw();
    }
}
