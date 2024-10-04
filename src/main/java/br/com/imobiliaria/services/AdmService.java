package br.com.imobiliaria.services;

import br.com.imobiliaria.models.AdmModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface AdmService
{
    public AdmModel createAdm(AdmModel admModel);
    public List<AdmModel> getAllAdms();
    public  Optional<AdmModel> getAdmsDetails(UUID id);
    public AdmModel updateAdmDatails(UUID id, AdmModel admModel);
    public void deleteAdm(UUID id);
}
