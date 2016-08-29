package br.com.hcs.spring.annotation.config.dao;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope(SCOPE_PROTOTYPE)
@Repository("daoProduto")
public class DAOProduto extends AbstractDAO {
    @PostConstruct
    public void init() {
        System.out.println("DAO produto iniciado.");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("DAO produto finalizado.");
    }
}
