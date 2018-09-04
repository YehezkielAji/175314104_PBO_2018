/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_175314104;

public class Dokter {
    private String nomorDokter,nama,alamat,tempatLahir; //variabel String dan bersifat private
    private int tanggalLahir; //variabel integer dan bersifat private
    
    public void setNomorDokter(String nomorDokter) throws NumberFormatException{ //method void dengan throws NumberFormatException
        if (nomorDokter.toCharArray().length>=6) //Method ini mengalokasikan array karakter baru
        this.nomorDokter = nomorDokter;
        else{
            throw new NumberFormatException("Nomor Dokter Salah"); //NumberFormatException berfungsi untuk menangani kesalahan dalam format penulisan angka.
    }
    }
    
    public String getNomorDokter() {
        return nomorDokter;
    }
     
    public void setNama(String nama) { //method void setNama dengan parameter variabel nama String
        this.nama = nama;
    }
        
    public String getNama() { //method getNama yang akan mereturn variabel String
        return nama;
    }

    public void setAlamat(String alamat) {  //method void setAlamat dengan parameter variabel alamat String
        this.alamat = alamat;
    }
    
    public String getAlamat() { //method getAlamat yang mereturn variabel String
        return alamat;
    }
     
    public void setTempatLahir(String tempatLahir) {  //method void setTempatLahir dengan parameter variabel tempatLahir bertipe integer
        this.tempatLahir = tempatLahir;
    }
    
    public String getTempatLahir() { //method getTempatLahir yang akan mereturn variabel String
        return tempatLahir;
    }
   
    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException{ //method void setTanggalLahir dengan parameter variabel tanggalLahir bertipe integer
        if(tanggalLahir>0 && tanggalLahir<32)
        this.tanggalLahir = tanggalLahir;
        else throw new NumberFormatException("Tanggal Lahir Tidak Valid");
    }  
    
    public int getTanggalLahir() {   //method getTanggalLahir yang mereturn variabel integer
        return tanggalLahir;
    }
}