package com.curso.java.configuracion;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class Configuracion extends ResourceConfig {

	
	public Configuracion() {
		packages("com.curso.java.servicios");
	}
}
