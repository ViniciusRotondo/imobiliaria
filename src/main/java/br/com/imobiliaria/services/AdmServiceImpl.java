package br.com.imobiliaria.services;

import br.com.imobiliaria.models.AdmModel;
import br.com.imobiliaria.repositories.AdmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AdmServiceImpl implements AdmService
{
    @Autowired
    private AdmRepository admRepository;

    @Override
    public AdmModel createAdm(AdmModel admModel)
    {
        return admRepository.save(admModel);
    }

    @Override
    public List<AdmModel> getAllAdms()
    {
        return admRepository.findAll();
    }

    @Override
    public Optional<AdmModel> getAdmsDetails(UUID id)
    {
        return admRepository.findById(id);
    }

    @Override
    public AdmModel updateAdmDatails(UUID id, AdmModel admModel)
    {
        AdmModel admData = admRepository.findById(id).orElse(null);

        if(admData != null)
        {
            return admRepository.save(admModel);
        }
        else
        {
            throw new RuntimeException("Administrador não encontrado com esse ID: " + id);
        }
    }

    @Override
    public void deleteAdm(UUID id)
    {
        admRepository.deleteById(id);
    }


}
