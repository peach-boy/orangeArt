package com.orangeart.domain.dao;


import com.orangeart.domain.model.StudentDO;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 学员Repository
 */
public interface StudentRepository extends JpaRepository<StudentDO, String> {


}
