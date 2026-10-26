package com.thanghub.service.impl;

import com.thanghub.repository.HiDomainRepository;
import com.thanghub.service.HiDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiDomainServiceImpl implements HiDomainService {
    @Autowired
    private HiDomainRepository hiDomainRepository;
    @Override
    public String sayHi() {
        return hiDomainRepository.sayHi();
    }
}
