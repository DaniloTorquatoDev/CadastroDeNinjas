package dev.DTorquato.CadastroDeNinjas.Ninjas;

import dev.DTorquato.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjasDTO {
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String email;
        private int idade;
        private MissoesModel missoes;
        private String rank;
    }


