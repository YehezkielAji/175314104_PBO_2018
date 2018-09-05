/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_175314104;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class DaftarAntrian extends JDialog {
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    
    public static void main(String[] args) {
        DaftarAntrian test = new DaftarAntrian();
        test.setSize(300, 400);
        test.setVisible(true);
    }
    
    public void init(){
        this.setLayout(null);
        judulLabel = new JLabel("DAFTAR PASIEN");
        judulLabel.setBounds(100, 25, 150, 10);
        this.add(judulLabel);
        
        namaLabel = new JLabel("NoRM");
        namaLabel.setBounds(10, 80, 50, 10);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds(80, 75, 200, 25);
        this.add(namaText);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(10, 130, 50, 10);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds(80, 125, 200, 25);
        this.add(namaText);
        
        namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(10, 180, 50, 10);
        this.add(namaLabel);
        
        namaText = new JTextField();
        namaText.setBounds(80, 175, 200, 25);
        this.add(namaText);
        
        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(80, 240, 150, 30);
        this.add(saveButton);
        
        
    }
    public DaftarAntrian(){
        init();
        
    }
    public DaftarAntrian (String title){
        this.setTitle(title);
        init();
    }
}
