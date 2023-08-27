package com.sonda.teste.aeronautic.controller;

import com.sonda.teste.aeronautic.dto.AircraftDTO;
import com.sonda.teste.aeronautic.dto.AircraftEditDTO;
import com.sonda.teste.aeronautic.services.AircraftService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeronaves")
@AllArgsConstructor
public class AircraftController {

    private AircraftService aircraftService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<AircraftDTO> findAll() {
        return aircraftService.findAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public AircraftDTO findById(@PathVariable Long id) {
        return aircraftService.findById(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/find")
    public AircraftDTO findByName(@RequestParam String name) {
        return aircraftService.findByName(name);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public AircraftDTO create(@Valid @RequestBody AircraftDTO aircraftDTO) {
        return aircraftService.create(aircraftDTO);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping("/{id}")
    public AircraftDTO update(@PathVariable Long id, @Valid @RequestBody AircraftEditDTO aircraftEditDTO) {
        return aircraftService.update(aircraftEditDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        aircraftService.delete(id);
    }
}
