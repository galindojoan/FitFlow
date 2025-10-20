package com.fitflow.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDate;

public class HabitResponseDTO {

    @Schema(description = "ID del hábito", example = "1")
    private Long id;

    @Schema(description = "Nombre del hábito", example = "Correr 30 min")
    private String name;

    @Schema(description = "Descripción del hábito", example = "Ejercicio diario")
    private String description;

    @Schema(description = "Fecha de inicio del hábito", example = "2025-10-21")
    private LocalDate startDate;

    @Schema(description = "Si el hábito está completado", example = "false")
    private Boolean completed;

    // Getters y setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public Boolean getCompleted() { return completed; }
    public void setCompleted(Boolean completed) { this.completed = completed; }
}
