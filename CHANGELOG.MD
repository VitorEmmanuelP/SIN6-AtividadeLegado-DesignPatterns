# Changelog

O formato baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.0.0/)

## [1.0.0] - 2025-09-29
### Adicionado
- Nova funcionalidade de notificação quando um pedido é realizado

### Corrigido
- Sem correções

### Modificado
- Sem modificações


## [1.1.0] - 2025-09-30

### Adicionado
- Implementação da interface `INotification` para os serviços `EmailService` , `SmsService` e `PushService`.
- Novo pacote `service.observer` para centralizar as interfaces e serviços de notificação.
- Método `adicionarAssinantes` em `NotificacaoService` para facilitar o registro em lote de notificadores.

### Corrigido
- Imports corrigidos e padronizados para refletir a nova estrutura de pacotes.
- Removidos arquivos duplicados e conflitos de nomes de classes/interfaces.
- Ajuste no uso de tipos e métodos em `NotificacaoApplication` e `PedidoService`.

### Modificado
- Refatoração geral da estrutura de pacotes para melhor organização e manutenção do código.