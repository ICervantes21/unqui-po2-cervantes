package unq.edu.ar.po2.tp2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.DoubleStream;

public class Empresa {

	private String nombre;
	private int cuit;
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	private ArrayList<ReciboDeHaberes> recibos = new ArrayList<ReciboDeHaberes>();

	public ArrayList<ReciboDeHaberes> getRecibos() {
		return recibos;
	}

	public void setRecibos(ArrayList<ReciboDeHaberes> recibos) {
		this.recibos = recibos;
	}

	public Empresa(String nombre, int cuit) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public Double montoTotalBrutos() {
		Double total = empleados.stream().mapToDouble(Empleado::sueldoBruto).sum();
		return total;
	}

	public Double montoTotalRetenciones() {
		Double total = (empleados.stream().mapToDouble(Empleado::retenciones)).sum();
		return total;
	}

	public Double montoTotalNeto() {
		Double total = (empleados.stream().mapToDouble(Empleado::sueldoNeto)).sum();
		return total;
	}

	public Double montoTotal() {
		Double listaTotal = this.montoTotalBrutos() + this.montoTotalNeto() + this.montoTotalRetenciones();
		return listaTotal;

	}

	public void liquidarSueldos() {
		empleados.forEach(empleado -> this.guardarRecibo(this.generarRecibo(empleado)));
	}

	public void guardarRecibo(ReciboDeHaberes recibo) {
		recibos.add(recibo);
	}

	public ReciboDeHaberes generarRecibo(Empleado empleado) {
		return new ReciboDeHaberes(empleado.getNombre(), empleado.getDirección(), null, empleado.sueldoBruto(),
				empleado.sueldoNeto(), null);
	}

	public Collection<Empleado> getEmpleados() {
		return empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

}
