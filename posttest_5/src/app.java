package posttest_5.src;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class app {

    static ArrayList<konsumsi> list1 = new ArrayList<>();
    static ArrayList<non_konsumsi> list2 = new ArrayList<>();
    
    public static void main(String[] args) throws IOException{
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        boolean login = true;

        final String user = "admin";
        final String pass = "123";

        String input_user;
        String input_pass;

        String nama = "";
        String merek = "";

        String jenis = "";
        String rasa = "";
        String kemasan = "";

        String kegunaan = "";
        String warna = "";

        int kuantitas = 0;
        int harga = 0;

        int urutan;

        konsumsi konsum = new konsumsi(nama, kuantitas, harga, merek, jenis, rasa, kemasan);
        non_konsumsi non_konsum = new non_konsumsi(nama, kuantitas, harga, merek, kegunaan, warna);

        while(true){

            while(login == true){
                bersih();

                System.out.println("==================");
                System.out.println("==  Login Toko  ==");
                System.out.println("==================");
                System.out.print("Masukkan Username : ");
                input_user = br.readLine();

                System.out.print("Masukkan Password : ");
                input_pass = br.readLine();

                if(input_user.equals(user) && input_pass.equals(pass)){
                    login = false;
                    bersih();

                    System.out.println("======================");
                    System.out.println("==  Selamat Datang  ==");
                    System.out.println("======================");

                    lanjutan();
                } else{
                    login = true;
                    bersih();

                    System.out.println("===============================");
                    System.out.println("==  username/password salah  ==");
                    System.out.println("===============================");

                    lanjutan();
                }
            }

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

                System.out.println("==========================");
                System.out.println("==   Tambah Data Toko   ==");
                System.out.println("==========================");
                System.out.println("== 1. makanan & minuman ==");
                System.out.println("== 2. benda             ==");
                System.out.println("==========================");
                System.out.print("== Masukkan pilihan : ");
                menu = Integer.parseInt(br.readLine());
                
                if(menu != 1 && menu != 2){

                    salah();
                    lanjutan();
        
                } else{

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
                    System.out.print("== Masukkan merek barang : ");
                    merek = br.readLine();
    
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
    
                    if(menu == 1){
    
                        bersih();
                        
                        System.out.println("============================");
                        System.out.println("==   Tambah Data Barang   ==");
                        System.out.println("============================");
                        System.out.print("== Masukkan jenis barang : ");
                        jenis = br.readLine();
    
                        bersih();
                        
                        System.out.println("============================");
                        System.out.println("==   Tambah Data Barang   ==");
                        System.out.println("============================");
                        System.out.print("== Masukkan rasa barang : ");
                        rasa = br.readLine();
    
                        bersih();
                        
                        System.out.println("============================");
                        System.out.println("==   Tambah Data Barang   ==");
                        System.out.println("============================");
                        System.out.print("== Masukkan kemasan barang : ");
                        kemasan = br.readLine();
    
                        konsumsi ksm = new konsumsi(nama, kuantitas, harga, merek, jenis, rasa, kemasan);

                        list1.add(ksm);
    
                    } else if(menu == 2){
                        bersih();
                        
                        System.out.println("============================");
                        System.out.println("==   Tambah Data Barang   ==");
                        System.out.println("============================");
                        System.out.print("== Masukkan kegunaan barang : ");
                        kegunaan = br.readLine();
    
                        bersih();
                        
                        System.out.println("============================");
                        System.out.println("==   Tambah Data Barang   ==");
                        System.out.println("============================");
                        System.out.print("== Masukkan warna barang : ");
                        warna = br.readLine();
    
                        non_konsumsi nksm = new non_konsumsi(nama, kuantitas, harga, merek, kegunaan, warna);

                        list2.add(nksm);
    
                    }
    
                    bersih();
    
                    System.out.println("=========================");
                    System.out.println("== Berhasil dimasukkan ==");
                    System.out.println("=========================");
    
                    lanjutan();

                }
                
            } else if(menu == 2){
                // hapus
                bersih();

                if(list1.isEmpty() && list2.isEmpty()){

                    konsumsi.kosong_barang();

                } else{
    
                    System.out.println("===========================");
                    System.out.println("==    Hapus Data Toko    ==");
                    System.out.println("===========================");
                    System.out.println("== 1. makanan & minuman  ==");
                    System.out.println("== 2. benda              ==");
                    System.out.println("===========================");
                    System.out.print("== Masukkan pilihan : ");
                    menu = Integer.parseInt(br.readLine());
    
                    bersih();
                    if(menu == 1){
    
                        if(list1.isEmpty()){
                            
                            konsum.kosong();
        
                        } else{
                            
                            System.out.println("===========================");
                            System.out.println("==   Hapus Data Barang   ==");
                            System.out.println("===========================");
                            for(int i = 0; i < list1.size(); i++){
        
                                System.out.println("|| " + (i+1) +". " + list1.get(i).getNama());
                                System.out.println("==========================");
                                System.out.println(">> Merek     : " + list1.get(i).getMerek());
                                System.out.println(">> Jenis     : " + list1.get(i).getJenis());
                                System.out.println(">> Rasa      : " + list1.get(i).getRasa());
                                System.out.println(">> Kemasan   : " + list1.get(i).getKemasan());
                                System.out.println(">> Kuantitas : " + list1.get(i).getKuantitas());
                                System.out.println(">> Harga     : Rp" + list1.get(i).getHarga());
                                System.out.println("==========================");
        
                            }
                            System.out.print("== Urutan ke-berapa yang dihapus? : ");
                            urutan = Integer.parseInt(br.readLine());
        
                            konsumsi.barang_konsumsi(urutan);
        
                            bersih();
        
                            System.out.println("==========================");
                            System.out.println("==   Berhasil dihapus   ==");
                            System.out.println("==========================");
        
                        }
                    } else if(menu == 2){
                        if(list2.isEmpty()){
                            
                            non_konsum.kosong();
        
                        } else{
                            
                            System.out.println("===========================");
                            System.out.println("==   Hapus Data Barang   ==");
                            System.out.println("===========================");
                            for(int i = 0; i < list2.size(); i++){
        
                                System.out.println("|| " + (i+1) +". " + list2.get(i).getNama());
                                System.out.println("==========================");
                                System.out.println(">> Merek     : " + list2.get(i).getMerek());
                                System.out.println(">> Kegunaan  : " + list2.get(i).getKegunaan());
                                System.out.println(">> Warna     : " + list2.get(i).getWarna());
                                System.out.println(">> Kuantitas : " + list2.get(i).getKuantitas());
                                System.out.println(">> Harga     : Rp" + list2.get(i).getHarga());
                                System.out.println("==========================");
        
                            }
                            System.out.print("== Urutan ke-berapa yang dihapus? : ");
                            urutan = Integer.parseInt(br.readLine());
        
                            non_konsumsi.barang_non_konsumsi(urutan);
        
                            bersih();
        
                            System.out.println("==========================");
                            System.out.println("==   Berhasil dihapus   ==");
                            System.out.println("==========================");
        
                        }
                    } else{

                        salah();

                    }
                }

                lanjutan();

            } else if(menu == 3){
                // update

                String nama_barang;
                String merek_barang;
                String jenis_barang;
                String rasa_barang;
                String kemasan_barang;

                String kegunaan_barang;
                String warna_barang;

                Integer kuantitas_barang;
                Integer harga_barang;

                bersih();
                if(list1.isEmpty() && list2.isEmpty()){

                    barang.kosong_barang();

                } else{
    
                    System.out.println("=============================");
                    System.out.println("==     Update Data Toko    ==");
                    System.out.println("=============================");
                    System.out.println("== 1. makanan & minuman    ==");
                    System.out.println("== 2. benda                ==");
                    System.out.println("=============================");
                    System.out.print("== Masukkan pilihan : ");
                    menu = Integer.parseInt(br.readLine());
    
                    bersih();
                    if(menu == 1){
    
                        if(list1.isEmpty()){
        
                            konsum.kosong();
        
                        } else{
        
                            System.out.println("==========================");
                            System.out.println("==  Update Data Barang  ==");
                            System.out.println("==========================");
                            for(int i = 0; i < list1.size(); i++){
            
                                System.out.println("|| " + (i+1) +". " + list1.get(i).getNama());
                                System.out.println("==========================");
                                System.out.println(">> Merek     : " + list1.get(i).getMerek());
                                System.out.println(">> Jenis     : " + list1.get(i).getJenis());
                                System.out.println(">> Rasa      : " + list1.get(i).getRasa());
                                System.out.println(">> Kemasan   : " + list1.get(i).getKemasan());
                                System.out.println(">> Kuantitas : " + list1.get(i).getKuantitas());
                                System.out.println(">> Harga     : Rp" + list1.get(i).getHarga());
                                System.out.println("==========================");
        
                            }
                            System.out.print("== Urutan ke-berapa yang diganti? : ");
                            urutan = Integer.parseInt(br.readLine());
            
                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan nama barang : ");
                            nama_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan merek barang : ");
                            merek_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan jenis barang : ");
                            jenis_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan rasa barang : ");
                            rasa_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan kemasan barang : ");
                            kemasan_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan banyak barang : ");
                            kuantitas_barang = Integer.parseInt(br.readLine());
            
                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan harga barang : ");
                            harga_barang = Integer.parseInt(br.readLine());
                            
                            konsumsi.barang_konsumsi(urutan, nama_barang, merek_barang, jenis_barang, rasa_barang, kemasan_barang, kuantitas_barang, harga_barang);

                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Berhasil diganti   ==");
                            System.out.println("==========================");
                        }
    
                    } else if(menu == 2){
    
                        if(list2.isEmpty()){
        
                            non_konsum.kosong();
        
                        } else{
        
                            System.out.println("==========================");
                            System.out.println("==  Update Data Barang  ==");
                            System.out.println("==========================");
                            for(int i = 0; i < list2.size(); i++){
            
                                System.out.println("|| " + (i+1) +". " + list2.get(i).getNama());
                                System.out.println("==========================");
                                System.out.println(">> Merek     : " + list2.get(i).getMerek());
                                System.out.println(">> Kegunaan  : " + list2.get(i).getKegunaan());
                                System.out.println(">> Warna     : " + list2.get(i).getWarna());
                                System.out.println(">> Kuantitas : " + list2.get(i).getKuantitas());
                                System.out.println(">> Harga     : Rp" + list2.get(i).getHarga());
                                System.out.println("==========================");
        
                            }
                            System.out.print("== Urutan ke-berapa yang diganti? : ");
                            urutan = Integer.parseInt(br.readLine());
            
                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan nama barang : ");
                            nama_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan merek barang : ");
                            merek_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan kegunaan barang : ");
                            kegunaan_barang = br.readLine();
            
                            bersih();
    
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan warna barang : ");
                            warna_barang = br.readLine();
            
                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan banyak barang : ");
                            kuantitas_barang = Integer.parseInt(br.readLine());
            
                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Barang pengganti   ==");
                            System.out.println("==========================");
                            System.out.print("== Masukkan harga barang : ");
                            harga_barang = Integer.parseInt(br.readLine());
            
                            non_konsumsi.barang_non_konsumsi(urutan, nama_barang, merek_barang, kegunaan_barang, warna_barang, kuantitas_barang, harga_barang);

                            bersih();
            
                            System.out.println("==========================");
                            System.out.println("==   Berhasil diganti   ==");
                            System.out.println("==========================");
                        }
    
                    } else{
    
                        salah();
    
                    }
                }
                
                lanjutan();

            } else if(menu == 4){
                // lihat/read
                bersih();
                if(list1.isEmpty() && list2.isEmpty()){

                    barang.kosong_barang();

                } else{

                    System.out.println("===========================");
                    System.out.println("==    Lihat Data Toko    ==");
                    System.out.println("===========================");
                    System.out.println("== 1. makanan & minuman  ==");
                    System.out.println("== 2. benda              ==");
                    System.out.println("===========================");
                    System.out.print("== Masukkan pilihan : ");
                    menu = Integer.parseInt(br.readLine());

                    bersih();
                    if(menu == 1){
                        if(list1.isEmpty()){
                            
                            konsum.kosong();

                        } else{

                            System.out.println("==========================");
                            System.out.println("==   List Data Barang   ==");
                            System.out.println("==========================");
                            for(int i = 0; i < list1.size(); i++){
            
                                System.out.println("|| " + (i+1) +". " + list1.get(i).getNama());
                                System.out.println("==========================");
                                System.out.println(">> Merek     : " + list1.get(i).getMerek());
                                System.out.println(">> Jenis     : " + list1.get(i).getJenis());
                                System.out.println(">> Rasa      : " + list1.get(i).getRasa());
                                System.out.println(">> Kemasan   : " + list1.get(i).getKemasan());
                                System.out.println(">> Kuantitas : " + list1.get(i).getKuantitas());
                                System.out.println(">> Harga     : Rp" + list1.get(i).getHarga());
                                System.out.println("==========================");

                            }
                        }

                    } else if(menu == 2){
                        if(list2.isEmpty()){

                            non_konsum.kosong();

                        } else{
                        
                            System.out.println("==========================");
                            System.out.println("==   List Data Barang   ==");
                            System.out.println("==========================");
                            for(int i = 0; i < list2.size(); i++){
            
                                System.out.println("|| " + (i+1) +". " + list2.get(i).getNama());
                                System.out.println("==========================");
                                System.out.println(">> Merek     : " + list2.get(i).getMerek());
                                System.out.println(">> Kegunaan  : " + list2.get(i).getKegunaan());
                                System.out.println(">> Warna     : " + list2.get(i).getWarna());
                                System.out.println(">> Kuantitas : " + list2.get(i).getKuantitas());
                                System.out.println(">> Harga     : Rp" + list2.get(i).getHarga());
                                System.out.println("==========================");
                            }
                        }
                    } else{

                        salah();

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

                salah();
                
                lanjutan();

            }
        }
    }

    // Prosedur jika inputan salah
    final static void salah(){
        bersih();

        System.out.println("===========================");
        System.out.println("==     Inputan salah     ==");
        System.out.println("===========================");
    }

    // Prosedur membersihkan layar
    final static void bersih(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();    
    }

    // Prosedur enter untuk lanjut
    final static void lanjutan(){
        System.out.print("== Tekan ENTER...");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    }

}
