package jdbc;

import java.util.Scanner;

public class PlainJdbcApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UserDAO user = new UserDAO();

        while(true){
            System.out.print("Enter User Name or Type quit to Stop: ");
            String name = sc.nextLine().trim() ;
            if(name.equalsIgnoreCase("quit")){
                System.out.println("Stopping user entries");
                break;
            }
            System.out.print("Enter AGE: " );
            int age = sc.nextInt();
            sc.nextLine();
            user.createUser(name,age);
            System.out.println("user added successfully");
        }
        System.out.println("DATABASE:  ");
        user.readUser();
        sc.close();
    }
}
