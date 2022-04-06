package com.codingdojo.kenny.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.kenny.modelos.Usuario;
import com.codingdojo.kenny.repositorios.RepositorioUsuarios;
//Service
@Service
public class ServicioUsuarios {
	//repo
	private final RepositorioUsuarios repositorio;
	//create constructor

	public ServicioUsuarios(RepositorioUsuarios repositorio) {
		this.repositorio = repositorio;
	}
	//functions                           use querys que hay en el repositorio
	
	//return all tables
	public List<Usuario> get_all(){ //este findAll es el nombre 
		return repositorio.findAll();
	}
	// return Usuario by id
	public Usuario find_user(Long id) {
		Optional<Usuario> optionalUser = repositorio.findById(id);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
	}
}
