package com.ssd.resttemplate.serviceImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssd.resttemplate.entity.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImdbServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public void getMatchesById(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        String uri = "http://localhost:8080/api/v1/matches/335982";
        ResponseEntity<Root> exchange = restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<Root>(httpHeaders), Root.class);

        System.out.println(exchange);

        HttpStatusCode statusCode = exchange.getStatusCode();
        System.out.println(statusCode);

        Root body = exchange.getBody();
        System.out.println(body);

    }

    public void getPopularCelebs(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("X-RapidAPI-Key","6fd43e6d80mshbe179a9b4bc6229p141014jsn7e1796327e75");
        httpHeaders.set("X-RapidAPI-Host","imdb8.p.rapidapi.com");

        String uri = "https://imdb8.p.rapidapi.com/actors/list-most-popular-celebs";

        ResponseEntity<String> exchange = restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<String>(httpHeaders), String.class);

        System.out.println(exchange);

    }

    public void getMatchesList(){

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        String uri = "http://localhost:8080/api/v1/matches";
        ResponseEntity<Root> exchange = restTemplate.exchange(uri, HttpMethod.GET, new HttpEntity<Root>(httpHeaders), Root.class);

        System.out.println(exchange);
    }

}
