package br.com.imobiliaria.controllers;

import br.com.imobiliaria.models.ClienteModel;
import br.com.imobiliaria.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ClientController
{
    @Autowired
    private ClientService clientService;

    @PostMapping("/client")
    public ClienteModel addClientDatails(@RequestBody ClienteModel clienteModel)
    {
        return clientService.createClient(clienteModel);
    }

    @GetMapping("/client")
    public List<ClienteModel> getAllClients()
    {
        return clientService.getAllClients();
    }

    @GetMapping("/client/{id}")
    public ResponseEntity<ClienteModel> getClientsDetails(@PathVariable UUID id)
    {
        ClienteModel client = clientService.getClientsDetails(id).orElse(null);
        if (client != null)
        {
            return ResponseEntity.ok().body(client);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/client/{id}")
    public ResponseEntity<ClienteModel> updateClientDetails(@PathVariable UUID id, @RequestBody ClienteModel clienteModel)
    {
        ClienteModel updatedClient = clientService.updateClienteDatails(id, clienteModel);
        if(updatedClient != null)
        {
            return ResponseEntity.ok(updatedClient);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/client/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable UUID id)
    {
        clientService.deleteClient(id);
        return ResponseEntity.noContent().build();
    }
}

