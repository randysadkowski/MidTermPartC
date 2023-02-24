/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.*;
/**
 *
 * @author randy
 */
public class TestUserprofile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();
        
        System.out.print("Enter your favorite genre: (1 for Comedy, 2 for Drama, 3 for Action, 4 for Mystery)");
        String userGenre = sc.nextLine();
        
        System.out.println("User profile successfully created");
    }
}
