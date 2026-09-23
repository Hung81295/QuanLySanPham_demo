package SoSanhStackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.score, other.score);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", score=" + score + "]";
    }


    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("A", 9));
        list.add(new Student("B", 3));
        list.add(new Student("C", 7));
        list.add(new Student("D", 8));
        list.add(new Student("E", 10));
        System.out.println("Sắp theo điểm (Comparable)");
        Collections.sort(list);
        for (Student student : list) {
            System.out.println(student);
        }
        Comparator<Student> theoTen=(sv1,sv2)->sv1.getName().compareTo(sv2.getName());
        Collections.sort(list, theoTen);
        System.out.println("Sắp theo tên(Comparator");
        for (Student student : list) {
            System.out.println(student);
        }

    }
}