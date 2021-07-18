package com.tkxs.domain.dai.repository;
/**
 * @author Mai Thành Duy An
 *
 */
import org.springframework.data.jpa.repository.JpaRepository;

import com.tkxs.domain.dai.entity.Dai;


public interface DaiRepository extends JpaRepository<Dai, String> {

}
