package com.kdzumba.conferencedemo.repositories;

import com.kdzumba.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
