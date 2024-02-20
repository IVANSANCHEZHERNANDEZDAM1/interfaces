package interfaces;

public class procesadordepagos {
	public interface ProcesadorDePago {
	    void realizarPago(double cantidad);
	    void reembolsarPago(double cantidad);
	}

}
