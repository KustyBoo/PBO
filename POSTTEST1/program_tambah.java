package posttest_1;

public class program_tambah {
    String nama;
    int kuantitas;
    int harga;

    public program_tambah(String Nama, Integer Kuantitas, Integer Harga){
        this.nama = Nama;
        this.kuantitas = Kuantitas;
        this.harga = Harga;
    }
    
    void berhasil(){

        program_1.bersih();

        System.out.println("=========================");
        System.out.println("== Berhasil dimasukkan ==");
        System.out.println("=========================");

    }
}
