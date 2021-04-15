package com.example.wbdvsp21projectMealForToday.repositories;

import com.example.wbdvsp21projectMealForToday.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT * FROM users WHERE username = :name", nativeQuery = true)
    List<User> findUserByUsername(@Param("name") String username);
}
