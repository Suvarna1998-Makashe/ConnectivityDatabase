package com.Table.Data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Table.Data.Entities.User;

public interface Repo extends JpaRepository<User, Integer> {

}
