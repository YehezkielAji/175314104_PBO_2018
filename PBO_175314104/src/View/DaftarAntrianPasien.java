/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Yeski's Legion
 */
public class DaftarAntrianPasien extends JDialog{
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    
    public DaftarAntrianPasien() {
        init();
    }

    public DaftarAntrianPasien(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);
        
        namaLabel = new JLabel("NoRM");
        namaLabel.setBounds(100, 70, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(200, 70, 100, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Tanggal Lahir");
        namaLabel.setBounds(100, 100, 100, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(200, 100, 100, 20);
        this.add(namaText);
        
         namaLabel = new JLabel("Bulan Lahir");
        namaLabel.setBounds(100, 130, 100, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(200, 130, 100, 20);
        this.add(namaText);
        
         namaLabel = new JLabel("Tahun Lahir");
        namaLabel.setBounds(100, 160, 100, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(200, 160, 100, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Klinik");
        namaLabel.setBounds(100, 190, 100, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(200, 190, 100, 20);
        this.add(namaText);
        
        saveButton=new JButton("SIMPAN");
        saveButton.setBounds(260,220,100,20);
        this.add(saveButton);
        
        namaLabel = new JLabel("DAFTAR PASIEN BARU");
        namaLabel.setBounds(260, 40, 300, 20);
        this.add(namaLabel);
    }
   
}