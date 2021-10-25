package com.serverValidation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serverValidation.beans.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {

}
