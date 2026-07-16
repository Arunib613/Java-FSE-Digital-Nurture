package com.cognizant.employeemanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagement.entity.Skill;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

        // HQL
        @Query("FROM Skill")
        List<Skill> getAllSkills();

        // Native SQL
        @Query(value = "SELECT * FROM skill", nativeQuery = true)
        List<Skill> getAllSkillsNative();
    }


