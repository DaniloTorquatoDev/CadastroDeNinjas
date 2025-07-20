package dev.DTorquato.CadastroDeNinjas.Missoes;

import dev.DTorquato.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_Missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char rank;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}


