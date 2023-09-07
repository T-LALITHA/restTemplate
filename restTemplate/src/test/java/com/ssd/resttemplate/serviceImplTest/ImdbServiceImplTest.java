package com.ssd.resttemplate.serviceImplTest;

import com.ssd.resttemplate.serviceImpl.ImdbServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ImdbServiceImplTest {

    @Autowired
    private ImdbServiceImpl imdbServiceImpl;

    @Test
    public void getMatchesById(){

        imdbServiceImpl.getMatchesById();
    }

    @Test
    public void getMatchesList(){

        imdbServiceImpl.getMatchesList();
    }

    @Test
    public void getPopularCelebs(){

        imdbServiceImpl.getPopularCelebs();
    }
}
