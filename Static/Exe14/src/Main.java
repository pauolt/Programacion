class Producto {
    String descripcion;
    float precio;
    float descuento = 15;
    static float iva;

    Producto(String descripcion, float precio, int descuento) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.descuento = descuento;
    }

   void setDescripcion (String descripcion){
       this.descripcion = descripcion;
   }

   String getDescripcion (){
       return descripcion;
   }

   void setPrecio (float precio){
       this.precio = precio;
   }

   float getPrecio (){
       return precio;
   }

   void setDescuento (int descuento){
       this.descuento = descuento;
   }

   float getDescuento (){
       return descuento;
   }

   static void setIva(int iva) {
       Producto.iva = iva;
   }

   static float getIva(){
        return iva;
    }


   float getPrecioConDescuento (){
       return precio * descuento / 100;
   }

   float getPrecioMasIva (){
       return precio * (1+iva/100);
   }

   float getPrecioConDescuentoMasIva () {
       return getPrecioConDescuento() + ( getPrecioMasIva() - precio);
   }

   String getInfo(){
        return "Descripcion: " + descripcion + "\nPrecio: " + precio + "\nDescuento: " + descuento + "\nPrecio con descuento: " + getPrecioConDescuento() + "\nPrecio con IVA" + getPrecioMasIva() + "\nPrecio final: " + getPrecioConDescuentoMasIva();
   }

}

public class Main {
    public static void main(String[] args) {
        Producto leche = new Producto("SI", 2, 20);
        Producto pan = new Producto("NO", 1.2f, 15);

        Producto.setIva(20);
        System.out.println(leche.getPrecioConDescuento());
        System.out.println(leche.getPrecioMasIva());
        System.out.println(leche.getPrecioConDescuentoMasIva());



    }
}