package edu.miu.cs.cs425.demos;

import edu.miu.cs.cs425.demos.model.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudentRecordMgmtApp {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Student s1 = new Student(110001, "Dave", LocalDate.of(1951, 11, 18));
        Student s2 = new Student(110002, "Anna", LocalDate.of(1970, 12, 07));
        Student s3 = new Student(110003, "Erica", LocalDate.of(1974, 01, 31));
        Student s4 = new Student(110004, "Carlos", LocalDate.of(2009, 8, 22));
        Student s5 = new Student(110005, "Bob", LocalDate.of(1990, 03, 05));

        Student[] students = {s1, s2, s3, s4, s5};
        printListOfStudent(students);
        System.out.println("*************************************");
        List<Student> st = getListOfPlatinumAlumniStudents(students);
        st.forEach(System.out::println);
        System.out.println("**************************************");
        int[] arr = {5, 15, 30, 7, 21, 35};
        printHelloWorld(arr);
        System.out.println("***************************************");
        int[] num={1,2,3,4,5};
        int[] num2={19,9,11,0,12};
        int result =findSecondBiggest(num);
        int res2 = findSecondBiggest(num2);
        System.out.println(result);
        System.out.println(res2);

    }

    private static void printListOfStudent(Student[] students) {
        Arrays.stream(students)
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);

    }

    private static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> sts = new ArrayList<>();
        for (Student i : students) {
            Period difference = Period.between(i.getDateOfadmission(), LocalDate.now());
            if (difference.getYears() > 30) {
                sts.add(i);
            }
        }
        return sts;

    }

    public static void printHelloWorld(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] % 7 == 0) {
                System.out.println("Hello World");
            }
            if (arr[i] % 5 == 0) {
                System.out.println("Hello");
            }
            if (arr[i] % 7 == 0) {
                System.out.println("World");
            }
        }
    }
        public static int findSecondBiggest(int[] arr){
          int max1 = arr[0];
          int max2 = arr[1];
          for(int i=2; i< arr.length;i++){
              if(arr[i] > max2){
                  max2=arr[i];
              }
              if(max2 > max1){
                  int temp = max1;
                  max1 = max2;
                  max2 = temp;
              }

            }
          return max2;


    }










}
