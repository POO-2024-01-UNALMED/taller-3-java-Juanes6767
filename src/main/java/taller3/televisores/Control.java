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
		if((tv.getEstado()==true) && (tv.getVolumen()<7)) {
		tv.volumenUp();
		}
	}
	public void volumenDown() {
		if((tv.getEstado()==true) && (tv.getVolumen()>1)) {
		tv.volumenDown();
		}
	}

	public void setCanal(int canal) {
		if(canal<8 && canal>0)
		tv.setCanal(canal);
	}
	public void setVolumen(int volumen) {
		if(volumen<=7 && volumen >=1) {
		tv.setVolumen(volumen);
	}}
}
