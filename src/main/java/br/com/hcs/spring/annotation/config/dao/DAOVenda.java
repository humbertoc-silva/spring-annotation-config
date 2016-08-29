package br.com.hcs.spring.annotation.config.dao;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope(SCOPE_PROTOTYPE)
@Repository("daoVenda")
public class DAOVenda extends AbstractDAO {}
