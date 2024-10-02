import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaArticulos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {


            // Articulo 1
            Articulo art1 = new Articulo();

            System.out.println("Introduce el Codigo de barras: ");
            art1.setCodigo_barra(sc.next());

            System.out.println("Introduce la denominacion: ");
            art1.setDenominacion(sc.next());

            System.out.println("Introduce las unidades: ");
            art1.setUnidades(sc.nextInt());

            System.out.println("Introduce el precio_compra: ");
            art1.setPrecio_compra(sc.nextDouble());

            System.out.println("Introduce el beneficio: ");
            art1.setBeneficio(sc.nextInt());

            art1.calcularPvP();


            // Articulo 2

            System.out.println("Introduce el Codigo de barras: ");
            String codigo_barra = sc.next();

            System.out.println("Introduce la denominacion: ");
            String denominacion = sc.next();

            System.out.println("Introduce las unidades: ");
            int unidades = sc.nextInt();

            System.out.println("Introduce el precio_compra: ");
            double precio_compra = sc.nextDouble();

            System.out.println("Introduce el beneficio: ");
            int beneficio = sc.nextInt();

            Articulo art2 = new Articulo(codigo_barra, denominacion, unidades, precio_compra, beneficio);


            // Articulo 3

            System.out.println("Introduce el Codigo de barras: ");
            codigo_barra = sc.next();

            System.out.println("Introduce la denominacion: ");
            denominacion = sc.next();

            System.out.println("Introduce las unidades: ");
            unidades = sc.nextInt();

            System.out.println("Introduce el precio_compra: ");
            precio_compra = sc.nextDouble();

            System.out.println("Introduce el beneficio: ");
            beneficio = sc.nextInt();

            Articulo art3 = new Articulo();


            art3.setCodigo_barra(codigo_barra);
            art3.setDenominacion(denominacion);
            art3.setUnidades(unidades);
            art3.setPrecio_compra(precio_compra);
            art3.setBeneficio(beneficio);

            art3.calcularPvP();

            // Mostrar Datos
            System.out.println("Articulo 1");
            System.out.println("Codigo barra: " + art1.getCodigo_barra());
            System.out.println("Denominacion: " + art1.getDenominacion());
            System.out.println("Unidades: " + art1.getUnidades());
            System.out.println("Precio compra: " + art1.getPrecio_compra());
            System.out.println("Beneficio: " + art1.getBeneficio());
            System.out.println("");

            System.out.println("Articulo 2");
            System.out.println("Codigo barra: " + art2.getCodigo_barra());
            System.out.println("Denominacion: " + art2.getDenominacion());
            System.out.println("Unidades: " + art2.getUnidades());
            System.out.println("Precio compra: " + art2.getPrecio_compra());
            System.out.println("Beneficio: " + art2.getBeneficio());
            System.out.println("");

            System.out.println("Articulo 3");
            System.out.println("Codigo barra: " + art3.getCodigo_barra());
            System.out.println("Denominacion: " + art3.getDenominacion());
            System.out.println("Unidades: " + art3.getUnidades());
            System.out.println("Precio compra: " + art3.getPrecio_compra());
            System.out.println("Beneficio: " + art3.getBeneficio());
            System.out.println("");
        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
