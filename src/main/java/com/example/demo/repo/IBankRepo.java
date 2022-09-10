package com.example.demo.repo;

import com.example.demo.model.BankAccountInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBankRepo extends JpaRepository<BankAccountInfo, Long> {
}
