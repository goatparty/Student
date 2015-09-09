/*
 * ******************************************************
 *  * Copyright (C) 9/9/15 11:58 AM 2018514
 *  *
 *  * This file is part of project :"Students".
 *  *
 *  * Student.java can not be copied and/or distributed without the express
 *  * permission of 2018514
 *  ******************************************************
 */

/**
 * Created by 2018514 on 9/3/15. Intro To Java
 */
@SuppressWarnings("UnqualifiedFieldAccess")
class Student {
    private double sc1;
    private double sc2;
    private double sc3;

    /**
     * Default constructor sets all the values to 0
     */
    public Student() {
        sc1 = 0;
        sc2 = 0;
        sc3 = 0;
    }

    /**
     * Sets scores to inputted values
     * @param sc1 Score 1
     * @param sc2 Score 2
     * @param sc3 Score 3
     */
    public Student(double sc1, double sc2, double sc3) {
        this.sc1 = sc1;
        this.sc2 = sc2;
        this.sc3 = sc3;
    }

    /**
     * Sets value of score 1
     * @param sc1 Score 1
     */
    public void setScore1(double sc1) {
        this.sc1 = sc1;
    }

    /**
     * Sets value of score 2
     * @param sc2 Score 2
     */
    public void setScore2(double sc2) {
        this.sc2 = sc2;
    }

    /**
     * Sets value of score 3
     * @param sc3 Score 3
     */
    public void setScore3(double sc3) {
        this.sc3 = sc3;
    }

    /**
     * Returns value of score 1
     * @return Score 1
     */
    public double getScore1() {
        return sc1;
    }

    /**
     * Returns the value of score 2
     * @return Score 2
     */
    public double setScore2() {

        return sc2;
    }

    /**
     * returns value of score 3
     * @return Score 3
     */
    public double setScore3() {

        return sc3;
    }

    /**
     * Returns the average of the 3 scores combined
     * @return Average of 3 scores
     */
    public double getAverage() {
        return (float)(sc1 + sc2 + sc3)/3;
    }

}



