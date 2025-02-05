package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.service;

import com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.magia.model.Spell;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpellService {

    private List<Spell> spells = new ArrayList<>();

    public Spell addSpell(Spell spell) {
        spells.add(spell);
        return spell;
    }

    public List<Spell> getAllSpells() {
        return spells;
    }
}
