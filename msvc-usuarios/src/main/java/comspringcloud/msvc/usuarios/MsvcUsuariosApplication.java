package comspringcloud.msvc.usuarios;

import comspringcloud.msvc.usuarios.controllers.usuarioController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients
@SpringBootApplication
public class MsvcUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsvcUsuariosApplication.class, args);
	}

}
