/**
 * 
 */
package com.gustavo.projectwebservices.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.gustavo.projectwebservices.entity.Empleado;

/**
 * @author Calistos
 *
 */
public class EmpleadoService {

	public Empleado consultarEmpleadoPorID(String id) {
		List<Empleado> empleados = this.consultarEmpleados();
		
		for (Empleado empleado : empleados) {
			if (empleado.getNumeroEmpleado().equals(id)) {
				return empleado;
			}
		}
		
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
	
	public List<Empleado> consultarEmpleados(){
		List<Empleado> empleados = new ArrayList<>();
		
		Empleado e = new Empleado();
		e.setNumeroEmpleado("12345");
		e.setNombre("Diego");
		e.setApellido("Lopez");
		e.setEdad(31);
		e.setFechaCreacion(LocalDateTime.now());
		
		Empleado e1 = new Empleado();
		e1.setNumeroEmpleado("123456789");
		e1.setNombre("Mario");
		e1.setApellido("Bearzi");
		e1.setEdad(25);
		e1.setFechaCreacion(LocalDateTime.now());
		
		empleados.add(e);
		empleados.add(e1);
		
		return empleados;
		
	}
}
