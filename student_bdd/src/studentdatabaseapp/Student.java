package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    // On créer les propriétés
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1000;

    //On établit maintenant les méthodes, les constructeur pour les fonctionnalités de notre app
    //Constructeur prompt au user de mettre son nom et son année
    public Student() {
//        Un input
        Scanner in = new Scanner(System.in);
        System.out.print("Entrez le prénom de l'étudiant : ");
        this.firstName = in.nextLine();

        System.out.print("Entrez le nom de l'étudiant : ");
        this.lastName = in.nextLine();

        System.out.print("1 - Première année \n2 - Deuxième année " +
                "\n3- Junior \n4- Sénior\n Entrez le grade de l'étudiant : ");
        this.gradeYear = in.nextInt();

        //lorsque l'on appelle notre méthode setStudentID, l'id incrémente de 1
        setStudentID();


        System.out.println(firstName + " " + lastName + " " + gradeYear + "" + studentID);


    }

    //Méthode, setter pour générer son ID
//    Il doit avoir leur propre ID --> avec static, elle ne renvoie rien donc void
    private void setStudentID() {
        //Son grade + son ID
        id++;
        this.studentID = gradeYear + " " + id;
    }

    //Inscription aux cours
    public void enroll() {
        // On fait une boucle
        do {
            System.out.println("Entrez le cours (Q pour quitter): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                System.out.println("Fin !");
                break;
            }
        } while (1 != 0);
        System.out.println("Inscrit à :" + courses);
        System.out.println("Frais de scolarité :" + tuitionBalance);
    }

    // Voir le solde

    // Payer les frais de scolarité
}
