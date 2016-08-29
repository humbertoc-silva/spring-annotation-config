package br.com.hcs.spring.annotation.config.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public abstract class AbstractDAO {
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    @Required 
    @Autowired
    @Qualifier("dataSourceUsuario")
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
