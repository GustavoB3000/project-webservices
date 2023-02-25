/**
 * 
 */
package com.gustavo.projectwebservices.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gustavo.projectwebservices.entity.Empleado;
import com.gustavo.projectwebservices.service.EmpleadoService;

/**
 * Webservice generado con Jersey.
 * @author Calistos
 */
@Path("empleadosWS")
public class EmpleadosWS {
	
	private EmpleadoService es = new EmpleadoService();

	@GET
	@Path("test")
	public String test() {
		return "Probando webservice con JERSEY";
	}
	
	@GET
	@Path("consultarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Empleado consultarEmpleado() {
		return this.es.consultarEmpleadoPorID();
	}
}
