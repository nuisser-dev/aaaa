package com.university.Restaurant_management.Repository;

import com.university.Restaurant_management.Entity.Orderr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Orderr, Long> {

}
