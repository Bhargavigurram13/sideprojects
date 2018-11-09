package com.sample.manageclaim.api.dao;

import com.sample.manageclaim.api.vo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserJdbcRepository extends CrudRepository<User, Long> {

    List<User> findByName(String name);

}
