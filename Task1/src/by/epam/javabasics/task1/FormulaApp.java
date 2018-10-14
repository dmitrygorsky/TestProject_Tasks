package by.epam.javabasics.task1;

public class FormulaApp {

    public static void main(String[] args) {

        double x;

        double y;

        x = Formula.enterNumber("x: ");

        y = Formula.enterNumber("y: ");

        System.out.println("The result of calculation is " + Formula.formulaCount(x,y));

    }
}
