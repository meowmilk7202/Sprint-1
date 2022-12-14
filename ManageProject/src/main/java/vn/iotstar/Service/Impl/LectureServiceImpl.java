package vn.iotstar.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import vn.iotstar.Entity.Lecture;
import vn.iotstar.Repository.ILectureRepository;
import vn.iotstar.Service.ILectureService;
@Service
public class LectureServiceImpl implements ILectureService{

	@Autowired
	ILectureRepository lectureRepo;

	@Override
	public <S extends Lecture> S save(S entity) {
		return lectureRepo.save(entity);
	}

	@Override
	public <S extends Lecture> Optional<S> findOne(Example<S> example) {
		return lectureRepo.findOne(example);
	}

	@Override
	public List<Lecture> findAll() {
		return lectureRepo.findAll();
	}

	@Override
	public Page<Lecture> findAll(Pageable pageable) {
		return lectureRepo.findAll(pageable);
	}

	@Override
	public List<Lecture> findAllById(Iterable<Long> ids) {
		return lectureRepo.findAllById(ids);
	}

	@Override
	public <S extends Lecture> Page<S> findAll(Example<S> example, Pageable pageable) {
		return lectureRepo.findAll(example, pageable);
	}

	@Override
	public Optional<Lecture> findById(Long id) {
		return lectureRepo.findById(id);
	}

	@Override
	public long count() {
		return lectureRepo.count();
	}

	@Override
	public void deleteById(Long id) {
		lectureRepo.deleteById(id);
	}

	@Override
	public void delete(Lecture entity) {
		lectureRepo.delete(entity);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Lecture getById(Long id) {
		return lectureRepo.getById(id);
	}

	@Override
	public void deleteAll() {
		lectureRepo.deleteAll();
	}

	@Override
	public Lecture findOneByName(String name) {
		return lectureRepo.findOneByName(name);
	}

	@Override
	public Page<Lecture> findByNameContaining(String name, Pageable pageable) {
		return lectureRepo.findByNameContaining(name, pageable);
	}

	@Override
	public Lecture findByEmailContaining(String email) {
		// TODO Auto-generated method stub
		return lectureRepo.findByEmailContaining(email);
	}

	@Override
	public List<Lecture> findByIdhoidongContaining(int idhoidong) {
		// TODO Auto-generated method stub
		return lectureRepo.findByIdhoidongContaining(idhoidong);
	}

	
	


	
}
