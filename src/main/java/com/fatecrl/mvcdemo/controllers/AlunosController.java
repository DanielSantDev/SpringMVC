package com.fatecrl.mvcdemo.controllers;

import com.fatecrl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlunosController {

    private List<Aluno> alunos = List.of(
        new Aluno("Daniel Santana","daniel@gmail.com", 01, 23),
		new Aluno("João da Silva","joaao@gmail.com", 02, 20),
        new Aluno("Maria dos Santos","Maria@gmail.com", 03, 27)
    );

    @GetMapping("/Alunos")
    private List<Aluno> getAlunos(){
        return alunos;
    }

}
