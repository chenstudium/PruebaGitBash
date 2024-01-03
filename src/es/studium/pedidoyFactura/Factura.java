// Clase 12�-3 11012023 No se realiz� en clase, hecho por m�. 54�
package es.studium.pedidoyFactura;

public class Factura
{
	private int idFactura;
	private String numeroFactura;
	private Pedido pedido;
	
	// Constructor por defecto o constructor vac�o
	public Factura()
	{
		idFactura = 0;
		numeroFactura = "";
		pedido = new Pedido();
	}

	// Constructor por par�metros, con todos los par�metros
	public Factura(int idFactura, String numeroFactura, Pedido pedido)
	{
		this.idFactura = idFactura;
		this.numeroFactura = numeroFactura;
		this.pedido = pedido;
	}

	// M�todos getters and setters
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