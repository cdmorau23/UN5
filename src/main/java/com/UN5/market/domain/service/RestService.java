package com.UN5.market.domain.service;

import com.UN5.market.domain.Rest;
import com.UN5.market.domain.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestService {
    @Autowired
    private RestRepository restRepository;


    public Optional<Rest> getRest(int restId){
        return restRepository.getRest(restId);
    }


    public Rest save(Rest rest){
        return restRepository.save(rest);
    }

    public boolean delete(int RestId){
        return getRest(RestId).map(rest -> {
            restRepository.delete(RestId);
            return true;
        }).orElse(false);
    }
}
