package com.kln.swst.simplerest.repository;

import com.kln.swst.simplerest.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student, Long> {

}
