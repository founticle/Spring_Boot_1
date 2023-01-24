package com.founticle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepository
        extends JpaRepository<customer, Integer> {
}
