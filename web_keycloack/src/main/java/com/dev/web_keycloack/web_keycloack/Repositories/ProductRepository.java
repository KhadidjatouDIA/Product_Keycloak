package com.dev.web_keycloack.web_keycloack.Repositories;

import com.dev.web_keycloack.web_keycloack.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository <Product, String>{

}
