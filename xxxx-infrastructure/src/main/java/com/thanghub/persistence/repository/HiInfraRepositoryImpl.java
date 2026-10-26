package com.thanghub.persistence.repository;

import com.thanghub.repository.HiDomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HiInfraRepositoryImpl implements HiDomainRepository {
    @Override
    public String sayHi() {
        return "Hi Infrastructure";
    }
}
