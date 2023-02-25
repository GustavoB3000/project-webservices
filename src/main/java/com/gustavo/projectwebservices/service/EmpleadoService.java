/**
 * 
 */
package com.gustavo.projectwebservices.service;

import java.time.LocalDateTime;

import com.gustavo.projectwebservices.entity.Empleado;

/**
 * @author Calistos
 *
 */
public class EmpleadoService {

	public Empleado consultarEmpleadoPorID(Long id) {
		return null;
	}
	
	public Empleado consultarEmpleadoPorID() {
		Empleado e = new Empleado();
		e.setNumeroEmpleado("12345");
		e.setNombre("Diego");
		e.setApellido("Lopez");
		e.setEdad(31);
		e.setFechaCreacion(LocalDateTime.now());
		
		return e;
	}
}
