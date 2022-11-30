package vn.iotstar.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import vn.iotstar.Entity.LeaderLecture;
import vn.iotstar.Repository.LeaderLectureRepository;
import vn.iotstar.Service.ILeaderLectureService;

@Service
public class LeaderLectureServiceImpl implements ILeaderLectureService{
	@Autowired
	LeaderLectureRepository leaderLectureRepository;

	@Override
	public <S extends LeaderLecture> S save(S entity) {
		return leaderLectureRepository.save(entity);
	}

	@Override
	public List<LeaderLecture> findAll() {
		return leaderLectureRepository.findAll();
	}

	@Override
	public Page<LeaderLecture> findAll(Pageable pageable) {
		return leaderLectureRepository.findAll(pageable);
	}

	@Override
	public List<LeaderLecture> findAll(Sort sort) {
		return leaderLectureRepository.findAll(sort);
	}

	@Override
	public Optional<LeaderLecture> findById(Long id) {
		return leaderLectureRepository.findById(id);
	}

	@Override
	public long count() {
		return leaderLectureRepository.count();
	}

	@Override
	public void deleteById(Long id) {
		leaderLectureRepository.deleteById(id);
	}

	@Override
	public LeaderLecture getOne(Long id) {
		return leaderLectureRepository.getOne(id);
	}

	@Override
	public void delete(LeaderLecture entity) {
		leaderLectureRepository.delete(entity);
	}

	@Override
	public LeaderLecture getById(Long id) {
		return leaderLectureRepository.getById(id);
	}

	@Override
	public void deleteAll() {
		leaderLectureRepository.deleteAll();
	}
	
}