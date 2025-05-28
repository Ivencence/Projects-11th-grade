public class FinalProject {
    public static void main(String[] args) {
    }
    
    public static void write(String path, String message){
        try(FileWriter fw = new FileWriter(path, true)){
         fw.write(message);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void read(String path){
        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            bf.readLine();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
class Author{
    public String name;
    public String nationality;
    public int authorID;
public Author(String name, String nationality, int authorID){
    this.name = name;
    this.nationality = nationality;
    this.authorID = authorID;
}
}

class Book extends Author{
    public String title;
    public int year;
    public int bookID;
    public Book(String name, String nationality, int authorID, String title, int year, int bookID){
        super(name, nationality,authorID);
        this.title = title;
        this.year = year;
        this.bookID = bookID;
    }
}

class User{
    int userID;
        public User(int userID){
        this.userID = userID;
    }
}
