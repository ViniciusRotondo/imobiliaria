package br.com.imobiliaria.controllers;

import br.com.imobiliaria.models.AdmModel;
import br.com.imobiliaria.services.AdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class AdmController
{
    @Autowired
    private AdmService admService;

    @PostMapping("/admin")
    public AdmModel addAdminDetails(@RequestBody AdmModel admModel)
    {
        return admService.createAdm(admModel);
    }

    @GetMapping("/admin")
    public List<AdmModel> getAllAdmsDetails()
    {
        return admService.getAllAdms();
    }

    @GetMapping("/admin/{id}")
    public ResponseEntity<AdmModel> getAdmsDetails(@PathVariable UUID id)
    {
        AdmModel adm = admService.getAdmsDetails(id).orElse(null);
        if(adm != null)
        {
            return ResponseEntity.ok().body(adm);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
    @PutMapping("/admin/{id}")
    public ResponseEntity<AdmModel> updateAdmDetails(@PathVariable UUID id, @RequestBody AdmModel admModel)
    {
        AdmModel updatedAdm = admService.updateAdmDatails(id, admModel);
        if(updatedAdm != null)
        {
            return ResponseEntity.ok(updatedAdm);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/admin/{id}")
    public ResponseEntity<Void> deleteAdm(@PathVariable UUID id)
    {
        admService.deleteAdm(id);
        return ResponseEntity.noContent().build();
    }
}
