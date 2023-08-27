package com.sonda.teste.aeronautic.repositories;

import com.sonda.teste.aeronautic.domain.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

    Aircraft findByName(String name);

}
