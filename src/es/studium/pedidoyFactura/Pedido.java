// Clase 12�-3 11012023 No se realiz� en clase, hecho por m�. 53�
package es.studium.pedidoyFactura;

import java.time.LocalDateTime;

public class Pedido
{
	// Atributos privados
	private int idPedido;
	private LocalDateTime fecha;
	private String referencia;
	
	// Constructor por defecto o constructor vac�o
	public Pedido()
	{
		idPedido = 0;
		fecha = LocalDateTime.now(); // Copiado de ejercicio resuelto
		referencia = "";
	}

	// Constructor con todos los par�metros menos el idPedido
	public Pedido(LocalDateTime fecha, String referencia)
	{
		this.fecha = fecha;
		this.referencia = referencia;
	}

	// Constructor por par�metros, con todos los par�metros
	public Pedido(int idPedido, LocalDateTime fecha, String referencia)
	{
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.referencia = referencia;
	}

	// M�todos getters and setters
	public int getIdPedido()
	{
		return idPedido;
	}

	public void setIdPedido(int idPedido)
	{
		this.idPedido = idPedido;
	}

	public LocalDateTime getFecha()
	{
		return fecha;
	}

	public void setFecha(LocalDateTime fecha)
	{
		this.fecha = fecha;
	}

	public String getReferencia()
	{
		return referencia;
	}

	public void setReferencia(String referencia)
	{
		this.referencia = referencia;
	}
}