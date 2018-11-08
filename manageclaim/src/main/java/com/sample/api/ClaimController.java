package com.sample.api;

import com.sample.api.vo.Claim;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claims")
public class ClaimController {

    @RequestMapping(path="/all", method= RequestMethod.GET)
    public Claim getClaims(){
        Claim claim = new Claim();
        claim.setId("100");
        return claim;
    }
}
