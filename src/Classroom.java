/*
 * ******************************************************
 *  * Copyright (C) 9/9/15 11:58 AM 2018514
 *  *
 *  * This file is part of project :"Students".
 *  *
 *  * Classroom.java can not be copied and/or distributed without the express
 *  * permission of 2018514
 *  ******************************************************
 */

/**
 * Created by 2018514 on 9/3/15. Intro To Java
 */
import java.util.*;
class Classroom {
    public static void main(String [] args) {
        Student student;
        Scanner keyboard = new Scanner(System.in);
        double sc1,sc2,sc3;

        System.out.println("Enter score 1: ");
        sc1 = keyboard.nextDouble();
        System.out.println("Enter score 2: ");
        sc2 = keyboard.nextDouble();
        System.out.println("Enter score 3: ");
        sc3 = keyboard.nextDouble();

        student = new Student(sc1,sc2,sc3);

        System.out.println(String.format("Score 1: %s\nScore 2: %s\nScore 3: %s\nAverage: %s", sc1, sc2, sc3, student.getAverage()));
    }
}
