package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IClienteDAO;
import com.crud.h2.dto.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	//Utilizamos los metodos de la interface IClienteDAO, es como si instaciaramos.
	@Autowired
	IClienteDAO iClienteDAO;
	
	@Override
	public List<Cliente> listarClientes() {
		
		return iClienteDAO.findAll();
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public Cliente clienteXID(Long id) {
		
		return iClienteDAO.findById(id).get();
	}
	

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		
		return iClienteDAO.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		
		iClienteDAO.deleteById(id);
		
	}


	@Override
	public List<Cliente> listarClienteNomnbre(String nombre) {
		
		return iClienteDAO.findByNombre(nombre);
	}

	@Override
	public List<Cliente> listarClienteTrabajo(String trabajo) {
		// TODO Auto-generated method stub
		return iClienteDAO.findByTrabajo(trabajo);
	}

}
