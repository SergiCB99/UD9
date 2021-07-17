
public class Libro {

	protected String isbn;
	protected String titulo;
	protected String autor;
	protected int numero_paginas;
	
	public Libro(String isbn, String titulo, String autor, int numero_paginas) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numero_paginas = numero_paginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(int numero_paginas) {
		this.numero_paginas = numero_paginas;
	}
	
	public String toString() {
		return "El libro " + titulo + " con ISBN " + isbn + " creado por el autor " + autor + " tiene " + numero_paginas
				+ " paginas";
	}
	
	
	
	
	
}
