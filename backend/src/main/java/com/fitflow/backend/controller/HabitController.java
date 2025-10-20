package com.fitflow.backend.controller;

import com.fitflow.backend.dto.HabitRequestDTO;
import com.fitflow.backend.dto.HabitResponseDTO;
import com.fitflow.backend.entity.Habit;
import com.fitflow.backend.repository.HabitRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/habits")
@CrossOrigin(origins = "http://localhost:5173")
@Tag(name = "Hábitos", description = "Operaciones CRUD sobre hábitos")
public class HabitController {

    @Autowired
    private HabitRepository habitRepository;

    @GetMapping
    @Operation(summary = "Listar todos los hábitos")
    public List<HabitResponseDTO> getAllHabits() {
        return habitRepository.findAll().stream().map(this::toResponseDTO).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un hábito por ID")
    public HabitResponseDTO getHabitById(@PathVariable Long id) {
        return habitRepository.findById(id).map(this::toResponseDTO).orElse(null);
    }

    @PostMapping
    @Operation(summary = "Crear un nuevo hábito")
    public HabitResponseDTO createHabit(@Valid @RequestBody HabitRequestDTO habitRequestDTO) {
        Habit habit = new Habit();
        habit.setName(habitRequestDTO.getName());
        habit.setDescription(habitRequestDTO.getDescription());
        habit.setStartDate(habitRequestDTO.getStartDate());
        habit.setCompleted(habitRequestDTO.getCompleted() != null ? habitRequestDTO.getCompleted() : false);
        Habit saved = habitRepository.save(habit);
        return toResponseDTO(saved);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un hábito existente")
    public HabitResponseDTO updateHabit(@PathVariable Long id, @Valid @RequestBody HabitRequestDTO habitRequestDTO) {
        return habitRepository.findById(id).map(habit -> {
            habit.setName(habitRequestDTO.getName());
            habit.setDescription(habitRequestDTO.getDescription());
            habit.setStartDate(habitRequestDTO.getStartDate());
            habit.setCompleted(habitRequestDTO.getCompleted() != null ? habitRequestDTO.getCompleted() : false);
            return toResponseDTO(habitRepository.save(habit));
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un hábito por ID")
    public void deleteHabit(@PathVariable Long id) {
        habitRepository.deleteById(id);
    }

    private HabitResponseDTO toResponseDTO(Habit habit) {
        HabitResponseDTO dto = new HabitResponseDTO();
        dto.setId(habit.getId());
        dto.setName(habit.getName());
        dto.setDescription(habit.getDescription());
        dto.setStartDate(habit.getStartDate());
        dto.setCompleted(habit.getCompleted());
        return dto;
    }
}
