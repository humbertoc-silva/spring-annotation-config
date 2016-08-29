package br.com.hcs.spring.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import br.com.hcs.spring.annotation.config.dao.DAOProduto;
import br.com.hcs.spring.annotation.config.dao.DAOUsuario;
import br.com.hcs.spring.annotation.config.dao.DAOVenda;

@Component("processador")
public class Processador {
    private DAOProduto daoProduto;
    private DAOUsuario daoUsuario;
    private DAOVenda daoVenda;
    
    public DAOProduto getDaoProduto() {
        return daoProduto;
    }
    
    @Required @Autowired
    public void setDaoProduto(DAOProduto daoProduto) {
        this.daoProduto = daoProduto;
    }
    
    public DAOUsuario getDaoUsuario() {
        return daoUsuario;
    }
    
    @Required @Autowired
    public void setDaoUsuario(DAOUsuario daoUsuario) {
        this.daoUsuario = daoUsuario;
    }
    
    public DAOVenda getDaoVenda() {
        return daoVenda;
    }

    @Required @Autowired
    public void setDaoVenda(DAOVenda daoVenda) {
        this.daoVenda = daoVenda;
    }
}
