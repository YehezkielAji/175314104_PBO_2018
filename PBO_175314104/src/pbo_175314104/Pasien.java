/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_175314104;

public class Pasien {
    private String noRekam,nama,alamat,tempatLahir; //variabel bertipe String dan bersifat private
    private int tanggalLahir,bulanLahir,tahunLahir; //variabel bertipe integer dan bersifat privat
    
    public Pasien(){ //menambahkan konstraktor    
    }
    
    public String getNoRekam() { //method getNoRekam yang mereturn variabel String
        return noRekam;
    }
    
    public void setNoRekam(String noRekam) throws NumberFormatException { //method void menambahkan throws NumberFormatException
        if (noRekam.toCharArray().length>=6) { //Method ini mengalokasikan array karakter baru
            this.noRekam = noRekam;
        }else{
                throw new NumberFormatException("Nomor Rekam Medis Salah"); //NumberFormatException berfungsi untuk menangani kesalahan yang ada dalam format penulisan angka
                }
    }
    
    public String getNama() { //method getNama yang mereturn variabel data String
        return nama;
    }
    
    public void setNama(String nama) { //method void setNama dengan parameter variabel nama bertipe String
        this.nama = nama;
    }
    
    public String getAlamat() { //method getAlamat yang akan mereturn variabel String
        return alamat;
    }
    
    public void setAlamat(String alamat) { //method void setNama dengan parameter variabel alamat bertipe String
        this.alamat = alamat;
    }
    
    public String getTempatLahir() { //method getTempatLair yang mereturn variabel bertipe String
        return tempatLahir;
    }
    
    public void setTempatLahir(String tempatLahir) {  //method void setTempatLahir dengan parameter variabel tempatLahir bertipe integer
        this.tempatLahir = tempatLahir;
    }
    
    public int getTanggalLahir() { //method getTanggalLahir yang mereturn variabel integer
        return tanggalLahir;
    }
    
    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException { //method void setTanggalLahir dengan parameter variabel tanggalLahir bertipe integer
        if(tanggalLahir>0 && tanggalLahir<32)
        this.tanggalLahir = tanggalLahir;
        else{  throw new NumberFormatException("Tanggal Lahir tidak vaild");}
    }
    
    public int getBulanLahir() {  //method getBulanLahir yang akan mereturn variabel integer
        return bulanLahir;
    }
    
    public void setBulanLahir(int bulanLahir) throws NumberFormatException { //method void setBulanLahir dengan parameter variabel bulanLahir bertipe integer
        if(bulanLahir>0 && bulanLahir<13)
        this.bulanLahir = bulanLahir;
        else{  throw new NumberFormatException("Bulan Lahir tidak vaild");}
    }
    
    public int getTahunLahir() {  //method getTahunLahir yang mereturn variabel integer
        return tahunLahir;
    }
    
    public void setTahunLahir(int tahunLahir)  throws NumberFormatException { //method void setTahunlahir dengan parameter variabel tahunLahir bertipe integer
         if(tahunLahir>0 )
        this.tahunLahir = tahunLahir;
         else{  throw new NumberFormatException("Tahun Lahir tidak vaild");}
    }
}