package com.exemplo.notificacao;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.exemplo.notificacao.service.observer.NotificacaoService;
import com.exemplo.notificacao.service.PedidoService;
import com.exemplo.notificacao.service.observer.INotification;
import com.exemplo.notificacao.model.Pedido;

@SpringBootApplication
public class NotificacaoApplication implements CommandLineRunner {

    @Autowired
    private NotificacaoService notificacaoService;

    public static void main(String[] args) {
        SpringApplication.run(NotificacaoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    System.out.println("=== Sistema de Notificação de Pedidos ===");
    ArrayList<INotification> notifiers = new ArrayList<>();

    notifiers.add(new com.exemplo.notificacao.service.EmailService());
    notifiers.add(new com.exemplo.notificacao.service.SmsService());
    
    notificacaoService.adicionarAssinantes(notifiers);
    
    PedidoService pedidoService = new PedidoService(notificacaoService);

    pedidoService.criarPedido("João", 150.0);
       
    System.out.println("=== Fim da execução ===");
    }
}
