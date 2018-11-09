package com.sample.manageclaim.api.dao;

import com.sample.manageclaim.api.vo.Claim;
import com.sample.manageclaim.api.vo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaimJdbcRepository extends CrudRepository<Claim, Long> {

    List<Claim> findByUserid(String userid);

}
