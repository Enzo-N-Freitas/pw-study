package br.com.etechoracio.study.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TBL_DISCIPLINA")
@Data
@Getter
@Setter
public class Disciplina {
    @Id
    @Column(name = "id_disciplina")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="TX_NOME")
    private String nome;

    public Long getId(){
        return id;
    }
}
