package vn.iotstar.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iotstar.Entity.Notification;

public interface INotificationService {

	void deleteAll();

	Notification getById(Long id);

	void delete(Notification entity);

	Notification getOne(Long id);

	void deleteById(Long id);

	long count();

	Optional<Notification> findById(Long id);

	<S extends Notification> Page<S> findAll(Example<S> example, Pageable pageable);

	List<Notification> findAll(Sort sort);

	Page<Notification> findAll(Pageable pageable);

	List<Notification> findAll();

	<S extends Notification> S save(S entity);

}