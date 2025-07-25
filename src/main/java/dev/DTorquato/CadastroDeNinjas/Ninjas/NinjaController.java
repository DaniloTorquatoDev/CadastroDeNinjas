package dev.DTorquato.CadastroDeNinjas.Ninjas;

import jakarta.persistence.PostUpdate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
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
    public NinjasDTO criarNinja(@RequestBody NinjasDTO ninjasDTO){
        return ninjaService.criarNinja(ninjasDTO);
    }

// Mostrar todos os ninjas
    @GetMapping("/listar")
    public List<NinjasDTO> listarNijas(){
        return ninjaService.listarNinjas();
    }

    //Mostrar Ninja por ID (CREATE)
    @GetMapping("/listar/{id}")
    public NinjasDTO listarNinjaPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

// Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterar/{id}")
    public NinjasDTO alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjasDTO ninjaAtualizado){
        return ninjaService.alterarNinjaPorId(id, ninjaAtualizado);
    }
// Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }


}
