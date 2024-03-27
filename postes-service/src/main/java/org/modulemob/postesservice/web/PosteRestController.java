package org.modulemob.postesservice.web;

import org.modulemob.postesservice.entities.Poste;
import org.modulemob.postesservice.repository.PosteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PosteRestController {
    private PosteRepository posteRepository;

    public PosteRestController(PosteRepository posteRepository) {
        this.posteRepository = posteRepository;
    }

    @GetMapping("/postes")
    public List<Poste> getAllPostes(){
        return posteRepository.findAll();
    }

    @GetMapping("/postes/{id}")
    public Poste getPosteById(@PathVariable String id){
        return posteRepository.findById(id).get();
    }


}
