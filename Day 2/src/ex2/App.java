package ex2;

import ex2.developers.Developer;
import ex2.developers.Intermediate;
import ex2.developers.Junior;
import ex2.developers.Senior;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Developer[] developers = {new Junior(),new Intermediate(),new Senior()};

        Arrays.stream(developers).forEach(Developer::printSkills);
    }
}
