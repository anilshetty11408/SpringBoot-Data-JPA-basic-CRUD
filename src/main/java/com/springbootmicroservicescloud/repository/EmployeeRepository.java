package com.springbootmicroservicescloud.repository;

import com.springbootmicroservicescloud.entity.EmployeeEntity;
import com.springbootmicroservicescloud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

}
