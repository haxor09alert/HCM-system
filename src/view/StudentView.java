package view;

import controller.UserController;
import models.Student;
import models.User;

public class StudentView {
    public static void main(String[] args) {
        User s1 = new User("Biraj", "birajcondo@gmail.com", "1234", null);
        UserController sc = new UserController();
        int insertedStudent = sc.insertDetails(s1);

        if (insertedStudent > 0) {
            System.out.println("Student inserted");
        } else {
            System.out.println("Failed to insert student");
        }
    }
}