package dev.DTorquato.CadastroDeNinjas.Ninjas;

import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class NinjaController {
    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

// Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }
// Mostrar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNijas(){
        return ninjaService.listarNinjas();
    }
    //Mostrar Ninja por ID (CREATE)
    @GetMapping("/listarID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostar ninja por id";
}

// Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }
// Deletar Ninja (DELETE)
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Deletar ninja por id";
    }


}
