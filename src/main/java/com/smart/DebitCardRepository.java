package com.smart;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.model.DebitCard;

public interface DebitCardRepository extends JpaRepository<DebitCard, Long> {
}
