package com.example.bootjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.bootjpa.model.Alien;

import java.util.List;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
    //Way of writing complex queries
//    List<Alien> findByAname(String aname);
//    List<Alien> findByGreaterThan(int aid);
//    @Query("from Alien where aname=?1 order by aid")
//    List<Alien> findByAnameSorted(String aname);



}
