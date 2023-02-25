/**
 * 
 */
package com.gustavo.projectwebservices.ws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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
	
	@GET
	@Path("consultarEmpleados")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Empleado> consultarEmpleados(){
		return this.es.consultarEmpleados();
	}
	
	@GET
	@Path("consultarEmpleadoPorId/{numEmp}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consultarEmpleadoPorId(@PathParam("numEmp") String numero) {
		Empleado em =  this.es.consultarEmpleadoPorID(numero);
		
		if(em == null) {
			return Response.noContent().build();
		}
		
		GenericEntity<Empleado> empleadoGenerico = new GenericEntity<Empleado>(em, Empleado.class);
		
		return Response.ok(empleadoGenerico).build();
	}
	
	@POST
	@Path("guardarEmpleado")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response guardarEmpleado(Empleado emp) {
		
		if(emp == null) {
			return Response.status(400).entity("No se ha ingresado dato alguno del empleado. Favor de ingresar datos").build();
		}
		
		
		if(emp.getNombre() == null || emp.getNombre().isEmpty()) {
			return Response.status(400).entity("El nombre es obligatorio.").build();
		}
		
		GenericEntity<Empleado> empleadoGenerico = new GenericEntity<Empleado>(emp, Empleado.class);
		return Response.ok(empleadoGenerico).build();
	}
}
