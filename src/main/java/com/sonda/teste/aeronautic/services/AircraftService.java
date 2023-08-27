package com.sonda.teste.aeronautic.services;

import com.sonda.teste.aeronautic.domain.Aircraft;
import com.sonda.teste.aeronautic.dto.AircraftDTO;
import com.sonda.teste.aeronautic.dto.AircraftEditDTO;
import com.sonda.teste.aeronautic.repositories.AircraftRepository;
import com.sonda.teste.aeronautic.utils.AircraftUtils;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class AircraftService {

    private AircraftRepository aircraftRepository;

    public AircraftDTO findById(Long id) {
        return AircraftUtils.transformToDTO(findAircraft(id));
    }

    public List<AircraftDTO> findAll() {
        return AircraftUtils.transformToDTO(aircraftRepository.findAll());
    }

    public AircraftDTO findByName(String name) {
        return AircraftUtils.transformToDTO(aircraftRepository.findByName(name));
    }

    public AircraftDTO create(AircraftDTO aircraftDTO) {
        Aircraft aircraft = AircraftUtils.transformFromDTO(aircraftDTO);
        if (Objects.nonNull(aircraft)) {
            return AircraftUtils.transformToDTO(aircraftRepository.save(aircraft));
        }
        return null;
    }

    public AircraftDTO update(AircraftEditDTO aircraftEditDTO) {
        Aircraft aircraft = findAircraft(aircraftEditDTO.getId());
        AircraftUtils.merge(aircraftEditDTO, aircraft);
        return AircraftUtils.transformToDTO(aircraftRepository.save(aircraft));
    }

    public void delete(Long id) {
        aircraftRepository.deleteById(id);
    }

    private Aircraft findAircraft(Long id) {
        try {
            return aircraftRepository.findById(id).get();
        } catch (Exception exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
