package cibertec.edu.pe.discovery_server_grupo11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerGrupo11Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServerGrupo11Application.class, args);
	}

}
