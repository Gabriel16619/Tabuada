package model;

public class Tabuada {

	private double multiplicando;
	private double mimimoMultiplicador;
	private double maximoMultiplicador;
	private double minimoMultiplicador;

	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}

	public double getMultiplicando() {
		return multiplicando;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.mimimoMultiplicador = minimoMultiplicador;
	}

	public double getMinimoMultiplicando() {
		return mimimoMultiplicador;
	}

	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}

	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	public String[] mostrarTabuada() {

		double tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String[] tabuada = new String[(int) tamanho];

		int indice = 0;
		while (minimoMultiplicador <= maximoMultiplicador) {
			double produto = multiplicando * minimoMultiplicador;
			tabuada[indice] = multiplicando + "x" + minimoMultiplicador + "=" + produto;
			indice++;
			minimoMultiplicador += 1;

		}
		return tabuada;
	}
}
