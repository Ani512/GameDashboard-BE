package anirudhumarji.gamedash.api;

import anirudhumarji.gamedash.services.CalculateService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

    @GetMapping(value = "/calculate")
    public Double getSum() {
        return CalculateService.calculateSum();
    }
}
