package org.example;

public class Student {
    private String name;
    private double midtermScore;
    private double finalScore;

    public Student(String name, double midtermScore, double finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverageScore() {
        return (midtermScore + finalScore) / 2;
    }

    public String calculateGrade() {
        double averageScore = calculateAverageScore();
        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
