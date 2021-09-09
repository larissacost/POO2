package Exercicios08_09_21;

public class produtoEletronico {
   private String categoria;
   private String modelo;
   private double preco;
   
   public produtoEletronico(String categoria,String modelo,double preco)
   {
	   this.categoria = categoria;
	   this.modelo = modelo;
	   this.preco = preco;
   }

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public double getPreco() {
	return preco;
}

public void setPreco(double preco) {
	this.preco = preco;
}

   
}
