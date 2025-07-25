package dev.DTorquato.CadastroDeNinjas.Ninjas;

import dev.DTorquato.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjasDTO ninjasDTO) {
        NinjaModel ninjaModel = new NinjaModel();

        ninjaModel.setId(ninjasDTO.getId());
        ninjaModel.setNome(ninjasDTO.getNome());
        ninjaModel.setEmail(ninjasDTO.getEmail());
        ninjaModel.setIdade(ninjasDTO.getIdade());
        ninjaModel.setMissoes(ninjasDTO.getMissoes());
        ninjaModel.setRank(ninjasDTO.getRank());

        return ninjaModel;
    }

    public NinjasDTO map(NinjaModel ninjaModel) {
        NinjasDTO ninjasDTO = new NinjasDTO();

        ninjasDTO.setId(ninjaModel.getId());
        ninjasDTO.setNome(ninjaModel.getNome());
        ninjasDTO.setEmail(ninjaModel.getEmail());
        ninjasDTO.setIdade(ninjaModel.getIdade());
        ninjasDTO.setMissoes(ninjaModel.getMissoes());
        ninjasDTO.setRank(ninjaModel.getRank());

        return ninjasDTO;

    }

}
