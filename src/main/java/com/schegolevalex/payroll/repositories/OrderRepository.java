package com.schegolevalex.payroll.repositories;

import com.schegolevalex.payroll.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
