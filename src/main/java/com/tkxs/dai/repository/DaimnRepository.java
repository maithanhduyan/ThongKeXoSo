package com.anmtd.dai.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.anmtd.dai.entity.Daimn;

@Repository
public interface DaimnRepository extends JpaRepository<Daimn, String> {

    @Query(value = "SELECT d FROM Daimn d WHERE d.id =:id ")
    public Optional<Daimn> fetchById(@Param("id") String id);

    @Query(value = "SELECT DISTINCT d.dai FROM Daimn d   ")
    public List<String> findNames();

    @Query(value = "SELECT d FROM Daimn d WHERE d.dai=:name ")
    public List<Daimn> findDaiByName(@Param("name") String name);
}
