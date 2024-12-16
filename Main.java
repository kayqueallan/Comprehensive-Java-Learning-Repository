!! REVER ASSOCIACOES

!! rever toString

!! rever TRY Try With Resouurces

!! Calendar e Date -> Vistas breviamente 

!! AULA 128 REVER QUANDO PUDER

O QUE E PROGRAMAÇÃO ORIENTADA A OBJETOS (POO)?


Objetivo: Aproximar o mundo digital do mundo real. 

Como funciona o java: 

Em "C" quando voce faz o codigo e compila, o codigo executavel so serve para seu respectivo sistema operacional, ou seja se eu compilar um codigo em "C" em Mac ele ira funcionar somente no sistema operacional Mac, esse executavel nao ira funcionar no windows por exemplo. O "C" ele e multiplataforma.

Ja no "Java" se eu pegar o codigo fonte no java ele nao ira funcionar se mandar direto para o computador assim como o "C", o codigo fonte e passado para um compilador java(javaC) e e gerado um codigo, que nao e chamado de codigo executavel e sim de Bytecode, se pegar esse bytecode e mandar para um computador ele nao vai entender e necessario pegar o bytecode e passar para mais um software intermediario o java virtual machine(jvm), ele interpreta esse codigo e passa para maquina que e o computador para sim entender. a diferenca e que ex: esse bytecode foi compilado por uma maquina windows, que gerou um bytecode e se enviarmos para diferentes JVM de diferentes sistemas operacionais, como por exemplo mandar para linux e mac a JVM vai se comunicar com a maquina e vai ser compreendido, ou seja voce pode pegar qualquer codigo em java e enviar para qualquer plataforma que gera um bytecode, e esse bytecode e mandar para diferentes JVM que vai funcionar em varios sistemas operacionas. E isso tem um nome chamado de: 

WORA : WRITE ONCE RUN ANYWHERE // ESCREVA UMA VEZ E EXECUTE EM QUALQUER LUGAR 

EXISTEM DOIS TIPOS DE PUBLICOS EM JAVA 

O QUE QUER SOMENTE USAR: E chamado de JRE  - java runtime environment ou ambiente de execucao java

o que e jre: e composto pela jvm e bibliotecas, as bibliotecas sao as APIS 

A jvm tem o Loader e verificador: parte interna da jvm que vai carregar o bytecode na memorial virtual da maquina e o verificador verifica se o codigo pode ser executado sem problema algum
Avicultura AnaClei LTDA, Av. Cantagalo, 134 - Novo Riacho, Contagem - MG, 32280-500Avicultura AnaClei LTDA, Av. Cantagalo, 134 - Novo Riacho, Contagem - MG, 32280-500
tem tambem o interpretador e gerenciador de memoria: o interpretador e aquele que pega o codigo em bytecode e transforma diretamente para o codigo nativo da maquina, o gerenciador de memoria vai gerenciar como as variaveis e funcoes vai se adaptar na memoria da JVM , JVM e como uma maquina virtual ou seja ela possui memoria 

tem tambem um compilador JIT: surgiu para dar um ganho de performace


O QUE DESENVOLVER PARA JAVA E CHAMADO: JDK - jAVA DEVELOPMENT KIT ou KIT DE DESENVOLVIMENTO JAVA

dentro do JDK ja possui toda JRE que descrevi acima e com as bibliotecas vem com a linguagem java chamada de JavaLang e um conjunto de ferramentas chamada de JavaTools que vem com o JavaC, o Debugger, e APIs de desenvolvimento.






// PRIMEIRO PROGRAMA: 


PACKAGE - PACOTE

public class PrimeiroPrograma{
    public static void main(String[] args){
        //METODO PRINCIPAL QUE ESTA DENTRO DA CLASSA DO PRIMEIRO PROGRAMA 
    }
}


--> PARA PRINTAR NA TELA UTILIZAMOS O COMANDO: 

-> System.out.print

Se colocarmos o comando "sout" e apertar tab teremos System.out.print                              
 

--> PUBLIC STATIC VOID MAIN:

se colocarmos o comando "psvm" e apertar tab teremos o comando public static void main(String[] args)


--> diferenca entre: 

-> System.out.print -> desse jeito nao ha quebra de linha 

-> System.out.println  -> se escrevermos desse jeito ele pula uma linha para baixo 


PORQUE TEMOS QUE COLOCAR EM ALGUNS COMANDOS EM LETRA MAIUSCULA : 

a tecnica e chamada de CamelCase: 

sempre quando tivermos a primeira letra sendo caixa alta: 

MinhaClasse -> Sempre quando vermos isso podemos ter certeza que sera uma classe ou interface 

agora se a primeira letra for minuscula e as outras forem em maiuscula sera ou uma "Atributo", "Metodo" ou "Variavel";

se tivermos algo escrito somente em letra minuscula isso sera o nome do package / pacote;

ex: 

MinhaHouse -> Uma classe 

alunoSesi -> Atributo, metodo ou variavel.

ex 2: 

public class PrimeiroPrograma -> isso e uma classe






//COMPILACAO MANUALMENTE


--> PODEMOS ESCREVER O codigO em qualquer lugar ate notpad

depois que escrevermos o codigo salvamos o arquivo com nome da classe exemplo:

public class OlaDevDojo{
    precisamos slavar o nome do arquivo como o nome da classe e depois colocamos .java

    ex: OlaDevDojo.java
}

-> Agora precisamos gerar o bytecode, na propria pasta podemos abrir o terminal e utilizar o comando: 

javac NomeDoArquivo.java

ex: javac OlaDev.java;

ira ser executado e ira criar uma pagina chamada .class que sera o bytecode, que ira gerar um codigo de baixo nivel para passarmos isso para jvm colocamos novamento no console um comando para ser executado:

ex: java OlaDev   --> importante: utilizamos sem a extensao .class

e com isso ira compilar e mostrar o resuldado


agora caso queiramos fazer alguma alteracao precisamos fazer essa etapa, nao podemos simplesmente mudar qualquer coisa no bloco de notas na hora de executar nao vai ser atualizado pois estamos atualizando o arquivo.java e nao o bytecode.

Toda ver que alterarmos teremos que utilizar: 

ex: javac NomeDoArquivo.java

E DEPOIS COMPILARMOS NOVAMENTE COM: 

java NomeDoArquivo






// ORGANIZANDO OP CODIGO EM PACOTESS


PODEMOS ARMAZENAR CLASSES DENTRO DE PACOTES E NECESSARIAMENTE A PRIMEIRA LINHA DE CODIGO DEVE ESTAR O NOME DO PACOTE

EX: 

package aprendendo.java;

public class DevDojo{
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}

POO{
    foi criada para mapear o mundo real para o mundo computacional, parte de principio que as coisas podem ser agrupadas.

    a diferencia entre as variaveis primitivas para variaveis de referencia do tipo objeto

    ex: 

    String nome --> Kayque
    int idade --> 18
    char sexo --> 'M'

    --> agrupamos tudo isso dentro de uma objeto por exemplo "pessoa" onde esses dados estao sendo guardados dentro de um objeto, um espaco em memoria;

    o que é uma classe? 
        - classe e o que nos temos em java para representar o mundo real com funcionalidades em comum, ex: classe carro -> que tem dados do tipo, marca, modelo, ano de fabricação etc...
        //Agrupamento de coisas reais que dao origem a objetos


    ex: 

    Classe pessoa 
        vai ter atributos do tipo: 
            nome;
            idade;
            sexo;
        --> esses atributos vao dar origem aos objetos 

    Classes de dominio nao possui o metodo main, classe e um templete que vai dar origem a objetos;


    ex: para se criar uma classe

        public class Pessoa{
            public String nome;
            public int idade;
            public char sexo;
        }


        import dominio.Estudante;

public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        --> isso e o que estamos criando uma instancias no metodo main para nos "referenciar para a classe Pessoa"

        -- > para criar objetos sempre utilizamos a palavra new e em seguida o nome de uma variavel de referencia para acessar esse objeto

        //Variavel de referencia do tipo estudante e temos um objeto do tipo Estudante,

        /**
         * EXPLICACÃO:
         * TEMOS UMA VARIAVEL Estudante que esta fazendo uma referencia para um objeto do tipo Estudante;
         *  vamos supor que iremos querer introduzir valores aos atributos que estao no objeto estudante
         *
         *  ex:
         *  estudante.nome;
         *
         * --> ai iremos acessar o espaco em memoria de nome e podemos adicionar valores ou modificar;
         *
         */
    }
}

--> package dominio; pacote onde esta alocada essa classe;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    --> Isso aqui e nossa classe com atributos: nome, idade, sexo;

}

public class Main{
    public static void main(String[] args){
        Estudante estudante = new Estudante();

        estudante.nome; 

        --> aqui acessamos o espaco em memoria da variavel por tipo de referencia 
    }
}

ATENÇÃO 
    --> 
        Estudante estudante --> e uma variavel de referencia ;
        = new Estudante --> e um objeto do tipo estudante ;

        e atraves do nome variavel de referencia fazemos referencia a um objeto e conseguimos acessar as variaveis dentro de uma classe;

                Estudante estudante = new Estudante();
                --> aqui se cria um objeto da classe estudante;


        A variável de referência é usada para armazenar a referência (ou endereço de memória) de um objeto criado a partir de uma classe. 
}



EXEMPLO PARA ENTEDER BEM:

public class Carro {
    public String marca;
    public String modelo;
    public int ano;
}

public class Main {
    public static void main(String[] args) {
        // Criando três objetos da classe Carro
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        // Atribuindo valores aos atributos de cada objeto
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2021;

        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2022;

        carro3.marca = "Ford";
        carro3.modelo = "Focus";
        carro3.ano = 2020;

    }
}






//TIPOS PRIMITIVOS 


    int, double, float, char, byte, short, long, boolean 

    --> SINTAXE JAVA 

    para criar uma variavel colocamos o tipo dela e depois o nome sendo letra minuscula a primeira letra em minuscula 

    ex: 

    int idadeDoPai; 

    idadeDePai = 10;

    System.out.println(idadeDePai); --> Isso mostra o resulado 10 no console

    texto mais variavel;

    --> System.out.println("A idade e: " + idadeDePai); --> isso mostra o texto mais a valor da variavel;

    1 byte = 8 bits 

    tamanhos das variaveis: 

    --> byte = 1 byte -128 a 127
    --> short = 2 bytes vai ate 32.000 mil

    int e long -> numeros inteiros
    double e float -> numeros decimais 
    boolean -> retorna valores false ou true;






CASTING 


double idade = 10.0;
float idade2 = 12.0F;

--> ocorrre um erro pois o compilador nao consegue indentificar o tamanho de espaco ocupado na memoria entao quando for declarar uma variavel float com depois um ponto ao final devemos colocar um 'F';

ex: 

float idade2 = 12.0F;


o CASTING e voce forcar um variavel a entrar na outra exemplo: 

long salarioNeymar = 100000000L;

int salarioCris = (int) 1000000000L;

ou seja eu forço esse numero a entrar na outra variavel cabendo ou nao e pode ser que o compilador corte alguns bits fazendo com que crie numeros estranhos, mais se realmente o tamanho couber o compilador vai aceitar e vai aparecer o numero normalmente.






//STRINGS 


COMECA COM LETRA MAIUSCULA PORQUE ELA PRECISA DE UM IDENTIFICADOR, e se inicia de aspas duplas;

ex: 

String nome = "Kayque Allan";






OPERADORES


//ELEMENTOS QUE PERMITEM FAZER OPERACOES 

    ARITIMETICOS:

    SOMA  = +;
    MENOS = -;
    DIVISAO = /;
    MULTIPLICACAO = *; 


OPREDORES RELACIONAIS 

    resto = % ; 

    a porcetagem utilizamos para saber o resto da operacao

    ex: 

    int resto =  20 % 2;

    isso resultara que o resto de operacao e 0;





OPERADORES BOOLEANOS


     <, > , <=, >=, !=, ==

    retorna valores boleanos, verdadeiros ou falso

    ex: 

    boolean isDezMaiorQueVinte = 10 > 20;  
    // --> para declarar uma variavel boolean e comum utilizar o is como a primeira palavra;

    System.out.println(isDezMaiorQueVinte);

    --> isso ira retornar false;






OPERADORES LOGICOS


    && (AND); --> IGUAL A C
    || (OUR); --> MESMO QUE C TAMBEM






ESTRUTURAS CONDICIONAIS


    if = se;

    ex: 

    int idade = 15;
    boolean isAutorizadoBeber = idade >= 18;

    if(isAutorizadoBeber){
        System.out.println("Autorizado a beber");
    }

    if(!isAutorizadoBeber){
        System.out.println("Não autorizado a beber!");

        // podemos utilizar exclamacao para negar e ficar tipo um else
    }


    else = senão

    ex:

    if(isAutorizadoBeber){
        System.out.println("Autorizado a beber");
    }

    else{
        System.out.println("Não autorizado a beber!");

        // podemos utilizar exclamacao para negar e ficar tipo um else
    }


SWITCH                                        

    // podemos colocar variaveis do tipo: 
    --> char, int, byte, short, enum, String.






ARRAYS (VETORES)


    --> para declarar um array em java precisar referenciar objeto em memoria e declarar o tamanho dos espacos:

    int[] idades = new int[3];


    a inicializao se nao conter nenhum valor dentro  e de :

    //byte, short, int , long, float e double = 0
    //char '\n0000' = ' '
    //boolean = false
    //String = null


    --> isso quer dizer que os espacos em memoria nao esta sendo utilizados para nada


    ex:     
        public class Main {
            public static void main(String[] args) {
                String[] nomes = new String[3];

                    nomes[0] = "kayque";
                    nomes[1] = "Liliane";
                    nomes[2] = "Lyvia";

        for (int i = 0; i <= 2; i++) {
            System.out.println(nomes[i]);
        }

        --> vamos que supor que nesse codigo adicionamos mais um espaco no array ou seja colocar de tamanho 4, teriamos que trocar toda estrutura do for, para isso existe uma propriedade que diz seu tamanho chamada de length ou seja podemos fazer assim.

            for (int i = 0; i <= nomes.length; i++) {
                System.out.println(nomes[i]);
            }
        }
    }
 

    formas de declarar os arrays:

    int[] num1 = new int[3]; 
    int[] num2 = {1,2,3,4,5}; --> array de 5 posicoes ;
    int[] num3 = new int[]{1,2,3,4}; --> array de 4 posicoes;


//ARRAYS MULTIDIMENSIONAIS  // MATRIZES 

    declaracao: 

    int[][] matriz = new int[3][3]; 






METODOS


    SemRetorno --> 

    --> Metodos sao parecidos com atributos, voce precisa de um IDENTIFICADOR de acesso que e o public e depois o metodo de retorno.

    void = sem retorno --> ou seja nao retorna nada.

    ex: 
            public void calculadoraTeste(){
                System.out.println(10 + 10);
            }


            para executar metodo precisamos primeramente criar a variavel de referencia do obj

            depois...:

            variavelDeReferencia.nomeDoMetodo();

            ex: calculadora.somaDeDoisNumeros();


Parametros --> Sao variaveis locais que vao estar viva durante o contexto, ou seja, dentro do metodo

Sintaxe --> e colocado o identificador e depois o nome de referencia da variavel 

            public void multiplicaDoisNumeros(int num1, int num2){
                System.out.println(num1 * num2);
            }


            na classe onde se executa (que tem a psvm) --> e declarado o objeto da classe e tambem e colocado a declaracao do metodo;

            multiplicaDoisNumeros multiplica = new multiplicaDoisNumeros();

            depois declaramos o metodo;

            multiplica.multiplicaDoisNumeros(num1, num2);

            dentro do metodo e chamado de parametro depois que voce declara e vai colocar "parametros dentro do metodo" nao e chamado mais de parametros e sim de argumento;



--> Com retorno;

            public double --> pode ser usado com variaveis primitivas (um tipo apos o public)
            e e obrigatorio utilizar return;

            ex: 

            public double divisaoDeDoisNumeros(double num1, double num2){
                return 0;  --> retorno desse metodo e zero;
            }

            public double divisaoDeDoisNumeros(double num1, double num2){
                return num1/num2;  --> retorno desse metodo a divisao de dois numeros que ira dar um retorno do tipo double;
            }

            como mostrar o resultado?

            Teste calcular = new Teste();

            double resultado = calcular.divisaoDeDoisNumeros(10,5);  --> atribuindo dois numeros a uma variavel do tipo double;

            --> System.out.println(resultado);

            out

            --> System.out.println(calcular.divisaoDeDoisNumeros);


            ex: na hora de atribuir esse metodo a uma variavel que seja de outro tipo vamos supor o metodo seja double e a variavel seja do tipo int teremos que fazer um casting ou seja forcar uma variavel double a "entrar" em uma do tipo inteirom (caber);

            int resultado = (int) calculadoraTeste(10,20);


            public int divisaoDeDoisNumeros(double num1, double num2){
                return (int) (num1/num2);  
            }


            --> passamos parametros do tipo double e temos um metodo do tipo inteiro, queremos que retorne um valor inteiro entao fazemos um casting para forcar a variavel double a entrar na inteira.



            FORMAS DIFERENTES DE SE UTILIZAR OS METODOS COM RETORNO OU SEM PARA O MESMO RESULTADO


            public int divisaoDeDoisNumeros(double num1, double num2){
                if(num2 != 0 ){
                    return num1/num2;
                }

                return 0;     --> esse return 0 e como se fosse um else 
            
            }


            COMO UTILIZAR O RETURN EM UM METODO VOID 

            public void divisaoDeDoisNumeros(double num1, double num2){
                if(num2 == 0){
                    System.out.println("Nao existe divisao por zero");


                    --> mesmo se essa afirmacao ser verdadeira o compilador nao ira para de executar aqui ele vai continuar e exibir o print de baixo, entao voce pensa que pode executar um break, mas nao porque ai nao tem laco de repeticao entao utilizamos o return;


                }
                System.out.println(num1/num2);
            }


            --> como se faz:


            public void divisaoDeDoisNumeros(double num1, double num2){
                if(num2 == 0){
                    System.out.println("Nao existe divisao por zero");
                    return;
                }
                System.out.println(num1/num2);
            }


            --> esse return e como se fosse um break, tem a mesma funcionalidade(poderimos utilizar um else, mas podemos melhorar o codigo deixando mais fino o codigo);


COMO AS VARIAVEIS PRIMITIVAS SE COMPORTAM EM UM METODO 

        --> quando passamos uma variavel primitiva para um metodo e alteramos o valor dela dentro do metodo, a variavel original nao sera alterada, porque estamos passando uma copia da variavel e nao a referencia dela;

    public class Main {
    public static void main(String[] args) {
        Teste numeros = new Teste();

        int num1 = 1;
        int num2 = 2;

        System.out.println("Dentro dos parametros:");
        numeros.multiplicarNumeros(num1, num2);

        System.out.println("Variavel fora do parametro: ");
        System.out.println("Num1: " +num1);
        System.out.println("Num2: " +num2);
    }
}

--> CLASSE ONDE AS VARIAVEIS ESTAO DENTRO DOS METODOS:

package dominio;

public class Teste {
    public void multiplicarNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;

        System.out.println(num1);
        System.out.println(num2);
    }
}


--> Quando passamos valores primitivos para um metodo nos nao estamos passando a referencia do obj em memoria estamos passando uma copia, tudo que faz com as variaveis e valores fica alocados somente no metodo, porque alteramos somente na "copia"; 

--> nao importa o que esta acontecendo dentro do metodo a variavel original nunca sera alterada!!






PASSAGEM DE PARAMETRO DO TIPO REFERENCIA


    --> podemos passar a variavel de referencia de um objeto para um metodo e assim utilizar esse parametro do tipo referencia;

    ex: 

    -> classe de execucao

    import dominio.Estudante;

    public class Main {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        System.out.println(aluno.nome = "Kayque");
        System.out.println(aluno.idade = 19);
        System.out.println(aluno.sexo = 'M');

        System.out.println("-------------------------------");

        aluno.imprimir(aluno);
        
        --> fizemos aqui a impressao de dois modos
    }
}


    -> classe Estudante

        package dominio;

        public class Estudante {
            public String nome;
            public int idade;
            public char sexo;

            --> podemos criar outra classe ou fazer aqui mesmo

        public void imprimir(Estudante estudante) {
            System.out.println(estudante.nome);
            System.out.println(estudante.idade);
            System.out.println(estudante.sexo);
    }

}

O QUE ACONTECEU AQUI
    Estamos passando para o metodo uma referencia de um objeto, onde la esta alocado as informacoes, dentro do metodo passamos o objeto e a variavel de referencia, e na classe principal passamos o atributo que e a variavel de referencia do objeto da classe Estudante.

    ou seja no momento de execucao do codigo temos duas variaveis de referencia fazendo referencia para o mesmo objeto. 






THIS 


    -> Qundo temos um metodo dentro de uma classe podemos nos referenciar ele utilizando o THIS

    public class Estudante{
        String nome;
        char sexo;
        int idade;

        public void imprimirEstudantes(){
            System.out.println(this.nome);
            System.out.println(this.idade);
            System.out.println(this.sexo);
        }
    }

    porque disso? pois estamos o metodo dentro da classe






METODOS COM ARRAY


    ex: 
    import dominio.Array;

    public class Main {
    public static void main(String[] args) {
        Array vetores = new Array();

        int[] array = {1,2,3,4,5};

        vetores.somaArray(array);

    }
}


    package dominio;

    public class Array {
        public void somaArray(int[] array){
         int soma = 0;
            for(int i = 0; i < array.length; i++){
            soma += array[i];
             }
    }
}







MODIFICADORES DE ACESSO  


    -->  variaveis de refencia de objeto nao consegue acessar atributos privados por isso utilizamos metodos como set & get;

    acoplamento e quao a classe esta conectada a outra do mundo real, ou seja colocamos para voce adicionar sua idade caso coloque uma idade negativa, isso nao corresponde ao mundo real... por isso podemos bloquear isso, pois isso pode afetar nossas classes, entao podemos utilizar modificadores de acesso privado.

    private --> Esses atributos so vao poder ser acessados pelo objeto; se eu tentar acessar esse atributo em outra classe eu nao consigo utilizando o modificador de acesso privado dando erro;

    ex:

    package dominio;

    public class Pessoa {   
        private String nome;
        private int idade;

        public void imprimirResultado(){
            System.out.println(this.nome);
            System.out.println(this.idade);
    }
}

--> quando criamos atributos privados precisamos criar um metodo publico, porque quando queremos que alguem atribua algo esse atributo necessitamos de um metodo publico;

ex: 
    package dominio;

    public class Pessoa {   
        private String nome;
        private int idade;

        public void imprimirResultado(){
            System.out.println(this.nome);
            System.out.println(this.idade);
    }        
    
    -->  REGRA: QUANDO CRIAMOS UM METODO PARA COLOCAR UM VALOR DENTRO DE UM ATRIBUTO PRECISAMOS ADICIONAR A PALAVRA SET + REFERENCIA DA VARIAVEL

    public void setNome(String nome){
        //(String nome) -> estamos dizendo que vamos setar e o que queremos colocar entre o nome por isso string;
        !! QUANDO UTILIZAMOS COMO PARAMETRO O MESMO NOME DE QUANTO TEMOS DENTRO DO METODO UTILIZAMOS O THIS PARA DIFERENCIAR 
         this.nome = nome;
    }
}


import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa humano = new Pessoa();
            humano.setNome("Kayque");
    }
}


--> estamos modificando um atributo privado; como isso e um metodo estamos passando um atributo para ser alocado em this.nome e ser modificado;  ou seja la na classe pessoa criamos um metodo onde o parametro e uma String nome; por isso utilizamos o this.nome --> porque isso se referencia ao atributo da classe; e se this.nome = nome ("kayque"); resultado em private String nome = "kayque";






GET


--> como conseguir pegar o que esta alocado em memoria temos que criar um metodo onde return ; porque estamos querendo pegar o nome que digitamos ou seja tem que retornar algo e no caso e string; e depois colocamos get+nome variavel; e precisa de parametro? nao pois queremos pegar o valor que esta em memoria;

public String getNome(){
    return this.nome;
}

e agora no main podemos imprimir, porque nao utilizamos void? porque nao conseguimos imprimir um metodo sendo ele void pois o que ele retorna e vazio, ja com return podemos utilizar dentro de um sout; e tambem porque queremos que se retorne algum valor;

import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Kayque");
        pessoa.setIdade(-2);

        System.out.println(pessoa.getNome()); --> Kayque
    }
}






SOBRECARGA DE METODOS 


import dominio.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.init("Kayque", 19, 'M');
        pessoa.imprimir();
    }
}

--> CLASSE PESSOA 

package dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public void init(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    -> aqui seria o set de cada atributo podemos colocar isso em somente um metodo fazendo com que diminua o codigo e fique muito mais organizado;

    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public char getSexo() {
        return this.sexo;
    }


    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
    }
}






CONSTRUTORES


    -> em todos os metodos temos parenteses; no caso do objeto criado temos o que e chamado de contrutor:
            --> Pessoa pessoa = new Pessoa(- construtor -);
    
    o contrutor nao temos nenhum tipo de retorno para se criar temos um modificador de acesso + nome da classe + parenteses e chaves;


    ex: public class Pessoa {

    public Pessoa(){
        ISSO E UM CONSTRUTOR 
    } 

    -->  O java tem uma regra mesmo que nao colocamos um construtor na hora da compilacao e colocado um automaticamente; porque precisamos desse contrutor para se criar um objeto;


    os contrutores te força  a seguir algumas regras, como por exemplos para nos cadrastramos uma novo usuario necessitamos obrigatoriamente de um nome, idade e sexo


    public class Pessoa {

    public String nome;
    public int idade;
    public char sexo;

    public Pessoa(String nome, int idade, char sexo){
        System.out.println(nome + idade + sexo);
     }
}


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kayque", 19, 'M');
    }
}


--> o contrutor e executado antes mesmo de qualquer metodo, ou seja acaba que vira uma obrigacao;


em contrutores podemos trabalhar tambem com sobrecarga, ou seja podemos criar mais de um contrutor seguindo os padroes de ter um modificador de acesso + Nome da classe + () + {} ; podemos deixar isso em branco e fazer um novo contrutor assim como abaixo;


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kayque", 19, 'M');
        Pessoa pessoa2 = new Pessoa("Lyvia", 11, 'F');
    }
}

public class Pessoa {

    public String nome;
    public int idade;
    public char sexo;

     

     public Pessoa(){
        //CONSTRUTOR pessoa2 
        //Lyvia11F 
     }
}


--> SOBRECARGA DE CONTRUTORES  

vamos supor que temos agora que introduzir um novo atributo que seja "estudio", se apenas adicionarmos pode ser que quebramos o codigo inteiro, e tambem dar muito mais trabalho para alterar, o que podemos fazer e sobrecarga;

em metodos podemos utilizar o this.nomeDoMetodo, para chamar quando estiver dentro da mesma classe; ja em contrutores colocamos this();


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kayque",12,"Visual Studio");
        --> isso faz refenrencia o objeto passando dentro dos parenteses o conteudo para o construtor
    }
}

public class Pessoa {
    public String nome;
    public int episodio;
    public String estudio;

    public Pessoa(String nome, int episodio, String estudio) {
        --> quando executamos essa primeira linha sera executada e ira chamar o contrutor debaixo; obrigatoriamente a referencia para outro contrutor deve se conter na primeira linha; ou seja o this(); deve estar na primeira linha;
        System.out.println(nome + episodio + estudio);
    }

    public Pessoa(){
        --> o constutor de cima ira chamar essa linha e executar e depois ira voltar e executar o resto
        System.out.println("Hello World");
    }
}


