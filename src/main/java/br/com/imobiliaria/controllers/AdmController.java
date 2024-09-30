package br.com.imobiliaria.controllers;

import br.com.imobiliaria.dtos.AdmRecordDto;
import br.com.imobiliaria.models.AdmModel;
import br.com.imobiliaria.services.AdmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/admin")
public class AdmController {

    private final AdmService admService;

    public AdmController(AdmService admService) {
        this.admService = admService;
    }

    @GetMapping
    public ResponseEntity<List<AdmModel>> getAllAdms(){
        return ResponseEntity.status(HttpStatus.OK).body(admService.getAllAdms());
    }

    @PostMapping
    public ResponseEntity<AdmModel> saveAdm(@RequestBody AdmRecordDto admRecordDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(admService.saveAdm(admRecordDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAdm(@PathVariable UUID id) {
        admService.deleteAdm(id);
        return ResponseEntity.status(HttpStatus.OK).body("Administrador deletado com sucesso");
    }
}
