package posttest_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program_1 {
    public static void main(String[] args) throws IOException{

        ArrayList<String> nama_barang = new ArrayList<>();
        ArrayList<Integer> banyak_barang = new ArrayList<>();
        ArrayList<Integer> harga_barang = new ArrayList<>();

        String nama;
        int kuantitas;
        int harga;

        int urutan;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true){
            bersih();
   
            System.out.println("=====================");
            System.out.println("==  Database Toko  ==");
            System.out.println("=====================");
            System.out.println("== 1. Tambah Data  ==");
            System.out.println("== 2. Hapus Data   ==");
            System.out.println("== 3. Update Data  ==");
            System.out.println("== 4. Lihat Data   ==");
            System.out.println("== 0. Keluar       ==");
            System.out.println("=====================");
            System.out.print("== Masukkan pilihan : ");

            int menu = Integer.parseInt(br.readLine());

            if(menu == 1){
                // tambah
                bersih();

                System.out.println("============================");
                System.out.println("==   Tambah Data Barang   ==");
                System.out.println("============================");
                System.out.print("== Masukkan nama barang : ");
                nama = br.readLine();

                bersih();
                
                System.out.println("============================");
                System.out.println("==   Tambah Data Barang   ==");
                System.out.println("============================");
                System.out.print("== Masukkan banyak barang : ");
                kuantitas = Integer.parseInt(br.readLine());

                bersih();
                
                System.out.println("============================");
                System.out.println("==   Tambah Data Barang   ==");
                System.out.println("============================");
                System.out.print("== Masukkan harga barang : ");
                harga = Integer.parseInt(br.readLine());

                program_tambah tbh = new program_tambah(nama, kuantitas, harga);

                tbh.berhasil();

                nama_barang.add(tbh.nama);
                banyak_barang.add(tbh.kuantitas);
                harga_barang.add(tbh.harga);

                lanjutan();
                
            } else if(menu == 2){
                // hapus
                bersih();
                if(nama_barang.size() == 0){
                    
                    System.out.println("============================");
                    System.out.println("==   Data Barang Kosong   ==");
                    System.out.println("============================");

                } else{
                    
                    System.out.println("===========================");
                    System.out.println("==   Hapus Data Barang   ==");
                    System.out.println("===========================");
                    for(int i = 0; i < nama_barang.size(); i++){

                        System.out.println("|| " + (i+1) +". " + nama_barang.get(i));
                        System.out.println("==========================");
                        System.out.println(">> Kuantitas : " + banyak_barang.get(i));
                        System.out.println(">> Harga     : Rp" + harga_barang.get(i));
                        System.out.println("==========================");

                    }
                    System.out.print("== Urutan ke-berapa yang dihapus? : ");
                    urutan = Integer.parseInt(br.readLine());

                    nama_barang.remove(urutan-1);
                    banyak_barang.remove(urutan-1);
                    harga_barang.remove(urutan-1);

                    bersih();

                    System.out.println("==========================");
                    System.out.println("==   Berhasil dihapus   ==");
                    System.out.println("==========================");

                }

                lanjutan();

            } else if(menu == 3){
                // update
                bersih();
                if(nama_barang.size() == 0){

                    System.out.println("============================");
                    System.out.println("==   Data Barang Kosong   ==");
                    System.out.println("============================");

                } else{

                    System.out.println("==========================");
                    System.out.println("==  Update Data Barang  ==");
                    System.out.println("==========================");
                    for(int i = 0; i < nama_barang.size(); i++){
    
                        System.out.println("|| " + (i+1) +". " + nama_barang.get(i));
                        System.out.println("==========================");
                        System.out.println(">> Kuantitas : " + banyak_barang.get(i));
                        System.out.println(">> Harga     : Rp" + harga_barang.get(i));
                        System.out.println("==========================");

                    }
                    System.out.print("== Urutan ke-berapa yang diganti? : ");
                    urutan = Integer.parseInt(br.readLine());
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Barang pengganti   ==");
                    System.out.println("==========================");
                    System.out.print("== Masukkan nama barang : ");
                    String barang_baru = br.readLine();
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Barang pengganti   ==");
                    System.out.println("==========================");
                    System.out.print("== Masukkan banyak barang : ");
                    Integer banyak_barang_baru = Integer.parseInt(br.readLine());
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Barang pengganti   ==");
                    System.out.println("==========================");
                    System.out.print("== Masukkan harga barang : ");
                    Integer harga_barang_baru = Integer.parseInt(br.readLine());
    
                    nama_barang.set(urutan-1, barang_baru);
                    banyak_barang.set(urutan-1, banyak_barang_baru);
                    harga_barang.set(urutan-1, harga_barang_baru);
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Berhasil diganti   ==");
                    System.out.println("==========================");
                }

                lanjutan();

            } else if(menu == 4){
                // lihat/read
                bersih();
                if(nama_barang.size() == 0){

                    System.out.println("============================");
                    System.out.println("==   Data Barang Kosong   ==");
                    System.out.println("============================");

                } else{

                    System.out.println("==========================");
                    System.out.println("==   List Data Barang   ==");
                    System.out.println("==========================");
                    for(int i = 0; i < nama_barang.size(); i++){
    
                        System.out.println("|| " + (i+1) +". " + nama_barang.get(i));
                        System.out.println("==========================");
                        System.out.println(">> Kuantitas : " + banyak_barang.get(i));
                        System.out.println(">> Harga     : Rp" + harga_barang.get(i));
                        System.out.println("==========================");

                    }

                }
                lanjutan();

            } else if(menu == 0){

                bersih();

                System.out.println("==========================");
                System.out.println("==     Terima Kasih     ==");
                System.out.println("==========================");
                break;

            } else{

                bersih();

                System.out.println("===========================");
                System.out.println("==     Inputan salah     ==");
                System.out.println("===========================");
                lanjutan();
            }

        }
        
    }

    // Fungsi membersihkan layar
    static void bersih(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();    
    }

    // Fungsi enter untuk lanjut
    static void lanjutan(){
        System.out.print("== Tekan ENTER...");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }
    
}
