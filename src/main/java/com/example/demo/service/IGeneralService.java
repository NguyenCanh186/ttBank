package com.example.demo.service;

import com.example.demo.model.BankAccountInfo;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IGeneralService <T>{

    Iterable<BankAccountInfo> findAll();

    T save(T t);

    Optional<T> findById(Long id);

    void remove(Long id);
}
