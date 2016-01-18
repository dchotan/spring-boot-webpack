package com.patrickgrimard;

import com.patrickgrimard.wnt.auth.Person;
import com.patrickgrimard.wnt.auth.profile.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {CarrierDoNotUseRepository.class})
@RestController
public class Application {

    @Autowired
    private CarrierDoNotUseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

    @RequestMapping(value = "/items", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Collection<CarrierProjection> items() {
        System.out.println("test");
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .map(c -> new CarrierProjection(c.getCarrier(), c.getReason()))
                .collect(Collectors.toList());
    }

    @Bean
    ProfileService<Person> profileService() {
        return (username) -> null;
    }
}
