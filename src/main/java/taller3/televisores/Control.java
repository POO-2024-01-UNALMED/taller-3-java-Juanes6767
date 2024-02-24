package taller3.televisores;

public class Control {
	private TV tv;

	public void enlazar(TV tv) {
		this.tv=tv;
		tv.setControl(this);
	}

	public void turnOff() {
		tv.turnOff();
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void setTv(TV tv) {
		this.tv=tv;
	}
	public TV getTv() {
		return tv;
	}
	public void canalUp() {
		if(tv.getEstado()==true) {
		tv.canalUp();
		}
	}
	public void canalDown() {
		if(tv.getEstado()==true) {
		tv.canalDown();
		}
	}
	public void volumenUp() {
		if(tv.getEstado()==true) {
		tv.volumenUp();
		}
	}
	public void volumenDown() {
		if(tv.getEstado()==true) {
		tv.volumenDown();
		}
	}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void setVolumen(int volume) {
		tv.setVolumen(volume);;
	}
}
