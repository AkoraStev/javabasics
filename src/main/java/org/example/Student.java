package org.example;

public class Student {
    private String firstName;
    private String lastName;
    private int[] scores;
    private int numberOfScores;

    public Student(String firstName,String lastName) {
        this.firstName= firstName;
        this.lastName= lastName;
        scores = new int[10];//Assuming a student can have up to 10 scores
        numberOfScores = 0;
    }

    public String getFullName() {
        return firstName +" "+ lastName;
    }
    public void addScore(int score) {

        if (numberOfScores<scores.length) {
            scores[numberOfScores] = score;
            numberOfScores++;
        } else {
            System.out.println("Cannot add more scores.Maximum limit reached.");
        }
    }
    public double calculateAverageGrade() {
        int totalScore = 0;
        for (int i=0;i<numberOfScores;i++) {
            totalScore +=scores[i];
        }
        System.out.println("Number of scores "+numberOfScores);
        return(double) totalScore/numberOfScores;
    }
}



