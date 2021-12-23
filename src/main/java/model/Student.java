package model;

import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;

@Table
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int score;
    private int age;

    @ManyToOne
    @JoinColumn(name = "classs_id")
    private Classs classs;

    public Student(Long id, String name, int score, int age, Classs classs) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.classs = classs;
    }

    public Student(String name, int score, int age, Classs classs) {
        this.name = name;
        this.score = score;
        this.age = age;
        this.classs = classs;
    }

    public Student(int score) {
        this.score = score;
    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Classs getClasss() {
        return classs;
    }

    public void setClasss(Classs classs) {
        this.classs = classs;
    }
    @Override
    public String toString() {
        return String.format("Student[id=%d, name='%s', score='%d', age='%d']", id, name, score,age);
    }
}
