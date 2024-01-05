package com.loiane.estruturadados.lista;

public class NoImutavel<T> {
    
    private final T elemento;
	private NoImutavel<T> proxima;

	public NoImutavel(final T elemento) {
		super();
		this.elemento = elemento;
		this.proxima = null;
	}

	public T getElemento() {
		return elemento;
	}

	public NoImutavel<T> getProxima() {
		return proxima;
	}

	public void setProxima(final NoImutavel<T> proxima) {
		this.proxima = proxima;
	}

	@Override
	public String toString() {
		return "No [elemento=" + elemento + ", proxima=" + proxima + "]";
	}
}
