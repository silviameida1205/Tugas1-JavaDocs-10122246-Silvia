package tugas1;

/**
 * Kelas Tabungan Menggambarkan data tabungan milik seorang nasabah.
 * menyediakan fungsi untuk mengelola saldo tabungan seperti pengisian dan penarikan.
 * @author Silvia Meida
 */
public class Tabungan {
    //ATRIBUT TABUNGAN
    private String nama;
    private String noRek;
    private String alamat;
    private int saldoTabungan;
    
    //GETTER & SETTER
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNoRek() {
        return noRek;
    }
    public void setNoRek(String noRek) {
        this.noRek = noRek;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public int getSaldoTabungan() {
        return saldoTabungan;
    }
    public void setSaldoTabungan(int saldoTabungan) {
        this.saldoTabungan = saldoTabungan;
    }
    
    //KONSTRUKTOR
    /**
     * Membuat objek Tabungan baru dengan data nasabah dan saldo awal.
     * @param nama nama nasabah
     * @param noRek nomor rekening nasabah
     * @param alamat alamat nasabah
     * @param saldoTabungan saldo awal tabungan
     */
    public Tabungan(String nama, String noRek, String alamat, int saldoTabungan){
        this.nama =nama;
        this.noRek = noRek;
        this.alamat= alamat;
        this.saldoTabungan = saldoTabungan;
    }
    
    //METHOD UTAMA
    /**
     * Melakukan proses pengisian saldo tabungan.
     * Hanya menerima nominal positif.
     * 
     * @param menu objek nasabah yang berisi junlah nominal yang akan ditambahkan.
     */
    public void isiTabungan(Nasabah menu){
        if(menu.getJumlahNominal() > this.getSaldoTabungan()){
            this.saldoTabungan = saldoTabungan + menu.getJumlahNominal();
        }
    }
    
    /**
     * Melakukan proses penarikan saldo tabungan.
     * Menolak penarikan jika saldo tidak mencukupi.
     * @param menu objek Nasabah yang berisi jumlah nominal yang akan ditarik.
     */
    public void TarikTabungan(Nasabah menu){
        if (menu.getJumlahNominal() > this.getSaldoTabungan()){
            this.saldoTabungan = this.getSaldoTabungan();
        }
        else
            this.saldoTabungan = saldoTabungan - menu.getJumlahNominal();
    }
}
