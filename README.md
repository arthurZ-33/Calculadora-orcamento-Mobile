# **App calcular orçamento básico**

> O seu fiel escudeiro digital para garantir que as despesas não sejam mais rápidas que a sua receita. Basicamente, a calculadora que impede o seu saldo de virar um "Game Over" inesperado.

## 📱 Descrição: "O Orçamento Contra-Ataca"

O **App calcular orçamento básico** é um aplicativo Android focado na simplicidade espartana para controle financeiro. Ele oferece uma rota rápida e sem complicação para o usuário verificar se o seu saldo será positivo (o que é raro) ou negativo (o que é a realidade) após subtrair a despesa total da receita total. É o primeiro passo para sair do modo "sobrevivência" e entrar no modo "investidor".

## 🔧 Funcionalidades: "Less is More"

- [x] **Splash Screen:** Um momento de contemplação zen antes do caos das finanças (imagem **c1.png**).
- [x] **Tela de Autenticação/Boas-Vindas:** Escolha seu destino: ser um novo recruta (**Cadastro**, imagem **c4.png**) ou voltar à base (**Login**, imagem **c3.png**).
- [x] **Cálculo de Orçamento:** O *core business*. Insere a Receita e a Despesa, e a mágica acontece (imagem **c5.png**).
- [x] **Exibição de Resultado:** Descubra se você terá que vender seus jogos retrô ou se poderá comprar aquele Funko Pop novo.
- [x] **Limpar Campos:** O botão de "reset" para você fingir que o resultado ruim nunca existiu.

## 🚀 Tecnologias Utilizadas: "O Poder de um Bom Stack"

- [x] **Android Studio** (Porque o código não se escreve sozinho, né?)
- [x] **Java** (O *Jedi* Knight que lida com a lógica do negócio).
- [x] **ConstraintLayout** (Para garantir que a UI não quebre mais rápido que o seu orçamento).
- [x] **UI Clássica:** **TextView**, **EditText** e **Button** – o trio invencível do Android *Dev* iniciante.

## 🛠️ Como Rodar o Projeto: "A Invasão Começa Aqui"

Siga os passos abaixo para clonar e rodar o projeto localmente. É tão fácil que até seu primo que só joga Free Fire consegue:

1.  Clone este repositório para o seu *local drive* de *Dev*:

    ```bash
    git clone https://github.com/arthurZ-33/Calculadora-orcamento-Mobile.git
    ```

2.  Abra o projeto no Android Studio.
3.  Sincronize, compile e execute (botão *Play*, você já sabe o caminho) em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto: "O Mapa do Tesouro"

(Use a estrutura de arquivos do seu projeto aqui. Exemplo abaixo)

```bash
├── app
│   ├── src
│   │   ├── main
│   │   │   ├── java/com/example/apporcamento
│   │   │   │   ├── MainActivity.java      # Lógica da tela de cálculo.
│   │   │   │   ├── LoginActivity.java     # Lógica do Login.
│   │   │   │   └── CadastroActivity.java  # Lógica do Cadastro.
│   │   │   ├── res
│   │   │   │   ├── layout
│   │   │   │   │   ├── activity_main.xml   # Layout do cálculo de orçamento.
│   │   │   │   │   ├── activity_login.xml    # Layout do Login.
│   │   │   │   │   └── activity_cadastro.xml # Layout do Cadastro.
│   │   │   │   └── drawable                # Seus ícones e a imagem do splash.
│   │   └── ...
└── README.md
```
🎨 Telas do Aplicativo: "The Showcase"
A interface do usuário é um exemplo de que menos é mais (e que o tempo do desenvolvedor é precioso). Um gradient azul suave e botões pretos robustos. Simples, direto e funcional.

1. Tela de Splash (O "Loading" Épico)
É o momento em que o aplicativo carrega, a promessa de organização financeira. Um icon bacana para não dizer que não tem arte.

Figura 1: Tela de Splash (/imgs/c1.png).

2. Tela Inicial (A Escolha de Morpheus)
Escolha a pílula azul (Cadastro) ou a pílula preta (Login). Você não pode ter os dois... ainda.

Figura 2: Tela Inicial de Navegação (/imgs/c2.png).

3. Tela de Login (Entre se Tiver a Senha Secreta)
Aqui, a única password que importa é a sua.

Figura 3: Tela de Login (/imgs/c3.png).

4. Tela de Cadastro (Seu Novo User Criado)
A chance de começar do zero e, desta vez, não usar "123456" como senha.

Figura 4: Tela de Cadastro (/imgs/c4.png).

5. Tela de Cálculo de Orçamento (O Campo de Batalha)
Onde você insere a Receita Total (seu loot) e a Despesa Total (o custo para manter o guild). O resultado? Seu saldo. A verdade nua e crua.

Figura 5: Tela de Cálculo de Orçamento (/imgs/c5.png).

👨‍💻 Desenvolvedor 
Arthur - https://github.com/arthurZ-33 - GitHub
