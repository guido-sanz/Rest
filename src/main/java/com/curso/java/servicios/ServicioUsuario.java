package com.curso.java.servicios;



import java.util.ArrayList;
import java.util.Arrays;


import java.util.List;

import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.curso.java.entidades.Usuarios;




@Path("/usuario")
public class ServicioUsuario {

	
	static List<Usuarios> listaUsuarios = new ArrayList<>();
	
	
	@POST
	@Path("/agregarUsuario")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response nuevoUsuario(Usuarios usuario) {
		listaUsuarios.add(usuario);
		return Response.ok(usuario).build();
	}
	@GET
	@Path("/listaUsuarios")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listarUsuarios() {
		return Response.ok(listaUsuarios).build();	
	}
	
	@POST
	@Path("/agregarLista")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response agregarListaUsuario(List<Usuarios> usuario) {
		listaUsuarios.addAll(usuario);
		return Response.ok(listaUsuarios).build();
		
	}
	
	
	
	
	
	
	
	
	
	
//	@Path("/holamundo")
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response holamundo() {
//
//		return Response.ok("hola mundo").build();
//
//	}
//	
//	@Path("/persona/{nombre}")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response Persona(@PathParam("nombre") String nombre) {
//		String mensaje = "hola" + nombre;
//		return Response.ok(mensaje).build();
//	}
//	
//	
//	@GET
//	@Path("/lista")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response listaPersonas() {
//		
//		List<String> lista =  Arrays.asList("guido", "octavio", "irene", "fabian");
//		return Response.ok(lista).build();
//
//
//	}

}
