/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan31_perkenalanmahasiswa;

/**
 *
 * @author Geo Syah Alkautsar
 * Deskripsi Kelas : Kelas tambahan untuk program utama
 */
public class Mahasiswa {
    public String nama;
    public String nim;

    public void perkenalkanDiri(String parNim, String parNama) {
        System.out.println("Hello everyone");
        System.out.println("My nim is : " + parNim);
        System.out.println("My name is : " + parNama);
        System.out.println("");

    }
}