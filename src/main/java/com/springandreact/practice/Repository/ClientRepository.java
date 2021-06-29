package com.springandreact.practice.Repository;

import com.springandreact.practice.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
