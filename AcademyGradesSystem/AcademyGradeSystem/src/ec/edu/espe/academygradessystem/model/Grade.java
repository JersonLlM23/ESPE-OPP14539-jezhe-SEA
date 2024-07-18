/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.academygradessystem.model;

/**
 *
 * @author JEZHE Software Sssosiation Engineers - DCCO ESPE
 */
import com.google.gson.annotations.Expose;

public class Grade {
    private Task task;
    private IndividualActivity individualActivity;
    private GroupActivity groupActivity;
    private Lesson lesson;
    private QuimestralExam quimestralExam;

    public Grade(Task task, IndividualActivity individualActivity, GroupActivity groupActivity, Lesson lesson, QuimestralExam quimestralExam) {
        this.task = task;
        this.individualActivity = individualActivity;
        this.groupActivity = groupActivity;
        this.lesson = lesson;
        this.quimestralExam = quimestralExam;
    }

    public double calculateFinalGrade() {
        return (task.getGrade() + individualActivity.getGrade() + groupActivity.getGrade() + lesson.getGrade() + quimestralExam.getGrade()) / 5;
    }

    // Getters and setters

    public Task getTask() {
        return task;
    }

    public IndividualActivity getIndividualActivity() {
        return individualActivity;
    }

    public GroupActivity getGroupActivity() {
        return groupActivity;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setIndividualActivity(IndividualActivity individualActivity) {
        this.individualActivity = individualActivity;
    }

    public void setGroupActivity(GroupActivity groupActivity) {
        this.groupActivity = groupActivity;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void setQuimestralExam(QuimestralExam quimestralExam) {
        this.quimestralExam = quimestralExam;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public QuimestralExam getQuimestralExam() {
        return quimestralExam;
    }

    @Override
    public String toString() {
        return "Grade{" + "task=" + task + ", individualActivity=" + individualActivity + ", groupActivity=" + groupActivity + ", lesson=" + lesson + ", quimestralExam=" + quimestralExam + '}';
    }

    
}

