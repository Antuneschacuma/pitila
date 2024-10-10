// package com.donas.pitila.adapters.controllers;

// import static org.junit.jupiter.api.Assertions.assertThrows;
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.mockito.Mockito.*;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.MockitoAnnotations;

// import com.donas.pitila.adapters.Dtos.CreateClientRequest;
// import com.donas.pitila.core.entities.Cliente;
// import com.donas.pitila.core.entities.Localizacao;
// import com.donas.pitila.core.ports.out.ClienteRepositoryPort;
// import com.donas.pitila.core.usecases.CadastrarCliente;

// public class CriarClienteControllerTest {

// @Mock
// private ClienteRepositoryPort clienteRepositoryPort;

// @InjectMocks
// private CadastrarCliente cadastrarCliente;

// private CriarClienteController criarClienteController;

// @BeforeEach
// public void setUp() {
// MockitoAnnotations.openMocks(this);
// criarClienteController = new CriarClienteController(cadastrarCliente);
// }

// @Test
// public void testCriarClienteComSucesso() {
// CreateClientRequest request = new CreateClientRequest("João Silva",
// "joao@example.com", "123456789", 40.7128,
// -74.0060);
// Localizacao localizacao = new Localizacao(40.7128, -74.0060);
// Cliente clienteEsperado = new Cliente("João Silva", "joao@example.com",
// "123456789", localizacao);
// when(clienteRepositoryPort.save(any(Cliente.class))).thenReturn(clienteEsperado);
// Cliente clienteCriado = criarClienteController.criar(request);

// assertNotNull(clienteCriado);
// assertEquals(clienteEsperado.getNome(), clienteCriado.getNome());
// }

// @Test
// public void testCriarClienteNomeInvalido() {
// CreateClientRequest request = new CreateClientRequest("", "joao@example.com",
// "123456789", 40.7128, -74.0060);
// assertThrows(IllegalArgumentException.class, () -> {
// criarClienteController.criar(request);
// });
// }
// }
