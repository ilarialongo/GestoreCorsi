package it.polito.tdp.corsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;

public class ConnectDB {
//private static final String jdbcURL="jdbc:mysql://localhost/iscritticorsi";
//private static HikariDataSource ds;

public static Connection getConnection() throws SQLException {
	String jdbcURL= "jdbc:mysql://localhost/iscritticorsi?user=root&password=Cuscinoila";
	return DriverManager.getConnection(jdbcURL);
	
}
}
/*	if(ds==null) {
		HikariConfig config= new HikariConfig();
		config.setJdbcUrl(jdbcURL);
		config.setUsername("root");
		config.setPassword("Cuscinoila");
		config.addDataSourceProperty("cachePrepStmts", true);
		config.addDataSourceProperty("prepStmtCacheSize", 250);
		config.addDataSourceProperty("prepStmtCacheSqlLimit","2048");
		ds= new HikariDataSource(config);
	}
	try {
		return ds.getConnection();
	} catch (SQLException e) {
		System.err.println("Errore di connessione a un db");
		throw new RuntimeException(e);
	}
}*/
	

