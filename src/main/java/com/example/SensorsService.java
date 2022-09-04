package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SensorsService {
    @Autowired SensorsRepository repository;

    public List<Sensors>listAll(){
        return (List<Sensors>) repository.findAll();
    }

    public void save(Sensors sensor) {
        repository.save(sensor);
    }

    public Sensors get(Integer id) throws Exception {
       Optional<Sensors> obj = repository.findById(id);
       if(obj.isPresent()){

           return obj.get();
       }
       else throw new Exception("dddd");
    }

    public void delete(Integer id){
        repository.deleteById(id);
    }
}
