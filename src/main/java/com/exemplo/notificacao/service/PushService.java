package com.exemplo.notificacao.service;
import com.exemplo.notificacao.service.observer.INotification;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PushService implements INotification {
    
    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Enviando push notification para " + pedido.getCliente());
    }
}
