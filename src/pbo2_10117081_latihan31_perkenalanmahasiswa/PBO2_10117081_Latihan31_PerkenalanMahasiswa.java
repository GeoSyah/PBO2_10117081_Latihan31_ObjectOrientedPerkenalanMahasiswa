/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan31_perkenalanmahasiswa;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2
 * Deskripsi Program : Program untuk mahasiswa yang memperkenalkan diri, dengan
 * 1 kelas tambahan untuk program utama.
 * 
 */
public class PBO2_10117081_Latihan31_PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Mahasiswa mhs1 = new Mahasiswa();

        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs1.perkenalkanDiri(mhs1.nim, mhs1.nama);

        Mahasiswa mhs2 = new Mahasiswa();

        mhs2.nim = "10110270";
        mhs2.nama = "Indra Tiola";
        mhs2.perkenalkanDiri(mhs2.nim, mhs2.nama);

        Mahasiswa mhs3 = new Mahasiswa();

        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs3.perkenalkanDiri(mhs3.nim, mhs3.nama);
        
        Mahasiswa mhs4 = new Mahasiswa();
        
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs4.perkenalkanDiri(mhs4.nim, mhs4.nama);
    }
    
}
