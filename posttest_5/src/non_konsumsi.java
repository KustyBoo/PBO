package posttest_5.src;

public final class non_konsumsi extends barang {

    private String kegunaan;
    private String warna;
    
    public non_konsumsi(String Nama, Integer Kuantitas, Integer Harga, String Merek, String Kegunaan, String Warna) {
        super(Nama, Kuantitas, Harga, Merek);
        this.kegunaan = Kegunaan;
        this.warna = Warna;
	}
    
    public String getKegunaan() {
        return kegunaan;
    }

    public void setKegunaan(String kegunaan) {
        this.kegunaan = kegunaan;
    }
    
    public String getWarna() {
        return warna;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }

    // Fungsi Overload delete
    static void barang_non_konsumsi(Integer urutan){
        app.list2.remove(urutan-1);
    }

    // Fungsi Overload update
    static void barang_non_konsumsi(Integer urutan, String NAMA, String MEREK, String KEGUNAAN, String WARNA, Integer KUANTITAS, Integer HARGA){
        app.list2.get(urutan-1).setNama(NAMA);
        app.list2.get(urutan-1).setMerek(MEREK);
        app.list2.get(urutan-1).setKegunaan(KEGUNAAN);
        app.list2.get(urutan-1).setWarna(WARNA);
        app.list2.get(urutan-1).setKuantitas(KUANTITAS);
        app.list2.get(urutan-1).setHarga(HARGA);
    }

    // Fungsi Overriding & Abstract
    public void kosong(){
        System.out.println("=========================");
        System.out.println("==  Data Benda Kosong  ==");
        System.out.println("=========================");
    }
}
