package posttest_3.src;

public class non_konsumsi extends barang {

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
}
