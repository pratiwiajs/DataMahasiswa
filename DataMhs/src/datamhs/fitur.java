/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamhs;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author pratiwiajs
 */
public class fitur {
        ArrayList<String> nama = new ArrayList();
        ArrayList<Integer> jk = new ArrayList();
        ArrayList<String> nim = new ArrayList();
        ArrayList<String> tglLahir = new ArrayList();
    
    
    void fiturData (){
        run:
        while (true){
            System.out.println("___________----------------___________________________________________________----------------___________\n");
            System.out.println("\t\t\t\t\t DATA MAHASISWA PTIK 2019");
            System.out.println("___________----------------___________________________________________________----------------___________\n");
            System.out.println("\n\t1. Lihat Data Mahasiswa");
            System.out.println("\n\t2. Cari Data Mahasiswa");
            System.out.println("\n\t3. Tambah Data Mahasiswa");
            System.out.println("\n\t4. Hapus Data Mahasiswa");
            System.out.println("\n\t5. Keluar\n");
            
            
            Scanner input = new Scanner(System.in);
            System.out.println("Silahkan Pilih Fitur yang Ada (1/2/3/4/5): ");
            String ftr = input.next();
            switch (ftr) {
                    case "1":{
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("\tData Mahasiswa");
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            for ( int i = 0; i < nama.size(); i++) {
                                System.out.println("Nama : " + nama.get(i));
                                System.out.println("Jenis Kelamin : " + jk.get(i));
                                System.out.println("NIM : " + nim.get(i));
                                System.out.println("Tanggal Lahir : " + tglLahir.get(i));
                                System.out.println("\n\n");}
                                System.out.println("=> Jumlah mahasiswa : " + nama.size());
                                System.out.println("\n\n");
                                   
                        break;
                            }


                    
                    case "2":{
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("\tCari Data Mahasiswa");
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("1. Temukan Data Mahasiswa Berdasarkan Jenis Kelamin");
                            System.out.println("2. Temukan Data Mahasiswa Berdasarkan NIM");
                            System.out.println("=> : ");
                            int cari = input.nextInt();

                            if (cari == 1){
                                System.out.println("Masukkan Jenis Kelamin (0 / 1) : ");
                                int a = input.nextInt();

                                for ( int i = 0; i < nama.size(); i++) {
                                    if (jk.get(i) == 0 || jk.get(i) == 1){
                                        System.out.println("Nama : " + nama.get(i));
                                        System.out.println("Jenis Kelamin : " + jk.get(i));
                                        System.out.println("NIM : " + nim.get(i));
                                        System.out.println("Tanggal Lahir : " + tglLahir.get(i));
                                        System.out.println("\n");
                                    }
                                    
                                    else if (jk.get(i) != 1 && jk.get(i) != 1){
                                        System.out.println("Maaf Data Berdasarkan Jenis Kelamin Tidak Ditemukan.\nSilahkan Mencoba dengan NIM");
                                    }
                                }
                            } 
                            
                            else if (cari == 2){
                                System.out.println("Masukkan NIM : ");
                                String b = input.next();

                                int index = Collections.binarySearch(nim, b);
                                String dataNama = nama.get(index);
                                int cariGender = jk.get(index);
                                String dataNIM = nim.get(index);
                                String caritanggal = tglLahir.get(index);
                                System.out.println("Nama : " + dataNama);
                                System.out.println("Jenis Kelamin : " + cariGender);
                                System.out.println("NIM : " + dataNIM);
                                System.out.println("Tanggal Lahir : " + caritanggal);
                                }   
                            break;
                            }

                        

                    case "3":{
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("\tTambah Data Mahasiswa");
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
                            System.out.println("Masukkan Data Mahasiswa dengan Benar !!!!!!");
                            System.out.println("Nama : ");
                            String name = input.next();
                            System.out.println("Jenis Kelamin (0: Laki-laki atau 1: Perempuan)  : ");
                            int gender = input.nextInt();
                            System.out.println("NIM  : ");
                            String number = input.next();
                            System.out.println("Tanggal lahir : ");
                            String date = input.next();
                            nama.add(name);
                            jk.add(gender);
                            nim.add(number);
                            tglLahir.add(date);
                            System.out.println("Data Mahasiswa Berhasil Ditambahkan");
                            break;
                            }



                    case "4":{
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("\tHapus Data Mahasiswa");
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
                            System.out.println("Untuk Menghapus Data Mahasiswa, Masukkan NIM Mahasiswa yang Valid !!!!!!");
                            System.out.println("NIM Mahasiswa: ");
                            String number = input.next();
                            int index = Collections.binarySearch(nim, number);
                            nama.remove(index);
                            jk.remove(index);
                            nim.remove(index);
                            tglLahir.remove(index);
                            System.out.println("Data Mahasiswa Berhasil Dihapus");
                            break;
                            }



                    case "5":
                        break run;

            }
        }
    }

    
}
