package posttest_2.src;

public class program_barang {
    private String nama;
    private int kuantitas;
    private int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public program_barang(String Nama, Integer Kuantitas, Integer Harga){
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
