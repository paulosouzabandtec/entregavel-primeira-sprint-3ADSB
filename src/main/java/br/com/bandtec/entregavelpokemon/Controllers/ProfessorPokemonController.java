package br.com.bandtec.entregavelpokemon.Controllers;

import br.com.bandtec.entregavelpokemon.Models.ProfessorPokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/professores")
public class ProfessorPokemonController {

    List<ProfessorPokemon> professorList = new ArrayList<>();

    @GetMapping("/listar-professores")
    public ResponseEntity listarTodos() {
        if (professorList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(professorList);
        }
    }

    @GetMapping("/listar-professor/{id}")
    public ResponseEntity listarUmProfessor(@PathVariable Integer id) {
        if (professorList.size() >= id) {
            return ResponseEntity.ok(professorList.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/criar-professor")
    public ResponseEntity criarProfessor(@RequestBody ProfessorPokemon professor) {
        professorList.add(professor);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/atualizar-professor/{id}")
    public ResponseEntity atualizarProfessor(@PathVariable Integer id, @RequestBody ProfessorPokemon professor) {
        if (professorList.size() >= id) {
            professorList.set(id - 1, professor);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/deletar-professor/{id}")
    public ResponseEntity deletarProfessor(@PathVariable Integer id) {
        if (professorList.size() >= id) {
            professorList.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
