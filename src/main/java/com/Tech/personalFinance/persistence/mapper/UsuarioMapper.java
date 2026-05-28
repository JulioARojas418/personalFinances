package com.Tech.personalFinance.persistence.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import com.Tech.personalFinance.domain.dto.UsuarioDto;
import com.Tech.personalFinance.domain.dto.UsuarioInsertDto;
import com.Tech.personalFinance.persistence.entity.UsuarioEntity;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mapping(source = "tipoDocumento.nombre", target = "tipoDocumento")
    UsuarioDto toDto(UsuarioEntity usuarioEntity);

    List<UsuarioDto> toDto(Iterable<UsuarioEntity> usariosEntity);

    UsuarioEntity toEntity(UsuarioInsertDto usuarioInsertDto);

    void toUpdateDto(UsuarioInsertDto usuarioInsertDto, @MappingTarget UsuarioEntity usuarioEntity);
}