PODEMOS TER MAIS DE DOIS CONTRUTORES 


        public class Main {
            public static void main(String[] args) {
                Pessoa pessoa = new Pessoa("Kayque",12,"Visual Studio", "Masculino");
            }
        }


        o que acontece e o seguinte quando executarmos o codigo o objeto Pessoa("Kayque",12,"Visual Studio", "Masculino");

        a primeira linha que ira ser executada e onde possui o numero um com isso quando essa primira linha for executada logo ira levar ao dois porque ela faz uma referencia; this(nome, episodio, estudio); que ira levar para o numero 2; this(); que quando ser executada vai levar ao terceiro contrutor que ira imprimir hello world e depois ira imprimir em linha normalmente como mostra abaixo, isso serve para quando queremos ter uma sobregarga, vamos supor que temos 4 atributos ja defenidos e agora vamos passar a ter 5, se modificarmos diretamente no contrutor principal pode ser que de quebra entre as classes, com isso podemos criar um outro contrutor que ira adicionar a informacoesm sem interfirir.

        ou seja podemos chamar outros contrutores com a palavra this, porem temos duas regras, se formos chamar outro construtor o this precisa ser a primeira linha executavel; e o this(); desse modo dentro de um metodo nao funciona somente em um construtor


        public class Pessoa {
            public String nome;
            public int episodio;
            public String estudio;
            public String genero;

            public Pessoa(String nome, int episodio, String estudio) {
        2 -     this();
        4       System.out.println(nome + episodio + estudio);
            }

            public Pessoa(String nome, int episodio, String estudio, String genero) {
        1 -     this(nome, episodio, estudio);
        5       

            public Pessoa(){
        3-      System.out.println("Hello World");
            }
        }






MODIFICADORES ESTATICOS 


    public class CarroTeste01 {
        public static void main(String[] args) {
            Carro c1 = new Carro("BMW", 280);
            Carro c2 = new Carro("Mercedes", 275);
            Carro c3 = new Carro("Passat", 290);

            c1.imprime();
            c2.imprime();
            c3.imprime();
        }
    }

    public class Carro {
        private String nome;
        private double velocidadeMaxima;
        private double velocidadeLimite = 250;

        public Carro(String nome, double velocidadeMaxima) {
            this.nome = nome;
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public void imprime(){
            System.out.println("--------------------------------");
            System.out.println("Nome: " + this.nome);
            System.out.println("Velociade Maxima: " + this.velocidadeMaxima);
            System.out.println("Velociade Limite: " + this.velocidadeLimite );
        }

        public String getNome() {
            return nome;
        }

     public void setNome(String nome) {
            this.nome = nome;
        }

        public double getVelocidadeMaxima() {
            return velocidadeMaxima;
        }

        public void setVelocidadeMaxima(double velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public double getVelocidadeLimite() {
            return velocidadeLimite;
        }

        public void setVelocidadeLimite(double velocidadeLimite) {
            this.velocidadeLimite = velocidadeLimite;
        }
    }



    --> explicacao: criamos uma classe carro onde possui atributos como nome, velocidade maxima, e velocidade limite de trafego em rua, pois na alemanha a partir de uma categoria de carros tem que ter um limitador de sua velociade mesmo que ela seja maior, ou seja o carro pode chegar a 300 km/h , mas existe um limitador que deixa ele chegar a somente 250;


    --> acima cada objeto e independente ou seja podemos colocar c1.getVelocidadeMaxima(300); e somente no objeto c1 sera modificado a velocidadeMaxima, isso fica meio ruim pois e uma regra os carros obdecerem; e os outros irao permanecer 250;

    --> o que queremos fazer e uma propriedade que seja idenpendente do objeto, afete a classe carro em si, o que precisamos e criar um modificador estatico;

    ex: private double static velocidadeMaxima = 250;

    o modificador estatico agora pertence a classe carro em si e nao a instancia da classe carro, ou seja basicamente isso "deixa de ficar dentro da classe carro = ser um atributo comum", comeca a ficar fora como um todo juntamente com a classe, comeca a passar ser uma instancia juntamente com a classe carro; nao pertence mais ao objeto e sim a classe em si;

    agora se colocarmos: 

    c1.setVelocidadeMaxima(180);

    --> todos os serao modificados ou seja : c1, c2, c3 e modificado e todos os outros objetos que criarmos a partir daqui irao ser afetados passando a ser 180




    --> e a partir de agora fica muito "feio" utilizamos c1.velocidadeMaxima(180); porque para quem le parecemos que estamos modificando o seu espaco em memoria que c1 esta fazendo referencia; mas na verdade nao estamos fazendo alterecao em c1 e sim a todas as instancias de classe carro pois e um modificador static que pertence a classe carro, e nao mais a uma instancia em particular de um objeto; temos que acessar atraves da propria classe;


    public class Carro {
        private String nome;
        private double velocidadeMaxima;
        public static double velocidadeLimite = 250;

        public Carro(String nome, double velocidadeMaxima) {
            this.nome = nome;
            this.velocidadeMaxima = velocidadeMaxima;
        }

        public void imprime(){
            System.out.println("--------------------------------");
            System.out.println("Nome: " + this.nome);
            System.out.println("Velociade Maxima: " + this.velocidadeMaxima);
            System.out.println("Velociade Limite: " + this.velocidadeLimite );
        }


        --> quando utilizamos this.velocidadeLimite, estamos falando que this se refere a instancia daquele objeto; fica um pouco incoerente dessa forma, nao e aconselhavel

        certo: System.out.println("Velociade Limite: " + Carro.velocidadeLimite );

        alteracao do atributo estatico: 

    public class CarroTeste01 {
        public static void main(String[] args) {
            Carro c1 = new Carro("BMW", 280);
            Carro c2 = new Carro("Mercedes", 275);
            Carro c3 = new Carro("Passat", 290);

            --> Carro.velocidadeLimite = 180;

            c1.imprime();
            c2.imprime();
            c3.imprime();
        }
    }


    --> nao estamos acessando mais atraves de uma variavel de referencia, agora fica claro que a modificao que estamos fazendo esta afetando toda a classe;

    METODOS STATICOS RESUMO: faz com que o atributo agora pertenca a classe e todos os objetos agora partilham o mesmo valor;





MODIFICADORES STATICOS  METODOS

    Métodos static em programação são utilizados para criar métodos que pertencem à classe e não a instâncias específicas da classe. Isso significa que você pode chamar esses métodos sem criar um objeto da classe. Eles são úteis quando você deseja que a funcionalidade seja compartilhada entre todas as instâncias da classe ou quando a lógica não depende do estado de um objeto específico.

    -> como podemos utilizar com metodos getters and setters

    comecamos com metodo de acesso + static + metodo + nome + () + {};

    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    and 

    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;  ou simplismente velocidadeLimite (Pois nao estamos utlizando o mesmo nome como atributo do metodo)
    }

    agora podemos colocar um metodo static sendo ele private;

    -> Set: Carro.setVelocidadeLimite;

    -> Get: System.out.println(Carro.getVelocidadeLimite());



    QUANDO DEVEMOS UTILIZAR OS METODOS ESTATICOS: quando nao tiver acessando atributos da instancia;


    public void imprime(){
        System.out.println("--------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velociade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velociade Limite: " + this.velocidadeLimite );
    }

    --> aqui nao poderiamos pois acessa atributos como this.nome e this.velocidadeMaxima

    public void calculadoraTeste(){
                System.out.println(10 + 10);
            }

    --> nesse exemplo poderiamos usar pois nao esta sendo utilizado nenhum atributo da instancia calculadora.





    
ASSOCIACAO


    -> EX: 

    public class Main {
        public static void main(String[] args) {
            Jogador jogador01 = new Jogador("Pele");
            Jogador jogador02 = new Jogador("Bebeto");
            Jogador jogador03 = new Jogador("Romario");

        Jogador[] jogadores = {jogador01, jogador02, jogador03};

        for(Jogador jogador : jogadores) {
            jogador.imprimir();

            Explicação de cada parte: 
            1- Jogador é o tipo de elemento que o loop vai iterar, ou seja, objetos do tipo Jogador.

            2- jogador é a variável que vai armazenar, a cada iteração, uma referência ao elemento atual do array.

            3- jogadores é o array que contém os objetos Jogador que serão percorridos.
        }

        Iteração e Acesso Direto:

        - Em cada iteração, a variável jogador faz referência a um dos objetos Jogador armazenados no array jogadores.

        - Como jogador aponta diretamente para o objeto, você pode chamar métodos diretamente usando jogador.imprimir(), sem precisar de um índice para acessar o elemento no array.
        }
    }

        --> estamos guardando jogadores em um array, um array (Jogadores) faz referencia a tres posicoes de memoria, e cada jogador0... faz referencia ha um objeto em memoria, ou seja um array jogadores que esta fazendo referencia a tres objetos de posicoes independentes,

        ou seja as posicoes so guardam referencia para outros objetos, ou seja, Pele ele tem duas referencia uma sendo posicao 0 do aarray e outra jogador01

    public class Jogador {
        private String nome;

        public Jogador(String nome) {
            this.nome = nome;
        }

        public void imprimir(){
            System.out.println("Nome jogador: " + nome);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }






ASSOCIACAO E PARECIDA COM A IDEIA DE BANCO DE DADOS: 


    1. JOGADOR 1 -- 1 PERSONAGEM;
    2. TIME 1 -- N JOGADORES;
    3. JOGADOR N -- 1 TIME;
    4. ESTUDANTE N -- N CURSO;

    Associacao --> relacionamento entre objetos.






ASSOCIACAO UNIDIRECIONAL MUITOS PARA UM


    - associacao de um jogador e um time

    public class Jogador {
        private String nome;
        private Time time;

        --> um jogador possui um time, aqui fazemos a referencia entre duas classes que depois irmos fazer a associacao;

        public Jogador(String nome) {
            this.nome = nome;
        }

        public void imprimir(){
            System.out.println("Nome jogador: " + nome);
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
            }
        }

    public class Time{
     private String nome;

        public Time(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }


    public class Main{
        public static void main(String[], args){

        Jogador jogador01 = new Jogador("Neymar");
        Time time01 = new Time("Selecao Brasileira");

        --> aqui ainda nao ha asssociacao entre eles, apenas temos dois objetos distintos , dizemos que jogador tem um time, porque existe um espaco criado no objeto private Time time; na classe jogador vamos criar a relacao atraves do set

        jogado01.setTime(time01);

        agora precisamos arrumar o metodo imprimir 

        ! metodo imprimir vai na classe jogador

        public void imprimir(){
        System.out.println("Nome jogador: " + nome);
        if(time != null){
            System.out.println(time.getNome());

            --> fazemos isso pois agora time e um objeto entrao precisamos utilizar o metodo get para acessar a informacao 

            --> precisamos fazer essa checagem para verificar se realmente existe um objeto em memoria para que seja buscado o getNome, se nao da um erro de null pointer, porque o que acontece no contrutor e passado as obrigatoriedades que tera que ser feito, quando isso nao e ainda o objeto em memoria nao e criado nao podemos nem existe, entao podemos chamar apos setar o time o metodo imprimir: 


            public static void main(String[], args){

            Jogador jogador01 = new Jogador("Neymar");

            jogador01.imprimir(); --> aqui vai dar erro pois, caso nao tenha a verificacao de nulo que foi feita acima, pois nao podemos imprimir, uma coisa que nem existe ainda na memoria;

            Time time01 = new Time("Selecao Brasileira");
            jogador01.setTime(time01);

        }

        --> FORMA CORRETA

        public static void main(String[], args){

            Jogador jogador01 = new Jogador("Neymar");
            Time time01 = new Time("Selecao Brasileira");

                jogador01.setTime(time01);
            jogador01.imprimir();

                --> agora certo criamos o objeto em memoria e depois executamos ele e podemos ver o resultado: 

                PELE 
             SELECAO BRASILEIRA

            }  
        }
    }






LEITURA DE DADOS DO TECLADO


    primeiro deve se chamar uma classe que e responsavel dessa funcao, no caso e so chamar o 

    Scanner nomeVariavel = new (System.in);  --> objeto 

    ex: 

    public class Main{
        public static void main(String[], args){
            Scanner imput = new Scanner(System.in);
            }
    }

    entao para lermos agora: 

    imput.next --> lebrando que next tem varios tipos;

    imput.next --> le apenas a primeira letra ou palavra antes do espaco 

    imput.nextLine --> le toda linha 


    ex: 

    import java.util.Scanner; --> import da classe java.util que contem a funcao que leitura do teclado

    public class Main {
        public static void main(String[] args) {
            Scanner imput = new Scanner(System.in);

            String name = imput.nextLine();

            System.out.println(name);
            }
    }


    tambem temos entradas especificas: 

    entrada.nextByte()  --> que so vai aceitar entradas numeros de -128 a 127; 

    entrada.hasNextByte() --> retornará false, indicando que a entrada não pode ser lida como um byte

    para isso existe varios outros como int, byte, long etc..

    !! nao temos isso para char entao o que podemos utilizar: 


    imput.next --> que so isso ira ler a primeira palavra, mas podemos especificar mais

    imput.next().charAt(0); --> ou seja ler a primeira palavra, e dessa palavra somente o   primeiro caracter que se contem na posicao 0 da string.


    ex: 

    public static void main(String[] args) {
            Scanner imput = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = imput.nextLine(); --> ler toda linha;

            System.out.println("Digite sua idade: ");
            int idade = imput.nextInt();  --> para ler somente numeros inteiros;

            System.out.println("Digite M ou F para seu sexo: ");
            char sexo = imput.next().charAt(0); --> somente o primeiro caracter;

            System.out.println("Nome: " + nome + "\nIdade: "+idade + "\NSexo: "+sexo);
        }
    }






HERANÇA


    -> o sistema esta mapeando o mundo real para o mundo digital, vamos supor que criamos uma classe pessoa, onde contem: nome, cpf e idade; agora pela necessidade do sistema temos que criar a classe funcionario onde necessita dos mesmos atributos citatos so que mais um adicional de matricula, salario; nao e necessario criar uma outra classe e digitar os mesmos atributos, podemos utilizar o conceito de heranca; ou seja porque na vida real um funcionario e uma pessoa, o termo "tem" significa que voce tem um relacionamento entre eles por exemplo pesssoa tem um endereco, ja na heranca utiliza o "e", ou seja, o funcionario e uma pessoa; entao o funcionario e tudo que pessoa é , so que mais alguma coisa; uma extesao de funcionalidades de uma classe; e algo que extende as funcionalidades de uma pessoa sendo algo mais especializado



    --> classe Pessoa 

    public class Pessoa{
        private String nome;
        private String cpf;
        private int idade

        {
        geters and seters
        }
    }

    --> classe funcionario 


    public class Funcionario extends Pessoa{
        private int matricula
        private double salario


    {
        geters and seters 
    }

    }

    e como acessamos na main? 

    public class Main{
        public static void main(String[] , args){
            -> aqui declaramos da mesma forma um objeto;

            Funcionario funcionario = new Funcionario();

            -> e como acessamos os atributos da classe Pessoa? 

            funcionario.setNome("Kayque");
            funcionario.setCpf("167.578.836-78")
        }
    }

        / -> Entao quando usamos heranca: quando queremos extender funcionalidades dela, e extender o relacionamento entre elas; 

        !!! temos que tomar bastante cuidado na utilizacao de heranca, porque quando utilizamos estamos acomplando altamente o codigo, e o melhor a se fazer e baixo acoplamento e alta coesao;




    

SOBRESCRICAO DE METODOS SUPER


    --> Basicamente escrever na classe filha o metodo sendo do mesmo nome, por exemplo na classe Pessoa tem um metodo imprime, e na classe Funcionario vai ter imprime tambem:


    public class Pessoa{
        private String nome;
        private String cpf;
        private int idade

        public void imprimir(){
            System.out.println(this.nome);
            System.out.println(this.cpf);
            System.out.println(this.idade);
     }

        { geters and seters }
    }


    public class Funcionario extends Pessoa{
        private int matricula
        private double salario

        public void imprimir(){
            System.out.println(this.salario);
        }


        --> quando fizemos isso a IDE entende que estamos sobrescrevendo os metodos, que na classe a classe filha esta sobrescrevendo a super-classe;
    }


    --> no caso se executar esse codigo acima o resultado ira dar somente o salario que no caso esta contido na classe filha, porque agora esta mudado o comportamento do metodo que no caso esta contido na classe mais especifica, mas podemos executar os dois metodos sendo eles tendo o mesmo nome; 


    ex: 

    public class Pessoa{
        private String nome;
        private String cpf;
        private int idade

        public void imprimir(){
            System.out.println(this.nome);
            System.out.println(this.cpf);
            System.out.println(this.idade);
     }
    }


    public class Funcionario extends Pessoa{
        private int matricula
        private double salario

        public void imprimir(){
            super.imprimir();
            System.out.println(this.salario);
            System.out.println(this.matricula);
        }
    }


    --> ou seja ai estamos especificando que queremos que seja impresso todo resultado primeiro da classe pessoa e apos e executado a classe funcionario, ou seja execute primeiro o metodo da super classe e depois execute o metodo da classe filha, para isso utilizamos a palavra super, que no caso estamos referindo ao objeto superclasse Pessoa, ai colocamos super.atributos_que_esta_sendo_importado;


    ->ex: super.imprime();


    assim o resultado no console sera: 

    - nome
    - cpf
    - idade
    - salario
    - matricula






PROTECT


    -> E um modificador de acesso, por exemplo: 

    public class Pessoa{
        private String nome;
    }


    public class Funcionario extends Pessoa{
        private double salario


        public void relatorioPagamento(){
            System.out.println("Eu " + this.nome);


         Nesse caso o certo seria: 

            System.out.println("Eu " + this.getNome());  -> pois o get nome e public, mas isso nao seria o ideal 


            No caso como o metodo da classe mae e privado nao podemos acessar diretamente, precisariamos de um metodo get para acessar a informacao, mas isso fica muito ruim, pois pensamos o seguinte se a super classe e a mae e possui a filha e uma compartilha atributos com a outra entao nao e necessario que seja privado por isso temos o medificador de acesso protected 

        }
    }

    definicao protected : 
        -> qualquer sub-classe em qualquer pacote teria acesso direto aos atributos, ou seja vai dar acesso a todas as subclasses independende de onde elas estiverem, porem todas as classes que estiverem no mesmo pacote terao acesso;






CONSTRUTORES EM HERANCA


    -->  para criarmos uma pessoa precisamos passar o nome que no caso pode ser passado pelo construtor, e quando criamos um construtor em uma classe mae , por exemplo se para criar uma Pessoa precisamos de um nome, quem for um funcionario tambem ira precisar de um nome, entao precisamos chamar o contrutor da superclasse, na classe filha;

        ex: 

    
    public class Pessoa{
        private String nome;
        private String cpf;
        private int idade

        public Pessoa(String nome){
            this.nome = nome;
        }

        public Pessoa(String nome, String cpf){
            this(nome);
            this.cpf = cpf;
        }

        public void imprimir(){
            System.out.println(this.nome);
             System.out.println(this.cpf);
            System.out.println(this.idade);
        }
    }


    public class Funcionario extends Pessoa{
        private int matricula
        private double salario

        public Funcionario(String nome){
            super(nome);

            // super(nome,cpf);

            --> aqui podemos chamar de dois construtores da outra classe, duas opcoes, e temos que definir acima em funcionario o string nome caso passamos a primeira opcao, ou string nome e string cpf para a segunda opcao ;
        }

        public void imprimir(){
            super.imprimir();
            System.out.println(this.salario);
        }
    }


    agora estamos dizendo que para criar um funcionario obrigatoriamente precisamos passar um nome;


    resumo: quando criamos um construtor na classe mae e esse construtor agora tem argumento, precisamos modificar os construtores classe filha.






BLOCOS DE INICIALIZACAO


    Os blocos de inicialização são usados em programação, especialmente em linguagens como Java, para executar código automaticamente quando uma classe é carregada ou uma instância dela é criada, sem a necessidade de chamadas diretas em métodos construtores ou estáticos. Eles são divididos em dois tipos:

    Bloco de inicialização estático: Executa uma única vez, quando a classe é carregada pela JVM (Java Virtual Machine), e é útil para inicializar variáveis estáticas ou realizar configurações gerais da classe que só precisam ser feitas uma vez.

    static {
    // Código executado ao carregar a classe
        }
    Bloco de inicialização de instância: Executa sempre que uma nova instância da classe é criada, antes do construtor, permitindo inicializar variáveis de instância de forma centralizada, evitando a duplicação de código em construtores.

    {
    // Código executado a cada nova instância
    }
    Esses blocos ajudam a organizar o código de inicialização, especialmente em classes complexas, evitando redundância e mantendo as inicializações em locais específicos, o que facilita a manutenção.






SEQUENCIA DE INICIALIZACAO


    --> Aqui veremos a sequencia de inicializacao de quando existir blocos staticos e heranca;

    public class Pessoa{
        private String nome;
        private String cpf;
        private int idade

        static{
            System.out.println("Dentro do bloco de inicializacao estatico de Pessoa");
        }

        {
            System.out.println("Dentro do bloco de inicializacao de Pessoa 1");
        }

        {
        
            System.out.println("Dentro do bloco de inicializacao de Pessoa 2");
        }


        public Pessoa(String nome){
            this.nome = nome;
            System.out.println("Deentro do construtor da classe Pessoa");
        }
    }


    public class Funcionario extends Pessoa{
        private double Salario;

        static{
         System.out.println("Dentro do bloco de inicializacao estatico de funcionario");
        }

        {
            System.out.println("Dentro do bloco de inicializacao de Funcionario 1");
        }

        {
        
            System.out.println("Dentro do bloco de inicializacao de Funcionario 2");
        }

        public Funcionario(String nome){
            super(nome);
            System.out.println("Dentro do construtor de funcionario");
        }
    }


    public class Main{
        public static void main(String[] args){
            Funcionario funcionario = new Funcionario("Kayque");
        }
    }

    --> quando temos herancao,  a super classe sempre sera inicializado primeiro que a filha;


    / resultado no console /

    Dentro do bloco de inicializacao estatico de Pessoa    
    Dentro do bloco de inicializacao estatico de Funcionario

    Dentro do bloco de inicializacao de Pessoa 1
    Dentro do bloco de inicializacao de Pessoa 2
    Dentro do construtor de Pessoa

    Dentro do bloco de inicializacao de Funcionario 1
    Dentro do bloco de inicializacao de funcionario 2
    Dentro do construtor de Funcionario


    Ordem de execucao: 

    0 - Bloco de inicializacao estatico da super classe e executado quando a JVM carregar a classe pai;

    1 - Bloco de inicializacao estatico da super classe e executado quando a JVM carregar a classe filha;

    2 - Alocado o espaco em memoria para o objeto pai

    3 - Cada atributo da classe pai e criado e inicializado com valores default ou o quer for passado da classe pai

    4 - Bloco de inicializacao da superclasse e executado

    5 - Construtor e executado

    6 - Alocado o espaco em memoria para o objeto da subclasse

    7  - Cada atributo da subclasse pai e criado e inicializado com valores default ou o quer for passado

    8 - Bloco de inicializacao da subclasse e executado

    9 - Construtor e executado subclasse 






MODIFICADOR FINAL TIPO PRIMITIVO 


    constantes 

    public class Carro{
        private String nome;
        private static double velociadeLimite = 250;

        --> velocidade limite era estatica e privada, a velocidade limite e algo que querememos que nao mude de forma alguma, existem certos tipos de atributos que voce nao quer que seja modificados e chamados de constantes, uma vez criado e permanecido daquele jeito ate parar o codigo e modificar novamente, e devinido pela palavra final.

        ex: 

        private static final double velocidadeLimite --> quando colocamos apenas dessa forma e dado um erro pois, uma vez criado e necessario que seja passado um valor, e esse codigo compilado nao poderemos mais modificar, constantes no java temos uma convensao propria que e tudo em UperCase separado por undescor

        o certo seria: 

        private static final double VELOCIDADE_LIMITE = 250;

        --> dessa forma esta correto;
    }


    public class CarroTeste{
        public static void main(String[] args){
            Carro carro = new Carro;

            Carro.VELOCIDADE_LIMITE = 180;

            --> se tentarmos associar algum valor como o exemplo acima ira dar erro pois ja associamos
        }
    }

    --> podemos inicializar o valor de outra forma atraves de blocos estaticos e nao estaticos e construtores;

    public class Carro{
        private String nome;
        public static final double VELOCIDADE_LIMITE;

        static{
            VELOCIDADE_LIMITE = 250;

            --> podemos fazer isso pois sempre que a classe for executada o bloco static tambem sera;
        }

        --> ou podemos tambem:

        public final double VELOCIDADE_LIMITE;

        {
            VELOCIDADE_LIMITE = 250;
        }

        -> ai na classe main utilizariamos para referenciar a velocidade limite a variavel de referencia 


        carro.VELOCIDADE_LIMITE;


        --> ou podemos tambem inicializar atraves de um construtor;

        public Carro(){
            VELOCIDADE_LIMITE = 250;
        }
    }






ENUMERACAO 


    public class Main{
        public static void main(String[] args){
            Cliente cliente1 = new Carro("Kayque", "Pessoa_Fisica");
            Cliente cliente2 = new Carro("davi", "Pessoa_Juridica");
            Cliente cliente3 = new Carro("joao", "PESSOA FISICA");
            Cliente cliente4 = new Carro("jose", "PESSOA JURIDICA");
        }
        System.out.println(cliente1); --> nao executa;
        System.out.println(cliente2); --> nao executa;
        System.out.println(cliente3); --> executa;
        System.out.println(cliente4); --> executa;
    }

    --> ao fizer dessa forma e totalmente prejudicial ao sistema, quando pensarmos em relacionar com banco de dados, pois ira ter a mesma informacao sendo salvas de formas diferentes;


    public class Cliente{
        private String nome;
        private String tipo;
        private static final String PESSOA_FISICA = "PESSOA FISICA";
        private static final String PESSOA_JURIDICA = "PESSOA JURIDICA";

        public Cliente(String nome,String tipo){

            if(!tipo.equals(PESSOA_FISICA) || !tipo.equals(PESSOA_JURIDICA)){
                return;

                //equals e usado para comparacao de strings 
            }
            this.nome = nome;
            this.tipo = tipo
        }
    }

        --> se executarmos essas duas classe o cliente 1,2 nao ira aparacer pois fizemos uma comparacao onde o modo que escrevemos nao e validado ;


    como podemos ver limitamos essas opcoes, mas queremos forcar o usuario passar essas duas opcoes dessa forma  fortemente tipado, o java possui a classe de enumeracao;


    todos atributos que criarmos dentro serao constantes 

    public enum TipoCliente{
        PESSOA_FISICA,
        PESSOA_JURIDICA
    }


    --> mas porque nao existe algum tipo? ex: tipo String ou tipo Int, nao existe porque a PESSOA_FISICA e PESSOA_JURIDICA ela e do TipoCliente, e esses dois valores fazem parte da enumeracao do TipoCLiente, como ficaria agora? e como se fosse uma relacao;


    public class Cliente{
        private String nome;
        private TipoCliente tipoCliente;

        --> e uma relacao, porque um Cliente tem um TipoCliente;

        public Cliente(String nome,TipoCliente tipoCliente){
            this.nome = nome;
            this.tipoCliente = tipoCliente
        }

        {getters e setters}
    }



    agora na classe main;


    public class Main{
        public static void main(String[] args){
            Cliente cliente1 = new Carro("Kayque", "Pessoa_Fisica");
            Cliente cliente2 = new Carro("davi", "Pessoa_Juridica");
            Cliente cliente3 = new Carro("joao", "PESSOA FISICA");
            Cliente cliente4 = new Carro("jose", "PESSOA JURIDICA");
        }
        System.out.println(cliente1); --> nao executa;
        System.out.println(cliente2); --> nao executa;
        System.out.println(cliente3); --> executa;
        System.out.println(cliente4); --> executa;
    }

    --> agora na classe main nao podemos mais passar as informacoes do tipo sendo elas do tipo STRING , porque ela nao e mais uma variavel, agora ela e um tipoCliente, agora os atributos que temos dentro da classe enum, sao constantes(Static e Final) da classe TipoCliente

    temos que fazer dessa forma 


    public class Main{
        public static void main(String[] args){
            Cliente cliente1 = new Carro("Kayque", tipoCliente.PESSOA_FISICA);
            Cliente cliente2 = new Carro("davi", tipoCliente.PESSOA_JURIDICA);
            Cliente cliente3 = new Carro("joao", tipoCliente.PESSOA_FISICA);
            Cliente cliente4 = new Carro("jose",tipoCliente.PESSOA_JURIDICA);
        }
        System.out.println(cliente1); 
        System.out.println(cliente2); 
        System.out.println(cliente3); 
        System.out.println(cliente4); 
    }

    --> precisa ser passado dessa forma, agora caso criamos o cliente 5 e pensamos em passar o tipo de outra forma, infelizmente nao tem como, para fazer isso e necessario adicionar algum novo tipo na classe de enumeracao



    --> estamos forcando a pessoa a passar algum desses dois tipos, fazendo com que diminua os erros.


    -/-> O certo de se utilizar a numeracao e quando temos uma escolha dentro de uma quantidade limitada de opcoes, e voce precisa forcar o tipo a ser utilizado.


    



ENUMERACAO  CONSTRUTORES E ATRIBUTOS


    na classe enum e aonde definir atributos que vao representar aquela enumeracao, esses atributos nao podem ser alterados como PESSOA_FISICA sera sempre PESSOA_FISICA... 

    dentro da enumeracao podemos trabalhar com construtores e atributos;

    --> enum pode ser usado dentro de outra classe

    public class Cliente {
        public enum TipoPagamento{
            DEBITO,CRETIDO
        }
        private String nome;
        private TipoCliente tipoCliente;
        private TipoPagamento tipoPagamento;
    }


    -> nos temos a enumeracao dentro da classe e uma relacao que cliente tem um tipo de pagamento e tem um tipoCliente;

    relembrando podemos utilizar atributos ou a classe enum sem nenhum modificador de acesso

    ex: 

    enum TipoPagamento{
            DEBITO,CRETIDO
        }
         String nome;
         TipoCliente tipoCliente;
         TipoPagamento tipoPagamento;
    }

    sem nada e chamado de modificador de acesso pacote, significa que qualquer classe dentro do mesmo pacote podera acessar esse atributo, significa que qualquer um pode acessar se estiver dentro do mesmo pacote;
    
    
    podemos criar um atributo dentro de uma numeracao;

    por exemplo pessoa fisica tera um numero 1 e pessoa juridica numero 2;

    ex: 

    public enum TipoCliente{
        PESSOA_FISICA(1),
        PESSOA_JURIDICA(2)

        private TipoCliente(){

        }
    }

    mesmo que nao criamos, toda vez em que executamos enum e criado um construtor, quando colocamos dois valores inteiro dentro de pessoa-fisica e juridica, quando colocamos esses valores automaticamente estamos passando eles para o construtor


    public enum TipoCliente{
        PESSOA_FISICA(1),
        PESSOA_JURIDICA(2)

        private int valor;

        -> aqui podemos colocar de duas formas sendo final ou nao, e tambem sendo publico ou nao, caso seja publico nao necessitamos de um get

        --> podemos armazenar o valor dentro de uma variavel, e como regra nao podemos nao podemos colocar uma variavel antes da enumeracao;

        TipoCliente(int valor){
            this.valor = valor;
        }

        --> quando for inicialido a classe enumeracao, caso a pessoa passe um dos dois tipos ira passar um valor, sendo 1 ou 2, quando os valores forem passado como iremos pegar ele? 

        - atraves de um getter, e faz sentido nos adicionarmos um set? nao pois o valor nao sera modificado entao nao faz sentido... 

        public int getValor(){
            return valor;
        }

    }



    public class Main{
        public static void main(String[] args){
            Cliente cliente1 = new Carro("Kayque", tipoCliente.PESSOA_FISICA);
            Cliente cliente2 = new Carro("davi", tipoCliente.PESSOA_JURIDICA);
            Cliente cliente3 = new Carro("joao", tipoCliente.PESSOA_FISICA, );
            Cliente cliente4 = new Carro("jose",tipoCliente.PESSOA_JURIDICA, );
        }
        System.out.println(cliente1);
        System.out.println(cliente2); 
        System.out.println(cliente3); 
        System.out.println(cliente4); 

    }


    no caso para nos entedermos bem: o metodo toString podemos utilizar para entender melhor

    public String toString(){
        return "Cliente {" +
        "nome" + nome + "\" + 
        ...
        ", tipoClienteInt =" + tipoCliente.valor +"

        --> aqui veremos o valor baseado ao atributo que estamos passando sendo ele ou pessoa fisica ou pessoa juridica ou seja, ou 1 ou 2, veremos que o valor ira mudar de acordo com atributo que formos passar, desse modo temos certeza de um valor numerico que ira ser passado para o banco de dados, valores inteiros representando pessoa fisica ou juridica;


        '}';
    }

    --> se executarmos dessa forma utilizando o metodo toString, veremos que ira aparecer no resultado o nome, o tipo de cliente sendo pessoa fisica ou pessoa juridica, e tambem um valor associado a ele referente ao atributo que criamos;

        ex:

        Cliente{nome = 'kayque', tipoCliente = PESSOA_FISICA, tipoClienteInt = 1}

--> e outro ex: nao precisamos nos limitar ao valor passado de rempresentacao, podemos colocar tambem do tipo String 
    
public enum TipoCliente{
        PESSOA_FISICA(1, "Pessoa Fisica"),
        PESSOA_JURIDICA(2, "Pessoa Juridica")

        private int valor;
        private String nomeRelatorio

        TipoCliente(int valor, String nomeRelatorio){
            this.valor = valor;
            this.nomeRelatorio = nomeRelatorio;
        }

        public int getValor(){
            return valor;
        }

        public int getNomeRelatorio(){
            return nomeRelatorio;
        }

        agora na classe Cliente para exibir do modo que desejamos sem ser e UperCase mudamos apenas para tipoCliente.getNomeRelatorio;

    }

     public String toString(){
        return "Cliente {" +
        "nome" + nome + "\" + 
        ...
        ", tipoClienteInt =" + tipoCliente.getValor() +"

        ", tipoCliente =" + tipoCliente.getNomeRelatorio() +" "
        }
     }






ENUMERACAO  SOBRESCRIATA DE METODOS 


    -> Seguinte problema: imaginamos que temos duas opcoes credito e debito mas precisamos dar descontos especificos em ambos, mas nao queremos fazer if dentro do codigo ;

     public enum TipoPagamento{
        DEBITO, 
        CREDITO;

        public double calcularDesconto(double valor){
            return 0;

            --> quem chamar esse metodo sem nada o valor retornado sera 0;
        }
     }


     agora na main{

        public class Main{
            public static void main(String[] args){
                Cliente cliente1 = new Cliente("Kayque", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);

                System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

                --> caso executarmos isso o valor retornado sera 0; pois nao estamos passando comportamento ainda para se calcular o desconto;
            }
        }
     }


     agora vamos fazer o comportamento na classe enum:


     public enum TipoPagamento{
        DEBITO{
            aqui criamos a chave para demonstrar o comportamento, e atraves de ctrl + o para sobrescrever algum metodo;

            @Override
            public double calcularDesconto(double valor){
                return valor * 0.1;
            }
        }, 
        CREDITO{
            @Override
            public double calcularDesconto(double valor){
                return valor * 0.05;
            }
        };

        public double calcularDesconto(double valor){
            return 0;
        }

        -->  agora o 0 aqui nao esta sendo utilizado, porque independe se usarmos debito ou credito, o valor 0 nao sera retornado;
     }


     --> se executarmos agora o metodo na main System.out.println(TipoPagamento.DEBITO.calcularDesconto(100)); ira da um resuldado dependendo do tipo de pagamento que foi chamado;


     --> melhor forma de se utilizar;

     public enum TipoPagamento{
        DEBITO{
            @Override
            public double calcularDesconto(double valor){
                return valor * 0.1;
            }
        }, 
        CREDITO{
            @Override
            public double calcularDesconto(double valor){
                return valor * 0.05;
            }
        };

        public double calcularDesconto(double valor){
            return 0;
        }
            podemos criar o metodo dessa forma mas existe uma melhor forma:

            porque esse metodo calcular desconto embaixo nao esta sendo utilizado, ou seja nao possui nenhum comportamento;

            --> O certo a criar um metodo que o metodo em si nao vai ter comportamento, so tera comportamento sera decidido araves de sobrescritas em outras classes ou enumeracoes, nesse caso esse corpo e inutil {} (as aspaas do metodo), o que temos que fazer e retirar e colocar ";";

            public double calcularDesconto(double valor);

            --> mas para isso precisamos colocar ele de forma abstrata, porque um metodo abstrato nao pode ter corpo, ou seja, e um metodo que foi criado somente para ser sobrescrito 

            entao o correto:

            public abstract double calcularDesconto(double valor);



            resutado final:

            public enum TipoPagamento{
                DEBITO {
                    @Override
                    public double calcularDesconto(double valor){
                        return valor * 0.10;
                    }
                },
                CREDITO{
                    @Override
                    public double calcularDesconto(double valor){
                        return valor * 0.05;
                    }
                };

                public abstract double calcularDesconto(double valor);
            }
     }






CLASSES ABSTRATAS PT1


     --> criada para resolver um problema de designer de codigo,
     
     public class Funcionario{
        protected String nome;
        protected double salario;

        public Funcionario(String nome, double Salario){
            this.nome = nome;
            this.salario = salario;
        }

        @Override
        public String toString(){
            return "Funcionario{" + '\'' + 
            "nome = '" + nome + '\' + 
            ",salario =" + salario '+ 
            '}';
        }
     }

     classe gerente -> herdada de funcionario 

     public class Gerente extends Funcionario{
        public Gerente (String nome, double salario){
            super(nome, salario);
        }
     }

     public classFuncionarioteste{
        public static void main(String[] args){
            Funcionario funcionario = new Funcionario("Zoro", 2000);

            --> aqui criamos um objeto da classe funcionario, sendo chamado de zoro, mas quem e zoro? ele e um gerente, desenvolvedor, vendedor?? ... na verdade nao deveria existir, so um funcionario, podemos evitar a criacao de funcionario, e deixar somente a criacao das classes que extendem funcionario; ai entra o abstract  

            Gerente gerente = new Gerente("Kayque", 5000);

            System.out.println(funcionario);
            System.out.println(gerente);
        }
     }


     --> abstract : quando colocamos isso na classe significa que agora ela vai ser como um templete, ou seja, nao podemos mais criar algo como concreto, normalmente quando trabalhamos com abstract definiminos o que nao for abstrato de concreto, no nosso caso agora funcionario e e abstrato, entao nao podemos mais instanciar a classe funcionario, nao podemos mais ter um objeto do tipo funcionario, teremos que criar agora somente objetos que extendem a classe funcionario

     ex: 

     public abstract class Funcionario{
        protected String nome;
        protected double salario;

        public Funcionario(String nome, double Salario){
            this.nome = nome;
            this.salario = salario;
        }
            porque temos um construtor aqui? pois estamos trabalhando com heranca, para poder criar um gerente tendo nome, e salario precisamos que esse construtor esteja contido em funcionario.
        
        }
     }

     --> uma classe que foi criada para ser extendida, uma classe que foi criada para ser uma superclasse.


     public final abstract class Funcionario{}

     nao podemos misturar final e abstract porque? porque criamos uma classe abstract para ser extendida, ja uma classe final quando criada e para nao ser extendida. ou seja, pode ser somente final ou abstract.


     -->resumo:  classes podem ser abstratas, na qual a funcionalidade de uma classe abstrata e ser extendida, e nao podemos instanciar uma classe abstrata, nao podemos tambem misturar final e abstract pois tem funcionalidades diferentes;






METODOS ABSTRATOS 

        -> metodos abstratos nao possui corpo, foi feito apenas para ser sobescrito;
        
        public abstract class Funcionario{
            protected String nome;
            protected double salario;

            public Funcionario(String nome, double salario){
                this.nome = nome;
                this.salario = salario;
            }

            public void calcularBonus(){
                this.salario = salario + salario * 0.1
            }
        }

        -->  no caso criamos o metodo dentro da classe abstrata, onde aqui criamos um calculo de bonus, mas como criamos dentro da classe funcionario entao isso se aplica para todos os outros herdados, podemos entao utilizar esse metodo dentro da classe desenvolverdor ou gerente sendo de forma propria para isso utilizamos o Metodo:

        -> public abstract void calcularBonus();


        public class Gerente extends Funcionario{
            public Funcionario(String nome, double salario){
                super(nome,salario);
            }

            @Override
            public void calcularBonus(){
                this.salario = this.salario + this.salario * 0.05; 
            }

            --> podemos fazer o mesmo para desenvolvedor
        }


        !! quando extendemos de uma classe abstrata, precisamos obrigatoriamente prover uma implementacao mesma que seja vazia, ex: caso extendemos a class funcionario para a classe desenvolvedor, precisamos obrigatoriamente sobrescrever o metodo calculaBonus(); mesmo que seja vazio;

        @Override
        public void calculaBonus(){
            //nao importa se teremos implementacao aqui ou nao, o que temos que cumprir com o trato de sobrescrever um metodo
        }

    
        ///METODOS ABSTRATOS REGRAS

    Vamos supor que criamos uma classe avo sendo ela a classe pessoa , sendo ela pai de funcionario, e o mesmo tendo desenvolvedor e gerente como filhos, sera que podemos fazer isso? claro que sim

    public abstract class Pessoa{
        public abstract void imprimir();
    }

    //

    public abstract class Funcionario extends Pessoa{
        protected String nome;
        protected double salario;

        public Funcionario(String nome, double salario){
            this.nome = nome;
            this.salario = salario;
            calcularBonus();
        }
    }

    public abstract calcularBonus();

    // --> se tivermos uma classe abstrata e uma  outra classe abstrata extendendo ela, no caso funcionario extendendo uma pessoa que tambem e abstrata, voce nao e obrigado ha implementar os metodos abstratos, mas caso deseja implementar e necessario implementar somente uma vez, por exemplo se colocarmos o metodo sobrescrito do metodo imprime, dentro da classe funcionario nao e necessario sobrescrever novamente nas classes filhas como: desenvolvedor e gerente.

    @Override
    public void imprimir(){
        System.out.println("Imprimindo...!!");
    }

    // --> como funcionario implementou o metodo imprime todas as classes filhas de funcionario vao pegar essa implementacao... ou seja nao  havera mais erros

    /*
     * caso deseja implementar o metodo para gerente ou desenvolvedor podemos chamar:
     * 
     * gerente.imprimir();
     * desenvolvedor.imprimir();
     * 
     */

    @Override
    public String toString...


    classes filhas ---> 

    public class Gerente extends Funcionario{
    }

    public class Desenvolvedor extends Funcionario{

    }


    !! -> regra: nao podemos ter multiplas herancas no java, mas podemos ter uma hierarquia maior, como pai, avo, tataravo ....






INTERFACE 


    --> Bem parecido com classes abstratas, a diferenca que podemos falas e que intertaface e interace e classe e classe!

    --> interfaces tinha o intuito de servir como um contrato, porque classes abstratas se pararmos para pensar nos metodos abstratos eles sao contratos que as classes concretas que extenderem precisa implementar os metodos abstratos.

    public interface DataLoader{
        // agora estamos utilizando interface, e como interface e tipo um contrato nao podemos colocar a palavra final, pois um contrato foi feito para ser implementado
    }

    quando criamos uma interface podemos criar metodos, somente com o tipo de retorno e o nome, nao e necessario colocar public abstract, pois isso se torna redundante


    public interface DataLoader{
        void load();

        --> como vimos nao e necessario adicionar o modificador de acesso + abstract 
    }


    public class DatabaseLoader implements DataLoader{
        // essa classe vai carregar dados do banco de dados, fara mais sentido quenfdo for ligado ao polimorfismo

        -> quando utilizamos interface, nao utilizamos mais o extends e sim o implements + nome da interface. e como load e um metodo abstrato e necessario implementar ele.

        @Override
        public void load(){
            System.out.println("Carregando dados do banco de dados");
        }
    }


    public class FileLoader implements DataLoader{
        @Override
        public void load(){
            System.out.println("Carregando dados de um arquivo");
        }
    }


    public class TesteDataLoader{
        public static void main(String[] args){
            DatabaseLoader databaseLoader = new DatabaseLoader();
            FileLoader fileLoader = new FileLoader();

            databaseLoader.load();  
            fileLoader.load();
        }
    }


    resumo: quando trabalhamos com interface nao se utiliza mais o public class, mas sim public interface, todos os metodos nao sao necessarios adicionar o public abstract antes pois isso se torna redundante , quando queremos implementar a inteface em outra classe utilizamos o implements + nome_da_interface;

    




IMPLEMENTANDO MULTIPLAS INTERFACES : CASOS ESPECIAIS 


    seguindo o raciocinio e utilizando as classes copiadas antes, imaginamos que seja criado uma nova interface chamada;

    public interface DataRemover{
        void remove();
    }

    nao queremos criar uma nova classe so para implementar na DatabaseLoader, queremos que o remove tambem seja implementado, uma das vantagens da interface e que voce pode prover a implementacao para multiplas interfaces de uma mesma classe, entao podemos fazer:

    public class DatabaseLoader implements DataLoader, DataRemover{

        @Override  --> // metodo sobrescrito de DataLoader

        public void load(){
            System.out.println("Carregando dados do banco de dados");
        }

        
        @Override  --> // metodo sobrescrito de DataRemover

        public void remove(){
            System.out.println("Removendo do banco de dados");
        }

        --> nao existe limite para adicionar, podemos fazer a implementaao de multiplas interfaces, ja nas classes nao;
    }


    outra diferenca: o fato da interface ter metodos com implementacao, ja nas classes abstratas nao e possivel, porque eles fizeram isso, imagina que temos o DataLoader, onde tem o metodo load,  agora fazendo o carregamento queremos que tenha o metodo para checar a permissao entao colocamos: 

    public abstract void checkPermission();

    -> o problema e quando colocamos um metodo abstrato onde ele outras classes estiverem extendendo isso, todas obrigatoriamente precisa sobrescrever esse metodo, @Override. e isso e muito ruim para grandes projetos onde se adicionar alguma funcionalidade seja necessario modificar muita coisa, os metodos default sao metodos que possui implementacao, entao podemos fazer a implementacao, nos estamos definindo na interface o comportamento daquele metodo

    ex: 

    public interface DataLoader{
        void load();    

        default void checkPermission(){
            System.out.println("Fazendo checagem de permissoes");

            --> com isso as outras classes que implemtentam essa interface, nao irao dar erro, pois nao e mais obrigatorio ter a sobrescrita desse metodo.
        }
    }


    nao ha necessidade de colocar public default... , pois isso se torna redundante;


    --> agora utilizando o metodo na main;


     public class TesteDataLoader{
        public static void main(String[] args){
            DatabaseLoader databaseLoader = new DatabaseLoader();
            FileLoader fileLoader = new FileLoader();

            databaseLoader.checkPermission();  
            fileLoader.checkPermission();

            --> veremos os system out printn que foi disposto na interface, sem mesmo sobrescrever, porem essas checagem de permissoes estao acontecendo no nivel da interface, podemos sobrescrever e prover a implementacao na classe
        }
    }



    --> ex: 


    public class DatabaseLoader implements DataLoader, DataRemover{

        @Override  --> 

        public void load(){
            System.out.println("Carregando dados do banco de dados");
        }

        @Override  --> 
        public void remove(){
            System.out.println("Removendo do banco de dados");
        }



        !!

        @Override
        
        public void checkPermission(){
            System.out.println("Checando permissoes no bando de dados");

            --> agora estamos sobrescrevendo o metodo disposto na interface, mas estamos provendo aqui mesmo a implementacao, ou seja o system out println da interface nao tera mais nenhum resultado, o que tera agora sera esse resultado disposto acima
        }
        
    }






INTERFACE ATRIBUTOS E METODOS ESTATICOS


    --> Resumo de interface: interface e como se fosse um contrato, onde todos os metodos por padrao serao publicos e abstratos , se nao criamos abstratos precisamos obrigatoriamente criar ele default , e precisamos prover uma implementacao quando ele for default e por padrao ele vai ser public , nao podemos criar objetos de interface.


    // private -> default ou de pacote --> protect -> public 


    precisamos tomar cuidado quanto ao uso de modificadores de acesso de sobrescrita, quando estamos sobrescrevendo nao podemos utilizar modificador de acesso mais restritivo, por padrao os metodos de uma interface sao publicos.

    
     public interface DataLoader{
        --> no caso aqui public como e padrao da interface 

        void load();    
    }

    --> exemplo se removermos o public no metodo load da interface e fazemos o mesmo com a classe onde tem a interface implementada, teremos um erro: porque ? nao podemos ter um modificador de acesso mais restritivo do que o que esta na superclasse: 


    public class DatabaseLoader implements DataLoader, DataRemover{

        @Override 

        --> e aqui default ou de pacote pois nao estamos -> como o padrao de classe

         void load(){
            System.out.println("Carregando dados do banco de dados");
        }
        
    }


    --> // private -> default ou de pacote --> protected -> public 


    --> para enterdemos melhor se criarmos um metodo public a sobrescrita te forca a ter um metodo public, pois todos que estao na esquerda serao mais restritivos do que ele, mas se no caso em uma classe abstrata colocarmos um modificador de acesso private, podemos utilizar na sobrescrita todos os modificadores de acesso menos restritos, como: default, public, protected.


    //ATRIBUTOS EM UMA INTERFACE? 

        Podemos criar um atributo em uma interface? sim, podemos, por padrao sao todos atributo sao constantes;

        public static final ...


        ex: 

        public static final int MAX_DATE_SIZE = 10;

        E por padrao nao e necessario utilizar o public static final, pois se torna redundante;


        podemos tambem adicionar metodos staticos, e relembrando metodos statics nao podem ser sobrescritos pois ele pertence a classe ou nesse caso a interface;


        ex dentro da interface : 

        public static void retriveMaxDateSize(){
            Systetem.out.println("Dentro de retriveMaxDateSize na interface");
        }






POLIMORFISMO  CURSO EM VIDEO
    

    -> temos dois tipos de polimorfismo sendo eles o de sobreposicao -> que e substituir um metodo que veio da classe mae para classe filha, e temos tambem o outro tipo de polimorfismo chamado de sobrecarga:


    POLIMORFISMO sobreposicao: um exemplo para melhor entendimento, imagina que tenhamos uma classe mamifero: 

    public class Mamifero{
        public void emitirSom(){
            System.out.println("Som de mamifero");
        }
    }


    public class Lobo extends Mamifero{
        @Override
        public void emitirSom(){
            System.out.println("Auuuuuuuuuuuuu!");
        }
    }


    
    public class Cachorro extends Lobo{
        @Override
        public void emitirSom(){
            System.out.println("Au Au Au Au"); 
        }
    }

    --> temos a classe mamifero que possui o metodo emitir som, e e uma classe que se extende de Animal(sendo ela abstrata), e criamos a classe lobo que tambem emite som, diferentemente como mamifero, apesar dele ser um mamifero, e colocamos ainda sim uma classe ainda mais especifica sendo ela cachorro sendo entendida de lobo, e claro que a emissao de som deles sao diferentes, 


    Podemos ver acima que os metodos possui a mesma assinatura, ou seja, o mesmo nome, e a mesma quantidade de atributos, e em classes diferentes isso so pode ser sobreposicao;


    POLIMORFISMO de sobrecarga: podemos propor um metodo de reacao para a classe Cachorro, so que e o seguinte existe varias maneiras de um cachorro reagir, varias formas = poliformas.

    ex: 


    reagir(){
        falar frase -> ele reage de forma agradavel ou agressival

        horario do dia -> manha = abanar rabo , tarde = abanar e latir, noite = ignorar.

        dono -> e dono = abanar, nao e dono = rosnar e latir

        ...
    }


    todas reacoes sao impostas por uma reacao, que sao as poliformas de reacao.


    ex na classe: 

    public class Cachorro extends Lobo{
        public void reagir(String frase){

        }

        public void reagir(int hora, int min){

        }

        public void reagir(boolean dono){

        }
    }

    --> todos os metodos tem o mesmo nome, mas eles tem assinaturas diferentes(parametros diferentes) , por exemplo no primeiro tem um tipo string, ja no segundo tem dois inteiros como parametro, tambem estao na mesma classe. ja na sobreposicao e a mesma assinatura em classes diferentes.

    chamando assim esse tipo de POLIMORFISMO de sobrecarga, pois esta sobrecarregando um metodo, temos varia maneiras de se fazer a mesma coisa, utilizando o mesmo nome com assinaturas diferentes da mesma classe.


    ex: 

    public class Cachorro extends Lobo{
        @Override
        public void emitirSom(){
            System.out.println("AU!AU!AU");
        }

        public void reagir(String frase){
            if(frase.equals "Toma comida" || frase.equals "Ola"){
                System.out.println("Abanar e lattir");
            } else{
                System.out.println("Rosnar");
            }
        }

        public void reagir(int hora, int min){
            ....
        }




        public void reagir(boolean dono){
            ....
        }

        -> caso colocamos a mesma assinatura(mesma quantidade e tipo de atributo, independente do tipo de retorno) teremos um erro;

        public boolean reagir(boolean comer){

        }
    }


    ai se declararmos la na main ex: 

    public class Main{
        public static void main(String[] args){
            Cachorro cachorro = new Cachorro();

            cachorro.reagir --> aqui teremos varias formas de reacao, aparecendo o tipo de parametro para que cada reacao seja diferente.


            cachorro.reagir(11, 10)  --> vai para reacao  reagir(int hora, int min);


            cachorro.reagir("Ola")  --> vai para reacao reagir(String frase);
        }
    }
    
    
    
    
    
POLIMORFISMO DevDojo


        public abstract class Produto{
            private String nome;
            private double valor;

            //-> faz sentido ter somente um produto? nao por isso colocamos ele como abstract e tambem colocamos um construtor que para se criar um produto obrigatoriamente seja necessario passar um nome e um valor:


            public Produto(String nome, double valor){
                this.nome = nome;
                this.valor = valor;
            }
        }


        public class Computador extends Produto{
            public Computador(String nome, double valor){
                super(nome, valor);
            }
        }


        public class Tomate extends Produto{
            public Tomate(String nome, double valor){
                super(nome, valor);
            }
        }


        --> explicacao de todas as classes: entao temos uma classe produto onde ela e abstrata, tambem criamos duas extensoes de produto sendo tomate e computador, e para isso nossos produtos precisam ser taxados(impostos), precisamos de um metodo para calcular os impostos, temos algumas opcoes, podemos criar um metodo abstrato em produto e forcas a implementacao nas classes extendidas, ou criar uma interface e fazer o uso declaramos:

        public interface Taxavel{
            double calcular imposto();

            --> aqui na interface nao fazemos idea de como o calculo ira ser feito, sera responsabilidade das subclasses, entao agora implementamos a interface em produto 
        }

        --> Classe produto agora: 

        public abstract class Produto implements Taxavel{
            protected String nome;
            protected double valor;

            public Produto(String nome, double valor){
                this.nome = nome;
                this.valor = valor;
            }

            --> entao porque nao sobrescrevemos o metodo aqui? porque nao faz sentido calcular a taxa em cima da classe produto precisamos especificamente calcular para tomate e computador, para isso precisaremos entao sobrescrever o metodo imposto em ambas as classes;
        }

        ATUALIZACOES DE TODAS AS CLASSES -> OPEN 


        public class Computador extends Produto{
            public static final double IMPOSTO_POR_CENTO = 0.20;

            public Computador(String nome, double valor){
                super(nome, valor);
            }

            @Override
            public double calcularImposto(){
                System.out.println("Calculando o imposto de computador");
                return this.valor * IMPOSTO_POR_CENTO;
            }

            // -->  O que fizemos aqui: sobrescrevemos o metodo de caculo de imposto criamos uma taxa constante para o imposto em cima de computador, onde o calulo e feito pelo valor * imposto, retornado ao resultado desejado; isso tambem para tomate 
        }


        public class Tomate extends Produto{
            public static final IMPOSTO_POR_CENTO = 0.06;

            public Tomate(String nome, double valor){
                super(nome, valor);
            }

            @Override
            public double calcular imposto(){
                System.out.println("Calculando o imposto de tomate");
                return this.valor = IMPOSTO_POR_CENTO;
            }
        }


         public abstract class Produto implements Taxavel{
            protected String nome;
            protected double valor;

            public Produto(String nome, double valor){
                this.nome = nome;
                this.valor = valor;
            }

            public String getNome(){
                return nome;
            }

            public double getValor(){
                return valor;
            }
        }


        --> AGORA EM OUTRO PACKGE, PORQUE? ( Quando estamos trabalhando com o tipo de arquitetura MVC, voce separa o modelo(que e o dominio(que representa o banco de dados)), das regra de negocio, e do que voce vai visualizar )



        public class CalculadoraImposto{
            public static void calcularImpostoComputador(Computador computador){
                double imposto = computador.calcularImposto();
                
                System.out.println("Relatorio de imposto do computador");
                System.out.println("Computador: " + computador.getNome());
                System.out.println("Valor: " + computador.getValor());
                System.out.println("Imposto a ser pago: " + imposto);

            }

            public static void calcularImpostoTomate(Tomate tomate){
                double imposto = tomate.calcularImposto();
                
                System.out.println("Relatorio de imposto do computador");
                System.out.println("Tomate: " + tomate.getNome());
                System.out.println("Valor: " + tomate.getValor());
                System.out.println("Imposto a ser pago: " + imposto);

            }
        }

        //EXECUTAVEL

        public class ProdutoTeste{
            public static void main(String[] args){
                Computador computador = new Computador("NUC10I7", 11000);
                Tomate tomate = new Tomate("Tomate Siciliano", 10);

                //--> agora vem o X da questao, temos a classe CalculadoraImposto precisamos instanciar essa classe para pegarmos os resultados, sera que precisamos criar um objeto dessa classe imposto para executar os metodos dentro dela, ai relembramos da aula onde de static, onde se nao estivermos acessando nenhum atributo de classe podemos transformas os metodos em static, quando transformamos o metodo em static nao precisamos mais colocar new CalculadoraImposto, podemos chamar: 

                CalculadoraImposto.calcularImpostoComputador(computador);
                CalculadoraImposto.calcularImpostoTomate(tomate);
            }
        }

        -> RESUMO DE TUDO QUE CRIAMOS E ACONTECEU: 
        
        Criamos primeiramente uma classe abstrata produto, porque o produto em si nao deve existir entao nao podemos instanciar, apenas as subclasses derivadas de produtos, criamos depois duas classes Computador e Tomate que extendem produto que consequentemente precisa utilizar o mesmo construtor, ai nos criamos a interface taxavel onde tem um unico metodo que se chama calcular imposto, quando chegamos agora na classe produto e vermos que Produto implements Taxavel estamos falando que agora produto e taxavel, consequentemente ele precisa implementar o metodo calcularImposto();, entao demos Override no metodo dentro da classe computador e tomate, em seguida criamos um pacote de servico onde fica as regras de negocio e colocamos dois metodos para calcular o imposto de computador e tomate, recebendo como argumento computador e tomate respectivamente e criamos nosso teste. 

    --> CLOSE 






POLIMORFISMO --> VIRADO NO JIRAYA  -> SEQUENCIA DA ANALOGIA 

        
        para explicar vamos imaginar a analogia do controle remoto, vamos imaginar um controle da sansung criado em 2019 onde possui funcionalidade -> botao da netiflix e prime video, o controle remoto da samsung vai trabalhar com uma televisao da samsung, onde teremos a televisao com netflix e prime video, temos nosso controle onde vai mandar o sinal para televisao, ou seja clicamos no botao e a televisao ira executar a acao, entao  no caso o controle e a variavel de referencia e o objeto e a televisao. 

        ex: Computador c = new Computador();
                variavel  = objeto 

        o que significa polimorfismo? significa que podemos trocar o tipo da variavel de refencia mas ainda ficar utilizando outros objetos, isso so e aplicado na heranca.


        ex: do que temos acima, um controle criado em 2019 com dois botoes netflix e primeVideo, quando acionado se executa em uma televisao que possui netflix e primeVideo, mas porem saiu um novo modelo de televisao da samsung porem mais moderno, ou seja uma extensao, onde temos a netflix o prime mas tambem o youtube, porem ainda estamos utilizando o controle de 2019, entao o controle da sansung de 2019, pode fazer referencia ao objeto(televisao de 2020), vamo supor que estamos no objeto de televisao 2020, se clicarmos no botao do controle (netflix) - > quem ira executar sera objeto televisao 2020, o mesmo acontecera para prime, ou seja o controle e responsavel por mandar o sinal e quem executa e o objeto televisao 2020, 
        
        -> baseado na variavel de referencia, e possivel acessar o youtube 2020? porque nao tem como chamar porque nao existe esse botao. 
        
        --> ate agora estavamos trabalhando com o mesmo tipo de variavel de refencia e objeto, mas podemos tambem, baseado nos exemplos anotados acima de tomate e computador();

        ex: 

        public class ProdutoTeste02{
            public static void main(String[] args){
                Produto produto = new Computador("Ryzen 9", 3000);

                // -> agora minha variavel de referencia vai ser a superclasse produto, e meu objeto sera uma das subclasses que extendeu as funcinalidades de produto;

                System.out.println(produto.getNome());
                System.out.println(produto.getValor());
            }
        }

        ->  se voltarmos para analogia paralela a do controle podemos ver que temos uma variavel de referencia do tipo produto onde tem as funcionalidade -> nome, valor, calcularImposto(); , temos tambem agora o objeto, que e um computador que teremos exatamente o mesmo atributo, quando damos entao um "sinal" em produto.nome quem esta executando nao e a variavel de referencia, nao e o objeto Produto(poque ate mesmo ele nao e ), o  que esta sendo executado e o objeto Computador



        mesmo exemplo aplicado em dois casos: 


        public class ProdutoTeste02{
            public static void main(String[] args){
                Produto produto = new Computador("Ryzen 9", 3000);
                System.out.println(produto.getNome());
                System.out.println(produto.getValor());

                Produto produto2 = new Tomate("Americano" , 10);
                System.out.println(produto2.getNome());
                System.out.println(produto2.getValor());

                --> quando executar teremos o resultado, o que aconteceu e que temos o mesmo tipo de variavel de referencia, porem agora nos temos outro produto que e um tomate, entao quando eu executo, e executado tomate, e tambem computador, onde o tipo de variavel sao ambas do tipo produto mas com variaveis de refencia diferentes.
            }
        }

        exemplo aplicando o mesmo que foi disposto no controle

        public class Tomate extends Produto{
            public static final IMPOSTO_POR_CENTO = 0.06;
            private String dataValidade;

            public Tomate(String nome, double valor){
                super(nome, valor);
            }

            @Override
            public double calcular imposto(){
                System.out.println("Calculando o imposto de tomate");
                return this.valor =* IMPOSTO_POR_CENTO;
            }

            public String getDadaValidade(){
                return dataValidade;
            }

            !! o que fizemos agora foi adicionar uma nova funcionalidade a tomate;
        }


        super-classe -> 

        
        public abstract class Produto implements Taxavel{
            protected String nome;
            protected double valor;

            public Produto(String nome, double valor){
                this.nome = nome;
                this.valor = valor;
            }

            public String getNome(){
                return nome;
            }

            public double getValor(){
                return valor;
            }
        }


        agora perguntamos se consiguimos executar essa data de validade atraves de uma variavel do tipo produto? e nao porque nunca vai ser disponivel para mim, pois produto nao tem como saber, a garantia que a heranca me da e que todos os atributos que tenho na minha superclasse podem ser chamados na subclasse proque sabemos que eles vao ser herdados, por isso podemos fazer isso: 

        Produto produto       =    new Computador("Ryzen 9", 2000);
        tipo mais generico    ->   para um tipo mais especifico 


        ou seja: entao produto que e o mais generico(E a superclasse) esta fazendo referencia para computador que e um tipo mais especifico, entao eu sei que tudo que tem em Produto vai ter em computador porque ele e meu filho(subclasse), mas nem tudo que tem na subclasse vai ter na superclasse






PARAMETROS POLIMORFICOS  


       public class CalculadoraImposto{
            
            public static void calcularImpostoComputador(Computador computador){
                double imposto = computador.calcularImposto();
                
                System.out.println("Relatorio de imposto do computador");
                System.out.println("Computador: " + computador.getNome());
                System.out.println("Valor: " + computador.getValor());
                System.out.println("Imposto a ser pago: " + imposto);

            }

            public static void calcularImpostoTomate(Tomate tomate){
                double imposto = tomate.calcularImposto();
                
                System.out.println("Relatorio de imposto do computador");
                System.out.println("Tomate: " + tomate.getNome());
                System.out.println("Valor: " + tomate.getValor());
                System.out.println("Imposto a ser pago: " + imposto);

            }
        }


        --> Nesse exemplo de caculadora imposto podemos criar algo mais generico passando um paramentro polimorfico, deixando um baixo acoplamento;


        ex: 

        public class CalculadoraImposto{
            public static void calcularImposto(Produto produto){
                double imposto = produto.calcularImposto();

                System.out.println("Relatorio de imposto: ");
                System.out.println("Produto : " + produto.getNome());
                System.out.println("Valor : " + produto.getValor());
                System.out.println("Imposto a ser pago : " + imposto);
            }
        }


        metodo todo responsavel para criar imposto;


        public class Televisao extends Produto{
            public static final IMPOSTO_POR_CENTO = 0.21;

            public Televisao(String nome, double valor){
                super(nome, valor); 
            }

            @Override
            public double calcularImposto(){
                System.out.println("Calculando o imposto da Televisao");
                return this.valor * IMPOSTO_POR_CENTO;
            }
        }

        produto teste --> executavel 

         public class Main{
                public static void main(String[] args){
                Televisao tv = new Televisao("Sansung 50\" ", 5000);

                CalculadoraImposto.calcularImposto(tv);

            }
        }


        --> Entao o que criamos foi um metodo generico, onde recebe um objeto fazendo uso de heranca das regras do java , e podemos estender essa funcionalidade para varios objetos que sao do tipo Produto, bom e isso.

        




POLIMORFISMO CAST E INSTANCEOF -> CAMINHO INVERSO


         public class Tomate extends Produto{
            public static final IMPOSTO_POR_CENTO = 0.06;
            private String dataValidade;

            public Tomate(String nome, double valor){
                super(nome, valor);
            }

            @Override
            public double calcular imposto(){
                System.out.println("Calculando o imposto de tomate");
                return this.valor = IMPOSTO_POR_CENTO;
            }

            public String getDadaValidade(){
                return dataValidade;
            }

            public void setDataValidade(String dateValidade){
                this.dataValidade = dataValidade;
            }
        }



        public class Main{
            public static void main(String[] args){
                Produto produto = new Computador("Ryzen 9", 3000);

                Produto produto2 = new Tomate("Americano" , valor);

                --> como queremos agora acessar a data de validade nao podemos utilizar mais produto como tipo,porque validade nao esta contino na classe Produto, entao temos que criar do tipo tomate;

                Tomate tomate = new Tomate("Americano", 20);
                tomate.setDataValidade("11/12/2021"); 

                CalculadoraImposto.calcularImposto(tomate);

                quando for calcular o imposto voce precisa imprimir a data de validade caso o produto seja um tomate -> so que calcular imposto esta recebendo um objeto Produto, mas na Classe produto nao esta contido a validade.

                public static void calcularImposto(Produto produto)...

            }
        }

        o que precisamos fazer nesse caso e o contrario, preciso passar um objeto da subclasse para superclasse, mas precisamos pegar esse objeto de volta;


        public class CalculadoraImposto{
            public static void calcularImposto(Produto produto){
                double imposto = produto.calcularImposto();

                System.out.println("Relatorio de imposto: ");
                System.out.println("Produto : " + produto.getNome());
                System.out.println("Valor : " + produto.getValor());
                System.out.println("Imposto a ser pago : " + imposto);

                // -> produto e um objeto do tipo tomate, ou seja essa variavel tomate vai fazer referencia para o mesmo objeto que produto esta fazendo, ; 

                //       Tomate tomate = produto;

                //--> se fizermos somente isso aqui ira dar erro, pois nao podemos fazer esse cast, sem ter certeza que ele ira funcionar, o java sabe que tomate e um produto,mas nao sabe necessariamente qual e o produto, precisamos especificar para o computador, entao precisamos fazer um cast explicito, forcando aquilo;

                // correto seria: 

                Tomate tomate = (Tomate) produto;

                System.out.println(tomate.getDataValidade());

            }
        }


        agora na classe  main podemos....


        public class Main{
            public static void main(String[] args){
                Produto produto = new Computador("Ryzen 9", 3000);

                Tomate tomate = new Tomate("Americano", 20);
                tomate.setDataValidade("11/12/2021"); 

                CalculadoraImposto.calcularImposto(tomate);

                --> agora se executarmos assim ira dar certo, sera impresso a data de validade de tomate, porem quando nos tentarmos executar um produto ira dar erro pois produto e um computador, ele e uma excecao, porque colocamos que produto ira ser refenreciado por uma variavel de tomate, e nao podemos fazer isso pois eles estao na mesma linhagem de heranca(eles sao irmaos), podemos fazer o cast somente de pai para filho;

                CalculadoraImposto.calcularImposto(produto); 
                
            }
        }
        
        
        entao para podermos executar precisamos fazer antes uma verificacao se produto necessariamente vai ser sempre um tomate e para isso temos uma palavra reservada chamada instanceof


        public class CalculadoraImposto{
            public static void calcularImposto(Produto produto){
                double imposto = produto.calcularImposto();

                System.out.println("Relatorio de imposto: ");
                System.out.println("Produto : " + produto.getNome());
                System.out.println("Valor : " + produto.getValor());
                System.out.println("Imposto a ser pago : " + imposto);
                
                if(produto instanceof Tomate){
                Tomate tomate = (Tomate) produto;
                System.out.println(tomate.getDataValidade());
                }

                vamos enterder: se o objeto que o produto estiver referenciando for uma instancia de Tomate eu quero que voce execute esse codigo, entao ele vai executar o codigo se e somente se o objeto que o produto estiver fazendo refencia for uma instancia de tomate. 
            }
        }

        entao agora na main, ele ira executar: 

        CalculadoraImposto.calcularImposto(tomate);  --> com a data 

        CalculadoraImposto.calcularImposto(produto); --> sem a data (produto referenciamos com o tipo Produto produto = new Computador(), ou seja uma instancia de computador);






POLIMORFISMO PROGRAMACAO ORIENTADA A INTERFACE 

        public interface Respositorio{
            void salvar();
        }


        public class RepositorioBandodeDados implements Repostorio{
            @Override
            public void salvar(){
                System.out.println("Salvando em um banco de dados");
            }
        }

        public class RepositorioMemoria implements Repostorio{
            @Override
            public void salvar(){
                System.out.println("Salvando em memoria ");
            }
        }

        public class RepositorioArquivo implements Repostorio{
            @Override
            public void salvar(){
                System.out.println("Salvando em um arquivo");
            }
        }


        public class RepositorioTeste{
            public static void main(String[] args){
                RespositorioBancodeDados respositorioBancodeDados = new RespositorioBancodeDados();

                RepositorioBandodeDados.salvar();

                aqui estamos salvando em um banco de dados, mas caso nos nao queiramos salvar em um banco de dados mas sim em um arquivo como devemos fazer? nao e necessario criar uma nova instancia somente fazer 

                Repositorio repositorio = new RepositorioArquivo();

                repositorio.salvar();  --> aqui estamos salvando em arquivo


                mas caso queiramos salvar de outra forma basta somente mudar o tipo da onde vai ser instanciado

                ex2: 

                     Repositorio repositorio = new RepositorioMemoria();

                     repositorio.salvar();  --> aqui vai salvar em memoria;
            }
        } 


        programar em interface --> aumenta a manutenabilidade do codigo!!




    

EXECECOES ERROS 

        --> sao condicoes anormais do programa, existem diversos tipos de excecoes que estao dentro do controle e outras estao fora de controle, por exemplo se criamos um atributo onde ele nao possa receber um numero negativo, ex: data, sao fluxos onde temos comos esperar, esta dentro do nosso controle, mas existem outros que estao fora do nosso controle, imaginamos que estamos tentando ler um arquivo onde este arquivo nao tem permissao para leitura... o java oferece para gente diversas classes e oportunidades para poder trabalhar com essas formas anormais.

            - todas as excecoes do java sao da classe Throwable, praticamente a mae de tudo que acontece de ruim em um sistema onde possui dois tipos: sendo eles erros, e exception 

                ERROS : Sao situacoes onde nao podemos recuperar, se temos um erro de memoria o que podemos fazer que a JVM ja nao tenha tentado, erros que aparece no programa onde sao impossiveis de recuperar em tempos de execucao, precisamos parar o programa, resolver o problema e depois iniciar novamente. Quando temos um erro, a JVM provavelmente para de funcionar...




    

RUNTIME EXCEPTION 

        -> Como filha da Throwable, nos temos errors e exception, quando falamos que ocorreu uma excecao nos estamos referindo que ocorreu uma excecao no sentido que o fluxo normal aconteceu, mas para certificacao e forma mais tecnica errors e excecao sao coisas diferentes, o erro que foi lancado e uma subclasse de error, quando se referimos a excecao , ou seja aquilo que foi lancado uma dessas classes ou qualquer outra que podemos criar e filho de exception: 


            RUNTIME EXEPTION: Conceitos que precisamos saber, que existem excecoes checadas e excecoes nao checadas

                //CHECKED: 
                    - excecoes que sao checadas sao filhas da classe "exception" diretamente e essas excecoes nao tratadas elas vao lancar um erro em tempo de compilacao, ou seja, nem conseguimos compilar o codigo, pois o compilador vai reclamar que voce nao tratou

                //UNCHECKED:
                    - execoes que sao filhas ou incluindo a classe "exception", essas excecoes que quando lancadas pelo programa quase 100% das vezes o problema e voce mesmo, ou seja voce nao tratou, ou voce nao fez uma verificacao.
        
        RESUMO: RuntimeException e uma excecao, error nao e uma excecao pois nao e filha de "exception", error e um Throwable e exception tambem e um Throwable, onde RuntimeException e uma excecao do tipo UNCHECKED, ou seja, voce nao precisa fazer a validacao para seu codigo compilar, ou seja, quando acontece, e um erro de desenvolvimento e nao de execucao.

        o qual a diferenca entre IOException E RuntimeException? 

            - IOException e uma excecao do tipo CHECKED, ou seja, voce e obrigado a tratar, e RuntimeException e uma excecao do tipo UNCHECKED, ou seja, voce nao e obrigado a tratar, mas pode tratar se quiser, e a diferenca entre elas e que a IOException e uma excecao que pode acontecer em tempo de execucao, e a RuntimeException e uma excecao que pode acontecer em tempo de compilacao, ou seja, se voce nao tratar a excecao do tipo IOException, o seu codigo nao ira compilar, e se voce nao tratar a excecao do tipo RuntimeException, o seu codigo ira compilar, mas pode dar erro em tempo de execucao.






EXEPTION

        O QUE E UMA STACK? 

            - Uma stack e uma pilha de execucao, onde temos um metodo que chama outro metodo, que chama outro metodo, que chama outro metodo, e assim por diante, e quando um metodo e chamado ele e colocado no topo da pilha, e quando ele termina ele e removido da pilha, e quando temos um erro de execucao, o erro e lancado na pilha, e a pilha e percorrida de baixo para cima, e quando o erro e lancado ele vai percorrer a pilha de execucao, e quando ele nao encontra um tratamento

        CHECKED:  

            - Sao excecoes que sao filhas da classe "exception" diretamente e essas excecoes nao tratadas elas vao lancar um erro em tempo de compilacao, ou seja, nem conseguimos compilar o codigo, pois o compilador vai reclamar que voce nao tratou


        Podemos utilizar como exemplo uma classe onde quase sempre ira pedir para realizar um tratamento, que e a parte de arquivos: 

        ex: se voltarmos a documentacao do java e pesquisar pela classe java.io.File, bom veremos varios metodos onde o que importa agora e o metodo createFile que retorna um boolean, podemos ver a assinatura do metodo que esta descrito como: "Throws IOException" esta falando que existe a possibilidade desse metodo lancar essa excecao IOException, se clicarmos veremos que IOException e filha da classe Exception, sendo uma excecao do tipo checkage, ou seja, precisamos oferecer um tratamento para ela, e se tiver algum problema na entrada ou saida ira retornar um erro, vamos ver na pratica...

            public class ExceptionTeste{
                public static void main(String[] args){

                }
                private static void criarNovoArquivo(){
                    File file = new File("arquivo\\teste.txt");  
                    --> aqui estamos criando apenas um objeto de um arquivo e nao um novo arquivo.


                }

                // aqui criarmos um novo pasta onde iremos salvar os arquivos, quando trabalhamos com java ele na hora da compilacao que qualquer caminho que voce esteja passando aqui no arquivo ele vai comecar do root do projeto, ou seja, se colocarmos um arquivo.txt, ele ira criar somente um arquivo, e no caso queremos utilizar um diretorio, entao precisamos colocar o caminho completo, ou seja, o caminho completo do arquivo que queremos criar
            }

        passo 2, vamos criar o arquivo: 

            public class ExceptionTeste{
                public static void main(String[] args){

                }
                private static void criarNovoArquivo(){
                    File file = new File("arquivo\\teste.txt");  
                    
                    file.createFile();

                    --> ao fazermos isso ira criar um erro de compilacao, pois esta falando que temos uma excecao do tipo checkage que nao esta sendo tratada, uma camada de seguranca que o java oferece, pois nao temos total controle do que esta acontecendo na criacao de um arquivo, entao o java te forca a fazer um tratativa, para caso isso aconteca, caso voce nao faca a JVM nao ira deixar voce compilar e executar seu programa. 
                }
            }
            

        passo 3, tratativas: 


                --> Entao precisamos falar para o java, tenta executar esse pedaco de codigo, e se voce lancar alguma excecao, pega essa excecao. 

                ou seja> 
                
                try> tenta fazer alguma coisa e se der algum problema, voce ...
                catch > pega, e voce precisa falar para o java o que voce esta querendo pegar que no caso e a IOException, que seria como se fosse um metodo, o java quando criar uma excecao ele vai criar um objeto para voce e vai referenciar o objeto aqui " IOException " .  

            public class ExceptionTeste{
                public static void main(String[] args){

                }
                private static void criarNovoArquivo(){
                    File file = new File("arquivo\\teste.txt");  
                    try {
                        // tenta 
                    } catch (IOException e){
                        // pega 
                        --> se colocarmos dessa forma ira dar erro, pois todas as vezes que estivermos trabalhando com alguma das subclasses de exception que nao e runtime, precisa ter um codigo que ta falando que existe a possibilidade de lancar, a unica opcao que temos para que isso nao ocorre e utilizar catch (Exception e), que no caso nao e o mais indicado, essa classe e mais generica e as boas praticas dizem que voce deve tentar capturar as excecoes mais especificas porque voce pode oferecer um tratamento melhor. ele nao da um erro de compilacao porque tambem pode ser do tipo RUNTIME.
                    }
                    file.createFile();
                }          
            }
            
        
        passo 4, tratativas mais especificas:
            
            --> se colocarmos algo dentro do corpo try, nao teremos mais erros, porque estamos oferecendo um tratamento, ou seja tenta executar o file.createFile();, caso de algum problema nessa linha pule para a linha do corpo dentro de catch

             public class ExceptionTeste{
                public static void main(String[] args){

                }
                private static void criarNovoArquivo(){
                    File file = new File("arquivo\\teste.txt");  
                    try {
                      boolean isCriado = file.createFile();
                      System.out.println("Arquivo criado" + isCriado);

                      --> o que ocorre aqui e, tenta criar o arquivo , se executar perfeitamente ele vai pular para o sout e depois para a linha 18, o catch nunca vai ser executado, agora se tiver um problema na criacao do arquivo ele vai pular direto para o catch.

                    } catch (IOException e){
                       
                        --> e quando fazemos quanto temos um catch? primeiramente nunca podemos deixar este bloco em branco, porque deixando esse bloco em branco estamos ignorando completamente essa excecao e avisando para completamente ninguem que essa excecao esta acontecendo,sempre temos que avisar o que esta acontecendo aqui uma forma e: 
                        
                        e.printStackTrace();

                        --> o que e o printStackTrace? e um metodo que vai imprimir a pilha de execucao, ou seja, temos a stack que no caso a metodo inferior do topo vai chamando as superiores, exemplo a main chama x e x chama y ... , se der um excecao em "y", o que ira acontecer, a excecao ira voltar para o metodo que chamou(x), e se tiver um tratamento em "x" ele ira tratar e o codigo ira continuar a ser executado, caso nao seja executado ele ira jogar de volta para o metodo main, e se o metodo main nao tratar ai a JVM ira parar de funcionar: e ai colocando esse comando "e.printStackTrace();" ele vai imprimir a pilha de execucao para tentar ver tudo que aconteceu, mas o programa nao ira parar de funcionar pois estamos fazendo uma tratativa, apesar de nao esta sendo colocado as regras de negocio,que segundo ponto e evitar colocar as regras de negocio no catch nao deve ser colocadas dentro do catch, ele e simplismente lidar com excecoes, se colocarmos regras de excecoes dentro do catch, o codigo vai estar muito mal desenvolvido. 
                    }
        18...        
                }
             }


        passo 5, resultado final:
        

             public class ExceptionTeste{
                public static void main(String[] args){
                    criarNovoArquivo();
                }
                private static void criarNovoArquivo(){
                    File file = new File("arquivo\\teste.txt");  
                    try {
                      boolean isCriado = file.createFile();
                      System.out.println("Arquivo criado" + isCriado);

                    } catch (IOException e){
                        e.printStackTrace();
                    }       
                }
             }

             -> agora caso de algum erro sera imprimido a pilha de execucao, a stacktrace.






LANCANDO EXCECAO UNCHECKED

            --> EX: 

            public class RuntimeException{
                public static void main(String[] args){
                    divisao(10, 0);   
                }
                private static int divisao(int a, int b){
                    return a / b;
                }
            }

                --> caso executarmos isso ira dar uma ArithmeticException que e uma runtime exception, ou seja, nao precisamos tratar, mas caso queiramos tratar, podemos fazer da seguinte forma:






                public class RuntimeException{
                    public static void main(String[] args){
                        divisao(10, 0); 
                    }
                        public static int divisao(int a, int b){
                            try{
                                return a / b;
                            }
                            catch(RuntimeException e){}
                                e.printStackTrace();
                    }
                    System.out.println("Chegou aqui");
                }

                    --> Quando falamos que um metodo precisa ter um retorno, ele tem esse retorno de try e se der tudo certo ele retorna a/b, se der tudo errado ele faz o printstacktrace, lembrando que o try and catch ele nao parar o codigo, se colocarmos aquela mensagem "chegou aqui", ela ira ser executada, e significa que o metodo vai acabar sem ter dado um retorno.



                
                o que fazer: 
                
                public class RuntimeException{
                    public static void main(String[] args){
                        divisao(10, 0); 
                    }
                        public static int divisao(int a, int b){
                            try{
                                return a / b;
                            }
                            catch(RuntimeException e){}
                                e.printStackTrace();
                    }
                    return 0;
                }

                    --> colocando um return no final, vai acontecer no cenario onde o catch e executado entao voce tenta executar a linha "return a/b", opa ... se der problema ele vai executar o catch e depois retornar zero, isso significa que a JVM nao vai dar um crash, nao ira parar de funcionar, mas tera um stacktrace mesmo assim, podemos tambem trabalhar de uma forma diferente...




                public class RuntimeException{
                    public static void main(String[] args){
                        System.out.println(divisao(10, 0)); 
                    }
                        public static int divisao(int a, int b){
                            if(b == 0){
                                throw new RuntimeException("Argumento ilegal, nao pode ocorrer uma divisao por zero");
                            }
                            try{
                                return a / b;
                            }
                            catch(RuntimeException e){}
                                e.printStackTrace();
                    }
                    return 0;
                }   

                    --> o que fizemos aqui foi lancar uma excecao, sabemos que nao podemos ter uma divisao por zero, se uma pessoa mandar uma divisao por zero, a gente tem que mandar uma excecaom, dizendo: "olha voce esta mandando uma argumento errado", entao podemos utilizar o if, dizendo olha se o b for == a zero... antigamente colocariamos return 0; porque nao sabia se utilizar excecao , agora podemos colocar o seguinte: olha se voce esta mandando b == 0 lanca throw o que? uma nova(new) excecao, e o x da questao vem ai, porque devemos pensar em colocar qual tipo qual excecao, no caso ai colocamos a RuntimeException.

                        --> quando fizemos isso o codigo abaixo do if nao sera executado, a nao ser que o if seja falso, se b == 0 o codigo ira executar a linha throw new RuntimeException... e vai voltar para quem chamou que no caso e System.out.println(divisao(10, 0)); ... 




                    -> e no caso poderiamos melhorar ainda mais 

                    public class RuntimeException{
                        public static void main(String[] args){
                            System.out.println(divisao(10, 0)); 
                        }
                        public static int divisao(int a, int b){
                                if(b == 0){
                                    throw new IllegalArgumentException("Argumento ilegal, nao pode ocorrer uma divisao por zero");
                                }
                            return a / b;
                        }
                    }


                    --> nesse caso nao e necessario mais fazer o try catch, aqui podemos apenas retornar a/b, agora caso executarmos nao teremos mais aparecendo o zero no console caso de erro, o que ira apararecer sera, a mensagem dita acima.

                        -> existem varios tipos de excecoes neste caso existe uma propria chamada IllegalArgumentException, se formos dentro dela poderemos ver que e a mesma e uma filha de RuntimeException, essa excecao significa que o metodo recebeu um argumento inapropriado, o melhor a se utilizar sao as expressoes mais especificas possiveis, que quando uma outra pessoa tiver utilizando seu codigo ela ira entender o que esta acontecendo. 


                    podemos tratar uma metodo ainda mais como o exemplo abaixo: 

                    public class RuntimeException{
                        public static void main(String[] args){
                            try{
                                divisao(10, 0);
                            }
                            catch(IllegalArgumentException e){
                                e.printStackTrace();
                            }
                            system.out.println("Codigo finalizado");
                        }

                        public static int divisao(int a, int b){
                                if(b == 0){
                                    throw new IllegalArgumentException("Argumento ilegal, nao pode ocorrer uma divisao por zero");
                                }
                            return a / b;
                        }
                    }

                        --> com este exemplo fica totalmente claro o que queremos expressar, estamos trabalhando com a stack , entao o main faz uma chamada para o metodo divisao, se caso o main chamar o metodo divisao passando um b == 0, ele ira dar uma excecao throw new IllegalArgumentException, e essa excecao ira ser propagada para baixo, ou seja ela ira retornar para o main, o main se nao fizer nenhum tipo de tratamento o codigo simplismente ira parar de funcionar, entao nesse caso como fizemos o tratamento, podemos ver embaixo que ira aparecer a mensagem de codigo finalizado, 

                            -> porque? porque temos um tratamento  para excecao imprimindo o mensagem, mas caso retiramos esse tratamento essa mensagem nunca sera impressa.




                    -> caso queiramos avisar para outras pessoas que estao utilizando nosso codigo que esse metodo pode lancar uma excecao, podemos fazer da seguinte forma:

                    public static int divisao(int a, int b) throws IllegalArgumentException{
                                if(b == 0){
                                    throw new IllegalArgumentException("Argumento ilegal, nao pode ocorrer uma divisao por zero");
                                }
                            return a / b;
                    }   

                            --> aqui estamos avisando para outras pessoas que estao utilizando o codigo, que este metodo tem a possibilidade de lancar uma excecao desse tipo, e apenas adicionar Throws + o tipo de excecao que pode ser lancada, logo apos a assinatura do metodo , lembrando que excecoes do tipo RuntimeException o tratamento e opcional, se o metodo que esta chamando nao quer tratar nada vai acontecer, nao significa que o programa nao ira compilar. em geral nao e de muito costume utilizar isso, o que se utiliza mais e colocar um comentario abaixo como: 


                     public class RuntimeException{
                        public static void main(String[] args){
                            divisao(10, 0);

                            system.out.println("Codigo finalizado");
                        }

                        //** 
                        *
                        * @param a
                        * @param b nao pode ser zero
                        * @return
                        */

                        public static int divisao(int a, int b){
                                if(b == 0){
                                    throw new IllegalArgumentException("Argumento ilegal, nao pode ocorrer uma divisao por zero");
                                }
                            return a / b;
                        }
                    }






LANCADO EXCECAO CHECKED

    -> so um resumo do porque se utiliza excecoes, isso e feito para proteger o codigo, quando trabalhamos com back e front , voce vai retornar para pessoa do outro lado da tela, alguma mensagem de erro, ou seja uma programacao defensiva.

    
    vamos utilizar isso como exemplo: 

    public class ExceptionTeste{
                public static void main(String[] args){
                    criarNovoArquivo();
                }
                private static void criarNovoArquivo(){
                    File file = new File("arquivo\\teste.txt");  
                    try {
                      boolean isCriado = file.createFile();
                      System.out.println("Arquivo criado" + isCriado);

                    } catch (IOException e){
                        e.printStackTrace();
                    }       
                }
        }

    --> existe pros e contras utilizando o tratamento de excecao utilizando try e catch, o pro disso e que voce faz com que o codigo nao pare de funcionar, contra seria a pessoa que esta chamando seu metodo, nao tem a opcao de fazer o tratamento do jeito dele, vamos supor no metodo criacao de arquivo onde chamamos o createFile do java, e o que aconteceria se a galera do java fizesse o tratamento de excecao dentro desse metodo, nesse caso quando eles fazem o tratamento dentro da biblioteca ou API, nos mesmos nao temos muito o que fazer... por isso poderiamos fazer esse criarNovoArquivo de outra forma... ou seja nao queremos fazer o tratamento dele, queremos enviar a responsabilidade para quem esta chamando, e para isso podemos fazer da seguinte forma:

        public class ExceptionTeste{
            public static void main(String[] args){
                criarNovoArquivo();
            }
            private static void criarNovoArquivo() throws IOException{
                File file = new File("arquivo\\teste.txt");  
                    try {
                      boolean isCriado = file.createFile();
                      System.out.println("Arquivo criado" + isCriado);

                    } catch (IOException e){
                        e.printStackTrace();
                    }       
                }

                --> ao adicionar throws IOException, quem quer que esteja chamando esse novo arquivo e obrigado a tratar essa excecao, como? utilizando try e catch ou jogando o trabalho para outra metodo que esteja chamando, mas nesse caso quem esta chamando e o metodo main por ultimo entao nao tem muito o que fazer.

                    --> quando voce deve utilizar throws e quando deve se utilizar try catch, quando temos um metodo privado temos que utilizar try e catch, porque ninguem fora dessa classe vai poder chamar o metodo e tratar ele em outra classe. agora se criar o metodo como public voce nao faz ideia de quem pode tratar ele, em qual parte do projeto pode ser chamado entao e mais interessante utilizar o Throws. 
            }



            --> outro exemplo:

            public static void main(String[] args) throws IOException{
                    criarNovoArquivo();
            }
            private static void criarNovoArquivo() throws IOException{
                File file = new File("arquivo\\teste.txt");  
                    try {
                      boolean isCriado = file.createFile();
                      System.out.println("Arquivo criado" + isCriado);

                    } catch (IOException e){
                        e.printStackTrace();
                        throw e;
                    }       
                

                --> temos uma opcao de fazer algo hibrido, voce captura a excecao e relanca a excecao. quando isso e util? imagina que temos um carrinho de compra, e tenta efetuar um pagamento. o pagamento pode falhar, quando o pagamento falha, voce quer ver no seu console que realmente falhou e quer dar a opcao para o cliente de uma nova tentativa. entao voce quer capturar a excecao quer mostrar no console, e ainda quer retornar para quem esta chamando seu metodo.
                
                    - como voce faz isso? 
                        entao quando createFile lanca uma excecao um objeto e criado, e esse objeto e referenciado aqui(IOException e), ai nos estamos imprimindo a pilha de execucao, e tratando a excecao, mas o deu merda, entao colocamos throw e; porque? quando colocamos isso dizemos "joga novamente", no exemplo que demos da divisao nos colocamos throw new, porque nos nao temos uma excecao , nos estamos criando uma excecao, mas nesse caso do catch nos temos uma excecao !! objeto esta sendo referenciado pela variavel e , estamos falando primeiro imprime no console depois lanca , quando voce lanca uma excecao do tipo IOException, voce e obrigado a colocar throws IOException na assinatura, porque se voce esta lancado uma excecao do tipo CHECKED voce e obrigado a dizer para os outros metodos que estao chamando que eles tem que tratar essa execao;

                            - o que e essa relancar excecao? e quando voce captura uma excecao e relanca ela para quem esta chamando. 

                            -> Entao tratamos a excecao, exibimos no console atraves do e.printStackTrace();, mas nao sabemos o que o metodo criarNovoArquivo(); quer fazer, por exemplo no metodo main poderiamos fazer um tratamento diferente, do tipo enviar um email dizendo que nao foi possivel criar o novo arquivo, isso e responsabilidade do metodo main, o que eu queria no metodo criarNovoArquivo(); era trabalhar na impressao do console e relancar essa excecao.

                                --> isso nao se encaixa as regras de negocio e simplismente uma forma alternativa de trabalhar com excecoes, por exemplo em um sistema de pagamento, se caso nao der certo, voce nao ira tentar fazer o pagamento novamente dentro do catch voce ira mandar para outro metodo responsavel pela chamada de uma nova tentativa de pagamento.  
                }





EXCECOES BLOCO FINALLY 

        --> esse caso e quando voce precisa que algum pedaco de codigo seja executado independente da condicao que esteja acontecendo dentro do try catch 
{           

        -> quando estamos trabalhando com arquivos, temos que fechar o arquivo, ou seja, quando voce abre um arquivo voce tem que fechar, e se voce nao fechar o arquivo, ele vai ficar aberto, e se voce ficar abrindo e fechando arquivos, o sistema operacional vai ficar sem memoria, entao e muito importante fechar o arquivo, e o finally e um bloco que e executado independente do que aconteca, se der certo ou errado, o finally vai ser executado, e e muito util para fechar arquivos, conexao com banco de dados, ou seja, qualquer coisa que voce precisa fechar, e muito util para isso.

        --> exemplo:

                public class RuntimeException{
                    public static void main(String[] args){
                        try{

                            System.out.println("Abrindo arquivo");
                            System.out.println("Escrevendo no arquivo");
            8 -             System.out.println("Fechar arquivo");

                        }catch (Exception e){
                            e.printStackTrace();
                    }

                    --> vamos supor que no momento que voce esteja escrevendo os daods no arquivo voce tenha uma excecao, a linha 8 nunca sera executada, aconteceu uma vez entao o problema persiste, e voce tem a sua aplicacao rodando em producao para milhares de pessoas acessando, e todas as vezes que voce tentar abrir e tentar escrever um recurso continuara aberto, em algum momento a memoria ira estourar e o processamento do programa ira parar de funcionar.
                    
                        --> Entao em casos especificos estamos trabalhando onde os recursos precisam ser fechados, a melhor parte para fazermos isso e durante o finaly, ele sempre sera executado independente de qualquer coisa
                }    
            }


            -> atualizando o codigo:

                public class RuntimeException{
                    public static void main(String[] args){
                        try{

                            System.out.println("Abrindo arquivo");
                            throw new RuntimeException(); 

                        }catch (Exception e){
                            e.printStackTrace();

                        }finally{
                            System.out.println("Fechar arquivo");
                        }
                    }

                    --> o que acontece? vamos supor que abrimos o arquivo e tivemos uma excecao, ai essa excecao foi capturada e foi impressa no console, mas mesmo com a excecao acontecendo no catch o finally sera imprimido.
                }

            

            resumo: o bloco finally e utilizado quando trabalhado com recursos precisam ser liberados por outras aplicacoes, que precisam ser fechados apos seu uso, e durante a criacao do try, voce nunca pode criar um try sozinho, ou try catch ou try finally(nao e tao utilizado no dia dia);
            





EXCECOES CAPTURANDO MULTIPLAS EXCECOES 

    -> existem casos aonde um metodo vai lancar mais de uma excecao;
        
        public class RuntimeException{
            public static void main(String[] args){
                try{
                    throw new IllegalArgumentException();
                }
                catch (ArrayIndexOutOfBoundsException){
                    System.out.println("Dentro do ArrayIndexOutOfBoundsException");
                }
                catch (IllegalArgumentException){
                    System.out.println("Dentro do IllegalArgumentException"); --> ira aparecer essa mensagem no console;
                }
                catch (ArithmeticException){
                    System.out.println("Dentro do ArithmeticException");
                }
                catch (RuntimeException){
                    System.out.println("Dentro do RuntimeException");
                }
            }

            --> como podemos ver, temos a possibilidade de tratar varias excecoes dentro de um metodo, e apenas adicionar catch, mas existem algumas regras,a primeira regra e que nao podemos colocar um tipo mais generico a frente dos outros catchs;
            
            {
                porque? quando temos a RuntimeException, nos temos o tipos mais generico, todas essas outras como ArithmeticException, IllegalArgumentException ... sao filhas da RuntimeException, significa entao que qualquer uma dessas excecoes podem ser referenciadas por um objeto da classe RuntimeException, pela regra do polimorfismo;
        }       

               public class RuntimeException{
                     public static void main(String[] args){
                try{
                    throw new RuntimeException();
                }
                catch (RuntimeException){
                    System.out.println("Dentro do RuntimeException");
                }
                catch (ArrayIndexOutOfBoundsException){
                    System.out.println("Dentro do ArrayIndexOutOfBoundsException");
                }
                catch (IllegalArgumentException){
                    System.out.println("Dentro do IllegalArgumentException"); --> ira aparecer essa mensagem no console;
                }
                catch (ArithmeticException){
                    System.out.println("Dentro do ArithmeticException");
                }

                ou seja, se colocarmos o catch sendo ele RuntimeException acima de todos os outros nenhum que esta abaixo podera ser executado, independente da excecao do tipo RuntimeException que sera lancada nenhum dos catch abaixo ira capturar, pois quem vai capturar sera o catch mais generico acima que no caso e o RuntimeException, entao lembrando excecoes mais genericas sempre tara que vir ao final, porque se nao a referencia do objeto ira direto para ela e essas catchs abaixo nunca serao executados.
            }






EXCECOES MULTI CATCH EM LINHAS
    
    -> podemos ter multiplos catch mas temos uma sintaxe para melhorar o codigo, e o que essa sintaxe fala? diz que voce pode colocar excecoes que nao estao na mesma linha de heranca dentro do mesmo catch separados via pipe "|"{

        --> por exemplo:  se voce tem uma excecao que e filha de RuntimeException e outra que e filha de IOException, essas excecoes nao seguem a mesma linha de heranca, entao voce pode colocar essas excecoes dentro do mesmo catch separados por pipe "|", e isso e muito util para diminuir a quantidade de codigo que voce tem que escrever, e tambem para melhorar a legibilidade do codigo.

            ex: 

            public class Teste{
                public class void main[String[] args]{
                    try{
                        talvezLanceException();
                    }
                    catch (SQLException | FileNotFoundException e){
                        e.printStackTrace();

                        // -> aqui diz que voce pode capturar uma excecao do tipo SQLException | FileNotFoundException e, pode colocar as duas pois elas seguem o mesmo raciocionio de heranca
                    }
                    catch(SQLException | FileNotFoundException | IOException e){
                        e.printStackTrace();

                        //-> se caso colocarmos uma excecao que nao segue a mesma linha de heranca, ira dar erro , pois a IOException nao segue a mesma linha de heranca que a SQLException e FileNotFoundException
                    }
                }

                public static void talvezLanceException() throws SQLException, FileNotFoundException{
                    
                }
            }



            -->  poderiamos fazer da seguinte forma : 
    }   

        public class Teste{
                public class void main[String[] args]{
                    try{
                        talvezLanceException();
                    }
                    catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticExceptione){
                        e.printStackTrace();

                    }
                    catch(RuntimeException e){
                        e.printStackTrace();
                    }

                    --> Podemos colocar dessa forma, que seria um catch que pega as excecoes mais especificas, e caso aconteca alguma coisa fora dessas excecoes nos temos um catch mais generico que no caso e o RuntimeException, e isso e muito util para diminuir a quantidade de codigo que voce tem que escrever, e tambem para melhorar a legibilidade do codigo.
                }

                public static void talvezLanceException() throws SQLException, FileNotFoundException{
                    
                }
            }






EXCECOES TRY WITH RESOURCES

    --> ver esse conteudo 






EXCECAO CUSTOMIZADA

    -> Podemos criar nossas proprias excecoes, por exemplo: vamos supor que queremos lancar uma excecao caso o login e a senha estejam incorretos, uma excecao que varia de sistema para sistema. 

        --> para criar uma exceceo customizada, basta criar uma classe e colocar um nome com final exception, exemplo: 
            -> LoginException
        
        --> depois escolhemos qual excecao desejamos extender, uma excecao do tipo CHECKED ou do tipo UNCHECKED 

            ex: 
                public class LoginInvalidoException extends Exception{
                    public LoginInvalidoException(){
                        super("Login invalido!!");
                    }
                    public LoginInvalidoException(String message){
                        super(message);
                    }

                    --> nos lancamos esse dois construtores porque? podemos ou nao passar uma mensagem especifica dentro da execao quando utilizarmos, caso nao passarmos isso tera uma mensagem padrao!!
                }

                --> Aqui lancamos uma excao customizada !! 


            EXEMPLO PRATICO UTILIZANDO EXCECOES CUSTOMIZADAS: 

                public class Main{
                    public static void main(String[] args){
                        try{
                            logar();
                        }
                        catch(LoginInvalidoException e){
                            e.printStackTrace();
                        }

                        // -> como lancamos uma excecao do tipo checkage, temos que tratar ela aqui ou se nao enviar para quem esta chamando, como no caso essa e a ultima classe que chama pois ela e uma psvm entao tratamos aqui ela dessa forma, onde ela tentar executar o metodo logar, caso contrario ela vai capturar a excecao e imprimir a pilha de execucao.
                    }

                    public static void logar() throws LoginInvalidoException{
                        Scanner imput = new Scanner(System.in);

                        String usuarioBD = "Kayque";
                        String SenhaBD = "123456";
                        
                        System.out.println("Digite o usuario: ");
                        String usuario = imput.nextLine();
                        System.out.println("Digite o Senha: ");
                        String senha = imput.nextLine();

                        if(!usuario.equals(usuarioBD) || !senha.equals(SenhaBD)){
                            throw new LoginInvalidoException("Usuario e senha invalidos");
                        }

                        System.out.println("Logado com sucesso");
                    }

                        --> o que fizemos aqui foi criar um metodo logar, onde ele vai pedir para o usuario digitar o usuario e a senha, e caso o usuario e a senha nao sejam iguais ao usuario e senha do banco de dados, ele vai lancar uma excecao do tipo LoginInvalidoException, e essa excecao vai ser capturada no metodo main, e vai ser impressa a pilha de execucao, e caso o usuario e a senha sejam iguais ao usuario e senha do banco de dados, ele vai imprimir "Logado com sucesso", e isso e uma excecao customizada, e muito util para trabalhar com excecoes que sao especificas do seu sistema, e que nao existem no java, e que voce quer que quem esteja utilizando seu sistema saiba que essa excecao pode acontecer, e que ele pode tratar ela da forma que ele quiser, e isso e muito util para trabalhar com excecoes customizadas.
                }






EXCECOES E REGRAS DE SOBRESCRITA

    ->

        
        public class Pessoa{
            public void salvar() throws LoginInvalidoException, FileNotFoundException{
                System.out.println("Salvando pessoa");
            }
        }

        -> na classe pessoa estamos declarando um metodo, onde o metodo salvar(), pode-se lancar duas excecoes.


            public class Funcionario extends Pessoa{
                public void salvar(){
                    System.out.println("Salvando funcionario");
                }
        }


        -> quando voce esta sobrescrevendo um metodo, voce nao e obrigado a declarar as mesma excecoes que aquele metodo esta declarando, porque a funcinalidade da sobrescrita que voce esta lancando pode ter funcionalidade totalmente diferente, pode ser que ela nao lance excecao, mas tambem voce pode tambem lancar somente uma excecao, ou tamebem pode colocar as duas excecoes na sobrescrita exemplo: 

            public class Funcionario extends Pessoa{
                public void salvar() throws LoginInvalidoException{
                    System.out.println("Salvando funcionario");
                }
            }

        
            --> tambem temos outra opcao, que seria lancar uma excecao do tipo Runtime tambem, na sobrescrita, e nesse caso nao seriamos obrigado a tratar a quem esteja chamando.

            public class Funcionario extends Pessoa{
                public void salvar() throws LoginInvalidoException, ArithmeticException{
                    System.out.println("Salvando funcionario");
                }
            }

            public class Main{
                public static void main(String[] args){
                    Pessoa pessoa = new Pessoa();
                    Funcionario funcionario = new Funcionario();

                    try{
                        funcionario.salvar();
                    } 
                    catch(LoginInvalidoException e){
                        e.printStackTrace();
                    }

                    --> nesse caso aqui como estamos falando que aquele metodo pode lancar tanto uma excecao checkage, tanto uma uncheckage, entao quem esta chamando esse metodo nao e obrigado a tratar essa excecao, entao podemos simplesmente tratar somente a checkage, que ira dar certo na compilacao.
                }
            }


            --> RESUMO DAS REGRAS: quando voce esta sobrescrevendo voce pode nao lancar nenhuma excecao, voce pode lancar uma ou todas as excecoes que tem la, e voce pode lancar qualquer excecao UNCHECKED, filhas de RuntimeException ou voce nao pode lancar excecoes do tipo mais genericas, e tambem nao podemos declarar excecoes do tipo CHECKED que nao foi declarada no metodo original.






// CLASSES UTILITARIAS WRAPPERS 

//     -> sao classes que vao melhorar o desempenho de nossas aplicacoes, melhorar o codigo, sao coisas que esta la para gente utiliziar.

//             o que são Wrappers? Objetos que vao encapsular os tipos primitivos, que sao eles;

//                 - byte
//                 - short
//                 - int 
//                 - long
//                 - float
//                 - double
//                 - char
//                 - boolean

//                 --> aqui trabalhamos com a regra de bits, tamanho do espaco em memoria que voce esta alocando.
                
//         public class Wrapper{
//             public static void main(String[] args){
//                 Byte byteW = 1;
//                 Short shortW = 1;
//                 Integer intW = 1;
//                 Long longW = 10L;
//                 Float floatW = 10F;
//                 Double doubleW = 10D;
//                 Character charW = 'a';
//                 Boolean booleanW = true;

//                 --> para se criar um Wrapper basta pegar o nome do tipo primitivo e comecar com letra maiuscula, com duas excecoes sendo eles o int e o char.
//             }   

//                 --> quando trabalhamos com classes Wrappers, eles valores estao relacionados ao polimorfismo, nao mais aos valores dos tipos primitivos relacionado ao tamanho que voce pode colocar em memoria.

//                 --> esses caras sao objetos, quando voce esta trabalhando com a passagem de parametros voce esta passando atraves de referencia. 

//                 porque o java criou isso? um dos motivos e voce poder passar os valores numericos por referecia nao mais por valor, para caso queiramos fazer alguma alteracao dentro do metodo, o segundo motivo e quando trabalharmos com estrutura de dados do pacote de colecoes, com arrayLists, vetores, collections nao trabalham com tipos primitivos, nao podemos trabalhar com tipos primitivos pois dentro de colecoes guardamos por referencia. Quando trabalharmos com threds precisamos de objetos para trabalhar na parte de sincronizacao.
//         }


//         AUTOBOXING 
//             -> E quando temos um tipo primitivo, mas fazemos o java transformar esse tipo primitivo em Wapper.

//             EX: Integer intW = 1;

//         UNBOXING
//             -> E quando temos uma variavel primitiva mas queremos pegar o Wapper, entao o java esta se encarregando de transformar esse tipo Wapper em primitivo.

//             EX: int i = intW;


        

//         --> temos a obcao, ja que estamos trabalhando com obj de agora utilizar metodos.

//             ex: int i = intW.intValue();

//                 -> basicamente o que o java vai fazer com esse metodo e um cast
                

//             ex2: Integer intW2 = Integer.parseInt("10");

//                 -> o que esse metodo faz? ele pega uma string e transforma em um inteiro, e isso e muito util quando estamos trabalhando com entrada de dados, quando estamos trabalhando com arquivos, quando estamos trabalhando com banco de dados, e muito util para transformar uma string em um inteiro, e isso e muito util para trabalhar com Wrappers.
                

//             PARA CARACTER TEMOS METODOS: 

//             Caracter.isDigit('a'); // retorna false, aceita valores numericos

//             Caracter.isLetter('a'); // retorna true, aceita valores de letras

//             Caracter.isLetterOrDigit('a'); // retorna true, aceita valores de letras e numeros, caso passe um valor '!@#$%¨&*' ele ira retornar false.

//             Caracter.isLowerCase('a'); // retorna true, aceita valores de letras minusculas

//             Caracter.isUpperCase('a'); // retorna false, aceita valores de letras maiusculas

//             Caracter.toUpperCase('a'); // retorna 'A', transforma a letra minuscula em maiuscula

//             Caracter.toLowerCase('A'); // retorna 'a', transforma a letra maiuscula em minuscula

//             Caracter.isWhitespace(' '); // retorna true, aceita valores de espacos em branco

//             Caracter.isWhitespace('\t'); // retorna true, aceita valores de tabulacao

//             Caracter.isWhitespace('\n'); // retorna true, aceita valores de quebra de linha

            





// CLASSES UTILITARIAS STRINGS

//     -> Strings no java sao imutaveis 

//     ex: 
//         public class StringTeste{
//             public static void main(Strings[] args){

//                 String nome = "Kayque"; // String constant pool

//             }
//         }
//         {
//             --> isso significa que uma piscina constante de strings, se tivessimos que desenhar esse cara, e como se tivesse um quadrado grande, que e o Heap(Onde todos os objetos moram), e dentro dessa parte o java cria um espaco especialmente para as Strings, e esse espaco e chamado String pool.

//             --> O java utiliza essa parte de String pool, porque existe um conceito da Ciencia da Computacao chamado (String Interning), que basicamente e quando voce utiliza as Strings de forma imutavel, ou seja, no Java toda String que voce esta criando, se criar ela pela primeira vez ela ira ser alocada no pool de String, mas se voce cria pela segunda vez o java nao ira duplicar. 

//             --> Entao quando colocamos a String nome = "Kayque", temos uma variavel de referencia onde faz refencia para o nome dentro da pool de String, e como sabemos que isso e verdade ? podemos fazer o seguinte: 

//             String nome = "Kayque";
//             String nome2 = "Kayque";

//             System.out.println(nome == nome2);
                
//                 -> quando quisemos comparar a referencia do objeto utilizamos o ==, e nesse caso ele ira retornar true, ou seja, isso significa que esses dois valores estao fazendo referencia para o mesmo objeto em memoria que e o "Kayque", e isso e muito util para economizar memoria, e tambem para melhorar o desempenho da aplicacao, e isso e muito util para trabalhar com Strings.

//                     -> E importante perceber que como String e imutavel, nao e possivel voce alterar esse valor, como veremos: 

//                     public class StringTeste{
//                         public static void main(Strings[] args){

//                             String nome = "Kayque";
//                             String nome2 = "Kayque";

//                             nome.concat(" Allan"); --> metodo para concatenar Strings

//                             System.out.println(nome); // ira retornar somente Kayque, e nao Kayque Allan

//                             System.out.println(nome == nome2); --> ira retornar true 


//                             --> agora vamos entender, como isso deu true sempre que concatenamos isso, e ta concatenando com um sobrenome, e ai que vem a imutabilidade das Strings, a nao ser que fazemos uma nova associacao, nao podemos trocar o valor que existe.
//             }               
//         }   

//         -->  Entao o que esta acontecendo ai, e que tem mais uma String sendo criada na pool de Strings, sendo " Allan", e existe ainda a String concatenada("Kayque Allan"), mas o problema e que nao existe uma variavel de referencia para elas, o que poderiamos fazer e o seguinte:

//         public class StringTeste{
//             public static void main(Strings[] args){
//                     String nome = "Kayque";
//                     String nome2 = "Kayque";

//                     nome = nome.concat(" Allan"); 
                    
//                     // -> Agora a variavel nome esta fazendo referencia para a nova String que foi criada, sendo ela "Kayque Allan".

//                     System.out.println(nome); // ira retornar "Kayque Allan"

//                     System.out.println(nome == nome2); --> ira retornar false 

//                 }

//                 --> Agora quando for impresso ira imprimir "Kayque Allan", e tambem quando tenta comparar as duas ira retorar false, pois agora a variavel nome -> aponta para uma nova String que foi criada.

//             }


            
//             --> agora o que acontece se criarmos uma Strig como se fosse objeto? E possivel criar...

//             ex: 
//                 String nome3 = new String ("Kayque");


//             ex em codigo:
//                 public class StringTeste{
//                     public static void main(Strings[] args){
//                         String nome2 = "Kayque";
//                         String nome3 = new String ("Kayque");

//                     System.out.println(nomeI == nomeO); --> ira retornar false 

//                 }

//                 --> Veremos que ira retornar falso, pois o que esta acontecendo e que temos uma variavel nomeO, fazendo referencia a um objeto, quando criamos dessa forma, esta criando a String em outro lugar, o que esta acontecendo e que estamos criando a String dentro do Heap de memoria(nao no pool de String), entao o nome3 esta fazendo referencia para um objeto que esta no Heap, onde seu conteudo continua sendo o mesmo "Kayque", ou seja, nome3 esta fazendo referencia para um OBJETO que encapsula a String.

//                 {
//                     se quisessemos pegar o valor(conteudo dentro do objeto poderiamos) fazer o seguinte:

//                     System.out.println(nome2 == nome3.intern()); --> ira retornar true
 
//                 }


//                     String nome3 = new String ("Kayque");

//                         -> isso entao cria uma variavel de referencia, tambem um objeto do tipo String, e tambe uma String na pool de String caso nao tenha sido criada.


//             }



//             - resumo: Strings sao imutaveis, e quando criamos Strings da forma literal no codigo ele cria diretamente na pool de String, e quando utilizamos somente nome.concat(); ele cria essa String la no pool, e tambem o resultado, e se nos nao associamos a variavel de referencia para essa nova String o valor e perdirdo, vimos tambem que '==' pode ser feito para comparar referencias, nao o valor em si do objeto que estao referenciando.






// CLASSES UTILITARIAS STRINGS PT2

//     metodos de auxilio para Strings:

//     public class StringTeste{
//         public static void main(String[] args){
//             String nome = "Kayque";

//             System.out.println(nome.charAt(0)); 
//             // retorna K, retorna o caracter que esta na posicao 0

//             System.out.println(nome.length()); 
//             // retorna 6, retorna o tamanho da String

//             System.out.println(nome.replace('K', 'C'));
//             // retorna Cayque, substitui o caracter K por C

//             System.out.println(nome.toLowerCase());
//             // retorna kayque, transforma a String em minuscula

//             System.out.println(nome.toUpperCase());
//             // retorna KAYQUE, transforma a String em maiuscula

//             System.out.println(nome.substring(0, 3));
//             // retorna Kay, retorna a String que esta entre a posicao 0 e 3, ou seja sempre sera menor que o segundo parametro.

//             System.out.println(nome.trim());
//             // retorna Kayque, remove os espacos em branco no inicio e no final da String
//         }
//     }






// CLASSES UTILITARIAS STRINGS PT3

//     public class PerformaceTeste{
//         public static void main(String[] args){
//             long inicio = System.currentTimeMillis();

//             concatString(10_000);

//             long fim = System.currentTimeMillis();

//             System.out.println("Tempo gasto: " + (fim - inicio) + "ms");
//         }
        
//         private static void concatString(int tamanho){
//             String texto = "";

//             for(int i = 0; i < tamanho; i++){
//                 texto += i; // 0,01, 012, 0123 ...
//             }
//         }

//         --> esse programa calcula o tempo da operacao do for, que conforme se utiliza String o tempo vai aumentando, pois a cada iteracao do for ele cria uma nova String, e isso e muito custoso para o processamento, e isso e muito util para mostrar a diferenca de performance entre a utilizacao de Strings.
//     }


//         --> para isso o java criou uma classe chamada StringBuilder que melhora bastante a performace !!


//         --> tambem existe a classe StringBuffer que basicamente e a mesma coisa que StringBuilder, a diferenca e que o StringBuffer e para um ambiente onde tem multiplas threads acessando o mesmo recurso. 


//             -> agora vem o X da questao, quando utiliar cada um(String, StringBuffer ou StringBuilder)? entao quando trabalhamos com o sistema voce esta fazendo o mapeamento das regras de negocio que voce tem no mundo real, essas regras de negocio do mundo real e o que realmente vai te dizer se voce vai utilizar String, StringBuilder ou StringBuffer, na maioria das vezes sempre vamos utilizar Strings, mas quando voce tem um metodo que e chamado muitas vezes, e que voce tem que concatenar muitas Strings, e muito util utilizar o StringBuilder, e quando voce tem um ambiente onde tem multiplas threads acessando o mesmo recurso, e muito util utilizar o StringBuffer, e isso e muito util para melhorar a performace da sua aplicacao, e isso e muito util para trabalhar com Strings.
            
            




// CLASSES UTILITARIAS STRINGBUILDER

//     -> nos vimos que as Strings sao imutaveis e por causa disso que temos aquele ritimo de desempenho baixo, quando concatenamos varias Strings, 

//     public class StringBuilderTeste{
//         public static void main(String[] args){
//             String nome = "Kayque";
//             nome.concat(" Allan");

//             System.out.println(nome); // ira retornar Kayque


//             --> isso nos ja vimos e sabemos como funciona, mas ai temos agora a StringBuilder, quando trabalhamos com StringBuilder, ele e mutavel, porque StringBuilder nao e uma String, ele e uma Classe que no final das contas vai trabalhar com as Strings.

//             ex: StringBuilder sb = new StringBuilder();

//                 -> quando criamos esse objeto, podemos passar tres opcoes, ou passar uma String,  ou uma sequencia de caracteres ou int capacidade, se nao passarmos nada ele ira criar uma StringBuilder para capacidade de 16 caracteres, caso passamos dos 16 caracteres ele ira dobrar a capacidade.

//                 -> como eles nao sao a mesma coisa nao podemos mais associar diretamente como: sb = nome; , isso ira dar erro, nao podemos tambem adicionar dessa forma sb = "kayque", isso tambem ira dar erro.

//                     -> Adicionamos atraves do metodo append, ele e sobrecarregado para todos os tipos primitivos, podemos passar boolean, char, int... que ira retornar um StringBuilder

//                         ex: sb.append("Kayque");
//         }

//         --> agora vamos ver um exemplo pratico:

//         public class StringBuilderTeste{
//             public static void main(String[] args){
//             StringBuilder sb = new StringBuilder("Kayque");

//             System.out.println(sb); 
//                 // -> se colocarmos aqui ira imprimir, porque? porque ele tem o metodo to.String dentro do StringBuilder que ira retornar o valor que esta dentro do String.
            
//             sb.append(" Allan"); --> Funciona como um concat 


//             System.out.println(sb); // ira retornar Kayque Allan, pois ele esta concatenando o valor dentro do StringBuilder.


//                 ---> Uma das razoes na qual a performace StringBuilder e bem maior que a da String e pela capacidade que a StringBuilder te oferece em fazer a mudanca da String sem precisar ficar alocando um novo espaco no pool de Strings, mas de certa isso aumenta um pouco a complexidade do codigo, porque? 


//             sb.append(" Allan").append (" Ribeiro"); // Teremos sempre que adicionar .append para se adicionar uma nova String, caso se coloque mutio, a visualizacao acaba ficando um pouco dificil.

//             }
//     }

//             --> Cuidados a se tomar: 

//             sb.substring(0, 3); 
//                 // ira retornar ainda "Kayque Allan Ribeiro", porque o retorno que o metodo substring da e do tipo String e nao StringBuilder.

//             para isso teriamos que fazer: 

//             String nome = sb.substring(0, 3); 
//                 // ira retornar "Kay", pois estamos pegando a substring do StringBuilder e passando para uma String.


            
//             --> Metodos que funcionam com StringBuilder:

//             sb.reverse(); // inverte a String

//             sb.delete(0, 3); // deleta a String que esta entre 0 e 3

//             sb.insert(0, "Kayque"); // insere a String "Kayque" na posicao 0

//             sb.replace(0, 3, "Kay"); // substitui a String que esta entre 0 e 3 por "Kay"

//             sb.length(); // retorna o tamanho da String







// CLASSES UTILITARIAS DATE

//     --> para se utilizar date, e so criar um novom objeto dessa classe, hoje em dia e pouco utilizado, a maioria dos metodos estao em depreciacao;

//     public class DateTeste{
//         public static void main(String[] args){

//             Date data = new Date(1_0000L); 

//             --> date trabalha em ms, ele tem dentro um Long, que representa os segundos de desde janeiro de 1970

//             System.out.println(data); // ira retornar Thu Jan 01 01:00:10 GMT 1970, pois conta a partir desta data em milisegundos;

//             Date data2 = new Date();

//             System.out.println(data2); // ira retornar a data atual do sistema.

//         }
//     }
            






// CLASSES UTILITARIAS CALENDAR

//     -> Foi a segunda classe criada para resolver os problemas da classe DATE;

//         obs: a classe calendar e uma classe abstrata, ou seja, nao podemos criar uma instancia dela;

//         classes date e classes calendar, sao utilizadas em sistemas legado; hoje em dia se usa coisas melhores;

//         // O Singleton é um padrão de projeto criacional que tem como objetivo garantir que uma classe tenha apenas uma única instância em toda a aplicação e fornecer um ponto de acesso global a essa instância. Ele é frequentemente usado quando é necessário um controle centralizado sobre algum recurso ou funcionalidade, como um gerenciador de configuração, cache, registro de logs, ou um gerenciador de conexão com o banco de dados.

//         public class CalendarTeste{
//             public static void man(String[] args){
//                 Calendar calendar = Calendar.getInstance();

//                     --> Assim que pegamos a instancia de Calendar; 
                    
//                 System.out.println(calendar); // ira retornar a data atual do sistema, mas em um formato diferente do que o Date retorna.

//                 para resolver isso podemos pegar, e fazer um hackzinho utilizando a classe Date.

//                 Date date = calendar.getTime();

//                 System.out.println(date); // ira retornar a data atual do sistema, mas em um formato diferente do que o Date retorna.

//                     --> Sendo assim podemos utilizar a data de acordo com o que precisamos.
//         }

//         Metodos de utilizacao nessa classe: 

//             calendar.getFirstDayOfWeek(); // retorna o primeiro dia da semana, dependendo da localizacao do seu sistema

//                 -> nos podemos fazer uma pequena logica nesse programa, sendo que dependendo de alguns paises temos o primeiro dia da semana como domingo e outros dias como segunda, podemos fazer o seguinte;

//                 if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
//                     //se compara as constantes que a classe calendar tem;

//                     System.out.println("Domingao e o primeiro dia ")
//                 }




//                 Tendo essas constantes podemos trabalhar com varias formasm, como por exemplo:

//                 calendar.get(Calendar.DAY_OF_MONTH); // retorna o dia do mes
//                 calendar.get(Calendar.DAY_OF_WEEK); // retorna o dia da semana
//                 calendar.get(Calendar.DAY_OF_YEAR); // retorna o dia do ano
//                 calendar.get(Calendar.MONTH); // retorna o mes
//                 calendar.get(Calendar.YEAR); // retorna o ano
//                 calendar.get(Calendar.HOUR); // retorna a hora
//                 calendar.get(Calendar.MINUTE); // retorna os minutos
//                 calendar.get(Calendar.SECOND); // retorna os segundos
//                 calendar.get(Calendar.MILLISECOND); // retorna os milisegundo


//                 -> Adicao de horas, minutos , dias ...: 

//                     calendar.add(Calendar.DAT_OF_MONTH, 1); // adiciona um dia
                    
//                     calendar.add(Calendar.HOUR, 1); // adiciona uma hora

                
//                 -> Setando valores:

//                     calendar.set(Calendar.DAY_OF_MONTH, 1); // seta o dia do mes para 1

//                     calendar.set(Calendar.MONTH, 1); // seta o mes para 1

//                     calendar.set(Calendar.YEAR, 2021); // seta o ano para 2021

//                     calendar.set(Calendar.HOUR, 1); // seta a hora para 1

//                     calendar.set(Calendar.MINUTE, 1); // seta os minutos para 1

//                     calendar.set(Calendar.SECOND, 1); // seta os segundos para 1

//                     calendar.set(Calendar.MILLISECOND, 1); // seta os milisegundos para 1

// }







// CLASSES UTILITARIAS DateFormat

//     -> E uma classe utilizada para formatacao de datas, uma classe que oferece metodos pre-definidos para formatar;

//         --> ! Uma classe abstrata onde nao pode ser instanciada

//         public class DateFormat{
//             public static void main(String[] args){
//                 Calendar  calendar = Calendar.getInstance();

//                 DateFormat[] df = new DateFormat[7];

//                 df[0] = DateFormat.getInstance();  --> Traz de acordo com a localizacao do sistema

//                 df[1] = DateFormat.getDateInstance(); --> Traz somente a data

//                 df[2] = DateFormat.getDateTimInstance(); --> Traz a data e a hora

//                 df[3] = DateFormat.getDateInstance(DateFormat.SHORT);  --> Traz a data no formato curto

//                 df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); --> Traz a data no formato medio

//                 df[5] = DateFormat.getDateInstance(DateFormat.LONG); --> Traz a data no formato longo

//                 df[6] = DateFormat.getDateInstance(DateFormat.FULL); --> Traz a data no formato completo

//                 for(DateFormat dateFormat : df){
//                     System.out.println(dateFormat.format(calendar.getTime()));

//                     // Imprime a data de acordo com o formato que foi passado
//                 }
            
//             }
//         }







// CLASSES UTILITARIAS INTERCIONALIZACAO DATAS COM LOCALE

//     -> Classe criada para trabalhar com intercionalizacao, feita para formatar tanto datas como moedas, numeros, baseado na preferencia do usuario ou de acordo com a localizacao da JVM dele;

//         public class LocaleTeste{
//             public static void main(String[] args){

//                 Calendar calendar = Calendar.getInstance();
//                 Locale localePT = new Locale("pt", "BR");

//                 --> Essa classe podemos criar objetos dela, e tem a possibilidade de trabalhar com diversos tipos dela, ela segue a formatacao, entao ela segue o padrao da ISOS, uma para definir a lingua e outra para definir o pais. 


//                 DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localePT);

//                     --> Isso faz com que a data seja formada de acordo com a localizacao, coloca a formato que seria FULL, e depois o locale que seria o localePT.

//                 System.out.println("Brazil " + df.format(calendar.getTime()));

//                     --> para printarmos fazemos o seguinte, pegamos a variavel de referencia para o objeto DataFormat, e chamamos o metodo format, passando o objeto calendar.getTime(), que ira retornar a data de acordo com a localizacao do sistema.
//             }  

//                 System.out.println(localePT.getDisplayCountry()); 
//                 // ira retornar Brazil, ou seja esta exibindo o pais de acordo com essa locale, mas esta exibindo de acordo com a lingua do sistema operacional padrao.      

//                 --> mas caso criamos uma instancia de Locale em Japao por exemplo, e fazer:

//                     System.out.println(localePT.getDisplayCountry(localeJP));
//                     // ira retornar Brasil, na lingua japonesa, ou seja ele ira retornar o pais de acordo com a lingua que foi passada no localeJP.


//                 System.out.println(Locale.getDefault()); 
//                 // ira retornar a localizacao do sistema operacional
//         }  






// CLASSES UTILITARIAS INTERCIONALIZACAO NUMEROS COM LOCALE

//         -> A classe NumberFormat ela e uma classe abstrata;
//             ex: NumberFormat nf = Number.getInstance();
        
//         public class NumberFormat{
//             public static void main(String[] args){
//                 Locale localeBR = new Locale("pt", "BR");
//                 Locale localeIT = new Locale("it", "IT");
//                 Locale localeJP = new Locale("jp", "JP");
//                 Locale localeUS = new Locale("us", "US");

//                 NumberFormat[] nf = new NumberFormat[4];
//                 //--> como iremos trabalhar com array utilizaos esse acima: 

//                 nf[0] = NumberFormat.getInstance(localeBR);
//                 nf[1] = NumberFormat.getInstance(localeJP);
//                 nf[2] = NumberFormat.getInstance(localeIT);
//                 nf[3] = NumberFormat.getInstance(localeUS);

//                 double valor = 10_000.2130;

//                 for(NumberFormat numberFormat : nf){
//                     System.out.println(numberFormat.format(valor));
//                 }

//                     -> podemos ver a formatacao de numeros de acordo com paises, utilizando Locale;
                
//             }
//         }






// CLASSES UTILITARIAS INTERCIONALIZACAO DE MOEDA COM LOCALE

//     --> E praticamente a mesma coisa que utilizamos antes,  a diferenca pr que antes utilizavamos getInstance() e agora utilizamos get.CurrencyInstance().

//     public class Money{
//         public static void main(String[] args){
//             Locale localePT = new Locale("pt, BR");
//             Locale localeUS = new Locale("en, US");
            

//             NumberFormat[] nf = new NumberFormat[4];

//             nf[0] = NumberFormat.getCurrencyInstance(localePT);
//             nf[0] = NumberFormat.getCurrencyInstance(localeUS);
//             //aqui poderiamos colocar outros locale, em outras formatacoes, para que seja exibido de acordo com o pais

//             double valor = 1_000;

//             for(NumberFormat moneyFormat : nf){
//                 System.out.println(moneyFormat.format(valor));

//             }            
//         }
//     }







// CLASSES UTILITARIAS SIMPLE DATE FORMAT
        
//     --> classe melhor para ajudar na formatacao de datas , ela oferece um pouco mais de flexibilidade do que a classe DateFormat, a maioria de classes de formatacao estao dentro da classe java.text ...


//     public class SimpleDateFormat{
//         public static void main(String[] args){
//             SimpleDateFormat sdf = new SimpleDateFormat(); 
//                 //-> classe nao e abstrata, podemos fazer instancias dela.

//                 -> ela e uma classe que tem como objetivo e trabalhar com a formatacao de datas, com um pouquinho mais de flexibilidade, a documentacao mostra que podemos utilizar a formatacao de acordo com as letras, cada letra tem seu significado. Baseado em uma data podemos transformar ele em diverrsos tipos de formato.

//                 // https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

//                 como exemplo: 

//                 String pattern = "dd/MM/yyyy 'at' HH:mm:ss";
//                 SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//                     System.out.println(sdf.format(new Date()));

//                         --> pegamos o objeto sdf e chamamos o metodo format, passando um objeto Date, e ele ira retornar a data formatada de acordo com o pattern que foi passado.
//         }
//     }






// CLASSES UTULITARIAS LOCALDATE 

//     -> classe nova do java 8, que veio para substituir a classe Date, ela e uma classe imutavel, e e muito mais facil de trabalhar com ela do que com a classe Date,

//     public class LocalDate{ 
//         public static void main(String[] args){
//             LocalDate date = LocalDate.of(2022, 10, 10);
//                 // -> para criar uma instancia de LocalDate, utilizamos o metodo of, passando o ano, mes e dia, da maneira que bem entender

//             LocalDate date2 = LocalDate.now(); 
//                 // -> para pegar a data atual do sistema, utilizamos o metodo now, que ira retornar a data atual do sistema.

//                 System.out.println(date.getYear()); // ira retorna o ano

//                 System.out.println(date.getMonth()); // ira retorna o mes
//                 System.out.println(date.getMonthValue()); // ira o valor do mes

//                 System.out.println(date.getDayOfWeel()); // ira retornar o dia da semana
                
//                 System.out.println(date.lengthOfMonth()); // ira retornar a quantidade de dias do mes

//                 System.out.println(date.isLeapYear()); // ira retornar se o ano e bissexto ou nao

//                 System.out.println(date.get(ChronoField.DAY_OF_MONTH)); // ira retornar o dia do mes. essa classes pode ser utiliza no lugar do getDayOfMonth.
                
//                 System.out.println();

//         } 
//     }   
    





// CLASSES UTILITARIAS LOCALTIME

//     -> Suegue os mesmo padroes da classe LocalDate, porem trabalha com horas, minutos e segundos.

//     public class LocalTime{
//         public static void main(String[] args){
//             LocalTime time = LocalTime.of(10, 20, 30);
//                 // -> para criar uma instancia de LocalTime, utilizamos o metodo of, passando a hora, minuto e segundo, da maneira que bem entender

//             LocalTime time2 = LocalTime.now();
//                 // -> para pegar a hora atual do sistema, utilizamos o metodo now, que ira retornar a hora atual do sistema.
                
//                 System.out.println(time); // ira retornar a hora que foi passada

//                 System.out.println(time2); // ira retornar a hora atual do sistema


//                 -> Metodos que podemos utilizar:

//                 System.out.println(time.getHour()); // ira retornar a hora

//                 System.out.println(time.getMinute()); // ira retornar os minutos

//                 System.out.println(time.getSecond()); // ira retornar os segundos

//         }
//     }






// CLASSES UTILITARIAS LOCALDATETIME

//     -> Essa classe e praticamente uma juncao das duas classes anteriores.

//         public class LocalDateTimeTeste{
//             public static void main(String[] args){
//                 LocalDateTime ldt = LocaDateTime.of(2022, 10, 10, 10, 20, 30);
//                     // -> para criar uma instancia de LocalDateTime, utilizamos o metodo of, passando o ano, mes, dia, hora, minuto e segundo, da maneira que bem entender

//                 LocalDateTime ldt2 = LocalDateTime.now();
//                     // -> para pegar a data e hora atual do sistema, utilizamos o metodo now, que ira retornar a data e hora atual do sistema.

//                     System.out.println(ldt); // ira retornar a data e hora que foi passada

//                     System.out.println(ldt2); // ira retornar a data e hora atual do sistema

//                     -> Metodos que podemos utilizar:

//                         System.out.println(ldt.getYear()); // ira retornar o ano

//                             -> esses metodos sao parecidos com os que vimos nas classes anteriores, porem agora temos a data e a hora juntas.
                            

//                         --> temos esse metodo abaixo onde temos um dia e podemos adicionar uma hora e tambem o inverso;

//                             LocalTime time = LocalTime.of(10, 20, 30);
//                             LocalDate date = LocalDate.of(2022, 10, 10);

//                             LocalDateTime ldt3 = date.atTime(time); // adiciona a hora a data
//                             LocalDateTime ldt4 = time.atDate(date); // adiciona a data a hora

//                             System.out.println(ldt3); // ira retornar a data e hora
//                             System.out.println(ldt4); // ira retornar a data e hora
//             }
//         }






// CLASSES UTILITARIAS INSTANT 

//     -> E uma classe parecida com a date, mas a diferenca e que a classe date trabalha com milisegundos a partir de 1 de janeiro de 1930, ja a date trabalha com nanosegundos;

//     public class Instant{
//         public static void main(String[] args){
//             Instant now = Instant.now();

//             System.out.println(now); 
//             System.out.println(LocaleDateTime.now());
                    
//             return: 
//                 2021-10-10T10:20:30.123Z
//                 2021-10-10T10:20:30.123

//                     --> a diferenca entre os dois e que o Instant mostra um 'Z' no final, que significa zuluTime ou UTC, que e o tempo universal(neutro), isso e muito util para quando trabalhamos com aplicacoes que precisa ser salva no banco de dados;

//                         -> vamos supor que voce salva a data no banco de dados de acordo de onde voce esta localizado, entao no meu horario e 'x horas', quando salvamos dessa forma, precisamos nos lembrar ou adicionar alguma coisa que nos representa nossa timeZone, se salvarmos dessa forma nao precisamos nos preocupar com isso, pois ele ja esta salvo de acordo com o tempo universal. 

//                     -> RESUMO: e que a classe Instant trabalha em nanosegundos, ja as outra nao, os metodos que temos sao os mesmos que temos nas outras classes, porem com a diferenca que trabalha em nanosegundos.
//         }
//     }






// CLASSES UTILITARIAS DURATION

//     -> A classe Duration e uma classe que foi criada para voce trabalhar com a quantidade de tempo, ela geralmente e utilizada para qquando voce quer pegar um intervalo entre duas datas, ela e baseada em segundos e nanosegundos.


//         public class DurationTeste{
//             public static void main(String[] args){
//                 LocalDateTime ld1 = LocalDateTime.now();
//                 LocalDateTime ldtNowAfter = LocalDateTime.now().plusYears(3);
//                     -> Precisamos de duas classes para saber a diferenca;

//                 LocalTime timeNow = LocalTime.now();
//                 LocalTime timeNow2 = LocalTime.now().minusHours(7);


//                 Duration entre = Duration.between(ld1, ldtNowAfter); // retorna a diferenca entre as duas datas

//                 System.out.println(entre); // ira retornar a diferenca entre as duas datas

//                 return: 
                     
//             }
//         }






// CLASSES UTILITARIAS PERIOD

//         --> A classe Period e uma classe que foi criada para voce trabalhar com a quantidade de tempo, ela geralmente e utilizada para quando voce quer pegar um intervalo entre duas datas, ela e baseada em anos, meses e dias.


//             public class PeriodTeste{
//                 public static void main(String[] args){
//                     LocalDate now = LocalDate.now();
//                     LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2);

//                         -> aceita somente LocalDate, nao aceita LocalDateTime, LocalTime, Instant, ela e baseada em anos, meses e dias.

//                     Period p1 = Period.between(now(), nowAfterTwoYears);

//                         System.out.println(p1); // ira retornar a diferenca entre as duas datas

//                     Period p2 = Period.ofWeeks(10); // retorna 10 semanas

//                         System.out.println(p2); // ira retornar 10 semanas

                       
//                 }
//             }






// CLASSES UTILITARIAS CHRONOUNIT 

//     -> Uma classe que tem varios metodos que padronizam as datas e periodos, e quando voce utiliza ela para pegar dias meses e anos e mais simples do que voce tivesse utilizando a LocalDateTime, uma classe bem pratica que ajuda no intervalo de datas ; 

//             java.time{

//             -> Duration = Para Hora;
//             -> Period = Para Datas;
//             -> Instant = Para Nanosegundos;
//             -> LocalDate = Para Datas, para nos seres Humanos;
//             -> LocalDateTime = Para Datas e Horas, para nos seres Humanos; 
//             -> LocalTime = Para Horas, para nos seres Humanos;
//             -> ChronoUnit = Para Datas e Horas, para nos seres Humanos;

//             }

//         public class ChronoUnit{
//             public static void main(String[] args){
//                 LocalDateTime aniversario = LocalDateTime.of(2005, Month.AUGUST, 15, 12 , 0,0);

//                 System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));  
//                 // retorna a quantidade de dias entre as duas datas

//                 System.out.println(ChronoUnit.WEEKS.between(aniversario, LocalDateTime.now()));
//                 // retorna a quantidade de semanas entre as duas datas

//                 System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
//                 // retorna a quantidade de meses entre as duas datas

                    
//             }
//         }






// CLASSES UTILITARIAS TEMPORALADJUSTERS

//     -> Ela e uma interface e so tem um metodo , e tem TEMPORALADJUSTERS que e uma classe que todos os metodos dessa classe sao estaticos, ou seja, isso e uma classe utilitaria, que foi criada para fazer ajustes no tempo, e e interessante que esses ajustes e diferente do nos estavamos trabalhando agora: 

//     -> 
//         public class TemporalAdjusters{
//             public static void main(String[] args){
//                 LocalDate now = LocalDate.now();

//                 now = now.plusDays(1); // adiciona um dia
//                     //-> a classe LocalDate e imutavel, entao para nos adicionarmos ou retirar algum valor, precisamos fazer uma associacao.

//                     --> QUAL E A DIFERENCA ENTRE WITH E PLUS: e que o plus se nos adicionarmos ele ira mudar todo o conjunto, ja com op with ele muda somente o que estamos especificando, sem mudar o resto.

//                 now = now.withDay(20); // seta o dia para 20


//                 System.out.println(now); // ira retornar a data de amanha

//                 System.out.println(now.getDaysOfWeek()); // ira retornar o dia da semana

//             }
//         }


//         -> Agora vamos ver um outro exemplo, para sabermos quando que sera um proximo dia
//         public class TemporalAdjusters{
//             public static void main(String[] args){
//                 LocalDate now = LocalDate.now();


//                 now = LocaDateTime.now.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)); 
//                     // ira retornar a data do proximo domingo.

//                     --> ! entre os metodos colocamos os prints para vermos o que esta acontecendo.

//                 now = LocaDateTime.now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)); 
//                 // ira retornar a data de hoje, caso seja domingo, caso nao seja ira retornar a data do proximo domingo.

//                 now = LocaDateTime.now.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)); 
//                 // ira retornar a data do ultimo domingo.

//                 now = LocaDateTime.now.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY)); 
//                 // ira retornar a data de hoje, caso seja domingo, caso nao seja ira retornar a data do proximo domingo.

//                 now = LocaDateTime.now.with(TemporalAdjusters.firstDayOfMonth()); 
//                 // ira retornar a data do primeiro dia do mes.

//                 now = LocaDateTime.now.with(TemporalAdjusters.lastDayOfMonth());
//                 // ira retornar a data do ultimo dia do mes.

//                 now = LocaDateTime.now.with(TemporalAdjusters.firstDayOfNextMonth());
//                 // ira retornar a data do primeiro dia do proximo mes.

//                 now = LocaDateTime.now.with(TemporalAdjusters.firstDayOfYear());
//                 // ira retornar a data do primeiro dia do ano.

//             }
//         }





//         --> exercicio para saber o proximo dia util do mes;

//         public class TemporalAdjusters{
//             public static void main(String[] args){
//                 LocalDate now = LocalDate.now();

//                 now = now.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));

//                 if(now.getDayOfWeek().getValue() == 6 || now.getDayOfWeek().getValue() == 7){
//                     now = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
//                 }
//             }
//         }






// CLASSES UTILITARIAS ZONEDDATETIME ZONELD OFFSETDATETIME
    
//         -> serve para trabalhar com zonas e datas ao mesmo tempo.

//         public class ZoneTest{
//             public static void main(String[] args){
//                 System.out.println(ZoneID.systemDefault());
//                     // ira retornar a zona do sistema

//                 ZoneID euaZone = ZoneID.of("America/New_York");
//                     // ira retornar a zona de New York, e necessario adicionar a zona correta se nao ira dar uma Exception 

//                 LocalDateTime ldt = LocalDateTime.now();

//                 System.out.println(now);
//                     -> Com essa zona nos podemos utilzar o LocalDateTime para trocar nosso horario, se imprimirmos isso ira retornar a data e hora de acordo com o padrao, como podemos ver ele nao te oferece nenhum tipo de zona, mas podemos atraves do ZoneDateTime: 

//                 ZonedDateTime zoneDateTime = now.atZone(euaZone);
//                     -> como ele e imutavel temos que adicionar ha uma variavel para que possamos ver o resultado, quando adicionamos falamos agora que nao e mais um localDateTime, agora ele e um zoneDateTime.

//                 System.out.println(zoneDateTime);
//                     -> ira retornar a data e hora de acordo com a zona que foi passada, mas ira imprimir sendo a data + a hora + a zona, sendo separado, se quisermos fazer de uma vez so, podemos fazer o seguinte:

//                 Istant nowInstant = Instant.now();

//                 ZonedDateTime zdt = nowInstant.atZone(euaZone);
//                     -> o interessante dessa classe e que ela trabalha com o zulo time, se fizermos dessa forma ele ira retornar tambem um zoneDateTime, mas a diferenca e que ele vai trazer ja aplicado o horario da zona que foi passada.


//             }
//         }






// CLASSES UTILITARIAS DATETIMEFORMATTER

//         -> Classe utilizada para formatacao

//         -> precisamos lembrar que toda vez que estamos trabalhando com formatacao que a palavra "format" significa que voce esta transformando do seu objeto para uma String, e todas as vezes que vemos a palavra "parse" voce esta transformando de uma String para um objeto.

//         exemplo: 

//             public class DateFormatterTeste{
//                 public static void main(String[] args){
//                     LocalDate date LocalDate.now();

//                     date.format(/*Vemos que aqui dentro podemos colocar varios tipos */);

//                     exemplos: 

//                     String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE); 
//                     // ira retornar a data no formato basico

//                     String s2 = date.format(DateTimeFormatter.ISO_DATE); 
//                     // ira retornar a data no formato ISO

//                     String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); 
//                     // ira retornar a data no formato ISO local

//                     System.out.println(s1 + " " + s2 + " " + s3); 
//                     // vai imprimir as formatacoes 



//                     agora vamos supor que temos uma String e queremos transformar ela em um objeto: lembramos que temos que tomar cuidado e utilizar o mesmo padrao que voce utilizou para formatar em String , exemplo: 

//                     LocalDate parse1 = LocalDate.parse("20210219");
//                         -> Se fizermos dessa forma ele ira dar uma excecao, pois o java nao sabe como formatar essa data, entao temos que passar o padrao que foi utilizado para formatar essa data, exemplo:

//                     LocalDate parse2 = LocalDate.parse("2021-02-19", DateTimeFormatter.BASIC_ISO_DATE);

//                         -> Se fizermos dessa forma ele ira retornar a data que foi passada, pois ele sabe como formatar essa data.

                    

//                     --> Formatacao de datas 

//                     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//                         -> aqui passamos o modelo desejado de acordo com o que queremos, e depois passamos para o objeto que queremos formatar.

//                     String formatBR = LocalDate.now().format(formatter);
//                         -> aqui passamos o objeto que queremos formatar, e chamamos o metodo format, passando o formatter que queremos.

//                     System.out.println(formatBR);
//                         -> ira retornar a data formatada de acordo com o que foi passado no formatter.


//                     --> agora aqui podemos fazer o parse de uma data que esta em String para um objeto:

//                     LocalDate parseBR = LocalDate.parse("20/02/2021", formatterBR);
//                         -> aqui passamos a data que esta em String, e chamamos o metodo parse, passando a data e o formatter que queremos.

//                     System.out.println(parseBR);
//                         -> ira retornar a data que foi passada, porem formatada de acordo com o formatter que foi passado.




//                     --> Podemos fazer a formatacao na lingua que queremos, para isso temos que passar o locale que queremos, exemplo:

//                     DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
//                         -> aqui passamos o modelo desejado de acordo com o que queremos, e depois passamos para o objeto que queremos formatar, e passamos o locale que queremos.


//                     String formatGR = localDate.now().format(formatterGR);
//                         -> aqui passamos o objeto que queremos formatar, e chamamos o metodo format, passando o formatter que queremos.

//                     System.out.println(formatGR);
//                         -> ira retornar a data formatada de acordo com o que foi passado no formatter.
//                 }
//             }






// CLASSES UTILITARIAS RESOURCEBUNDLE

//     -> e uma forma que voce tem de intercionalizar a suas mensagens, 






COLECOES EQUALS 

    -> O que e colecoes: e um conjunto de objetos, que sao armazenados em uma unica variavel, e que podem ser acessados atraves de um indice ou de uma chave, e que podem ser acessados de forma sequencial ou aleatoria.

    -> public class EqualsTest{
        public static void main(String[] args){
            String nome = "Kayque Allan";
            String nome2 = "Kayque Allan";
            String nome3 = new String("Kayque Allan");

            System.out.println(nome == nome2); --> retorna true 

            System.out.println(nome == nome3); --> retorna false, porque temos "kayque allan" dentro do pool de String, mas temos o new String no heap de memoria, olhando para esse dois valores sabemos que esta correto, mas o java nao entende que estao corretos, porque o java foi desenvolvido para trabalhar dessa forma.


                    -> para que retorne true, temos que fazer o seguinte:


            System.out.println(nome.equals(nome2)); --> retorna true, o equals vai trabalhar no que foi definido, ele vem da classe objetcts que idependente de sobrescrever ou nao, ele vai fazer a sobrescrita do equals para comparar se essas duas variaveis de referencias sao iguais.

        }
    }

    --> Exemplo 2:

    ->  public class Smartphone{

            private String serialNumber;
            private String marca;

            public Smartphone(String serialNumber, String marca){
                this.serialNumber = serialNumber;
                this.marca = marca;
            }

            public void setSerialNumber(String serialNumber){
                this.serialNumber = serialNumber;
            }

            public String getSerialNumber(){
                return serialNumber;
            }

            public void setMarca(String marca){
                this.marca = marca;
            }

            public String getMarca(){
                return marca;
            }

        }

        -->  com essa classe agora podemos voltar la para classe teste, sendo que vamos supor que temos dois Smartphones iguais, onde vamos tentar fazer a comparacao:  
    }



    public class EqualsTest{
        public static void main(String[] args){
            Smartphone s1 = new Smartphone("1ABC1", "Apple");
            Smartphone s2 = new Smartphone("1ABC1", "Apple");

            System.out.println(s1.equals(s2)); 
                --> quando comparamos esses dois valores, se voltarmos la na classe Object vamos ver que ele esta comparando se o valor de memoria  = objeto, se executarmos o equals teste ele ira retornar false;
                
                    - porque? nos temos os dois objetos que possui o mesmo serialNumber e mesma marca, mas a diferenca e que temos duas variaveis de referencia que uma e "s1" e outra e "s2", quando utilizamos o equals que vem do objetcts ele vai comparar se o esse(s1) valor em memoria(objeto em memoria) e igual a esse(s2).

                    - entao a variavel de referencia que s1 esta fazendo referencia esta fazendo referencia para o mesmo objeto que s2? e isso que estamos comparando. e como ele esta fazendo referencia para dois objetos distintos ele vai retornar false.

                    ou seja: 

                        s1 --> "1ABC1" e s2 --> "1ABC1" 

                            -> para que funcionasse o s2 teria que fazer referencia para o mesmo objeto em memoria que s1;

                        s1 --> "1ABC1" <-- s2  "1ABC1"

                            -> agora sim ira retornar true, para fazermos isso temos que colocar ele em referenciando um mesmo objeto. 
                            
                ex: 
                
                    Smartphone s1 = new Smartphone("1ABC1", "Apple");
                    Smartphone s2 = s1;

                    System.out.println(s1.equals(s2)); 
                        --> isso agora ira retorna true, porque s2 esta fazendo referencia para o mesmo objeto em memoria que s1, entao ele vai retornar true.
                    

        }
    }






COLECOES EQUALS PT2

    -> precisamos falar para o java agora que todas as vezes que formos comparar dois objetos do tipo Smartphone precisa levar em consideracao o serialNumber deles, para isso sabemos que todo objeto e da classe objects com isso sabemos que podemos fazer a sobrescrita do metodo equalsl, 


    public class Smartphone{

            private String serialNumber;
            private String marca;

            public Smartphone(String serialNumber, String marca){
                this.serialNumber = serialNumber;
                this.marca = marca;
            }

            @Override
            public boolean equals(Object obj){

                -> com essas regras precisamos implementar o metodo equals, basicamente a primeira coisa que temos que fazer e verificar se o objeto e nulo, se objeto que estamos passando e recebemos em "Object obj" obviamente nos temos que retornar false;

                -> equals ira sempre ser executado a partir de um objeto, ou seja, o this sempre ira existir, o que estamos referenciando e o this como o "x.".

                - agora a implementacao, que verifica se objeto passado e null: 

                    if(obj == null) return false;

                - agora precisamos verificar se temos dois objetos iguais: 

                    if(this == obj) return true;

                - agora temos como parametro object, mas precisamos verificar se esse objeto faz parte do Smartphone.

                    if(this.getClass() != obj.getClass()) return false;

                - quando chegamos nessa linha temos certeza absoluta que o objeto e um celular entao podemos criar uma variavel de referencia para o objeto que estamos comparando, e fazer um cast para o objeto que estamos comparando. Após confirmar que obj é um Smartphone, fazemos o casting para transformar o tipo genérico Object em um tipo específico: Com isso, podemos acessar atributos como serialNumber e marca do objeto smartphone para compará-los com os do objeto atual (this).

                    Smartphone smartphone = (Smartphone) obj;


                - agora podemos fazer a comparacao dos objetos, e retornar o resultado: 

                    return serialNumber != null && serialNumber.equals(smartphone.serialNumber);

                        --> estamos chamando o .equals agora de uma String, e o que o equals da String faz? ele compara dois valores literais, ou seja, ele compara se o valor que esta dentro do serialNumber e igual ao valor que esta dentro do serialNumber do objeto que estamos comparando, se for igual ele retorna true, se nao for ele retorna false. 

                


                /*-> regra que precisamos seguir:

                    - Reflexivo: metodo equals precisa ser reflexivo, que significa que x.equals(x) tem que ser true para tudo que dor diferente de null

                    - Simetrico: para x e y diferentes de null, x.equals(y) == true logo, y.equals(x) == true

                    - Transitividade: para x,y, z diferentes de null, se x.equals(y) == true, e x.equals(z) true logo, y.equals(z) tem que ser == true

                    - Consistente: x.equals(x) sempre retorna true se x for diferente de null

                    - para x diferente de null, x.equals(null) tem que retornar false
                */ 
            }

            public void setSerialNumber(String serialNumber){
                this.serialNumber = serialNumber;
            }

            public String getSerialNumber(){
                return serialNumber;
            }

            public void setMarca(String marca){
                this.marca = marca;
            }

            public String getMarca(){
                return marca;
            }
        }




        resultado da sobrescrita do equals: 

        @Override
        public boolean equals(Object obj){
            if(obj == null) return false;

            if(this == obj) return true;

            if(this.getClass() != obj.getClass()) return false;

            Smartophone smartphone = Smartophone obj;

            return serialNumber != null && serialNumber.equals(smartphone.serialNumber); 
        } 







COLECOES HASHCODE 

    -> vamos falar sobre o irmao do equals que e o hashcode, que um mais um metodo do java tem para gente que vai trabalhar diretamente nas colecoes que irao trabalhar com hash, na ultima aula trabalhamos com equals agora sabemos dizer para o java como ele pode identificar que dois objetos sao iguais.

        o que e hash code? vamos imaginar que temos duas caixas, e essas duas caixas terao nome dentro dela, se pensarmos em trabalhar com arrays o problema seria fazer busca, exemplo se voce tem um array de 10 buscar voce ira fazer dentro dessas 10 buscas, mas se voce tem um array com 70 millions de posicoes fica complicado fazer uma busca, entao para solucionar esse problema de performace nos temos as colecoes que utilizam hash;

            - hash e um numero que voce gera, a logica para gerar existe diversas. 
            
            
            podemos usar como exemplo que cada letra seria um numero: a = 1, b = 2, c = 3...
            
            com isso poderiamos criar uma logica para que cada nome que fosse passado, ele iria gerar um numero, e esse numero seria o hash, e com isso poderiamos fazer uma busca mais rapida, porque ele iria buscar o hash e nao o nome: 
            
            ex: 
            
            bob = 2 + 15 + 2 = 19   
            alex = 1 + 12 + 5 + 24 = 42
            
            o hash e basicamente isso gerar um valor numerico para identificar seu valor, porem temos que tomar cuidado porque imagina que: 


            bob = 2 + 15 + 2 = 19   
            alex = 1 + 12 + 5 + 24 = 42
            dirk = 4 + 9 + 18 + 11 = 42

            --> agora temos dois nomes dentro da caixa que serao representados pelo hash 42, como que o java consegue se virar? como por exemplo eu peca o alex, o java vai fazer o seguinte irar rodar e pedir o hash 42, entrando dentro da caixa onde esta alocado esses dois valores, e agora como ira se diferenciar? para saber qual se deve retornar ele se utiliza o equals porque ele ira trazer o valor baseado no que definimos logicamente, basicamente hash e isso voce vai gerar um valor e esse valor ira ser gerado pelo java para indexar as colecoes e o equals caso voce tenha valores duplicados vai trazer aquele valor que voce esta procurando.






HASHCODE PT2 

      -> vamos sobrescrever o metodo do hashcode  
      
      /*public class Smartphone{

            private String serialNumber;
            private String marca;

            public Smartphone(String serialNumber, String marca){
                this.serialNumber = serialNumber;
                this.marca = marca;
            }

            @Override
            public boolean equals(Object obj){
                if(obj == null) return false;
                if(this == obj) return true;

                if(this.getClass() != obj.getClass()) return false;

                Smartphone smartphone = (Smartphone) obj;

                return serialNumber != null && serialNumber.equals(smartphone.serialNumber);

                        
            }
        */

            ----> AQUI: 

            @Override
            public int hashCode(){
                return super.hashCode();
            }

                -> temos algumas regras para implementarmos esse hashcode

                1 regra: se tivermos x.equals(y) == true, y.hashCode() == x.hashCode(), se falarmos que x e y sao iguais, entao o hashcode de x tem que ser igual ao hashcode de y, se x.equals(y) == true, y.hashCode() == x.hashCode() tem que ser verdadeiro.

                    - exemplos: se temos alex e alex o hashCode deles tem que ser exatamente o mesmo
                    
                2 regra : y.hashCode() == x.hashCode() nao necessariamente o equals de y.equals(x) tem que ser true, exemplo: se temos y.hashCode() == x.hashCode() nao necessariamente significa que y.equals(x) tem que retornar a mesma coisa, porque? 
                    
                    - digamos que estamos compararando o hashCode de alex e dirk e exatamente, mas nao significa que eles sao o mesmo objeto.


                3 regra: se x.equals(y) == false, o hashCode tem que ser diferente 

                4 regra: y.hashCode() != x.hashCode() x.equals(y) devera ser false, se o hashCode de y for diferente do hashCode de x, entao x.equals(y) tem que ser false. 



                como podemos fazer? 


                public int hashCode(){
                    return this.serialNumber.hashCode();
                        -> na propria classe String, ja tem a implementacao para fazer o calculo do hashcode, estamos dependendo do hashCode desenvolvidos pelos arquitetos do java, entao precisamos tambem verificar se ele e nulo, por caso seja teremos uma excecao de nullPointerException, precisamos verificar aqui se o serialNumber e diferente de null, se for diferente de null, ele ira retornar o hashcode do serialNumber, se for igual a null ele ira retornar 0, e isso e uma regra que temos que seguir, se o objeto e nulo ele tem que retornar 0, se o objeto nao e nulo ele tem que retornar o hashcode do objeto.
                }


                resumo: e um numero que ira ser gerado, de preferencia esse numero tera que ser unico para os objetos, quando estamos implementando o hashCode ele tem que dar um match no equals, o equals se estamos usando o serialNumber para verificar se dois objetos sao iguais, no hashCode() tambem teremos que utilizar o serialNumber para gerar o numero hash, nao importa se estamos gerando != algoritimos, o importante e o atributo que voce esta gerando e o mesmo utilizado la no equals.

                                
        /*
            public void setSerialNumber(String serialNumber){
                this.serialNumber = serialNumber;
            }

            public String getSerialNumber(){
                return serialNumber;
            }

            public void setMarca(String marca){
                this.marca = marca;
            }

            public String getMarca(){
                return marca;
            }
        }
    */






COLECOES COMPLEXIDADE 

    -> basicamente precisamos entender que as colecoes e um grupo de dados que pode ser dividido em diferentes classes, mas que eles se enquadram em duas categorias a "Ordered" (ordenados) e "Sorted" (sortidos), quando falamos que algo e ordenado geralmente o java utiliza a palavra que a colecao e ordenada quando ele consegue lembrar a ordem dos elementos onde eles deveriam estar, por exemplo: se estamos trabalhando do array, temos a posicao 0,1,2,3,4 ... o java lembra dessa ordem, entao um array ele e ordenado, quando falamos sortido, significa que a iteracao da ordem geralmente baseado no que voce pre-definiu, exemplo: um conjunto de nomes, onde queremos que ele seja sempre organizado em ordem alfabetica, entao todas as vezes que nos inserirmos em uma colecao, ela tera que se ajustar e ordenar os nomes em ordem alfabetica.

        --> quando trabalhamos com colecoes de dados precisamos levar em consideracao a performace, um conceito muito famoso seria o big O, que basicamente define a velocidade baseado no tipo de operacao que voce estar fazendo.

        --> quando falamos em colecao (seria colecao de dados ), ja a collection significa a interface collection, onde as classes implementam e temos tambem uma classe abstrata chamada collections, que seria como se fosse uma classe utilitaria que prove os metodos interessantes. temos tambem que tomar cuidado com a complexidade Big O, cada uma das colecoes que estamos trabalhando tem um nivel de dificudade para operacao, exemplo: adicionar, remover, procurar, verificar se existe...}







COLECOES LIST PT1

    -> vamos falar agora sobre listas, ela seria uma interface, e tambem proven de uma colecao ordenada, ou seja, sequencial. 


    public class ListTest{
        public static void main(String[] args){
            // List nomes = "podemos criar varios tipos de objetos aqui, mas o mais famoso e o ArrayList";

            -> o pacote collection e altamente coeso, normalmente trabalhamos orientado a interface, entao precisamos de um tipo para esse objeto, onde o mais famoso seria o ArrayList, e o mesmo, e basicamente um array que pode ser dinamicamente incrementado, ou seja, ele e por padrao se inicia com 16 posicoes, e ele pode ser aumentado, quando adicionamos valores, nao precisamos recriar o array, ele faz isso automaticamente por traz dos panos. 


            List nomes = new ArrayList();  -> esse modo era feito ate a versao 1.4 do java; 

            nomes.add("Kayque"); -> adiciona um nome na lista
            nomes.add(123);
            nomes.add("Kaypiraz"); 

            ("se vermos dentro de nome.add, vemos que ele esta pedindo um Objeto, entao qual objeto que temos aqui? nos nao sabemos, sabemos que tem String ali dentro mas o java nao sabe")

            for(Object nome: nomes){
                System.out.println(nome);
                    -> isso ira funcionar normalmente, ele ira imprimir tudo que coloquei acima, ele esta aceitando qualquer coisa e isso seria um problema, era isso que acontecia de problema ate a versao 1.4;

            }
            


            --> agora nas novas versoes eles adicionaram um novo tipo, forcaram em tempo de compilacao a definicao do tipo;

            List <String> nomes = ArrayList();

                - agora estamos forcando isso em tempo de compilacao a ser uma lista somente de Strings, agora se apertamos com control + P poderemos ver que agora o tipo que ele aceita e somente String, porque substituimos por String, isso foi feito para manter a compatibilidade retrativa com as outras versoes do java, a partir da versao 1.5 quando compilamos o codigo, em bytecode o java ira ver somente "List nomes = ArrayList()", mas em tempo de compilacao ele ira te forcar a colocar somente String, caso voce coloque um inteiro ele ira dar erro;


                - Esse objeto e um ArrayList ou seja uma lista, um array que pode ser incrementado em tamanho tecnicamente indefinido (enquanto existir memoria)

                for(String nome: nomes){
                    System.out.println(nome);

                    --> podemos colocar aqui agora que e do tipo String, porque o que estiver dentro dessa lista sera String;
                }

                
                -> como pegariamos algo com o for indexado? 

                    for(int i = 0; i < nomes.size(); i++){
                        System.out.println(nomes.get(i));

                        // -> pega o valor de acordo com o indice, e imprime o valor de acordo com o indice;
                    } 
                    
                    como isso nao e mais um array e sim um ArrayList teremos que utilizar agora o size() que ira retornar o tamanho;
        }
    }







COLECOES LIST PT2

    -> 


    public class ListTest{
        public static void main(String[] args){
        
           List <String> nomes = ArrayList();

            nomes.add("Kayque");
            nomes.add(123);
                         

                for(String nome: nomes){
                    System.out.println(nome);

                    -> O que acontece se colocarmos o nomes.add dentro do for? ele ira dar uma exececao, acontece por causa da forma que  o for funcionar, ele meio que ja tem um tamanho fixado na hora que voce comeca a iterar sobre ele o java ja sabe, nao podemos simplesmente alterar o tamanho pois "nomes" sinalizado dentro do for ja sabe o size;

                    nomes.add("Kaypiraz");  
                }
        
                for(int i = 0; i < nomes.size(); i++){
                    System.out.println(nomes.get(i));

                    nomes.add("Kaypiraz"); 
                    
                    --> para se utilizar dessa forma teremos que utilizar o for indexado, ele vai imprimir e adiocionar mais um, de dois vai aumentar para 3, a iteracao vai continuar i vai aumentar mais um e assim por diante, esse cara nunca ira parar de executar;
                } 
                    
                    !! nao tem como fazer dessa forma

                
                -> Temos que tomar cuidado na criacao de qualquer tipo de colecao o valor que estamos passando aqui <String> tem que ser obrigatoriamente um objeto por isso utilizamos Wrappers, 

                List <Integer> numeros = new ArrayList();  
                
                    --> dessa forma, e porque nao podemos criar colecoes com tipos primitivos? porque as colecoes chamam o equals e o hashcode internamente, como os tipos primitivos sao primitivos nao tem como existir um equals e um hashCode para tipos primitivos;




                --> Temos outros metodos interessantes tambem como: 


                @remove: 

                nomes.remove(0); 
                    --> ou remover pelo indice 

                nomes.remove("Kayque"); 
                     --> podemos passar diretamento o objeto, no caso uma String, atraves do equals ele ira remover o objeto que esta dentro da lista;


                @addAll: 

                --> passamos tudo de uma outra lista para dentro de uma outra lista,

                List <String> nomes1 = new ArrayList();
                List <String> nomes2 = new ArrayList();

                nomes.addAll(nomes2); 
                    -> todos os valores que estao dentro de nomes2 serao passados para dentro de nomes1, e nomes2 continuara com os valores que ele tinha antes, e nomes1 tera os valores de nomes2;


                @clear:

                nomes.clear(); 
                    -> limpa a lista, remove todos os valores que estao dentro da lista;
        }   
    }






COLECOES LIST PT3

    -> vamos trabalhar agora com uma lista voltada para o mundo real

    public class SmartphoneTest{
        public static void main(String[] args){
            Smartphone s1 = new Smartphone("1ABC1", "Apple");
            Smartphone s2 = new Smartphone("22222", "Pixel");
            Smartphone s2 = new Smartphone("33333", "Sansung");

            -> vamos supor que temos uma lista de smartphones, e queremos adicionar esses smartphones dentro dessa lista, como podemos fazer isso?

            List<Smartphone> smartphones = new ArrayList(6);
                --> Uma lista do tipo Smartphones;


            smartphones.add(s1);
            smartphones.add(s2);
            smartphones.add(s3);

            for(Smartphone smartphone: smartphones){
                System.out.println(smartphone);
            } 


                ---> o que queremos mostrar e o uso do equals, por exemplo digamos que temos aqui um quarto smartphone, e digamos por exemplo, voce tem esses tres valores acima guardados no banco de dados ai uma pessoa vai la e digita por exemplo em uma telinha o serial "22222", ta sendo inserido pelas pessoas, e queremos saber se esse smartphone existe naquela lista, como podemos fazer isso?  

                Smartphone s4 = new Smartphone("22222", "Pixel");

                atraves do metodo contains: 

                    smartphones.contains(s4);
                        -> onde ele retorna true ou false, para saber se aquele objeto existe dentro da lista;

                        e a mesma coisa que fazer: 

                    s4.equals(s2);
                        -> que tambem ira retornar true 


                -> temos outro metodo que e o indexOf, que traz o indice do objeto que voce esta passando

                smartphones.indexOf(s4);
                    -> ira retornar o indice do objeto que voce esta passando, se ele nao existir ele ira retornar -1;
        }
    }






COLECOES LIST PT4

    -> sortidos e ordenados

        public class ListSortTest{
            public static void main(String[] args){
                List<String> mangas = new ArrayList();

                mangas.add("Naruto");
                mangas.add("Pokemon");
                mangas.add("One Piece");
                mangas.add("Dragon Ball");
                mangas.add("Bleach");

                Collections.sort(mangas);
                    -> classe utilitaria onde os metodos sao todos estaticos, ele ira reorganizar a lista de forma em ordem alfabetica, pegamos a lista e fizemos um reodernamento um algoritimo de sortir e classificar e ordenar nossa lista

                for(String manga: mangas){
                    System.out.println(manga);
                        -> vai imprimir a lista
                }

            } 
        }


        -->  mas nem tudo esta certo, porque se tentarmos fazer dessa forma dentro de Smartophone ira dar erro porque temos dois atributos, e o java nao sabe qual ele deve ordenar;

        para isso vamos representar: 


           

        
        --> agora vamos para a classe de teste:

            public class MangaTeste{
                public static void main(String[] args){
                    List<Manga> mangas = new ArrayList();

                    mangas.add(new Manga(1L , "Naruto", 10.0));
                    mangas.add(new Manga(2L , "Pokemon", 20.0));
                    mangas.add(new Manga(3L , "One Piece", 30.0));
                    mangas.add(new Manga(4L , "Dragon Ball", 40.0));
                    mangas.add(new Manga(5L , "Bleach", 50.0));

                        -> agora precisamos orfernar, mas precisamos dizer para o java como ordernan a lista, so conseguimos fazer isso na classe "ListSortTest" a primeira acima nessa aula, porque a propria classe String implementa a interface Comparable, e a interface Comparable tem um metodo chamado compareTo, que basicamente ele compara um objeto com outro, e ele retorna um inteiro, se for 0 ele e igual, se for 1 ele e maior, se for -1 ele e menor, e a classe String implementa essa interface, e por isso conseguimos fazer dessa forma, mas a classe Manga nao implementa essa interface, entao precisamos fazer isso manualmente;
                }
            }


            ex: public class Manga interface Comparable<Manga>{
                -> onde precisamos passar tambem o tipo que seria manga, e tambem implementar o metodo compareTo;


                @Override
                public int compareTo(Manga manga){
            
                        -> REGRAS DESSE METODO: 

                            - se o retorno for 0, significa que os objetos sao iguais
                            - se o retorno for maior que 0, significa que o objeto que esta chamando e maior
                            - se o retorno for menor que 0, significa que o objeto que esta chamando e menor

                        ou seja: 

                        if(this.id < manga.getId()){
                            return -1;
                        }else if(this.id.equals(manga.getId())){
                            return 0;
                        }else{
                            return 1;
                        }


                    -> dessa forma nos implementando o metodo compareTo, conseguimos ordenar a lista de mangas, e agora podemos fazer o sort da lista de mangas, e ele ira ordenar de acordo com o que foi implementado no compareTo, e ele ira ordenar de acordo com o id, se for igual ele ira retornar 0, se for maior ele ira retornar 1, se for menor ele ira retornar -1, e dessa forma conseguimos ordenar a lista de mangas de acordo com o id;
             
                }
            }


            temos uma forma melhor de fazer isso, pois o id e um Long, que e um Wrapper, eles possui metodos que podemos utilizar, entao o Wrapper do Long, ja implementou o compareTo


            @Override
                public int compareTo(Manga manga){
                    
                    return this.id.compareTo(manga.getId());

                        -> estamos delegando a responsabilidade para o compareTo do Long, entao todo aquele codigo que tinhamos antes e reduzido para isso ai, mas quando nao poderiamos utilizar o compareTo dessa forma? quando estamos trabalhando com o tipo primitivo, entao por exemplo se quisermos organizar essa List por preco, dessa forma nao daria, pois ela e um tipo primitivo(double preco), pois ele nao tem metodos, tinhamos
                  
                }

                caso fosse por preco teriamos que fazer:

                return Double.valueOf(preco).compareTo(manga.getPreco());

                    -> dessa forma ele iria transformar o preco em um objeto, e iria chamar o compareTo do Double, e iria comparar os valores, e dessa forma iria ordenar a lista de mangas de acordo com o preco; se utiliza o valueOf, para o que for passado dentro do paramentro se transformar em um Wrapper;
            }


            RESUMO: 
                -> voce prove a implementacao da Comparable, em seguida voce precisa fazer a implementacao do compareTo, e dentro do compareTo voce precisa dizer como que voce quer ordenar, e depois disso voce pode chamar o sort, e ele ira ordenar de acordo com o que foi implementado no compareTo, sempre que possivel delegue as responsabilidades para dentro da classe do java;






COLECOES SORTING LITS COMPARATOR
    
    -> Sobre o sorteamento e ordenacao de listas, vamos falar sobre um problema comum depois de muito tempo de desenvolvimento, digamos que implementamos o comparable, e o compareTo esta retornando a lista de forma ordenada, mas ai vem um problema digamos que queremos trocar, ex: "nao queremos mais ordernar por nome, e sim por id", se tentarmos fazer isso e possivel que ocasione muitos problemas no codigo, digamos que quando temos o compareTo sendo executado de uma forma por todo sistema a outra forma que temos seria utilizar a Comparator; 

            -> que seria um interface que ira tambem fazer comparacao, mas a unica diferenca entre essa e a Comparable, e que essa nos temos o metodo compare() e voce nao utliza implementando em sua classe diretamente ou seja( implements Comparator), porque o sort espera um objeto que implementa a interface Comparable;


    como fazemos quando temos esses metodos especificos? 

    
        class MangaById implements Comparator<Manga>{
            @Override
            public int compare(Manga manga1, Manga manga2){
                return manga1.getId().compareTo(manga2.getId());

                -> exatamente a mesma regra que tinhamos no compareTo, porem como podemos ver nao estamos mais com o objeto manga, nos estamos com o  objeto MangaById, nesse caso nos temos acesso a dois, da mesma forma que nos fizemos la estamos fazendo aqui;
            }
        }

            public class MangaTeste{
                public static void main(String[] args){
                    List<Manga> mangas = new ArrayList();

                    mangas.add(new Manga(1L , "Naruto", 10.0));
                    mangas.add(new Manga(2L , "Pokemon", 20.0));
                    mangas.add(new Manga(3L , "One Piece", 30.0));
                    mangas.add(new Manga(4L , "Dragon Ball", 40.0));
                    mangas.add(new Manga(5L , "Bleach", 50.0));
                }


                agora em meu sort: 

                Collections.sort(mangas, new MangaById());
                    -> como funciona agora? queremos que o sort, ao inves de utilizar o comportamento padrao da classe Manga, que e fazendo a organizacao via nome, queremos que ele faca a organizacao via id, e e por isso que esse metodo e sobrecarregado, pois ele aceita um objeto que passa no test comprareTo, e ele dis que aceita somente objeto do tipo Manga, por isso passamos ao utilizar o implements Comparator<Manga>, quem vai se encarregar de chamar esse objeto e o java;
            }
            





COLECOES BINARY SEARCH 

    -> binary search retorna a posicao onde voce deveria inserir esse elemento caso ele nao exista;
    
    {

    public class BinarySearch{
        public static void main(String[] args){
            List<Integer> numeros = new ArrayList<>();

            numero.add(2);
            numero.add(0);
            numero.add(4);
            numero.add(3);

            -> binarySearch vai fazer uma busca na lista que nos passarmos e vai retornar para gente o indice caso encontre o que nos procuramos, mas caso nao encontre ele ira retornar algo seguindo essa regra: 
            
                --> //(-(ponto de insercao) -1), precisamos que a lista seja ordenada, podemos ter a ordem definida pelas classes wrapper ou por exemplo, caso tenha definido um comparator voce precisa passar esse comparator tambem, entao voce precisa passar obrigatoriamente uma lista que ja esteja ordenada, se nao o resultado nao pode ser confiado, entao antes de chamar o binarySearch voce precisa chamar o sort, para garantir que a lista esta ordenada;

            Collections.sort(numeros);

            System.out.println(Collections.binarySearch(numeros, 2));
                -> entao digamos que queremos procurar o numero 2, ele precisa da nossa lista, entao queremos achar dentro da nossa lista "numeros" a posicao 2, onde ira retornar o indice (1);


            --> agora o que acontece se passarmos dentro do binarySearch um numero que nao existe dentro da lista, ele ira retornar essa regra //(-(ponto de insercao) -1)?

            System.out.println(Collections.binarySearch(numeros, 1));
                
                -> entao ele ira retornar um numero positivo se e somente se ele encontrar o numero que voce esta procurando dentro da sua lista, se ele nao existir dentro da sua lista ele ira retornar de acordo com sua regra; pois por exemplo imagine que colocamos o 0 dentro da lista, e fazemos essa procura, com isso ele iria se encontrar no indice 0, e se nao existisse essa regra o numero nao encontrado tambem se apareceria com indice 0, para isso nao ocorrer foi criado essa regra;
        }
    }

    exemplo 2: 

    public class BinarySearch2{
        public static void main(String[] args){
             List<Manga> mangas = new ArrayList();

                    mangas.add(new Manga(1L , "Naruto", 10.0));
                    mangas.add(new Manga(2L , "Pokemon", 20.0));
                    mangas.add(new Manga(3L , "One Piece", 30.0));
                    mangas.add(new Manga(4L , "Dragon Ball", 40.0));
                    mangas.add(new Manga(5L , "Bleach", 50.0));

            -> digamos que queremos fazer a busca, primeiro passo a se fazer e a ordenacao: 

            Collections.sort(mangas);

            Manga mangaToSearch = new Manga(2L, "Kaypiraz", 2.99);

            System.out.println(Collections.binarySearch(mangas, mangaToSearch));

            -> aqui estamos colocando que queremos dentro da lista de mangas que ele ache o objeto mangaToSearch, isso ira retornar a posicao dele;

        }


        -> agora caso nos tivessemos feito uma ordenacao customizada e nao tivessemos passado o comparator, ele iria dar erro, porque ele nao iria saber como ordenar, entao precisamos passar o comparator, e para isso precisamos passar o comparator dentro do binarySearch, e ele ira fazer a busca de acordo com o comparator que foi passado;


        exemplo: 


        List<Manga> mangas = new ArrayList();
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();

                    mangas.add(new Manga(1L , "Naruto", 10.0));
                    mangas.add(new Manga(2L , "Pokemon", 20.0));
                    mangas.add(new Manga(3L , "One Piece", 30.0));
                    mangas.add(new Manga(4L , "Dragon Ball", 40.0));
                    mangas.add(new Manga(5L , "Bleach", 50.0));


            mangas.sort(mangaByIdComparator);

            Manga mangaToSearch = new Manga(2L, "Kaypiraz", 2.99);

            System.out.println(Collections.binarySearch(mangas, mangaToSearch));

            --> se colocarmos apenas dessa forma ele ira se perder pois a ordenacao esta customizada, precisamos passar o mesmo valor para a pesquisa;

            System.out.println(Collections.binarySearch(mangas, mangaToSearch ,mangaByIdComparator));

                -> agora dessa forma ele ira retornar o indice que o objeto esta dentro da lista;
    }






COLECOES CONVERSAO DE LISTA PARA ARRAYS E VICE VERSA

    public class ListaArrayConversao{
        public static void main(String[] args){
            List<Integer> numeros = new ArrayList<>();

            numeros.add(1);
            numeros.add(2);
            numeros.add(3);

            numeros.toArray();
                -> ele ira retornar um array de objetos;

            ou 

            Integer[] integers = numeros.toArray(new Integer[0]);
                -> ele pede um array de objeto, que podemos utilizar dessa forma:
                
                
            System.out.println(Arrays.toString(integers));
                -> ele ira imprimir o array de objetos;

            -> agora temos um array com a mesma posicao que temos dentro de um array list;


                --> agora vamos fazer o contrario, vamos pegar um array e transformar em uma lista;

                Integer[] numerosArray = new Integer[3];

                numerosArray[0] = 1;
                numerosArray[1] = 2;
                numerosArray[2] = 3;

                List<Integer> arrayToList = Arrays.asList(numerosArray);
                    -> ele ira retornar uma lista de objetos;


                system.out.println(Array.toString(numerosArray));    
                system.out.println(arrayToList);

                    numerosToArray.set(0, 12);

                        -> se fizermos isso, ambos os array serao alterados para a posicao 0 com o valor 12, pois o Array.asList cria um link com o array original, e isso fica mais complicado ainda se tentarmos adicionar um valor, que ira dar um erro, pois nao podemos fazer alteracoes seja adicionando quando criamos um array atraves do Arrays.asList;


                    - e como fariamos para alterar? como podemos criar um cara desse que permite fazer alteracoes?

                        podemos fazer da seguinte forma: 

                    List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));

                    numerosList.add(15);  --> nao ira dar erro;
                        
                        -> O arrayList construtor e sobrecarregado, podemos passar um valor sendo a capacidade inicial ou  podemos passar uma outra colecao, dessa forma ele ira criar uma nova lista, e nao ira criar um link com o array original, e dessa forma podemos fazer alteracoes, adicionar, remover, etc;



                    - E como podemos passar diretamente varios valores ao array list, sem precisar toda hora criar um add: 

                        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

                            -> assim ele ira criar, e adicionar a uma lista, e dessa forma podemos fazer alteracoes, adicionar, remover, etc;

                        A partir da versao 11, criou-se uma nova forma atraves do : 

                        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);

                            -> que seria a mesma coisa, cria-se uma lista imutavel que pode ser passada a ser mutavel ;

                    
                    

            
        }
    }






