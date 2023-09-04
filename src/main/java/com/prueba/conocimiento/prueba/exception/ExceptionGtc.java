package com.prueba.conocimiento.prueba.exception;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionGtc extends RuntimeException {
   // Cree esta para ir mas rapido
    private LocalDateTime fecha;

    public ExceptionGtc(String message) {
        super(message);
        this.fecha=LocalDateTime.now();
    }
}
