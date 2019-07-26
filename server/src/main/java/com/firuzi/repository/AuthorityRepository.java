package com.firuzi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firuzi.model.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, Long> {
  Authority findByName(String name);
}