COLECOES ITERATOR 
    
    -> vamos ver como podemos remover dados de uma lista;

    // utilizando a mesma classe Manga, so que agora adicionamos um novo atributo, no video ele cria um construtor sobrecarregado para receber o id

     public class Manga interface Comparable<Manga>{
                private Long id;
                private String nome;
                private double Preco;
                private int quantidade;

                public Manga(Long id, String nome, double preco){
                    Objects.requireNonNull(id,, "Id nao pode ser nulo");
                    Objects.requireNonNull(nome);
                    Objects.requireNonNull(preco);

                    this.id = id;
                    this.nome = nome;
                    this.preco = preco;
                    this.quantidade = quantidade;
                }

                public void setId(Long id){
                    this.id = id;
                }

                public Long getId(){
                    return id;
                }

                public void setNome(String nome){
                    this.nome = nome;
                }

                public String getNome(){
                    return nome;
                }

                public void setPreco(double preco){
                    this.preco = preco;
                }

                public double getPreco(){
                    return preco;
                }

                @Override
                public String toString(){
                    return "Manga{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + "}";
                }

                @Override
                public boolean equals(Object obj){
                    if(obj == null) return false;
                    if(this == obj) return true;
                    if(this.getClass() != obj.getClass()) return false;

                    Manga manga = (Manga) obj;

                    return id != null && id.equals(manga.id);
                }

                @Override
                public int hashCode(){
                    return id.hashCode();
                }

                @Override
                public int compareTo(Manga manga){
                    return this.nome.compareTo(manga.getNome());
                }
            }


    -> agora vamos no teste

        public class IteratorTeste{
            List<Manga> mangas = new ArrayList();
                
            mangas.add(new Manga(5L , "Naruto", 10.0, 0));
            mangas.add(new Manga(1L , "Pokemon", 20.0, 5));
            mangas.add(new Manga(4L , "One Piece", 30.0, 0));
            mangas.add(new Manga(3L , "Dragon Ball", 40.0, 2));
            mangas.add(new Manga(2L , "Bleach", 50.0, 0));

            for(Manga mangas: mangas){
                if(manga.getQuantidade() == 0){
                    mangas.remove(manga);
                    
                    -> se tentarmos fazer dessa forma ira dar erro;
                }
            
            - outra forma de remover seria utilizando o iterator: 

            Iterator<Manga> mangaIterator = mangas.iterator();

                -> o que e iterator? e uma classe que meio que checa antes de fazer alguma acao, imagine que estamos no banco olhando a fila do banco, voce e o iterator, a fila do banco e os mangas, voce precisa de olhar alguem na fila, voce antes de chamar alguem da fila voce vai olhar, voce vai olhar para fila de novo para depois apontar o dedo e voce vem ca tambem: 
                
                    - entao o iterator vai fazer isso: 

                while(mangaIterator.hasNext()){
                    if(mangaIterator.next().manga.getQuantidade() == 0){
                        mangaIterator.remove();
                    }

                    -> dessa forma consiguir remover de uma forma segura por causa do hasNext; 
                }

                com o java 8 veio uma nova forma de remover atraves do: 

                - mangas.removeIf();
                    --> para se utilizar precisamos de uma variavel de referencia, da mesma forma que o do foreach, tanto faz o nome, quem vai fazer a navegacao dos elementos sera o proprio removeIf;

                
                    ex: mangas.removeIf(manga -> manga.getQuantidade() == 0);

                        -> explicacao: queremos que utilize "manga" como variavel de referencia e a logica de negocio ira ir depois da seta(a seta e obrigatoria), dessa forma estamos falando, navega por todo os mangas e remove se voce achar que a quantidade e igual a 0, e dessa forma ele ira remover todos os mangas que tiverem a quantidade igual a 0;

                               
            }
        }






