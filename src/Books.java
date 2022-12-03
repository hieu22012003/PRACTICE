public class Books {

    String Bookid, BookName, Author ;
    Integer Price;

    //contructor
    public Books(){

    }
    public Books( String Bookid, String BookName, String Author, Integer Price ) {
        Bookid = Bookid;
        BookName = BookName;
        Author = Author;
        Price = Price;
    }

    //getter & setter


    public String getEnrolID() {
        return Bookid;
    }

    public void setEnrolID(String Bookid) {
        Bookid=Bookid;
    }

    public String getFirstName() {
        return BookName;
    }

    public void setFirstName(String BookName) {
        BookName =  BookName;
    }

    public String getLastName() {
        return Author;
    }

    public void setLastName(String Author) {
        Author = Author;
    }

    public Integer getAge() {
        return Price;
    }

    public void setAge(Integer Price) {
        Price = Price;
    }

}
