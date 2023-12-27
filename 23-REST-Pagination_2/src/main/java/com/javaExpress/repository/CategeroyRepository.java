package com.javaExpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javaExpress.models.Categeroy;

@Repository

public interface CategeroyRepository extends JpaRepository<Categeroy, Integer> {

}
