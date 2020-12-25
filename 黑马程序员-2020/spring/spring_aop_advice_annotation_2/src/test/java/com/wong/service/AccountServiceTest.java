package com.wong.service;

import com.wong.config.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class AccountServiceTest {
    
    @Autowired
    private AccountService accountService;
    
    @Test
    public void save() {
        accountService.save();
    }
    
    @Test
    public void update() {
        accountService.update(123);
    }
    
    @Test
    public void delete() {
        accountService.delete();
    }
}