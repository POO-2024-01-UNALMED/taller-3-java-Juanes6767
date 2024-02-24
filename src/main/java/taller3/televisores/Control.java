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
		setCanal(tv.getCanal()+1);
	}
	public void canalDown() {
		setCanal(tv.getCanal()-1);
	}
	public void volumenUp() {
		setVolumen(tv.getVolumen()+1);
	}
	public void volumenDown() {
		setVolumen(tv.getVolumen()-1);
		}

	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	public void setVolumen(int volumen) {
			tv.setVolumen(volumen);
		}
	}

