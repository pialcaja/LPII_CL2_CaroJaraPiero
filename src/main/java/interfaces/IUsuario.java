package interfaces;

import java.util.List;

import model.TblUsuariocl2;

public interface IUsuario {

	List<TblUsuariocl2> ValidarUsuario(String usuario, String password);
	
}
