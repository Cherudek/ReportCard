package com.example.gregorio.reportcard;

/**
 * Created by Gregorio on 11/05/2017.
 */


//New ReportCard class generated
public class ReportCard {


    //First Field is the name of the subject
    private String mSubject;

    //Second Field is the grade of the subject
    private Character mGrade;


    //Constructo for our ReportCard Class
    public ReportCard(String Subject, Character Grade) {
        this.mSubject = Subject;
        this.mGrade = Grade;
    }

    // Getter method created to obtain the name of the subject
    public String getSubject() {
        return mSubject;
    }

    //Getter method to obtain the grade
    public Character getGrade() {
        return mGrade;
    }

    //Setter method to set the name of the subject
    public void setSubject(String Subject) {
        this.mSubject = Subject;
    }


    //Setter method to obtain the Grade
    public void setmGrade(Character Grade) {
        this.mGrade = Grade;
    }


    // toString method to turn our data to String and print it to screen for eg.
    @Override
    public String toString() {
        return "ReportCard{" +
                "Subject='" + mSubject + '\'' +
                ", Grade=" + mGrade +
                '}';
    }
}
