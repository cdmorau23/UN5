package com.UN5.market.persistence;

import com.UN5.market.domain.Admin;
import com.UN5.market.domain.repository.AdRepository;
import com.UN5.market.persistence.crud.AdminCrudRepository;
import com.UN5.market.persistence.entity.Administrador;
import com.UN5.market.persistence.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class AdministradorRepository implements AdRepository {

    @Autowired
    private AdminCrudRepository adminCrudRepository;
    @Autowired
    private AdminMapper mapper;



    @Override
    public Optional<Admin> getAdmin(int adminId){
        return adminCrudRepository.findById(adminId).map(admin -> mapper.toAdmin(admin));
    }

    @Override
    public Admin save(Admin admin){
        Administrador administrador = mapper.toAdministrador(admin);
        return mapper.toAdmin(adminCrudRepository.save(administrador));

    }
    @Override
    public void delete(int adminId){
        adminCrudRepository.deleteById(adminId);
    }





}
