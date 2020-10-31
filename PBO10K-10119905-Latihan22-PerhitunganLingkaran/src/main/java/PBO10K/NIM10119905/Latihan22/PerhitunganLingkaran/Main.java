/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan22.PerhitunganLingkaran;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Function;


/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program untuk Menghitung lingkaran
 */
public class Main {

    public static void main(String[] args) {
        float diameter = 0;
        boolean cek = false;
        
        Function<Float, Float> jarijari = diameterlingkaran
                -> diameterlingkaran / 2;
        
        Function<Float, Double> keliling = diameterlingkaran
                -> Math.PI * diameterlingkaran;
        
        Function<Float, Double> luas = diameterlingkaran 
                -> (0.25f * Math.PI) * Math.pow(diameterlingkaran, 2);
        
        var scanner = new Scanner(System.in);
        
        System.out.println("==================== Perhitungan Lingkaran ====================");
        while(!cek)
        {
            try {
                System.out.println("Masukan Nilai Diameter Lingkaran : ");
                diameter = scanner.nextFloat();
                cek = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter Tidak Sesuai.\n");
                scanner.next();
            }
        }
        
        System.out.println();
        System.out.println("================== Hasil Perhitungan Lingkaran ==================");
        System.out.printf("Jari Jari Lingkaran \t\t= %.0f cm%n", jarijari.apply(diameter),("cm"));
        System.out.printf("Luas Lingkaran \t\t\t= %.2f cm%n", luas.apply(diameter));
        System.out.printf("Keliling Lingkaran \t\t= %.2f cm%n", keliling.apply(diameter));
        
    }
    
}
