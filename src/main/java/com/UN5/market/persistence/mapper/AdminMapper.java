package com.UN5.market.persistence.mapper;

import com.UN5.market.domain.Admin;
import com.UN5.market.persistence.entity.Administrador;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {AdminRestMapper.class})
public interface AdminMapper {
    @Mappings({
            @Mapping(source = "idAdmin",target = "adminId"),
            @Mapping(source = "nombre",target = "adminname"),
            @Mapping(source = "correo",target = "admincorreo"),
            @Mapping(source = "contraseña",target = "admincontraseña"),




    })
    Admin toAdmin(Administrador administrador);
    List<Admin> toAdmins(List<Administrador> administradores);
    @InheritInverseConfiguration
    Administrador toAdministrador(Admin admin);
}
