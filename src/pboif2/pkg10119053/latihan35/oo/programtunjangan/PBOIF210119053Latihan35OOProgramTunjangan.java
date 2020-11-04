/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan35.oo.programtunjangan;

import java.util.Scanner;
import tunjangan.Tunjangan;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program tunjangan
 */
public class PBOIF210119053Latihan35OOProgramTunjangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tunjangan tunj = new Tunjangan();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");                
        tunj.gajiPokok = input.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        tunj.status = input.next();
        
        tunj.tampilHasilHitung();
    }
    
}
