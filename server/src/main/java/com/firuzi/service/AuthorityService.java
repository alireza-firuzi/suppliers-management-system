package com.firuzi.service;

import java.util.List;

import com.firuzi.model.Authority;

public interface AuthorityService {
  List<Authority> findById(Long id);

  List<Authority> findByname(String name);

}
