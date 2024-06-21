package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TblUsuariocl2;

public class TblUsuariocl2Imp implements IUsuario{

	@Override
	public List<TblUsuariocl2> ValidarUsuario(String usuario, String password) {

		EntityManagerFactory em = Persistence.createEntityManagerFactory("LPII_CL2_CaroJaraPiero");
		
		EntityManager emanager = em.createEntityManager();
		
		try {
			
			emanager.getTransaction().begin();
			
			List<TblUsuariocl2> listado = emanager.createQuery("select u from TblUsuariocl2 u where u.usuariocl2 = :usuario and u.passwordcl2 = :password", TblUsuariocl2.class).setParameter("usuario", usuario).setParameter("password", password).getResultList();
			
			emanager.getTransaction().commit();

			return listado;
			
		} catch (Exception e) {

			emanager.getTransaction().rollback();
			
			return null;
			
		} finally {
		
			emanager.close();
			
		}
	}

}
