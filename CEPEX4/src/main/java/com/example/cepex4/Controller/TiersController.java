package com.example.cepex4.Controller;

import com.example.cepex4.Services.Operateur.TiersService;
import com.example.cepex4.entity.Tiers;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("/tiers")
public class TiersController {
    TiersService tiersService;

    @PostMapping("/ajouterTiers")
    public String AddUser (@RequestBody Tiers tiers){
        tiersService.AddTiers(tiers);
        return "Tiers Added succefuly!!";

    }

    @PutMapping("/edit-Tiers")
    public Tiers editTiers(@RequestBody Tiers p) {
        return  tiersService.editTiers(p);

    }

    @GetMapping("/all-Tierss")
    public List<Tiers> getTierss()
    {
        return tiersService.retrieveAll();}

    @GetMapping("/retrieveById/{oper_sqid}")
    public Tiers getByTierss(@PathVariable Long oper_sqid){
        return tiersService.retrieveById(oper_sqid);}

    @DeleteMapping("/delete-Tiers/{oper_sqid}")
    public String deleteTiers(@PathVariable Long oper_sqid) {
        tiersService.deleteTiers(oper_sqid);
        return "Tiers deleted!!";
    }
}
