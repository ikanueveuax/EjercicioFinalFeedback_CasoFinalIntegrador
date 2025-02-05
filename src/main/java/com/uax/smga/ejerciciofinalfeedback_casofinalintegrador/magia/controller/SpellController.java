package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.controller;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.model.Spell;
import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spells")
public class SpellController {

    @Autowired
    private SpellService spellService;

    @PostMapping
    public ResponseEntity<Spell> addSpell(@RequestBody Spell spell) {
        Spell createdSpell = spellService.addSpell(spell);
        return ResponseEntity.ok(createdSpell);
    }

    @GetMapping
    public ResponseEntity<List<Spell>> getAllSpells() {
        return ResponseEntity.ok(spellService.getAllSpells());
    }
}
