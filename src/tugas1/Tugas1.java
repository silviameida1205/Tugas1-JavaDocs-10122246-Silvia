package tugas1;
import java.util.Scanner;

/**
 * Kelas Tugas1 menjalankan simulasi aplikasi ATM Bank Maju Mundur.
 * Nasabah dapat melihat saldo, menambah, atau menarik uang dari tabungan.
 * @author Silvia Meida
 */
public class Tugas1 {
    
    /**
     * Mengelola alur menu utama dan interaksi dengan pengguna.
     * @param args argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
     Scanner inputData = new Scanner(System.in);
     
     //Inisialisasi data nasabah
     Tabungan data = new Tabungan (
             "Silvia Meida", 
             "10122246" ,
             "Cimahi",
             2000000);
     Nasabah menu = new Nasabah ();
     menu.pilihMenu();
        System.out.print("PILIH MENU : "); int pilihMenu = inputData.nextInt();
        menu.getPilihMenu();
        
        while(pilihMenu != 4){
            if (pilihMenu == 1){
                System.out.println("");
                menu.tampilDataTabungan(data);
            }
            else if (pilihMenu == 2){
                System.out.println("");
                menu.prosesPengisianSaldo(data);
            }
            else if (pilihMenu == 3){
                System.out.println("");
                menu.prosesPenarikanSaldo(data);
            }
            else
                System.out.println("Program Berakhir");
            System.out.println("");
            menu.getPilihMenu();
            menu.pilihMenu();
            System.out.print("PILIH MENU :"); pilihMenu = inputData.nextInt();
        }
     
    }
    
}
