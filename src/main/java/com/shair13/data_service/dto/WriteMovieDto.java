package com.shair13.data_service.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WriteMovieDto {
    @NotBlank
    private String title;
    @NotBlank
    private String director;
    private String description;
    @Min(1)
    @Max(10)
    private double rate;
}
