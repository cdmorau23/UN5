package com.UN5.market.web.backController;

import com.UN5.market.domain.Rest;
import com.UN5.market.domain.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Rest")
public class RestControler {
    @Autowired
    private RestService restService;

    @GetMapping("/{Rest}")
    public ResponseEntity<Rest> getRest(@PathVariable("Rest") int RID){
        return restService.getRest(RID).
                map(rest -> new ResponseEntity<>(rest, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<Rest> save(@RequestBody Rest rest){
        return new ResponseEntity<>(restService.save(rest), HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int adID){
        if( restService.delete(adID)){
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }
}
