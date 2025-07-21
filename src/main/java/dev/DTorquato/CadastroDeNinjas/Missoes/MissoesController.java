package dev.DTorquato.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @GetMapping("/listar")
    public String mostrarMissoes() {
        return "Misões listadas";
    }

    @PostMapping("/criar")
    public String criarMissao() {
        return "Missao criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada";
    }



}
