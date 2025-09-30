package com.exemplo.notificacao.service.observer;

import com.exemplo.notificacao.model.Pedido;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class NotificacaoService {
    private ArrayList<INotification> assinantes = new ArrayList<>();

    public NotificacaoService() {
        this.assinantes = new ArrayList<>();
    }

    public NotificacaoService(ArrayList<INotification> assinantes) {
        this.assinantes = assinantes;
    }

    public void adicionarAssinante(INotification assinante) {
        assinantes.add(assinante);
    }
    public void adicionarAssinantes(ArrayList<INotification> assinantes) {
        this.assinantes.addAll(assinantes);
    }

    public void removerAssinante(INotification assinante) {
        assinantes.remove(assinante);
    }

    public void enviar(Pedido pedido) {
        for (INotification assinante : assinantes) {
            assinante.enviar(pedido);
        }
    }
}
