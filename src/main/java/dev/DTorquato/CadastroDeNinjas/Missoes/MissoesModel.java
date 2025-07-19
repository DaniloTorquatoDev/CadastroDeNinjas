package dev.DTorquato.CadastroDeNinjas.Missoes;

import dev.DTorquato.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_Missoes")

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private  char rank;

    private NinjaModel ninja;

    public MissoesModel() {
    }

    public MissoesModel(String nome, char rank) {
        this.nome = nome;
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }
}
