package com.example.codeclan.fileSystemHomework.repositories;

import com.example.codeclan.fileSystemHomework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
