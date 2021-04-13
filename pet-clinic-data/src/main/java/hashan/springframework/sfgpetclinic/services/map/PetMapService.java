package hashan.springframework.sfgpetclinic.services.map;

import hashan.springframework.sfgpetclinic.model.Owner;
import hashan.springframework.sfgpetclinic.model.Pet;
import hashan.springframework.sfgpetclinic.services.CrudService;
import hashan.springframework.sfgpetclinic.services.PetService;


import java.util.Set;



public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
