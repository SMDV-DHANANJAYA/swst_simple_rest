package com.kln.swst.simplerest.repository;

import com.kln.swst.simplerest.model.Student;
import org.hibernate.annotations.NamedNativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository <Student, Long> {
    List<Student> findAllByName(String name);
//    List<Student> findAllByIdBetween(Long id1, Long id2);
//    List<Student> findAllByNameLike(String name);

//    @Query(value = "SELECT s FROM Student s WHERE s.name like '?1'", nativeQuery = true)
//    List<Student> findStudentManualQuery(String name);


}
