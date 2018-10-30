/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import pbo_175314104.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Pasien {
    
    public static void tambahPasienBaru(Pasien test) {
    daftarPasienKlinik.add(test);
    }
    public static Pasien cariPasien(String string) {
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if(daftarPasienKlinik.get(i).getNoRekamMedis()==string)
                return daftarPasienKlinik.get(i);
        }
        return null;
    }
    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            for (int i = 0; i < daftarPasienKlinik.size(); i++) {
                String data = daftarPasienKlinik.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
//            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
//            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
System.out.println(ex.getMessage());
        } finally {
            try {
                fos.close();

            } catch (IOException ex) {
//                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
System.out.println(ex.getMessage());            }
        }
    }
    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasil = hasil + (char)dataInt;
                    } else if (nama == false) {
                        temp.setNama(hasil);
                        nama = true;
                        hasil = "";
                    } else if (alamat == false) {
                        temp.setAlamat(hasil);
                        alamat = true;
                        hasil = "";
                    }
                }
            }
        } catch (FileNotFoundException ex) {
             System.out.println(ex.getMessage());

        } catch (IOException ex) {
             System.out.println(ex.getMessage());
        }
    }
    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienKlinik;
    }
    @Override
    public String toString() {
        return noRekamMedis+"\t"+nama + "\t" + alamat + "\n";
    }
    private String noRekamMedis,nama,alamat,tempatLahir; //deklarasi variabel bertipe data String dan bersifat private
    private int tanggalLahir,bulanLahir,tahunLahir; //deklarasi variabel bertipe data integer dan bersifat privat
    public static ArrayList<Pasien>daftarPasienKlinik=new ArrayList<Pasien>();
     
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik){ //menambahkan konstruktor, Konsktruktor adalah method yang pertama kali dijalankan pada saat sebuah objek pertama kali diciptakan
        setNama(nama);
        setAlamat(alamat);
        setTempatLahir(tempatLahir);
        setTanggalLahir(tanggalLahir);
        setBulanLahir(bulanLahir);
        setTahunLahir(tahunLahir);
        setNoRekamMedis(nik);
    }
    public Pasien() {
    }
    public String getNoRekamMedis() { //membuat method bernama getNoRekamedis yang akan mereturn variabel bertipe data String
        return noRekamMedis;
    }
    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException { //membuat method void dengan menambahkan throws NumberFormatException
        if (noRekamMedis.toCharArray().length>=6) { //Method ini mengalokasikan array karakter baru, yang panjangnya sesuai dengan panjang string yang ditentukan
            this.noRekamMedis = noRekamMedis;
        }else{
                throw new NumberFormatException("Nomor Rekam Medis Salah"); //NumberFormatException berfungsi untuk menangani kesalahan2 dalam format penulisan angka.
                }
    }
    public String getNama() { //membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return nama;
    }
    public void setNama(String nama) { //membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }
    public String getAlamat() { //membuat method bernama getAlamat yang akan mereturn variabel bertipe data String
        return alamat;
    }
    public void setAlamat(String alamat) { //membuat method void bernama setNama dengan parameter variabel alamat bertipe data String
        this.alamat = alamat;
    }
    public String getTempatLahir() { //membuat method bernama getTempatLair yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {  //membuat method void bernama setTempatLahir dengan parameter variabel tempatLahir bertipe data integer
        this.tempatLahir = tempatLahir;
    }
    public int getTanggalLahir() { //membuat method bernama getTanggalLahir yang akan mereturn variabel bertipe data integer
        return tanggalLahir;
    }
//    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException { //membuat method void bernama setTanggalLahir dengan parameter variabel tanggalLahir bertipe data integer
//        if(tanggalLahir>0 && tanggalLahir<32)
//        this.tanggalLahir = tanggalLahir;
//        else{  throw new NumberFormatException("Tanggal Lahir tidak vaild");}
//    }
    public void setTanggalLahir(int tanggalLahir){
        this.tanggalLahir=tanggalLahir;}
    public int getBulanLahir() {  //membuat method bernama getBulanLahir yang akan mereturn variabel bertipe data integer
        return bulanLahir;
    }
//    public void setBulanLahir(int bulanLahir) throws NumberFormatException { //membuat method void bernama setBulanLahir dengan parameter variabel bulanLahir bertipe data integer
//       if(bulanLahir>0 && bulanLahir<13)
//        this.bulanLahir = bulanLahir;
//       else{  throw new NumberFormatException("Bulan Lahir tidak vaild");}
//    }
    public void setBulanLahir(int bulanLahir){
        this.bulanLahir=bulanLahir;}
    public int getTahunLahir() {  //membuat method bernama getTahunLahir yang akan mereturn variabel bertipe data integer
        return tahunLahir;
    }

//    public void setTahunLahir(int tahunLahir)  throws NumberFormatException { //membuat method void bernama setTahunlahir dengan parameter variabel tahunLahir bertipe data integer
//         if(tahunLahir>0 )
//        this.tahunLahir = tahunLahir;
//         else{  throw new NumberFormatException("Tahun Lahir tidak vaild");}
//    }
    public void setTahunLahir(int tahunLahir){
        this.tahunLahir=tahunLahir;}
    public String getRekamMedis() {
        return noRekamMedis;
    }
    public void setNik(String text) throws Exception {
        if (text.length()== 6) {
            this.noRekamMedis=text;
        }else{
            throw new Exception("NIK harus terdiri dari 6 digit");
        }
    }
    public void setRekamMedis(String text) {
        text=noRekamMedis;
    }
}

