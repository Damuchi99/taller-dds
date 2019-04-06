public class Auto {
	protected int velocidad = 0;
	protected Estado estado;
	
	public void encender(Auto auto) {
		estado.encender(this);
	}
	
	public void apagar(Auto auto) {
		estado.apagar(this);
	}
	
	public void acelerar(Auto auto, int vel) {
		estado.acelerar(this, vel);
	}
	
	public void detener(Auto auto) {
		estado.detener(this);
	}
}
