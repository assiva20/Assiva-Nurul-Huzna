/*
Nama        : Assiva Nurul Huzna
NIM         : 11200930000029
Kelas       : Sistem Informasi 2A
 */

public class Bank {
    String Saldo;
    
    public Bank(String Saldo) {
        this.Saldo = Saldo;
    }
    
    public void data() {
        System.out.println("Saldo saat ini:" + Saldo);
        System.out.println("Simpan Uang:" + Saldo);
        System.out.println("Ambil Uang:" + Saldo);
    }
    
    void getsaldo() {
        System.out.println("Saldo saat ini:" + Saldo);
    }
}