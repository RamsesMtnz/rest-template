package com.github.conradovera.mapper;

public interface ManejadorExcepcion {
	
	Respuesta doResponse(Exception ex);
	Respuesta doResponse(Exception ex, String ipRequest);
	Respuesta doResponse(Exception ex, String ipRequest, ManejadorExcepcionNegocio manejadorExcepcionNegocio);
}
