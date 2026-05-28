package com.Tech.personalFinance.domain.dto;

public record UsuarioDto(
    String nombre,

    String apellido,

    String tipoDocumento,

    String documento
    
) { }
