package br.edu.usj.ads.lpii.pets.ClienteFolder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
    
    @Id
    Long cpf;

    @Column
    String nome;
    @Column
    String telefone;

}
