package anirudhumarji.gamedash.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Version {

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public String getVersion() {
        return "v1";
    }
}
