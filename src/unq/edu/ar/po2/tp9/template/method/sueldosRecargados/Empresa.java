package unq.edu.ar.po2.tp9.template.method.sueldosRecargados;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
	
	private List<Empleado> empleados;

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	public Empresa() {
		this.empleados = new ArrayList<Empleado>();
	}
	
	public void pagarTodosLosSueldos() {
		for (Empleado e : this.empleados) {
			e.cobrarSueldo();
		}
	}

}
