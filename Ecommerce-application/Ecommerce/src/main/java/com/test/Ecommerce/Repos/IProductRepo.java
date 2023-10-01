package com.test.Ecommerce.Repos;

import com.test.Ecommerce.Model.Product;
import com.test.Ecommerce.Model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByProductCategory(ProductCategory category);
}