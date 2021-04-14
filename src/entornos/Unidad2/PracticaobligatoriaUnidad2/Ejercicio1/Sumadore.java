package entornos;

public class Sumadore {

	private int Numero1;
	private int Numero2;
	private int resultado;
	
	public Sumadore() {
		super();
	}

	public Sumadore(int numero1, int numero2, int resultado) {
		super();
		Numero1 = numero1;
		Numero2 = numero2;
		this.resultado = numero1 + numero2;
	}

	@Override
	public String toString() {
		return "Sumadore [Numero1=" + Numero1 + ", Numero2=" + Numero2 + ", resultado=" + resultado + "]";
	}

	public int getNumero1() {
		return Numero1;
	}

	public void setNumero1(int numero1) {
		Numero1 = src.Utilslfloen.obtenerEnteroPorScanner();
	}

	public int getNumero2() {
		return Numero2;
	}

	public void setNumero2(int numero2) {
		Numero2 = src.Utilslfloen.obtenerEnteroPorScanner();
	}

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = Numero1 + Numero2;
	}
	
	
	
}
