package com.predavanjemartbe.controllers;

import com.predavanjemartbe.models.Dog;
import com.predavanjemartbe.services.DogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("dogs")
@RestController
public class DogController {

    private final DogService dogService;

    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("list")
    public List<Dog> getDogs() {
        return this.dogService.getDogsList();
    }
//
//    @GetMapping("{id}")
//    public Dog getDogs(@PathVariable Long id) {
//        return this.dogService.getDogById(id);
//    }
//
//    @DeleteMapping("{id}")
//    public void deleteDog(@PathVariable Long id) {
//        this.dogService.deleteDog(id);
//    }
//
    @PostMapping()
    public Dog createDog(@RequestBody Dog dog) {
        return this.dogService.createDog(dog);
    }
//
//    @PutMapping("{id}")
//    public Dog updateDog(@PathVariable Long id, @RequestBody Dog dog) {
//        return this.dogService.updateDog(id, dog);
//    }
}
