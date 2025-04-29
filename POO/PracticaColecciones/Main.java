package POO.PracticaColecciones;

import java.util.ArrayList;
import java.util.ArrayList;
    public class Main {
        public static void main(String[] args) {
            Inventario inventario = new Inventario();

            Producto p1 = new Producto("001", "Notebook", 1500.0, 5, CategoriaProducto.ELECTRONICA);
            Producto p2 = new Producto("002", "Camiseta", 900.0, 10, CategoriaProducto.ROPA);
            Producto p3 = new Producto("003", "Arroz", 50.0, 100, CategoriaProducto.ALIMENTOS);
            Producto p4 = new Producto("004", "Silla", 300.0, 20, CategoriaProducto.HOGAR);
            Producto p5 = new Producto("005", "Televisor", 2500.0, 15, CategoriaProducto.ELECTRONICA);

            inventario.agregarProducto(p1);
            inventario.agregarProducto(p2);
            inventario.agregarProducto(p3);
            inventario.agregarProducto(p4);
            inventario.agregarProducto(p5);

            System.out.println("Listado de productos en inventario:");
            inventario.listarProductos();

            Producto productoBuscado = inventario.buscarProductoPorId("003");
            if (productoBuscado != null) {
                System.out.println("\nProducto encontrado:");
                productoBuscado.mostrarInfo();
            }

            System.out.println("\nProductos de categoría ELECTRONICA:");
            ArrayList<Producto> productosElectronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
            for (Producto producto : productosElectronica) {
                producto.mostrarInfo();
            }

            inventario.eliminarProducto("002");
            System.out.println("\nProductos después de eliminar el ID 002 (Camiseta):");
            inventario.listarProductos();

            inventario.actualizarStock("001", 10);
            System.out.println("\nProductos después de actualizar el stock del ID 001 (Notebook):");
            inventario.listarProductos();

            System.out.println("\nTotal de stock disponible: " + inventario.obtenerTotalStock());

            Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
            System.out.println("\nProducto con mayor stock:");
            productoMayorStock.mostrarInfo();

            System.out.println("\nProductos con precio entre $1000 y $3000:");
            ArrayList<Producto> productosFiltrados = inventario.filtrarProductosPorPrecio(1000, 3000);
            for (Producto producto : productosFiltrados) {
                producto.mostrarInfo();
            }

            System.out.println("\nCategorías disponibles:");
            inventario.mostrarCategoriasDisponibles();
        }
    }
