package anirudhumarji.gamedash.api;

import anirudhumarji.gamedash.services.BaseUrlService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BaseUrl {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Map<String, String> getEndPoints() {
        return BaseUrlService.endPointList();
    }
}
