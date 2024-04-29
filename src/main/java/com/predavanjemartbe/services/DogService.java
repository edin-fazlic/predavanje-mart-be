package com.predavanjemartbe.services;

import com.predavanjemartbe.models.Dog;
import com.predavanjemartbe.repositories.DogRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DogService {

    private DogRepository dogRepository;

    public DogService(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public List<Dog> getDogsList() {
        return this.dogRepository.findAll();
    }
//
//    public Dog getDogById(long id) {
//        for (Dog dog : this.dogs) {
//            if(dog.getId() == id) {
//                return dog;
//            }
//        }
//        return null;
//    }
//
//    public void deleteDog(long id) {
//        List<Dog> dogList = this.dogs;
//        for (int i = 0; i < dogList.size(); i++) {
//            if (dogList.get(i).getId() == id) {
//                this.dogs.remove(i);
//                return;
//            }
//        }
//    }
//
    public Dog createDog(Dog dog) {
        if (this.dogRepository.count() < 3) {
            return this.dogRepository.save(dog);
        }
        return null;
    }
//
//    public Dog updateDog(Long id, Dog dog) {
//        Dog current = this.getDogById(id);
//        if(current == null) {
//            return null;
//        }
//        current.setName(dog.getName());
//        current.setBreed(dog.getBreed());
//        current.setAge(dog.getAge());
//        return current;
//    }
}
