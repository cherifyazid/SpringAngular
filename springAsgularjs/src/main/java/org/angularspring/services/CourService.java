package org.angularspring.services;

import org.angularspring.model.Cour;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourService extends JpaRepository<Cour,Long> {
}
