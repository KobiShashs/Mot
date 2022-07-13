package ex1;

/**
 * Created by kobis on 13 Jul, 2022
 */
public class SimpleLine implements Line{
    @Override
    public String draw() {
        return "---";
    }

    @Override
    public String toString() {
       return this.draw();
    }
}
