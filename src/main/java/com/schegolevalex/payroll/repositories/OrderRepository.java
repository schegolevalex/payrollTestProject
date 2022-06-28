package com.schegolevalex.payroll.repositories;

import com.schegolevalex.payroll.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

interface OrderRepository extends JpaRepository<Order, Long> {
}
