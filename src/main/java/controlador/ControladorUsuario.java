package controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TblUsuariocl2Imp;
import model.TblUsuariocl2;

/**
 * Servlet implementation class ControladorUsuario
 */
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorUsuario() {
        //super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		TblUsuariocl2 usuario = new TblUsuariocl2();
		TblUsuariocl2Imp crud = new TblUsuariocl2Imp();
		
		// VALIDACION DE USUARIO
		String usu = request.getParameter("usuario");
		String pwd = request.getParameter("password");
		List<TblUsuariocl2> listado = crud.ValidarUsuario(usu, pwd);
		int contador=0;
		
		for(TblUsuariocl2 lis:listado) {
			contador++;
		}
		
		if(contador==0) {
			System.out.println("Usuario no encontrado");
			request.getRequestDispatcher("/ErrorLogin.jsp").forward(request, response);
		} else {
			System.out.println("Usuario encontrado");
			request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
		}
	}

}
