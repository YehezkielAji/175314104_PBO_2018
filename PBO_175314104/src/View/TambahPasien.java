/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Yeski's Legion
 */
public class TambahPasien extends JFrame implements ActionListener {

    private JMenuBar Menu;
    private JMenu fileMenu;
    private JMenuItem exitMenu;
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JTextField namaText;
    private JButton saveButton;
    
    private JMenuItem newMenuItem;

    public TambahPasien() {
        init();
    }

    public void init() {

        Menu = new JMenuBar();
        fileMenu = new JMenu("File");

        Menu.add(fileMenu);
        this.setJMenuBar(Menu);

        exitMenu = new JMenuItem("Exit");
        newMenuItem = new JMenuItem("New");

        fileMenu.add(newMenuItem);
        fileMenu.add(exitMenu);
        Menu.add(fileMenu);

        exitMenu.addActionListener(this);

        this.setLayout(null);

 namaLabel = new JLabel("NoRM");
        namaLabel.setBounds(100, 70, 50, 20);
        this.add(namaLabel);
        
        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(320, 70, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(370, 70, 100, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Alamat");
        namaLabel.setBounds(320, 100, 50, 20);
        this.add(namaLabel);
        
        namaText= new JTextField();
        namaText.setBounds(370, 100, 100, 20);
        this.add(namaText);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == exitMenu) {
            System.exit(0);
     
        }
    } 

}