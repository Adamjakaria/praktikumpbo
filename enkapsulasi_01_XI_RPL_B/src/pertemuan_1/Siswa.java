/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;

/**
 *
 * @author ADAM
 */
public class Siswa{
    
    private String nama;
    private int nilai;
    private String kelas;
    
    public void isiData(){
        nama = "Steven";
        nilai = 90;
        kelas = "XI RPL B";
    }
    public String getNama(){
        return this.nama;
    }
    public int getNilai(){
        return this.nilai;
    }
    public String getKelas(){
        return this.kelas;
    }
    public void cetak(){
        System.out.println("nama : " + nama);
        System.out.println("nilai : " + nilai);
        System.out.println("kelas : " + kelas);
    }
    
}
