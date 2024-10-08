package br.com.imobiliaria.services;

import br.com.imobiliaria.models.ClienteModel;
import br.com.imobiliaria.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService
{

    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public ClienteModel createClient(ClienteModel clienteModel)
    {
        return clienteRepository.save(clienteModel);
    }

    @Override
    public List<ClienteModel> getAllClients()
    {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<ClienteModel> getClientsDetails(UUID id)
    {
        return clienteRepository.findById(id);
    }

    @Override
    public ClienteModel updateClienteDatails(UUID id, ClienteModel newClienteModel)
    {
        ClienteModel clienteData = clienteRepository.findById(id).orElse(null);

        if(clienteData != null)
        {
            return clienteRepository.save(newClienteModel);
        }
        else
        {
            throw new RuntimeException("Cliente não encontrado com esse ID: " + id);
        }
    }

    @Override
    public void deleteClient(UUID id)
    {
        clienteRepository.deleteById(id);
    }
}
