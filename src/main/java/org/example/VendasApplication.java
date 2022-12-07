package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //informa que a classe inicializara uma aplicação spring boot
@RestController
public class VendasApplication {

    /*@Autowired //usado para injetar uma dependencia(deixar a responsabilidade de instanciar uma classe para quem chama a classe.)
    @Qualifier("applicationName")//atribuir a string do metodo nesta variavel*/
    @Value("${application.name}") //procura uma propriedade com esse nome e pega o valor dela para atribuir na variavel
    private String applicationName;

    @Cachorro
    private Animal animal;
    @Bean(name = "executarAnimal")
    public CommandLineRunner executar(){
        return args -> {
            this.animal.barulho();
        };
    }

    @GetMapping("/hello") //quando acessar essa url, irá mostrar a mensagem
    public String helloWord()
    {
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}
