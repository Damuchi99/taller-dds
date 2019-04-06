public class Encendido implements Estado{
	@Override
	public void encender(Auto auto) {
		throw new YaEncendidoException("Ya estoy encendido");
	}
	
	@Override
	public void apagar(Auto auto) {
		
	}
	
	@Override
	public void acelerar(Auto auto, int vel) {
		auto.velocidad = auto.velocidad + vel;
	}
	
	@Override
	public void detener(Auto auto) {
		
	}
}
