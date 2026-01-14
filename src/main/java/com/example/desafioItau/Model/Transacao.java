package com.example.desafioItau.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jspecify.annotations.NonNull;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class Transacao {
    @NonNull
    private final double valor;
    @NonNull
    private final String data;

}
