package by.epam.javabasics.task3;

public class FormulaApp {

    public static void main(String[] args) {

        double a = Formula.enterNumber("A: ");

        double b = Formula.checkAvsB(a, Formula.enterNumber("B that is bigger than A: "));

        double h = Formula.checkHvsAB(a, b, Formula.enterNumber("H that represents a step between A and B: "));

        String[] arrX = Formula.returnX(a,b,h);

        String[] arrFX = Formula.returnFX(a,b,h);

        double[] arrX_d = new double[arrX.length];

        for (int i = 0; i < arrX.length; i++) {

            arrX_d[i] = Double.parseDouble(arrX[i].replace(',','.'));

        }

        double[] arrFX_d = new double[arrFX.length];

        for (int i = 0; i < arrFX.length; i++) {

            arrFX_d[i] = Double.parseDouble(arrFX[i].replace(',','.'));

        }

        String leftAlignFormat = "| %9.2f | %10.2f |%n";

        System.out.format("+-----------+------------+%n");
        System.out.format("|     x     |     f(x)   |%n");
        System.out.format("+-----------+------------+%n");

        for (int i = 0; i < arrX.length; i++) {
            System.out.format(leftAlignFormat, arrX_d[i], arrFX_d[i]);
        }

        System.out.format("+-----------+------------+%n");



    }

}
