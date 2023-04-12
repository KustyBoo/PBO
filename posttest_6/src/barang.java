package posttest_6.src;

interface command {
    void kosong();
    void delete_sukses();
    void update_sukses();
}

public abstract class barang implements command{

    private String nama;
    private String merek;
    private int kuantitas;
    private int harga;
    
    public barang(String Nama, Integer Kuantitas, Integer Harga, String Merek){
        this.nama = Nama;
        this.merek = Merek;
        this.kuantitas = Kuantitas;
        this.harga = Harga;
    }

    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
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

    static void kosong_barang(){
        System.out.println("========================");
        System.out.println("== Data Barang Kosong ==");
        System.out.println("========================");
    }

    // Abstract method yang diwariskan
    public abstract void kosong();

}
