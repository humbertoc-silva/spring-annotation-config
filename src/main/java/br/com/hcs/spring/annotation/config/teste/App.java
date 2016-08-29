package br.com.hcs.spring.annotation.config.teste;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.hcs.spring.annotation.config.Processador;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Processador processador = context.getBean("processador", Processador.class);
    }
}
