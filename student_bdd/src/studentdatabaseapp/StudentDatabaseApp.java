package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {
        //Demander combien de nouveaux étudiants on veut ajouter
        System.out.print("Entrez le nombre de nouveaux étudiants à inscrire: ");
        Scanner in = new Scanner(System.in);
        //on veut créer un tableau d'étudiant
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        // Créer n nombre de nouveaux étudiants
        for (int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }

        for (int n = 0; n < numOfStudents; n++) {
            System.out.println(students[n].toString());
        }
    }
}
