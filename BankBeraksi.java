/*
Nama        : Assiva Nurul Huzna
NIM         : 11200930000029
Kelas       : Sistem Informasi 2A
 */

public class BankBeraksi {

    public static void main(String[] args) {
        Bank MyBank = new Bank("Rp.100000");
        
        System.out.println("Selamat Datang Dibank ABC");
        System.out.println("Saldo saat ini:" + MyBank.Saldo + '\n');
        
        MyBank.Saldo = "Rp.500000";
        System.out.println("Simpan Uang:" + MyBank.Saldo);
        
        MyBank.Saldo = "Rp.600000";
        System.out.println("Saldo saat ini:" + MyBank.Saldo + '\n');
        
        MyBank.Saldo = "Rp.150000";
        System.out.println("Ambil :" + MyBank.Saldo);
        
        MyBank.Saldo = "Rp.450000";
        System.out.println("Saldo saat ini:" + MyBank.Saldo + '\n');
    }
}