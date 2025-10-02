
 
package pkgif.pkgelse;

/**
 *
 * @author Asus
 */
//public class IfElse {

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        Scanner input = new Scanner ( System.in);
//        
//        
//
//  if (nilai >= 90) {
//      System.out.println("Nilai A");
//  } else if (nilai >= 75) {
//      System.out.println("Nilai B");
//  } else if (nilai >= 60) {
//      System.out.println("Nilai C");
//  } else {
//      System.out.println("Nilai D");
//  }
//  
//    }
//    
//}

import java.util.Scanner;

  public class IfElse {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Masukkan username: ");
          String user = scanner.nextLine();

          System.out.print("Masukkan password: ");
          String pass = scanner.nextLine();

          if (user.equals("admin") && pass.equals("1234")) {
              System.out.println("Login berhasil, selamat datang " + user + "!");
          } else {
              System.out.println("Login gagal, coba lagi.");
          }
      }
  }
  