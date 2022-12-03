import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BookManage sm = new BookManage();
        Scanner sc = new Scanner(System.in);
        int x;

        while (true) {
            System.out.println("\n-----------Menu------------");
            System.out.println("Choose the function you want:");
            System.out.println("1. Add books");
            System.out.println("2. Save books to list");
            System.out.println("3. Show books list");
            System.out.println("0. Exit");
            System.out.println("---------------------------");
            do {
                System.out.print("Please choose: ");
                x = sc.nextInt();
            } while (x < 0 || x > 3); {
                switch (x) {
                    case 1: {
                        try {
                            sm.addBooks();
                            System.out.println("\nYou have successfully added books");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 2: {
                        try {
                            sm.saveBooks();
                            System.out.println("\nYou have successfully saved the books to the file");
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 3: {
                        try {
                            System.out.println("\nBooks List: \n");
                            sm.showBooks();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 0: {
                        System.out.println("Progress stopped");
                        return;
                    }

                }
            }
        }

    }
}
