/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_1;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class LuasBangunDatar {
    
    private int panjang;
    private int lebar;
    private int luas;
    
    public void IsiBangunDatar(){
	Scanner in = new Scanner(System.in);
	panjang = 9;
        lebar = 4;
        }
    public int getPanjang(){
        return this.panjang;
    }
    public int getLebar(){
        return this.lebar;
    }
     public void cetak(){
		System.out.println("============================");
		System.out.println("Menghitung luas persegi panjang");
		System.out.println("----------------------------");
		System.out.print("Masukkan panjang : ");
		System.out.println(panjang +" cm");
		System.out.print("Masukkan lebar : ");
		System.out.println(lebar +" cm");
		luas = panjang * lebar;
		System.out.println("============================");
		System.out.println("Luas persegi panjang= "+ luas + " cm");
	}

    
}
