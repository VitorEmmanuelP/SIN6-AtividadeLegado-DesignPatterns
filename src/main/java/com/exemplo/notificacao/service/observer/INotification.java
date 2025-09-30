package com.exemplo.notificacao.service.observer;

import com.exemplo.notificacao.model.Pedido;

public interface INotification {
    void enviar(Pedido pedido);
}
