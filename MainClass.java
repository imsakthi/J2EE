package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("1)Press 1 for signup \n2)Press 2 for login \n3)Press 3 for logout");
        System.out.println("Enter choice ");
        int choice = s.nextInt();

        DBMethods db = new DBMethods();

        switch (choice) {
            case 1: {
                System.out.println("Welcome to signup page");
                System.out.println("Enter id");
                int id = s.nextInt();
                System.out.println("Enter First name");
                String fname = s.next();
                System.out.println("Enter last name");
                String lname = s.next();
                System.out.println("Enter email");
                String email = s.next();
                System.out.println("Enter password");
                String pass = s.next();
                System.out.println("Enter DOB");
                String dob = s.next();
                System.out.println("Enter phone");
                long phone = s.nextLong();

                User u = new User();
                u.setId(id);
                u.setFirst_name(fname);
                u.setLast_name(lname);
                u.setEmail(email);
                u.setPassword(pass);
                u.setDob(dob);
                u.setPhone(phone);

                db.save(u);
                break;
            }
            case 2: {
                System.out.println("Enter email");
                String email = s.next();
                User u = db.findByEmail(email);

                if (u != null) {
                    System.out.println("Enter password");
                    String pass = s.next();
                    if (pass.equals(u.getPassword())) {
                        System.out.println(
                            "Press 1 to fetch all data \nPress 2 for update \nPress 3 find by id \nPress 4 for delete by id");
                        int ch = s.nextInt();
                        switch (ch) {
                            case 1: {
                                ArrayList<User> al = db.fetchAll();
                                for (User u1 : al) {
                                    System.out.println(u1);
                                }
                                break;
                            }
                            case 2: {
                                System.out.println("Enter id");
                                int id = s.nextInt();
                                User u2 = db.findById(id);
                                if (u2 != null) {
                                    System.out.println(
                                        "Press 1 for update first name \nPress 2 for update last name \nPress 3 for update email \nPress 4 for update password \nPress 5 for update dob \nPress 6 for update phone");
                                    System.out.println("Enter your choice");
                                    int cho = s.nextInt();
                                    switch (cho) {
                                        case 1: {
                                            System.out.println("Enter first name");
                                            String firstName = s.next();
                                            u2.setFirst_name(firstName);
                                            break;
                                        }
                                        case 2: {
                                            System.out.println("Enter last name");
                                            String lastName = s.next();
                                            u2.setLast_name(lastName);
                                            break;
                                        }
                                        default: {
                                            System.out.println("Enter valid input");
                                        }
                                    }
                                    db.Update(u2);
                                } else {
                                    System.out.println("Id not found");
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Enter id");
                                int id = s.nextInt();
                                User u1 = db.findById(id);
                                if (u1 != null) {
                                    System.out.println(u1);
                                } else {
                                    System.out.println("Id not found");
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Enter id");
                                int id = s.nextInt();
                                db.delete(id);
                                break;
                            }
                            default: {
                                System.out.println("Enter valid input");
                            }
                        }
                    } else {
                        System.out.println("Incorrect password");
                    }
                } else {
                    System.out.println("Email not found");
                }
                break;
            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Enter valid input");
            }
        }
    }
}
