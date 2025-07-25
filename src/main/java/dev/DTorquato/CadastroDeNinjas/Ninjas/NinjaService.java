package dev.DTorquato.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> listarNinjas(){
    return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);
    }

    public  NinjasDTO criarNinja (NinjasDTO ninjaDto) {
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDto);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);

    }

    public void deletarNinjaPorId(long id) {
        ninjaRepository.deleteById(id);
    }

    public NinjaModel alterarNinjaPorId(Long id, NinjaModel ninjaAtualizado) {
        if(ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
            return null;
    }





}
