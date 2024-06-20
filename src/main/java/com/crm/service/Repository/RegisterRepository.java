package com.crm.service.Repository;

import org.springframework.data.repository.CrudRepository;
import com.crm.service.Entity.Register;

public interface RegisterRepository extends CrudRepository<Register, Long> {
}
