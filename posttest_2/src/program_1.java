package posttest_2.src;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program_1 {

    static ArrayList<program_barang> list = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String nama;
        int kuantitas;
        int harga;

        int urutan;

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

                program_barang tbh = new program_barang(nama, kuantitas, harga);

                tbh.berhasil();

                list.add(tbh);

                lanjutan();
                
            } else if(menu == 2){
                // hapus
                bersih();
                if(list.isEmpty()){
                    
                    System.out.println("============================");
                    System.out.println("==   Data Barang Kosong   ==");
                    System.out.println("============================");

                } else{
                    
                    System.out.println("===========================");
                    System.out.println("==   Hapus Data Barang   ==");
                    System.out.println("===========================");
                    for(int i = 0; i < list.size(); i++){

                        System.out.println("|| " + (i+1) +". " + list.get(i).getNama());
                        System.out.println("==========================");
                        System.out.println(">> Kuantitas : " + list.get(i).getKuantitas());
                        System.out.println(">> Harga     : Rp" + list.get(i).getHarga());
                        System.out.println("==========================");

                    }
                    System.out.print("== Urutan ke-berapa yang dihapus? : ");
                    urutan = Integer.parseInt(br.readLine());

                    list.remove(urutan-1);

                    bersih();

                    System.out.println("==========================");
                    System.out.println("==   Berhasil dihapus   ==");
                    System.out.println("==========================");

                }

                lanjutan();

            } else if(menu == 3){
                // update
                bersih();
                if(list.isEmpty()){

                    System.out.println("============================");
                    System.out.println("==   Data Barang Kosong   ==");
                    System.out.println("============================");

                } else{

                    System.out.println("==========================");
                    System.out.println("==  Update Data Barang  ==");
                    System.out.println("==========================");
                    for(int i = 0; i < list.size(); i++){
    
                        System.out.println("|| " + (i+1) +". " + list.get(i).getNama());
                        System.out.println("==========================");
                        System.out.println(">> Kuantitas : " + list.get(i).getKuantitas());
                        System.out.println(">> Harga     : Rp" + list.get(i).getHarga());
                        System.out.println("==========================");

                    }
                    System.out.print("== Urutan ke-berapa yang diganti? : ");
                    urutan = Integer.parseInt(br.readLine());
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Barang pengganti   ==");
                    System.out.println("==========================");
                    System.out.print("== Masukkan nama barang : ");
                    list.get(urutan-1).setNama(br.readLine());
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Barang pengganti   ==");
                    System.out.println("==========================");
                    System.out.print("== Masukkan banyak barang : ");
                    list.get(urutan-1).setKuantitas(Integer.parseInt(br.readLine()));
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Barang pengganti   ==");
                    System.out.println("==========================");
                    System.out.print("== Masukkan harga barang : ");
                    list.get(urutan-1).setHarga(Integer.parseInt(br.readLine()));
    
                    bersih();
    
                    System.out.println("==========================");
                    System.out.println("==   Berhasil diganti   ==");
                    System.out.println("==========================");
                }

                lanjutan();

            } else if(menu == 4){
                // lihat/read
                bersih();
                if(list.isEmpty()){

                    System.out.println("============================");
                    System.out.println("==   Data Barang Kosong   ==");
                    System.out.println("============================");

                } else{

                    System.out.println("==========================");
                    System.out.println("==   List Data Barang   ==");
                    System.out.println("==========================");
                    for(int i = 0; i < list.size(); i++){
    
                        System.out.println("|| " + (i+1) +". " + list.get(i).getNama());
                        System.out.println("==========================");
                        System.out.println(">> Kuantitas : " + list.get(i).getKuantitas());
                        System.out.println(">> Harga     : Rp" + list.get(i).getHarga());
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
