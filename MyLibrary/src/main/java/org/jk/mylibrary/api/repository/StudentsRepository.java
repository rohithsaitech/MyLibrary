package org.jk.mylibrary.api.repository;

import org.jk.mylibrary.api.entites.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Long> {

	Students findUserByMblNum(Long mobile);
}
