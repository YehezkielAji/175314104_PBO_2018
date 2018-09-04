/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_175314104;

public class Klinik {
    private String id, nama; //variabel String bersifat private

    public void setId(String id) { //method void setId dengan parameter variabel id bertipe String
        this.id = id;
    }
    
    public String getId() { //method getId yang mereturn variabel String
        return id;
    }
     
    public void setNama(String nama) { //method void setNama dengan parameter variabel nama bertipe String
        this.nama = nama;
    }
    
    public String getNama() { //method getNama yang mereturn variabel String
        return nama;
    }
}