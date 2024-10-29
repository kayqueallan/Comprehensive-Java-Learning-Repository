!! REVER ASSOCIACOES


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


//CASTING 

double idade = 10.0;
float idade2 = 12.0F;

--> ocorrre um erro pois o compilador nao consegue indentificar o tamanho de espaco ocupado na memoria entao quando for declarar uma variavel float com depois um ponto ao final devemos colocar um 'F';

ex: 

float idade2 = 12.0F;


o CASTING e voce forcar um variavel a entrar na outra exemplo: 

long salarioNeymar = 100000000L;

int salarioCris = (int) 1000000000L;

ou seja eu forço esse numero a entrar na outra variavel cabendo ou nao e pode ser que o compilador corte alguns bits fazendo com que crie numeros estranhos, mais se realmente o tamanho na meio aceitar vai aparecer o numero normalmente.



//STRINGS 

COMECA COM LETRA MAIUSCULA PORQUE ELA PRECISA DE UM IDENTIFICADOR, e se inicia de aspas duplas;

ex: 

String nome = "Kayque Allan";


 
//OPERADORES

ELEMENTOS QUE PERMITEM FAZER OPERACOES 

ARITIMETICOS:

SOMA  = +;
MENOS = -;
DIVISAO = /;
MULTIPLICACAO = *; 


OPREDORES RELACIONAIS 

resto = % ; 

o porcetagem utilizamos para saber o resto da operacao

ex: 

int resto =  20 % 2;

isso resultara que o resto de operacao e 0;

OPERADORES BOOLEANOS

// <, > , <=, >=, !=, ==

retorna valores boleanos, verdadeiros ou falso

ex: 

boolean isDezMaiorQueVinte = 10 > 20;  
// --> para declarar uma variavel boolean e comum utilizar o is como a primeira palavra;

System.out.println(isDezMaiorQueVinte);

--> isso ira retornar false;


OPERADORES LOGICOS

&& (AND); --> IGUAL A C
|| (OUR);  --> MESMO QUE C TAMBEM



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





ARRAYS - VETORES 

--> para declarar um array em java precisar referenciar objeto em memoria e declarar o tamanho dos espacos:

int[] idades = new int[3];


a inicializao se nao conter nenhum valor dentro da string e de :

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



//METODOS

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

            --> 

            import dominio.Teste;

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


//PASSAGEM DE PARAMETRO DO TIPO REFERENCIA
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



    //THIS 

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


    //METODOS COM ARRAY

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

Outro tipo que podemos passar seria 



//MODIFICADORES DE ACESSO  

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


//GET

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



//SOBRECARGA DE METODOS 

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


//CONSTRUTORES


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

vamos supor qu8e temos agora que introduzir um novo atributo que seja "estudio", se apenas adicionarmos pode ser que quebramos o codigo inteiro, e tambem dar muito mais trabalho para alterar, o que podemos fazer e sobrecarga;

em metodos podemos utilizar o this.nomeDoMetodo, para chamar quando estiver dentro da mesma classe; ja em contrutores colocamos this();


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kayque",12,"Visual Studio");
        --> isso faz refenrencia ao contrutor 
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
  2 -   this();
   4 System.out.println(nome + episodio + estudio);
    }

    public Pessoa(String nome, int episodio, String estudio, String genero) {
1 -  this(nome, episodio, estudio);
    5 System.out.println(genero);
    }

        public Pessoa(){
3-   System.out.println("Hello World");
    }
}



// MODIFICADORES ESTATICOS 

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



--> explicacao: criamos uma classe carro onde possui atributos como nome, valocidade maxima, e velocidade limite de trafego em rua, pois na alemanha a partir de uma categoria de carros tem que ter um limitador de sua velociade mesmo que ela seja maior, ou seja o carro pode chegar a 300 km/h , mas existe um limitador que deixa ele chgar a somente 250;


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



// MODIFICADORES STATICOS - METODOS
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



    QUANDO DEVEMOS UTILIZAR OS METODOS ESTATICOS: quando nao tiver acessando atributos da instancia 


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

    -> 

    EX: 

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



--> ASSOCIACAO E PARECIDA COM A IDEIA DE BANCO DE DADOS: 


1. JOGADOR 1 -- 1 PERSONAGEM;
2. TIME 1 -- N JOGADORES;
3. JOGADOR N -- 1 TIME;
4. ESTUDANTE N -- N CURSO;

Associacao --> relacionamento entre objetos.




/ -> ASSOCIACAO UNIDIRECIONAL MUITOS PARA UM

associacao de um jogador e um time

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

imput.next().charAt(0); --> ou seja ler a primeira palavra, e dessa palavra somente o primeiro caracter que se contem na posicao 0 da string.


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

-> o sistema esta mapeando o mundo real para o mundo digital, vamos supor que criamos uma classe pessoa, onde contem: nome, cpf e idade; agora pela necessidade do sistema temos que criar a classe funcionario onde necessita dos memos atributos citatos so que mais um adicional de matricula, salario; nao e necessario criar uma outra classe e digitar os mesmos atributos, podemos utilizar o conceito de heranca; ou seja porque na vida real um funcionario e uma pessoa, o termo "tem" significa que voce tem um relacionamento entre eles por exemplo pesssoa tem um endereco, ja na heranca utiliza o "e", ou seja, o funcionario e uma pessoa; entao o funcionario e tudo que pessoa é , so que mais alguma coisa; uma extesao de funcionalidades de uma classe; e algo que extende as funcionalidades de uma pessoa sendo algo mais especializado



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

        !!! temos que tomar bastante cuidado na utilizacao de heranca, porque quando utilizamos estamos acomplando altamente o codig, e o melhor a se fazer e baio acoplamento e alta coesao;

    

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


    --> quando fizemos isso a IDE entende que estamos sobrescrevendo os metodos, que no classe a classe filha esta sobrescrevendo a super-classe;
}


--> no caso se executar esse codigo acima o resultado ira dar somente o salario que no caso esta contido na classe filha, porque agora esta mudado o comportamento do metodoque no caso esta contido na classe mais especifica, mas podemos executar os dois metodos sendo eles tendo o mesmo nome; 


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
        super.imprir();
        System.out.println(this.salario);
    }
}


--> ou seja ai estamos especificando que queremos que seja impresso todo resultado primeiro da classe pessoa e apos e executado a classe funcionario, ou seja execute primeiro o metodo da super classe e depois execute o metodo da classe filha, para isso utilizamos a palavra super,, que no caso estamos referindo ao objeto superclasse Pessoa, ai colocamos super.atributos_que_esta_sendo_importado;


->ex: super.imprime();


assim o resultado no console sera: 

- nome
- cpf
- idade
- salario



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
