package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class MinhaConfiguration {
    /*@Bean(name = "applicationName") //cria um objeto do tipo string para que possa ser utilizado onde precisar(tipo um include) - utilizado apenas nos metodos
    public String applicationName()
    {
        return "Sistema de Vendas";
    }*/
    @Bean
    public CommandLineRunner executar()
    {
        return args -> {
            System.out.println("Rodando");
        };
    }
}
