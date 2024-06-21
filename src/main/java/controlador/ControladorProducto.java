package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TblProductocl2Imp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        //super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		TblProductocl2 producto = new TblProductocl2();
		TblProductocl2Imp crud = new TblProductocl2Imp();
		List<TblProductocl2> listadoProductocl2s = crud.ListarProductos();
		
		request.setAttribute("listadoProductos", listadoProductocl2s);
		
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre = request.getParameter("nombre");
		double pCompra = Double.parseDouble(request.getParameter("pCompra"));
		double pVenta = Double.parseDouble(request.getParameter("pVenta"));
		String estado = request.getParameter("estado");
		String descr = request.getParameter("descr");
		
		TblProductocl2 producto = new TblProductocl2();
		TblProductocl2Imp crud = new TblProductocl2Imp();
		
		producto.setNombrecl2(nombre);
		producto.setPreciocompcl2(pCompra);
		producto.setPrecioventacl2(pVenta);
		producto.setEstadocl2(estado);
		producto.setDescripcl2(descr);
		
		crud.RegistrarProducto(producto);
		
		List<TblProductocl2> listadoProducto = crud.ListarProductos();
		request.setAttribute("listadoProductos", listadoProducto);
		
		request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
	}

}
