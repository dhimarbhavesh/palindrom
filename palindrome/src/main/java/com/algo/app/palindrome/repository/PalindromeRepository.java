package com.algo.app.palindrome.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algo.app.palindrome.dao.Palindrom;

public interface PalindromeRepository extends JpaRepository<Palindrom, String> {

}
