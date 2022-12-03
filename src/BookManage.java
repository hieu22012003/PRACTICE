import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManage {
    private ArrayList<Books> booksList = new ArrayList<Books>();

    Scanner sc = new Scanner(System.in);
    //input
    public String inputID() {
        System.out.print("Input book ID: ");
        String ID = sc.nextLine();
        return ID;
    }
    public String inputBookTitle() {
        System.out.print("Input book name: ");
        String BookTitle = sc.nextLine();
        return BookTitle;
    }
    public String inputAuthor() {
        System.out.print("Input book author: ");
        String Author = sc.nextLine();
        return Author;
    }
    public int inputPrice() {
        System.out.print("Input book price: ");
        int Price = sc.nextInt();
        return Price;
    }

    //phương thức
    public void addBooks(){
        String ID = inputID();
        String BookTitle = inputBookTitle();
        String Author = inputAuthor();
        int Price = inputPrice();

        Books Books = new Books(ID, BookTitle, Author, Price);
        booksList.add(Books);
    }

    //save students
    public void saveBooks() throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("Books.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            //read file
            FileInputStream fis = new FileInputStream("Books.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            while (txt != null) {
                System.out.println(txt);
                txt = dis.readLine();
            }
        } catch (FileNotFoundException f) {
            System.out.println("File not found");
        } catch (IOException io) {
            System.out.println("Error...");
        }
    }

    //read files -> show student
    public void readFiles() throws IOException, ClassNotFoundException {
        File f = new File("Books.txt");
        FileInputStream fin = new FileInputStream(f);
        ObjectInputStream objin = new ObjectInputStream(fin);

        booksList = new ArrayList<Books>();
        booksList = (ArrayList)objin.readObject();

        showBooks();

        objin.close();
        fin.close();
    }

    public void showBooks() {
        if (booksList.size()==0){
            System.out.println("List is empty");
        }
        else{
            System.out.println("|   EnrolID   |      Full name      |  Age  |");
            System.out.print("=============================================\n");
            for (Books b : booksList) {
                System.out.format("| %11s | %19s | %5d |\n",b.getEnrolID(),b.getFirstName() + " " + b.getLastName(),b.getAge());
            }
        }
    }
}
