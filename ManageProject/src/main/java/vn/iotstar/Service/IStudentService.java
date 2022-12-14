package vn.iotstar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import vn.iotstar.Entity.Student;

public interface IStudentService {

	void deleteAll();

	Student getById(Integer id);

	void delete(Student entity);

	void deleteById(Integer id);

	Long count();

	Optional<Student> findById(Integer id);

	<S extends Student> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends Student> S saveAndFlush(S entity);

	void flush();

	Page<Student> findAll(Pageable pageable);

	List<Student> findAll();

	<S extends Student> S save(S entity);

	List<Student> findByNameContaining(String name);

	Page<Student> findByNameContaining(String name, Pageable pageable);

	Student findByEmailContaining(String email);

	List<Student> findByIdproject(Long idproject);

	List<Student> findByWaitproject(Long idproject);

	List<Student> findByXoaproject(Long xoaproject);
}
