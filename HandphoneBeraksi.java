/*
Nama    : Assiva Nurul Huzna
NIM     : 11200930000029
Kelas   : Sistem Informasi 2A
 */
package hp;

public class HandphoneBeraksi {
    public static void main(String[] args) {
        Handphone hpku = new Handphone();
        
        hpku.hp = "Handphone hidup...";
        hpku.hp = "Kring, kring, kring...panggilan dilakukan";
        hpku.hp = "Dung, dung...sms berhasil terkirim";
        hpku.hp = "Handphone mati...";
        
        hpku.printhidupkan();
        hpku.printlakukanpanggilan();
        hpku.printkirimSMS();
        hpku.printmatikan();
    }
    
}
