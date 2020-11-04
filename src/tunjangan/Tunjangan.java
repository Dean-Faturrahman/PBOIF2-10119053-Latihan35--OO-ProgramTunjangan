/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tunjangan;

/**
 *
 * @author Dean
 */
public class Tunjangan {
    public int gajiPokok;
    public String status;
    
    public double hitungTunjangan(){
        if ("Menikah".equals(status)||"menikah".equals(status)){
            return 0.35 * gajiPokok;
        } else {
            return 0;
        }
    }
    
    public double hitungGaji(){
        return gajiPokok + hitungTunjangan();
    }
    
    public void tampilHasilHitung(){
        System.out.println("");
        System.out.println("========Hasil Perhitungan Gaji========");
        System.out.println("Gaji Pokok : " + gajiPokok);
        System.out.println("Tunjangan  : " + hitungTunjangan());
        System.out.println("Total Gaji : " + hitungGaji());
    }
}
