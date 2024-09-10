// Abstract class
abstract class Item {
    private String nama;
    private String warna;
    private String ukuran;

    //Encapsulation
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    //Abstract method
    public abstract void displayInfo();
}

//Inheritance
class Objects extends Item {
    //Overriding Abstract method
    @Override
    public void displayInfo() {
        System.out.println("Nama objek: " + getNama());
        System.out.println("Warna: " + getWarna());
        System.out.println("Ukuran: " + getUkuran());
    }

    //Method Overloading
    public void setProperties(String nama, String warna) {
        setNama(nama);
        setWarna(warna);
    }

    public void setProperties(String nama, String warna, String ukuran) {
        setNama(nama);
        setWarna(warna);
        setUkuran(ukuran);
    }
}

public class Main {
    public static void Main(String[] args) {
        Objects obj = new Objects();
        
        //Overloading
        obj.setProperties("benda", "merah");
        obj.setUkuran("besar");

        //Polymorphism
        Item item = obj;
        item.displayInfo();
    }
}
