package dev.DTorquato.CadastroDeNinjas.Ninjas;

import dev.DTorquato.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository  extends JpaRepository<NinjaModel, Long> {
}
