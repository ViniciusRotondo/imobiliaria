package br.com.imobiliaria.services;

import br.com.imobiliaria.models.AdmModel;
import br.com.imobiliaria.models.ClienteModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ClientService {

    public ClienteModel createClient(ClienteModel clienteModel);
    public List<ClienteModel> getAllClients();
    public Optional<ClienteModel> getClientsDetails(UUID id);
    public ClienteModel updateClienteDatails(UUID id, ClienteModel clienteModel);
    public void deleteClient(UUID id);
}
