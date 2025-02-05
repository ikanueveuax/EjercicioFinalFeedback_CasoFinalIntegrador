package com.uax.smga.ejerciciofinalfeedback_casofinalintegrador.pedidos.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class DatabaseConfig {

    @Bean
    public DataSource dataSource() {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl("jdbc:mysql://localhost:3306/pedidos_db");
        ds.setUsername("usuario");
        ds.setPassword("contraseña");
        ds.setMaximumPoolSize(10);
        // Otras configuraciones necesarias
        return ds;
    }
}
