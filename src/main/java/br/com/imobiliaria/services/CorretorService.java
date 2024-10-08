package br.com.imobiliaria.services;

import br.com.imobiliaria.models.AdmModel;
import br.com.imobiliaria.models.CorretorModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface CorretorService {
    public CorretorModel createCorretor(CorretorModel corretorModel);
    public List<CorretorModel> getAllCorretores();
    public Optional<CorretorModel> getCorretorDetails(UUID id);
    public CorretorModel updateCorretorDatails(UUID id, CorretorModel corretorModel);
    public void deleteCorretor(UUID id);
}
