package interfaces;

import java.util.List;

import model.TblProductocl2;

public interface IProducto {

	public void RegistrarProducto(TblProductocl2 producto);
	List<TblProductocl2> ListarProductos();
	
}
