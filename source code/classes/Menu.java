package classes;

public class Menu {
    private String namaMenu;
    private double harga;
    private String kategori;

    public void setNamaMenu(String nama_menu){
        this.namaMenu = nama_menu;
    }
    public void setHarga(double harga_lol){
        this.harga = harga_lol;
    }
    public void setKategori(String kategorikal){
        this.kategori = kategorikal;
    }

    // Get methods
    public String getNamaMenu(){
        return namaMenu;
    }
    public double getHarga(){
        return harga;
    }
    public String getKategori(){

        return kategori;
    }
}
