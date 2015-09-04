/**
 * Created by 2018514 on 9/3/15.
 */
public class Student {
    private double sc1;
    private double sc2;
    private double sc3;

    /**
     * Default constructor sets all the values to 0
     * @param sc1
     * @param sc2
     * @param sc3
     */
    public Student() {
        sc1 = 0;
        sc2 = 0;
        sc3 = 0;
    }
    /**
     * Default constructor sets all the values to 0
     * @param sc1
     * @param sc2
     * @param sc3
     */
    public Student(double score1, double score2, double score3) {
        sc1 = score1;
        sc2 = score2;
        sc3 = score3;
    }

    /**
     * Sets value of score 1
     * @param score
     */
    public void setScore1(double score) {
        sc1 = score;
    }

    /**
     * Sets value of score 2
     * @param score
     */
    public void setScore2(double score) {
        sc2 = score;
    }

    /**
     * Sets value of score 3
     * @param score
     */
    public void setScore3(double score) {
        sc3 = score;
    }

    /**
     * Returns value of score 1
     * @return
     */
    public double getScore1() {

        return sc1;
    }

    /**
     * Returns the value of score 2
     * @return
     */
    public double setScore2() {

        return sc2;
    }

    /**
     * returns value of score 3
     * @return
     */
    public double setScore3() {

        return sc3;
    }

    /**
     * Returns the average of the 3 scores combined
     * @return
     */
    public double getAverage() {

        return (float)(sc1 + sc2 + sc3)/3;
    }

}
