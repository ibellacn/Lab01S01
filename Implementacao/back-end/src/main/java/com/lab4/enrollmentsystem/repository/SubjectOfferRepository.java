package com.lab4.enrollmentsystem.repository;

import com.lab4.enrollmentsystem.model.Subject;
import com.lab4.enrollmentsystem.model.SubjectOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectOfferRepository extends JpaRepository<SubjectOffer, Integer> {
}
