package by.epam.javabasics.task2;

public class InsideAreaOrNotApp {

    public static void main(String[] args) {

        int x = InsideAreaOrNot.enterNumber("X: ");

        int y = InsideAreaOrNot.enterNumber("Y: ");

        System.out.println(InsideAreaOrNot.checkArea(x, y));

    }
}
