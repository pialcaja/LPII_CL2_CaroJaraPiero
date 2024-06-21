package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IProducto;
import model.TblProductocl2;

public class TblProductocl2Imp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {

		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_CaroJaraPiero");
		
		EntityManager emanager = em.createEntityManager();
		
		emanager.getTransaction().begin();
		
		emanager.persist(producto);
		
		System.out.println("Producto registrado en la BD.");
		
		emanager.getTransaction().commit();
		
		emanager.close();
		
	}

	@Override
	public List<TblProductocl2> ListarProductos() {

		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_CaroJaraPiero");
		
		EntityManager emanager = em.createEntityManager();
		
		emanager.getTransaction().begin();
		
		List<TblProductocl2> listado = emanager.createQuery("select p from TblProductocl2 p", TblProductocl2.class).getResultList();
		
		emanager.getTransaction().commit();
		
		emanager.close();
		
		return listado;
	}

}
