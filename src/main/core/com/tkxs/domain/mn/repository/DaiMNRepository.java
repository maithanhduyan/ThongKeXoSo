package com.tkxs.domain.mn.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
/**
 * @author Mai Thành Duy An
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tkxs.domain.mn.entity.DaiMN;

public interface DaiMNRepository extends JpaRepository<DaiMN, String> {

	@Query("SELECT d FROM DaiMN d WHERE d.name = :id ")
	public List<DaiMN> findByDai(@Param("id") String dai);

	@Query(value = "SELECT * FROM DaiMN d WHERE d.name = :id  LIMIT :deep", nativeQuery = true)
	public List<DaiMN> findByDai(@Param("id") String dai,@Param("deep") int deep);

}
