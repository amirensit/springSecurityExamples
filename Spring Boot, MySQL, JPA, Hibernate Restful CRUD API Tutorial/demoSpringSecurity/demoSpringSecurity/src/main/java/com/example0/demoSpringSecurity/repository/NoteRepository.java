package com.example0.demoSpringSecurity.repository;


import com.example0.demoSpringSecurity.domain.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
