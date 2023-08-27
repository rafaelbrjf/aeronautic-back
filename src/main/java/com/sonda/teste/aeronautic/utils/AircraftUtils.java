package com.sonda.teste.aeronautic.utils;

import com.sonda.teste.aeronautic.domain.Aircraft;
import com.sonda.teste.aeronautic.dto.AircraftDTO;
import com.sonda.teste.aeronautic.dto.AircraftEditDTO;

import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class AircraftUtils {
    public static Aircraft transformFromDTO(AircraftDTO aircraftDTO) {
        if(Objects.nonNull(aircraftDTO)) {
            Aircraft aircraft = new Aircraft();
            aircraft.setId(aircraftDTO.getId());
            aircraft.setName(aircraftDTO.getName());
            aircraft.setBrand(aircraftDTO.getBrand());
            aircraft.setYear(aircraftDTO.getYear());
            aircraft.setDescription(aircraftDTO.getDescription());
            aircraft.setSold(aircraftDTO.getSold());
            aircraft.setCreated(aircraftDTO.getCreated());
            aircraft.setUpdated(aircraftDTO.getUpdated());
            return aircraft;
        }
        return null;
    }

    public static Aircraft transformFromDTOPut(AircraftDTO aircraftDTO, Aircraft aircraft) {
        if(Objects.nonNull(aircraftDTO) && Objects.nonNull(aircraft)) {
            aircraft.setId(aircraftDTO.getId());
            aircraft.setName(aircraftDTO.getName());
            aircraft.setBrand(aircraftDTO.getBrand());
            aircraft.setYear(aircraftDTO.getYear());
            aircraft.setDescription(aircraftDTO.getDescription());
            aircraft.setSold(aircraftDTO.getSold());
            aircraft.setUpdated(Instant.now());
            return aircraft;
        }
        return null;
    }

    public static AircraftDTO transformToDTO(Aircraft aircraft) {
        if(Objects.nonNull(aircraft)) {
            AircraftDTO aircraftDTO = new AircraftDTO();
            aircraftDTO.setId(aircraft.getId());
            aircraftDTO.setName(aircraft.getName());
            aircraftDTO.setBrand(aircraft.getBrand());
            aircraftDTO.setYear(aircraft.getYear());
            aircraftDTO.setDescription(aircraft.getDescription());
            aircraftDTO.setSold(aircraft.getSold());
            aircraftDTO.setCreated(aircraft.getCreated());
            aircraftDTO.setUpdated(aircraft.getUpdated());
            return aircraftDTO;
        }
        return null;
    }

    public static List<AircraftDTO> transformToDTO(List<Aircraft> aircraftList) {
        if(Objects.nonNull(aircraftList) && !aircraftList.isEmpty()) {
            return aircraftList.stream().map(AircraftUtils::transformToDTO).collect(Collectors.toList());
        }
        return null;
    }

    public static Aircraft merge(AircraftEditDTO aircraftEditDTO, Aircraft aircraft) {
        if(Objects.nonNull(aircraftEditDTO) && Objects.nonNull(aircraft)) {
            aircraft.setName(aircraftEditDTO.getName());
            aircraft.setBrand(aircraftEditDTO.getBrand());
            aircraft.setYear(aircraftEditDTO.getYear());
            aircraft.setDescription(aircraftEditDTO.getDescription());
            aircraft.setSold(aircraftEditDTO.getSold());
            aircraft.setUpdated(Instant.now());
            return aircraft;
        }
        return null;
    }
}
