package aula_0602;

import java.util.ArrayList;

public class ArmazemParaiba {

	private ArrayList<Cliente> clientes;
	
	public ArmazemParaiba(){
		clientes = new ArrayList<Cliente>();
	}
	
	public boolean adicionaCliente(Cliente cliente){
		return clientes.add(cliente);
	}
	
	public double getTotalFinanciavel(){
		double totalFinanciavel = 0.0;
		for(Cliente cliente : clientes){
			totalFinanciavel = totalFinanciavel + cliente.getFinanciamentoMax();
		}
		return totalFinanciavel;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		final String eol = System.getProperty("line.separator");		
		
		sb.append("Lista de Clientes");
		sb.append(eol);
		for(Cliente cliente : clientes){
			sb.append(cliente);
			sb.append(eol);
			sb.append(eol);
		}
		return sb.toString();
	}
	
	public ArrayList<ClienteFiel> getClientesFieis(){
		ArrayList<ClienteFiel> clientesFieis = new ArrayList<>();
	
		for(Cliente cliente : clientes){
			if(cliente instanceof ClienteFiel){
				ClienteFiel clienteFiel = (ClienteFiel)cliente;
				clientesFieis.add(clienteFiel);
			}
		}
		return clientesFieis;
	}
}
