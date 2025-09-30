package com.exemplo.notificacao.service;

import com.exemplo.notificacao.model.Pedido;
import com.exemplo.notificacao.service.observer.NotificacaoService;
import org.springframework.stereotype.Service;




@Service
public class PedidoService {

    private final NotificacaoService notificacaoService;
    

    public PedidoService(NotificacaoService notificacaoService) {
        this.notificacaoService = notificacaoService;
    }

    public void criarPedido(String cliente, double valor) {
        Pedido pedido = new Pedido(cliente, valor);
        System.out.println("Pedido criado para o cliente: " + cliente);
        notificacaoService.enviar(pedido);
    }
}
