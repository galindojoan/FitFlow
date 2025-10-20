package com.fitflow.backend.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class HabitRequestDTO {

    @Schema(description = "Nombre del hábito", example = "Correr 30 min", required = true)
    @NotBlank(message = "El nombre no puede estar vacío")
    private String name;

    @Schema(description = "Descripción del hábito", example = "Ejercicio diario")
    private String description;

    @Schema(description = "Fecha de inicio del hábito", example = "2025-10-21", required = true)
    @NotNull(message = "La fecha de inicio es obligatoria")
    private LocalDate startDate;

    @Schema(description = "Indica si el hábito está completado", example = "false")
    private Boolean completed = false;

    // Getters y setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public Boolean getCompleted() { return completed; }
    public void setCompleted(Boolean completed) { this.completed = completed; }
}
