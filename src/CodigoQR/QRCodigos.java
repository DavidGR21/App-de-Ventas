package CodigoQR;


import java.awt.Image;
import java.io.ByteArrayOutputStream;
import javax.swing.ImageIcon;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRCodigos {

    public ImageIcon GenerarCodigoQRFactura(String cCompra, String fecha, String proveedor, String total) {
        String cadena = ("Codigo de Factura: " + cCompra + "\n"
                + "Fecha: " + fecha + "\n"
                + "Codigo: " + proveedor + "\n"
                + "Total: " + total + "\n");
        ByteArrayOutputStream out = QRCode.from(cadena).to(ImageType.PNG).withSize(140, 140).stream();
        ImageIcon imageIcon = new ImageIcon(out.toByteArray());
        Image image = imageIcon.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        return imageIcon;
    }

    public ImageIcon GenerarCodigoQRProductos(String cProducto, String nombre, String proveedor) {
        String cadena = ("Codigo del Producto: " + cProducto + "\n"
                + "Nombre del Producto: " + nombre + "\n"
                + "Codigo del Proveedor: " + proveedor + "\n");
        ByteArrayOutputStream out = QRCode.from(cadena).to(ImageType.PNG).withSize(140, 140).stream();
        ImageIcon imageIcon = new ImageIcon(out.toByteArray());
        Image image = imageIcon.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        imageIcon = new ImageIcon(image);
        return imageIcon;
    }
}
