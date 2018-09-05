/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author USER
 */
public class TesMain {
     public static void main(String[] args){
        Jurusan myjurusan = new Jurusan();
        System.out.println("-----------------------------------------");
        myjurusan.cetakSekolah("SMK Telkom Malang");
        myjurusan.cetakGuru("Pak Firdausa");
        myjurusan.cetakJurusan("Rekayasa Perangkat Lunak");
        myjurusan.cetakMapel("BasisData");
        myjurusan.cetakKelas("XIR5");
        System.out.println("-----------------------------------------");
    }
}
