package posttest_3.src;

public class konsumsi extends barang{

    private String jenis;
    private String rasa;
    private String kemasan;
    
    public konsumsi(String Nama, Integer Kuantitas, Integer Harga, String Merek,
    String Jenis, String Rasa, String Kemasan) {
        super(Nama, Kuantitas, Harga, Merek);
        this.jenis = Jenis;
        this.rasa = Rasa;
        this.kemasan = Kemasan;
    }
    
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getKemasan() {
        return kemasan;
    }

    public void setKemasan(String kemasan) {
        this.kemasan = kemasan;
    }

}
