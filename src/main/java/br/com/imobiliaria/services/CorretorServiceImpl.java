package br.com.imobiliaria.services;

import br.com.imobiliaria.models.CorretorModel;
import br.com.imobiliaria.repositories.CorretorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CorretorServiceImpl implements CorretorService
{
    @Autowired
    public CorretorRepository corretorRepository;

    @Override
    public CorretorModel createCorretor(CorretorModel corretorModel)
    {
        return corretorRepository.save(corretorModel);
    }

    @Override
    public List<CorretorModel> getAllCorretores()
    {
        return corretorRepository.findAll();
    }

    @Override
    public Optional<CorretorModel> getCorretorDetails(UUID id)
    {
        return corretorRepository.findById(id);
    }

    @Override
    public CorretorModel updateCorretorDatails(UUID id, CorretorModel corretorModel)
    {
        CorretorModel corretorData = corretorRepository.findById(id).orElse(null);

        if (corretorData!= null)
        {
            return corretorRepository.save(corretorModel);
        }
        else
        {
            throw new RuntimeException("Não foi encontrado corretor com esse id: " + id);
        }
    }

    @Override
    public void deleteCorretor(UUID id)
    {
        corretorRepository.deleteById(id);
    }
}
