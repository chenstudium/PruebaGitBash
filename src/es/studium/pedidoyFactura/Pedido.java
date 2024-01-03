// Clase 12º-3 11012023 No se realizó en clase, hecho por mí. 53º
package es.studium.pedidoyFactura;

import java.time.LocalDateTime;

public class Pedido
{
	// Atributos privados
	private int idPedido;
	private LocalDateTime fecha;
	private String referencia;
	
	// Constructor por defecto o constructor vacío
	public Pedido()
	{
		idPedido = 0;
		fecha = LocalDateTime.now(); // Copiado de ejercicio resuelto
		referencia = "";
	}

	// Constructor con todos los parámetros menos el idPedido
	public Pedido(LocalDateTime fecha, String referencia)
	{
		this.fecha = fecha;
		this.referencia = referencia;
	}

	// Constructor por parámetros, con todos los parámetros
	public Pedido(int idPedido, LocalDateTime fecha, String referencia)
	{
		this.idPedido = idPedido;
		this.fecha = fecha;
		this.referencia = referencia;
	}

	// Métodos getters and setters
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