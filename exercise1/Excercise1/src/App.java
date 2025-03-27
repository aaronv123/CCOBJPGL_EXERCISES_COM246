import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

// Login
    System.out.print("Enter Username: ");

    String username = scanner.nextLine();

    System.out.print("Enter Password: ");

    String password = scanner.nextLine();
    
// Declare user object
User me = new User(username, password);

    System.out.println();


// File check
    File myfile = new File("Account.txt");

//    if (myfile.exists()) {
//        System.out.println("File Exists");}

// File read
    Scanner fileScanner = new Scanner(myfile);

    Boolean accountexists = false;
    while (fileScanner.hasNextLine()) {
       String filedata = fileScanner.nextLine();
//     System.out.println(filedata); 

       String usernamefile = filedata.split(",")[0];

       String passwordfile = filedata.split(",")[1];
       
    if (username.equals(usernamefile) && password.equals(passwordfile)) {
       accountexists = true;
       break;
    }
    }
    if (accountexists) {
        System.out.println("Login Succesful\n" + me.getUsername());
    } else {
        System.out.println("Login Failed");
    }
    fileScanner.close();
}

}


