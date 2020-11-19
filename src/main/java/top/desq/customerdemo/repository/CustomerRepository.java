package top.desq.customerdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import top.desq.customerdemo.model.Customer;

/**
 * Repository interface for {@link top.desq.customerdemo.model.Customer} class.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
