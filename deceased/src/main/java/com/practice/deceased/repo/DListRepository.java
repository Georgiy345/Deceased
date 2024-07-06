package com.practice.deceased.repo;

import com.practice.deceased.database.DList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DListRepository extends JpaRepository<DList, Long> {

}
