
package com.tutorial;
class Mahasiswa {
String nama;
String nim;
String prodi;
}

public class Main {
    public static void main(String[] args) {
       // instansiasi objek dari class mahasiswa
      Mahasiswa mhs1 = new Mahasiswa (); // proses instansiasi

      // memberi atribut pada objek mhs1
      mhs1.nama = "RONI";
      mhs1.nim = "22241084";
      mhs1.prodi = "PTI";

      System.out.println("Nama : " + mhs1.nama);
       System.out.println("NIm : " + mhs1.nim);
        System.out.println("Prodi : " + mhs1.prodi)




    }


}
