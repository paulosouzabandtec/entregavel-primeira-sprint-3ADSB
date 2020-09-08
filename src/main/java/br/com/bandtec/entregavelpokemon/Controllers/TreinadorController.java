package br.com.bandtec.entregavelpokemon.Controllers;

import br.com.bandtec.entregavelpokemon.Models.Treinador;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/treinadores")
public class TreinadorController {

    List<Treinador> treinadorList = new ArrayList<>();

    @GetMapping
    public ResponseEntity listarTodos() {
        if (treinadorList.isEmpty()) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.ok(treinadorList);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity listarUmTreinador(@PathVariable Integer id) {
        if (treinadorList.size() >= id) {
            return ResponseEntity.ok(treinadorList.get(id - 1));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity criarTreinador(@RequestBody Treinador treinador) {
        treinadorList.add(treinador);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/id}")
    public ResponseEntity atualizarTreinador(@PathVariable Integer id, @RequestBody Treinador treinador) {
        if (treinadorList.size() >= id) {
            treinadorList.set(id - 1, treinador);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarTreinador(@PathVariable Integer id) {
        if (treinadorList.size() >= id) {
            treinadorList.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
