package hashan.springframework.sfgpetclinic.services;


import hashan.springframework.sfgpetclinic.model.Owner;
import hashan.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by jt on 7/18/18.
 */
public interface VetService{
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
