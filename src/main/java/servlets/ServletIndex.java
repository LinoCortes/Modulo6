package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Ejercicio Grupal 1 Modulo 6 
 * Grupo 7
 * Integrantes: 
 * 	Lino Cortes
 * 	Felipe Toro
 * 	Pedro Urbina
 * 	Sergio Morales
 */
public class ServletIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Dentro del ServletIndex");
	}
}