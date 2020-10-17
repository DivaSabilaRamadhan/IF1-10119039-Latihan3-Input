/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; // import kelas scanner
/**
 *
 * @author
 * NAMA  : Diva Sabila Ramadhan 
 * KELAS : IF1
 * NIM   : 10119039
 * Deskripsi Program : Program Input 
 * 
 */
public class Input {

        public static void main(String[] args) {
        System.out.println("Masukkan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+ nama);
    }
    
}
