package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal=1;
	private int precio=500;
	private boolean estado;
	private int volumen=1;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca,boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
	}
	public boolean getEstado() {
		return estado;
	}
	public void turnOff() {
		this.estado=false;
	}
	public void turnOn() {
		this.estado=true;
	}
	public int getNumTV() {
		return numTV;
	}
	
	public void canalUp() {
		setCanal(canal+1);
	}
	public void canalDown() {
		setCanal(canal-1);
	}
	public void volumenUp() {
		setVolumen(volumen+1);
	}
	public void volumenDown() {
		setVolumen(volumen-1);
	}
	
	public void setMarca(Marca marca){
		this.marca=marca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public void setCanal(int canal) {
		this.canal=canal;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio=precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen=volumen;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control=control;
	}
	
	public Control getControl() {
		return control;
	}
}