package br.com.imobiliaria.controllers;

import br.com.imobiliaria.models.CorretorModel;
import br.com.imobiliaria.services.CorretorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class CorretorController
{

    @Autowired
    public CorretorService corretorService;

    @PostMapping("/corretor")
    public CorretorModel addCorretorDetails(@RequestBody CorretorModel corretorModel)
    {
        return corretorService.createCorretor(corretorModel);
    }

    @GetMapping("/corretor")
    public List<CorretorModel> getAllCorretorDetails()
    {
        return corretorService.getAllCorretores();
    }

    @GetMapping("/corretor/{id}")
    public ResponseEntity<CorretorModel> getCorretorDetails(@PathVariable UUID id)
    {
        CorretorModel corretor = corretorService.getCorretorDetails(id).orElse(null);

        if (corretor != null)
        {
            return ResponseEntity.ok().body(corretor);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/corretor/{id}")
    public ResponseEntity<CorretorModel> updateCorretorDatails(@PathVariable UUID id, @RequestBody CorretorModel corretorModel)
    {
        CorretorModel updatedCorretor = corretorService.updateCorretorDatails(id, corretorModel);
        if (updatedCorretor != null)
        {
            return ResponseEntity.ok().body(updatedCorretor);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/corretor/{id}")
    public ResponseEntity<Void> deleteCorretor(@PathVariable UUID id)
    {
        corretorService.deleteCorretor(id);
        return ResponseEntity.noContent().build();
    }
}
