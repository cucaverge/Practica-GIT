package com.coderhouse.Clase8;

import com.coderhouse.Clase8.model.Client;
import com.coderhouse.Clase8.model.Invoice;
import com.coderhouse.Clase8.model.Product;
import com.coderhouse.Clase8.repository.InvoiceRepository;
import com.coderhouse.Clase8.repository.ProductRepository;
import com.coderhouse.Clase8.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Clase8Application implements CommandLineRunner {

	/*@Autowired
	private ProductRepository productRepository;

	@Autowired
	private ClientRepository clientRepository;

	@Autowired
	private InvoiceRepository invoiceRepository;*/

	public static void main(String[] args) {
		SpringApplication.run(Clase8Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Server listening on. http://localhost:8888/h2-console");

        /*Product taza = new Product();
		taza.setCode("dasdfasdf");
		taza.setDescription("400 ml");
		taza.setPrice(10);
		taza.setStock(100);
		this.productRepository.save(taza);

		//Parte 2 creación de productos
		Product remera = new Product();
		remera.setCode("SJSxnms2992Ajkx");
		remera.setDescription("Una bonita remera azul");
		remera.setPrice(3000);
		remera.setStock(10);
		this.productRepository.save(remera);

		Product auricularesBT = new Product();
		auricularesBT.setCode("xnksasdSSascs");
		auricularesBT.setDescription("Duran una banda la batería");
		auricularesBT.setPrice(10000);
		auricularesBT.setStock(20);
		this.productRepository.save(auricularesBT);

		Optional<Product> productoGuardado1 = this.productRepository.findById(1);
		Optional<Product> productoGuardado2 = this.productRepository.findById(2);

		System.out.println(productoGuardado1);
		System.out.println(productoGuardado2);


		//Creación clientes
		Client cliente1 = new Client();
		cliente1.setName("Horacio");
		cliente1.setDocnumber("8922812");
		cliente1.setLastname("Guarani");
		this.clientRepository.save(cliente1);

		Client cliente2 = new Client();
		cliente2.setName("Sebas");
		cliente2.setLastname("Ancavil");
		cliente2.setDocnumber("39540113");
		this.clientRepository.save(cliente2);

		Client cliente3 = new Client();
		cliente3.setName("Sebas");
		cliente3.setLastname("Abad");
		cliente3.setDocnumber("39540115");
		this.clientRepository.save(cliente3);


		//Paso 3: creación de facturas
		Optional<Client> client1 = this.clientRepository.findById(1);
		Invoice invoice1 = new Invoice();
		client1.ifPresent(invoice1::setClient);
		invoice1.setCreated_at("13-03");
		invoice1.setTotal(700);
		this.invoiceRepository.save(invoice1);

		Invoice invoice2 = new Invoice();
		client1.ifPresent(invoice2::setClient);
		invoice2.setCreated_at("15-03");
		invoice2.setTotal(700);
		this.invoiceRepository.save(invoice2);


		Optional<Client> client2 = this.clientRepository.findById(2);
		Invoice invoice3 = new Invoice();
		client2.ifPresent(invoice3::setClient);
		invoice3.setCreated_at("15-03");
		invoice3.setTotal(700);
		this.invoiceRepository.save(invoice3);

		client1 = this.clientRepository.findById(1);
		client2 = this.clientRepository.findById(2);
		System.out.println(client2.get().getInvoice());

        /*Búsqueda con métodos customizados
		List<Client> clientes = this.clientRepository.findByNameLike("%ora%");
		System.out.println(clientes.size());
		printClientes(clientes);

		List<Client> clientes2 = this.clientRepository.getByNameOrderedByLastnameJPQL("Sebas");
		System.out.println(clientes2.size());
		printClientes(clientes2);

		List<Client> clientes3 = this.clientRepository.getByNameOrderedByLastnameNativeQuery("Sebas");
		System.out.println(clientes3.size());
		printClientes(clientes3);*/

        /*Optional<Product> productoObtenido = this.productRepository.findById(1);
		if (productoObtenido.isPresent()) System.out.println(productoObtenido.get());

		Optional<Client> clienteObtenido = this.clientRepository.findById(1);
		if (clienteObtenido.isPresent()) System.out.println(clienteObtenido.get());*/
	}



	/*private void printClientes(List<Client> clientes) {
		for (Client client : clientes
		) {
			System.out.println(client);
		}*/
	}


