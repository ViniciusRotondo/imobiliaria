package br.com.imobiliaria.services;

import br.com.imobiliaria.dtos.AdmRecordDto;
import br.com.imobiliaria.models.AdmModel;
import br.com.imobiliaria.repositories.AdmRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AdmService {

    private final AdmRepository admRepository;

    public AdmService(AdmRepository admRepository) {
        this.admRepository = admRepository;
    }

    public List<AdmModel> getAllAdms(){
        return admRepository.findAll();
    }

    @Transactional
    public AdmModel saveAdm(AdmRecordDto admRecordDto) {
        AdmModel adm = new AdmModel();

        adm.setNomeCompleto(admRecordDto.nomeCompleto());
        adm.setEmail(admRecordDto.email());
        adm.setContato(admRecordDto.contato());
        adm.setSenha(admRecordDto.senha());

        return admRepository.save(adm);
    }


    @Transactional
    public void deleteAdm(UUID id) {
        admRepository.deleteById(id);
    }
}
