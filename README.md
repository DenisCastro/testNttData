#Teste pratico NTT DATA

Engenheiro de Qualidade de Software - Teste Prático



Ao clonar o projeto, para conseguir configurar as dependências seguir os passos:

1) Esperar a IDE junto com o maven fazer o download e configuração das dependências do projeto

2) Realizar download do java 1.8 caso não possua instalado ou caso já instalado apontar para o caminho de instalação.

Para execução do Teste Prático 1:

1) Executar um @Test deixado de exemplo na classe RecargaTelefone

2) Dentro da package "test" está presente a classe "RecargaTelefoneTest" onde estão os testes unitários referente ao teste pratico 1 onde podem ser executados todos os testes juntos, iniciando a execução da classe toda, ou cada teste separadamente também. Obs.: Afim de simular uma falha não tratada na recarga de telefone, está presente um comentário "TODO" descrevendo como simular esta falha não tratada



Para execução do Teste Prático 2:


1) Em resources > testePratico2, estão os arquivos "Environment Teste Pratico 2.postman_environment" e "testNttData.postman_collection" devem ser importados no Postman para execução, realizando primeiro o import do "Environment Teste Pratico 2.postman_environment" e realizar a habilitação do environments, em seguida, em Collections, realizar o import do "testNttData.postman_collection", assim já estará tudo pronto para execução da request "Teste Pratico 2", que tem os testes configurados como solicitado. Obs.: caso desejar realizar a troca do cep utilizado, o valor é configurado na variável "cep" presente nos environments


Para execução do Teste Prático 3:

1) Ao abrir o arquivo "testePratico3.feature" presente em test.resources.testePratico3.features para melhor leitura aconselha-se a instalação do plugin "Gherkin"

2) Instalar o plugin "cucumber for java" para associação dos BDDs escrito em "Gherkin" com os métodos escritos em java

3) Dentro do pacote test.java.testePratico3.runner existe uma classe executora dos testes escritos em Gherkin, nela estão presentes duas linhas contando "tags", uma comentada, que serve para executar os casos de teste de acordo com as tags, presentes sobre cada caso de teste (as tags podem ser únicas ou não), já a "tag" que não está comentada, contendo a tag "TestePratico3", ela vai executar todos os quatro casos de testes referente ao teste prático 3

4) Ao executar a classe runner, devem ser executados todos os casos de testes referente ao teste pratico 3, porém, os três primeiros casos, dependem da conexão com o banco de dados que estava configurado apenas na minha máquina local (infelizmente não tive tempo hábil para realizar a criação automática do banco de dados e do registro necessário para este teste ficar 100% independente). Já o quarto caso de teste, este sim, não precisa da conexão com o banco, então ele deve executar com sucesso, uma unica observação é referente a versão do Chrome presente na máquina que for tentar executar o projeto, é sugerido que o Chrome esteja na versão mais próxima a 100.0.4896.127 para conseguir executar a automatização, porém, caso seja outra a versão, deve-se buscar no endereço: https://chromedriver.chromium.org/downloads a versão do navegador atual, baixar o zip referente a win32, e substituir esta nova versão do chromedrive no endereço "src.test.resources.drivers" no projeto