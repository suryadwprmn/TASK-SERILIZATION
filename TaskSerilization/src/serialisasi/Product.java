/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author LENOVO
 */
public class Product implements Serializable{
    private String id;
    private transient String nama;
    private static int garansi;
    private final String distributor = "resmi";
    
    private List <ProductItem> items;

    public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public static void setGaransi(int garansi) {
        Product.garansi = garansi;
    }
    

    public void setItems(List<ProductItem> items) {
        this.items = items;
    }
    

    @Override
            public String toString() {
          String produk, item = "";
          produk = "Produk: \r\n"
          + "Id=" + id + "\r\n"
          + "Nama=" + nama + "\r\n"
          + "Garansi=" + garansi + "\r\n"
          + "Distributor=" + distributor + "\r\n"
          + "=======================\r\n"
          + "Product Item:\r\n";
          item = items.stream().map((obj) -> 
         obj.toString()).reduce(item, String::concat);
          return produk + item;
          }
    
}