COLECOES SET HASHSET 

    -> primeiramente vamos mostrar a vantagem de trabalhar orientado a interface, antes estavamos trabalhando com ArrayList, mas existe uma outra possibilidade por new LinkedList<>(); , se trocamos o exemplo de antes por isso daria no mesmo resultado, o LinkedList ele nada mais nada que um Array onde cada uma das posicoes do array sabe sobe a posicao anterior e a proxima,  a vantagem de utilizar um LinkedList, de acordo com o Big o , ele possui um percentual melhor de desempenho em questao de remocao, se voce utiliza bastante remocao na lista seria mais vantagem utilizar o LinkedList; 


    Set

    public class SetTeste{
        public static void main(String[] args){

            Set<Mangas> mangas = new HashSet<>();

            -> a vantagem do set e que ele nao permite elementos duplicados dentro da colecao, e podemos criar um objeto do tipo HashSet<>(); significa que essa e uma colecao que permite apenas elementos unicos e esses elementos serao organizados pelo hash, ou seja, na tem como garantir como esses caras vao estar dentro da nossa lista, porque ele pode se ajustar com base no que nos nos inserirmos, entao vamos imprimir;
            
            mangas.add(new Manga(5L , "Naruto", 10.0, 0));
            mangas.add(new Manga(1L , "Pokemon", 20.0, 5));
            mangas.add(new Manga(4L , "One Piece", 30.0, 0));
            mangas.add(new Manga(3L , "Dragon Ball", 40.0, 2));
            mangas.add(new Manga(3L , "Dragon Ball", 40.0, 2));
            mangas.add(new Manga(2L , "Bleach", 50.0, 0));
            
            mangas. -> veremos que nao possui indice "ex: mangas.get ", porque o set ele nao e indexado, nao tem como pegar get(0), voce precisa navegar sobre a colecao e voce pode utilizar o foreach 

            for(Manga manga : mangas){
                System.out.println(manga); 

                -> ao imprimir podems ver que a forma impressa foi totalmente diferente da sequencia passada, e que se formos dentro da Classe manga, podemos ver que a logica como o metodo hashCode(); faz para gerar um hash e guardar dentro da colecao;

            
                - o que acontece se coloca um objeto duplicado dentro da colecao?

                    la em cima duplicamos o "dragon ball", se imprimirmos poderemos ver que apenas um foi impresso, porque? antes de inserir ele ira checar dentro do metodo equals, por isso e importante do ter o metodo equals sobrescrito na sua classe pois ele ira garantir que voce nao ira adicionar elementos duplicados; 


                se quisermos que seja os elementos fique da forma de ordenacao de como foi criado e so utilizar: 

                Set<Manga> mangas = new LinkedHashSet<>();
                    -> dessa forma ele ira seguir a ordem que foi inserido, e nao ira seguir a ordem do hash; 
            }
        }
    }





    
    /* COLECOES NAVIGABLESET TREESET 
    
    -> VER A OUTRA AULA E ESSA
    
    class SmartphoneMarcaComparator implements Comparator<Smartphone>{
        return o1.getMarca().compareTo(o2.getMarca());
    
            -> dessa forma ele ira comparar a marca do smartphone, e ira ordenar de acordo com a marca;
    }

    public class NavegleSetTeste{
        public static void main(String[] args){

            - e uma interface que estende a interface SortedSet, e o SortedSet estende o set, tudo e parte de um set que segue a mesma regra, significa que voce precisa obrigatoriamente nao inserir elementos duplicados, ele nao vai deixar atraves da utilizacao do equals para saber se aquele elemento ja existe dentro do set, ele adiciona alguns metodos para pegar elementos baseado em posicoes existententes;}

            NavigableSet<Smartphone> set = new TreeSet<>(SmartphoneMarcaComparator);
                -> as classes que vemos com esse nome tree, normalmente vao trabalhar diretamente com a parte do sort, ou seja, precisam que as classes que estamos adicionando dentro dessa colecao tree, precisamos ter certeza que ela possui comparable.

            Smatphone smartphone = new Smarphone("123", "Apple");

            set.add(smartphone);
                -> veremos que ele ira dar erro, pois ele tenta verificar se o smartphone e um comparable, como ele nao e, ele lanca uma excecao, mas vamos supor que nao tenhamos acesso a classe smatphone e mesmo assim queremos adicionar;
            
        }

    }
    */






