// Clase 12º-3 11012023 No se realizó en clase, hecho por mí. 54º
package es.studium.pedidoyFactura;

public class Factura
{
	private int idFactura;
	private String numeroFactura;
	private Pedido pedido;
	
	// Constructor por defecto o constructor vacío
	public Factura()
	{
		idFactura = 0;
		numeroFactura = "";
		pedido = new Pedido();
	}

	// Constructor por parámetros, con todos los parámetros
	public Factura(int idFactura, String numeroFactura, Pedido pedido)
	{
		this.idFactura = idFactura;
		this.numeroFactura = numeroFactura;
		this.pedido = pedido;
	}

	// Métodos getters and setters
	public int getIdFactura()
	{
		return idFactura;
	}

	public void setIdFactura(int idFactura)
	{
		this.idFactura = idFactura;
	}

	public String getNumeroFactura()
	{
		return numeroFactura;
	}

	public void setNumeroFactura(String numeroFactura)
	{
		this.numeroFactura = numeroFactura;
	}

	public Pedido getPedido()
	{
		return pedido;
	}

	public void setPedido(Pedido pedido)
	{
		this.pedido = pedido;
	}
}