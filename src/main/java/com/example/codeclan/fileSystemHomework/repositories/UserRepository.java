package com.example.codeclan.fileSystemHomework.repositories;

import com.example.codeclan.fileSystemHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
