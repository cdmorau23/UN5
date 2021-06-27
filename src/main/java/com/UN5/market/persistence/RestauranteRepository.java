package com.UN5.market.persistence;

import com.UN5.market.domain.Rest;
import com.UN5.market.domain.repository.RestRepository;
import com.UN5.market.persistence.crud.RestauranteCrudRepository;
import com.UN5.market.persistence.entity.Restaurante;
import com.UN5.market.persistence.mapper.RestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class RestauranteRepository implements RestRepository {
    @Autowired
    private RestauranteCrudRepository restauranteCrudRepository;
    @Autowired
    private RestMapper mapper;

    @Override
    public Optional<Rest> getRest(int restId){
        return restauranteCrudRepository.findById(restId).map(restaurante -> mapper.toRest(restaurante));
    }

    @Override
    public Rest save(Rest rest){
        Restaurante restaurante = mapper.toRestaurante(rest);
        return mapper.toRest(restauranteCrudRepository.save(restaurante));
    }
    @Override
    public void delete(int restId){
        restauranteCrudRepository.deleteById(restId);
    }

}
