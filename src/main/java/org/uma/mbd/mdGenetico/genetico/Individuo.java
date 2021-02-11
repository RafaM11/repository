package org.uma.mbd.mdGenetico.genetico;

public class Individuo {
	private Cromosoma cromosoma;

	private double fitness;

	/**
	 * Crea un cromosoma aleatoriamente y lo evalúa para obtener su fitness.
	 * 
	 * @param longitud
	 *            Longitud del cromosoma.
	 * @param problema
	 *            Problema a resolver.
	 */
	public Individuo(int longitud, Problema problema) {
		Cromosoma cromosoma = new Cromosoma(longitud, true);
		this.cromosoma = cromosoma;
		fitness = problema.evalua(cromosoma);
	}

	/**
	 * Hace una copia en profundidad del cromosoma recibido y lo eval�a para
	 * obtener su fitness.
	 * 
	 * @param cromosoma
	 *            Cromosoma que debe asociarse al individuo.
	 * @param problema
	 *            Problema a resolver.
	 */
	public Individuo(Cromosoma cromosoma, Problema problema) {
		cromosoma = cromosoma.copia();
		this.cromosoma = cromosoma;
		fitness = problema.evalua(cromosoma);
	}

	/**
	 * Devuelve el valor de fitness del individuo.
	 * 
	 * @return Fitness del individuo.
	 */
	public double getFitness() {
		return fitness;
	}

	/**
	 * Devuelve una copia (en profundidad) del cromosoma asociado al individuo.
	 * 
	 * @return Cromosoma copia del asociado al individuo.
	 */
	public Cromosoma getCromosoma() {
		return cromosoma.copia();
	}

	public String toString() {
		return "Individuo(" + cromosoma + ", " + fitness + ")";
	}
}
