package com.example.codeclan.fileSystemHomework.repositories;


import com.example.codeclan.fileSystemHomework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
