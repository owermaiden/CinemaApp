package com.ower;

import com.ower.repository.AccountRepository;
import com.ower.repository.MovieCinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CinemaAppApplication {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    MovieCinemaRepository movieCinemaRepository;

    @PostConstruct
    private void testAccount(){
        System.out.println(accountRepository.findByOrderByAgeDesc());
        System.out.println(movieCinemaRepository.countAllByCinemaId(4L));

    }

    public static void main(String[] args) { SpringApplication.run(CinemaAppApplication.class, args);

    }



}

