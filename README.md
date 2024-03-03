
# Teste Java Developer
## TGID

### Objetivos
• O sistema deve conter ao menos dois usuários: Empresa e Cliente
• CPF (para Cliente) e CNPJ (para Empresa) devem ser validados
• Para cada Empresa, deve haver ao menos um tipo de taxa de sistema que será
incidida no momento da transação (saque e depósito)
• As Empresas devem ter um saldo que advém dos depósitos e saques realizados por
• Clientes na sua empresa, e já com o abate das taxas de administração (sistema)
• Clientes podem fazer depósitos e saques pelas Empresas (a depender dos saldos
das empresas)
• No momento em que a transação é realizada, deve ser enviado um callback para
Empresa informando a transação (essa informação pode dar erro caso o sistema
esteja instável, utilize o site webhook.site para simular envio), e algum tipo de
notificação para o Cliente (seja e-mail, SMS ou algo do tipo). 


## Tecnologias Utilizadas
- IDE STS
- Spring boot framework
- DB MySQL
- Insomnia







## Arquitetura Proposta

![App Screenshot](https://i.imgur.com/lZwXrJq.png)


## UML

![App Screenshot](https://i.imgur.com/FP7Syvw.png)

## Melhorias

- Acrescentar testes unitários e de integração
- Validação de usuário e diferenciação de acesso para usuários
- Fila usando kafka ou rabbitMQ para não sobrecarregar as notificações
- Hospedagem em cloud para usar os recursos disponíveis
- Criar webhook do zero para testar notificações reais
