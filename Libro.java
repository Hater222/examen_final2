package Ejercicio02ex;


	public class Libro {
	    private String titulo;
	    private String autor;
	    private int identificador;
	    private String categoria;
	    private int edadRecomendada;

	    public Libro(String titulo, String autor, int identificador, String categoria, int edadRecomendada) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.identificador = identificador;
	        this.categoria = categoria;
	        this.edadRecomendada = edadRecomendada;
	    }

	    // Getters y setters

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

	    public int getIdentificador() {
	        return identificador;
	    }

	    public void setIdentificador(int identificador) {
	        this.identificador = identificador;
	    }

	    public String getCategoria() {
	        return categoria;
	    }

	    public void setCategoria(String categoria) {
	        this.categoria = categoria;
	    }

	    public int getEdadRecomendada() {
	        return edadRecomendada;
	    }

	    public void setEdadRecomendada(int edadRecomendada) {
	        this.edadRecomendada = edadRecomendada;
	    }
	}


