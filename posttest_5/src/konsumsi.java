package posttest_5.src;

public final class konsumsi extends barang{

    private String jenis;
    private String rasa;
    private String kemasan;
    public Object barang;
    
    public konsumsi(String Nama, Integer Kuantitas, Integer Harga, String Merek, String Jenis, String Rasa, String Kemasan) {
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

    // Fungsi Overload delete
    static void barang_konsumsi(Integer urutan){
        app.list1.remove(urutan-1);
    }

    // Fungsi Overload update
    static void barang_konsumsi(Integer urutan, String NAMA, String MEREK, String JENIS, String RASA, String KEMASAN, Integer KUANTITAS, Integer HARGA){
        app.list1.get(urutan-1).setNama(NAMA);
        app.list1.get(urutan-1).setMerek(MEREK);
        app.list1.get(urutan-1).setJenis(JENIS);
        app.list1.get(urutan-1).setRasa(RASA);
        app.list1.get(urutan-1).setKemasan(KEMASAN);
        app.list1.get(urutan-1).setKuantitas(KUANTITAS);
        app.list1.get(urutan-1).setHarga(HARGA);
    }

    // Fungsi Overriding & Abstract
    public void kosong(){
        System.out.println("=================================");
        System.out.println("== Data Makanan/Minuman Kosong ==");
        System.out.println("=================================");
    }

}
