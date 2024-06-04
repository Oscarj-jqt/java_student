package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    // On créer les propriétés
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
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
                courses = courses + "\n " + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                System.out.println("Fin !");
                break;
            }
        } while (1 != 0);
    }

    // Voir le solde
    public void viewBalance() {
        System.out.println("Votre solde est de: $" + tuitionBalance);
    }

    // Payer les frais de scolarité
    public void payTuition() {
        viewBalance();
        //On fait la méthode pour le système de paiement
        // le prompt pour entrer la valeur du prix
        System.out.print("Entrez votre paiement: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Paiement confirmé de $ " + payment);
        viewBalance();
    }
    // Montrer le statut
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade: " + gradeYear +
                "\nid de l'étudiant :" + studentID +
                "\nInscrit aux cours: " + courses +
                "\nLe solde: $" + tuitionBalance;
    }
}
