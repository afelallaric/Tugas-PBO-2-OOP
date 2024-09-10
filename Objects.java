public class Objects {
    private String nama;
    private String warna;
    private String ukuran;

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getwarna() {
        return warna;
    }

    public void setwarna(String warna) {
        this.warna = warna;
    }

    public String getukuran() {
        return ukuran;
    }

    public void setukuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public static void main(String[] args) {
        Objects obj = new Objects();
        obj.setnama("benda");
        obj.setwarna("merah");
        obj.setukuran("besaar");

        System.out.println("Nama objek: " + obj.getnama());
        System.out.println("warna: " + obj.getwarna());
        System.out.println("ukuran: " + obj.getukuran());
    }
}
