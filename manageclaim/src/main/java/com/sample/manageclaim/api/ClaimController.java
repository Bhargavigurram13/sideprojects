package com.sample.manageclaim.api;

import com.sample.manageclaim.api.dao.ClaimJdbcRepository;
import com.sample.manageclaim.api.vo.Claim;
import com.sample.manageclaim.api.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    ClaimJdbcRepository claimJdbcRepository;

    @RequestMapping( method= RequestMethod.GET)
    public Iterable<Claim> getClaims(@RequestParam("userid") String userid){
        Iterable<Claim> claims = claimJdbcRepository.findByUserid(userid);
        return claims;
    }

    @RequestMapping(method= RequestMethod.POST)
    public void addClaim(@RequestBody Claim claim){
        claimJdbcRepository.save(claim);
    }
}