COLECOES MAP HASHMAP

    -> tenicamente o map nao e uma colletion, ele nao faz parte da linha de heranca da interface collection;


    public class MapTeste{
        public static void main(String[] args){
            Map<k , v>
                -> se entrarmos dentro da interface map, poderemos ver que ele pede primeiro uma chave(k) e valor(v), para cada chave voce tem um valor associado{

            Map<String, String> map = new HashMap<>();
                -> como tem hash no nome significa que ele vai ordernar as chaves baseado no hash, ou seja a ordem pode mudar conforme voce vai inserindo os elementos, e obrigatoriamente voce vai precisar do equals e o hashCode implementado, porque uma das primeira regra que voce tem no map, e que voce nao pode possuir chaves duplicadas, como adicionamos valores no map? 

            map.put("teklado", "teclado");
            map.put("mouze", "mouse");
            map.put("vc", "voce");
            map.put("vc", "voce2");

            - se tentarmos colocar a mesma chave e substituir o valor, ele continuara com a mesma chave e ira sobrescrever o valor, por isso que tem esse metodo: 

            putIfAbsent("vc", "voce2");
                -> se a chave nao existir ele ira adicionar, se existir ele nao ira fazer nada;

            
            - como fazemos para navegar? e imprimir esses valores? atraves do for normal existe duas opcoes, uma seria utilizando a navegacao via chave ou via valores, como sabemos para cada chave possuimos um valor, e se pegarmos todas essas chaves teremos elementos unicos, ou seja, a chave e um set;

            for(String key : map.keySet()){
                -> oq esse metodo faz e pegar todas a chaves de map;
            
                System.out.println(key + ": " + map.get(key));
                    -> dessa forma ele ira imprimir a chave e o valor;
            }

            ---------------------------------------------------------

            for(String values : map.values()){      
                System.out.println(values);
                    -> dessa forma ele ira imprimir apenas os valores;
            }


            ---------------------------------------------------------

                --> a primeira opcao pegamos somente a chave e a segunda somente o valor, agora existe uma terceira opcao para pegar os dois;

            for(Map.Entry<String, String> entry : map.entrySet()){

                -> basicamente temos o metodo entrySet, que nada mais e que um objeto que ira ter a chave e o valor, so que aforma de criar o for fica um pouco diferente, pois temos que colocar o tipo que ira retornar.tipo da chave/valor Map.Entry<String, String>, da um nome e chamamos map.entrySet(); dessa forma temos atravades da variavel entry a chave e o valor;

                System.out.println(entry.getKey() + ": " + entry.getValue());
                    -> dessa forma ele ira imprimir a chave e o valor;
            }


            se quisessemos manter a ordem de como nos inserimos os objetos basta na hora de criar, adicionar o linkedHashMap<>();

            Map<String, String> map = new LinkedHashMap<>();
                -> dessa forma ele ira manter a ordem de insercao, e nao ira mudar a ordem de acordo com o hash;            

        }
    }























SOLID

    -> Esses principios ajudam a escrever codigos mais limpos, porque eles separam responsabilidades, porque diminuem o acoplamento, facilitando na refatoracao e estimulando o reaproveitamento de codigo;

        S - Single Responsability Principle
        O - Open / Closed Principle
        L - Liskov Substitution Principle
        I - Interface Segregation Principle
        D - Dependency Inversion Principle


    Single Responsability Principle
        -> uma classe deve ter um e somente um motivo para mudar, esse principio diz que uma classe deve ser especializada em unico assunto e deve possuir uma unica responsabilidade, ou seja, a classe deve ter uma unica tarefa ou acao para executar; GOD CLASS(e nome dado as classes que possuem muitas responsabilidades);, usar o GodClass nao e algo muito legal;

    
    Open Closed Principle
        -> objetos ou entidades devem estar aberto para extensao, mas fechados para modificacao, quando um novo comportamento e recursos precisam ser adicionados em um software devemos extender e nao alterar o codigo fonte original;

    
    Liskov Substitution Principle
        -> uma classe derivada deve ser substituivel por sua classe base, ou seja, se S e um subtipo de T, entao os objetos do tipo T podem ser substituidos por objetos do tipo S, sem que seja necessario alterar as propriedades desse programa, ou seja, a classe derivada deve ser capaz de substituir a classe base sem quebrar o programa;

    
    Interface Segregation Principle
        -> onde uma classe nao deve ser forcada a implementar interface / metodos que nao irao utilizar, esse principio diz que e melhor criar interfaces mais especificas do que uma unica generica

    
    Dependency Inversion Principle
        -> diz que devemos depender de abstracoes e nao implementacoes, ou seja, modulos de alto nivel nao devem depender de modulos de baixo nivel, ambos devem depender da abstracao, e que abstracao nao deve depender de detalhe, detalhes devem depender de abstracoes, ou seja, devemos depender de interfaces e nao de classes concretas, Isso promove um design mais flexível e desacoplado, facilitando a manutenção e a escalabilidade do código;






PADROES DE PROJETO 

    design patterns: 
        estao relacionados a arquitetura e engenharia de software, os padroes de projeos estao iteiramente interligados ao paradgma de orientacao a objetos, os designer patternes sao solucoes elegantes ja prontas, pensadas e testadas de problemas que acontecem regulamente no dia dia do programador, focam na reutilizacao de solucoes, devem ser aplicados durante o processo de refatoracao;

            - padroes de criacao: trata da construcao de objetos e o de referencia, esse grupo e importante pois ele sustenta o principio, programe para interface, e nao para implementacoes; exemplos: Singletoon, factori method;

            - padroes estruturais: trata da relacao entre objetos, e como eles interagem entre si, para formarem grandes objetos complexos(grandes estruturas); exemplos: adapter, decorator, flyweight, proxy, bridge, composite;
            
            - padroes comportamentais: que trata da comunicacao entre os objetos, especialmente em termo de responsabilidades e algoritimos; exemplos: chain of responsibility, observer
;
