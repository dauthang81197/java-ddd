package com.xxxx.ddd.application.service.event.impl;

import com.thanghub.service.HiDomainService;
import com.xxxx.ddd.application.service.event.EventAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventAppServiceImpl implements EventAppService {

    // Call domain service
    @Autowired
    private HiDomainService hiDomainService;
    @Override
    public String sayHi(String who) {
        return hiDomainService.sayHi();
    }
}
