package com.example.demo.service;

import com.example.demo.model.BankAccountInfo;
import com.example.demo.repo.IBankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankService implements IBankService{

    @Autowired
    private IBankRepo bankRepo;

    @Override
    public Iterable<BankAccountInfo> findAll() {
        return bankRepo.findAll();
    }

    @Override
    public BankAccountInfo save(BankAccountInfo bankAccountInfo) {
        return bankRepo.save(bankAccountInfo);
    }

    @Override
    public Optional<BankAccountInfo> findById(Long id) {
        return bankRepo.findById(id);
    }

    @Override
    public void remove(Long id) {
        bankRepo.deleteById(id);
    }
}
