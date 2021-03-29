/*
Nama        : Assiva Nurul Huzna
NIM         : 11200930000029
Kelas       : Sistem Informasi 2A
 */

package Matematika;
public class Matematika {
    int tambah = 0;
    int kurang = 0;
    int kali = 0;
    int bagi = 0;
    double pertambah = 0;
    double pengurang = 0;
    double perkali = 0;
    double pembagi = 0;

    void pertambahan(int a,int b){
        tambah = a+b;
        System.out.println("Pertambahan :"+a+"+"+b+"="+tambah);
    }
    
    void pengurangan(int a,int b){
        kurang = a-b;
        System.out.println("Pengurangan :"+a+"-"+b+"="+kurang);
    }
    
    void perkalian(int a,int b){
        kali = a*b;
        System.out.println("Perkalian :"+a+"x"+b+"="+kali);
    }
   
    void pembagian(int a,int b){
        bagi = a/b;
        System.out.println("Pembagian : "+a+"/"+b+"="+bagi);
    }
    void pertambahan(double a,double b,double c){
        pertambah = a+b+c;
        System.out.println("Pertambahan :"+a+"+"+b+"+"+c+"="+tambah);
    }
    void pertambahan(double a,double b){
        pertambah = a+b;
        System.out.println("Pertambahan :"+a+"+"+b+"="+tambah);
    }
    void pengurangan(double a,double b,double c){
        pengurang = a-b-c;
        System.out.println("Pengurangan :"+a+"-"+b+"-"+c+"="+kurang);
    }
    
    void perkalian(double a,double b,double c){
        perkali = a*b*c;
        System.out.println("Perkalian :"+a+"*"+b+"*"+c+"="+kali);
    }
   
    void pembagian(double a,double b,double c){
        pembagi = a/b/c;
        System.out.println("Pembagian : "+a+"/"+b+"/"+c+"="+bagi);
    } 
}

