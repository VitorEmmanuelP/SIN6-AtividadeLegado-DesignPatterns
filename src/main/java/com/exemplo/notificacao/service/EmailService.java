
package com.exemplo.notificacao.service;

import com.exemplo.notificacao.service.observer.INotification;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;

@Service
public class EmailService implements INotification {
    public void enviar(Pedido pedido) {
        System.out.println("Enviando e-mail para " + pedido.getCliente());
    }
}
