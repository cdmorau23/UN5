package com.UN5.market.domain.repository;

import com.UN5.market.domain.Admin;

import java.util.Optional;

public interface AdRepository {
    Optional<Admin> getAdmin(int adminId);
    Admin save(Admin admin);
    void delete(int adminId);

    /*metodos necesarios:
    -Obtener admin por su nombre y contraseña para el login
    -Insercion de admin dados su nombre, correo y contraseña para el register
    -Modificacion de admin dados su nombre, correo y contraseña para actualizar perfil dentro de mi perfil
    -eliminacion de admin por si se desea eliminar la cuenta
     */
}
