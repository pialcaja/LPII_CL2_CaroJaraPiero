package test;

import java.util.List;

import dao.TblProductocl2Imp;
import model.TblProductocl2;

public class TestProducto {

	public static void main(String[] args) {
		
		TblProductocl2 producto = new TblProductocl2();
		TblProductocl2Imp crud = new TblProductocl2Imp();
		
//		// TESTEO DE REGISTRO
//		producto.setNombrecl2("Arroz");
//		producto.setPrecioventacl2(4.9);
//		producto.setPreciocompcl2(2);
//		producto.setEstadocl2("Con stock");
//		producto.setDescripcl2("Bolsa de 1kg.");
//		
//		crud.RegistrarProducto(producto);
		
//		// TESTEO DE LISTADO
//		List<TblProductocl2> listado = crud.ListarProductos();
//		
//		for(TblProductocl2 lis:listado) {
//			System.out.println("Código: " + lis.getIdproductocl2() + ", Nombre: " + lis.getNombrecl2());
//		}
		
		
	}

}
