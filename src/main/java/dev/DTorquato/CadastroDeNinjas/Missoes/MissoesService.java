package dev.DTorquato.CadastroDeNinjas.Missoes;
import dev.DTorquato.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissoesService {

    private MIssoesRepository mIssoesRepository;
    public MissoesService(MIssoesRepository mIssoesRepository) {
        this.mIssoesRepository = mIssoesRepository;
    }

    public List<MissoesModel> listarMissoes(){
        return mIssoesRepository.findAll();
    }

    public MissoesModel criarMissao (MissoesModel missoes){
       return mIssoesRepository.save(missoes);
    }

    public void deletarMissaoPorId(Long id) {
        mIssoesRepository.deleteById(id);
    }

}
