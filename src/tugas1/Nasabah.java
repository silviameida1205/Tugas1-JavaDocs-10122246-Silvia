package tugas1;
import java.util.Scanner;

/**
 * Kelas Nasabah menggambarkan interkasi nasabah dengan aplikasi ATM Bank Maju Mundur.
 * Nasabah dapat melihat data tabungan, melakukan pengisian, atau penarikan saldo.
 * @author Silvia Meida
 */

public class Nasabah {
    //dATRIBUT NASABAH
    private final Scanner inputData = new Scanner (System.in);
    private int pilihMenu;
    private int jumlahNominal;
    
    
    //METHOD GETTER & SETTER
    public int getPilihMenu(){
        return pilihMenu;
    }

    public void setPilihMenu(int pilihMenu) {
        this.pilihMenu = pilihMenu;
    }

    public int getJumlahNominal() {
        return jumlahNominal;
    }

    public void setJumlahNominal(int jumlahNominal) {
        this.jumlahNominal = jumlahNominal;
    }
    
    //METHOD UTAMA
    /**
     * Menampilkan daftar menu utama aplikasi ATM.
     */
    public int pilihMenu(){
        System.out.println("Aplikasi ATM Bank Maju Mundur");
        System.out.println("=============================");
        System.out.println("1) Lihat Data Tabungan");
        System.out.println("2) Pengisian Saldo Tabungan");
        System.out.println("3) Penarikan Saldo Tabungan");
        System.out.println("4) Keluar Aplikasi");
        return pilihMenu;
    }
    
    /**
     * Menampilkan data tabungan Nasabah.
     * @param data objek Tabungan yang berisi Iinformasi nasabah.
     */
    public void tampilDataTabungan(Tabungan data){
        System.out.println("DATA TABUNGAN BANK MAJU MUNDUR");
        System.out.println("==============================");
        System.out.println("Nama Nasabah    : " +data.getNama());
        System.out.println("No Rekening     : " +data.getNoRek());
        System.out.println("Alamat          : " +data.getAlamat());
        System.out.println("Saldo Tabungan  : " +data.getSaldoTabungan());
    }
    
    /**
     * Melakukan proses pengisian saldo ke tabungan.
     * 
     * @param data objek Tabungan yang akan diisi saldonya.
     */
    public void prosesPengisianSaldo(Tabungan data){
        System.out.println("MENU PENGISIAN TABUNGAN");
        System.out.println("=======================");
        System.out.println("Masukan Jumlah Nominal Yang Akan di Transfer");
        System.out.print("Jumlah Nominal =  ");
        this.jumlahNominal = inputData.nextInt();
        
        data.isiTabungan(this);
        System.out.println("✅ Saldo berhasil ditambahkan.");
    }
    
    /**
     * Melakukan proses penarikan saldo dari Tabungan.
     * @param data objek Tabungan yanh akan ditarik saldonya.
     */
    public void prosesPenarikanSaldo(Tabungan data){
        System.out.println("MENU PENARIKAN TABUNGAN");
        System.out.println("=======================");
        System.out.println("Masukan Jumlah Nominal yang Akan di Tarik");
        System.out.print("Jumlah Nominal =  ");
        this.jumlahNominal = inputData.nextInt();
        
        data.TarikTabungan(this);  
        System.out.println("✅ Penarikan saldo berhasil dilakukan.");
    }
}
