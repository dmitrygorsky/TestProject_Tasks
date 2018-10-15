package by.epam.javabasics.task5;

import java.util.Random;

public class Ball {

    private  String color;
    private int weight;

    public Ball(String color, int weight) {

        this.color = color;

        this.weight = weight;

    }

    public String getColor() {

        return color;

    }

    public void setColor(String color) {

        this.color = color;

    }

    public int getWeight() {

        return weight;

    }

    public void setWeight(int weight) {

        this.weight = weight;

    }

    //method that puts each object of Ball class into array of Ball type
    //given array of Ball type, given array of String type

    public static Ball[] ballsArray(Ball[] balls, String[] arrColors) {

        Random random = new Random();

        for (int i = 0; i < balls.length; i++) {

            Ball ball = new Ball(arrColors[random.nextInt(arrColors.length)], random.nextInt(100));

            balls[i] = ball;

        }

        return balls;

    }


}
