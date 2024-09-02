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
float idade2 = 12.0;

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
|| (OU);  --> MESMO QUE C TAMBEM





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

        --> vamos que supor que nesse codigo adicionamos mais um espaco no array ou seja colocar de tamanho 4, teriamos que trocar toda estrutura do for, para isso existe uma propriedade que diz seu tamanho chamada de langth ou seja podemos fazer assim.

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

        -- > para criar objetos sempre utilizamos a palavra new e em seguida o nome do objeto que voce quer criar

        //Variavel de referencia do tipo estudante e temos um objeto do tipo estudante,

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
    public static void main(Strinf[] args){
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

    public class Main(){
        public static void main(String[] args){
            Estudante estudante01 = new Estudante;


        }
    }

    -> classe Estudante

        public class Estudante{
            String nome;
            int idade;
            char sexo;
        
        --> podemos criar outra classe ou fazer aqui mesmo a impressao em um metodo;

        public void imprimir(){
            System.ou.println(estudante.nome);
        }
        }