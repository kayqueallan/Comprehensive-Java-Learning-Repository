!! REVER ASSOCIACOES

!! Rever Modificador Final

!! rever toString


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






TIPOS PRIMITIVOS 


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



    --> explicacao: criamos uma classe carro onde possui atributos como nome, velocidade maxima, e velocidade limite de trafego em rua, pois na alemanha a partir de uma categoria de carros tem que ter um limitador de sua velociade mesmo que ela seja maior, ou seja o carro pode chegar a 300 km/h , mas existe um limitador que deixa ele chgar a somente 250;


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

        !!! temos que tomar bastante cuidado na utilizacao de heranca, porque quando utilizamos estamos acomplando altamente o codigo, e o melhor a se fazer e baio acoplamento e alta coesao;




    

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


    -->  para criarmos uma pessoa precisamos passar onome que no caso pode ser passado pelo construtor, e quando criamos um construtor em uma classe mae , por exemplo se para criar uma Pessoa precisamos de um nome, quem for um funcionario tambem ira precisar de um nome, entao precisamos chamar o contrutor da superclasse, na classe filha;

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
            super.imprir();
            System.out.println(this.salario);
        }
    }


    agora estamos dizendo que para criar um funcionario obrigatoriamente precisamos passar um nome;


    resum: quando criamos um construtor na classe mae e esse constrtutor agora tem argumento, precisamos modificar os construtores classe filha.






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

        --> velociadade limite era estatica e privada, a velocidade limite e algo que querememos que nao mude de forma alguma, existem certos tipos de atributos que voce nao quer que seja modificados e chamados de constantes, uma vez criado e permanecido daquele jeito ate parar o codigo e modificar novamente, e devinido pela palavra final.

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

            --> se tentarmos associar algum valor como o exemplo acima ira dar erro pois ja asociamos
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
            this.tipo = tipo
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

    mesmo que nao criamos, toda vez em que executamos enum e criado um construtor, quando colocamos dois valores inteiro dentro de pess-fisica e juridica, quando colocamos esses valores automaticamente estamos passando eles para o construtor


    public enum TipoCliente{
        PESSOA_FISICA(1),
        PESSOA_JURIDICA(2)

        private int valor;

        -> aqui podemos colocar de duas formas sendo final ou nao, e tambem sendo publico ou naol, caso seja publico nao necessitamos de um get

        --> podemos armazenar o valor dentro de uma variavel, e como regra nao podemos nao podemos colocar uma variavel antes da enumeracao;

        TipoCliente(int valor){
            this.valor = valor;
        }

        --> quando for inicialido a classe enumeracao, caso a pessoa passe um dos dois tipos ira passarr um valor, sendo 1 ou 2, quando os valores forem passado como iremos pegar ele? 

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

--> e outro ex: nao precisamos nos limitar ao valor passado de rempresentacao, podemos colocar tabem do tipo String 
    
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


    -> Seguinte problema: imaginamos que temos duas oopcoes credito e debito mas precisamos dar descontos especificos em ambos, mas nao queremos fazer if dentro do codigo ;

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


     --> abstract : quando colocamos isso na classe significa que agora ela vai ser como um templete, ou seja, nao podemos mais criar algo como concreto, normalmente quando trabalhamos com abstract definiminos o que nao for abstrato de concreto, no nosso caso agora funcionario e e abstrato, entao nao podemos mais instanciar a classe funcionario, nao podemos mais ter um objeto do tipo funciario, teremos que criar agora somente objetos que extendem a classe funcionario

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
    
    
    
    
    
POLIMORFISMO 


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
        
        Criamos primeiramente uma classe abstrata produto, porque o produto em si nao deve existir entao nao podemos instanciar, apenas as subclasses derivadas de produtos, criamos depois duas classes Computador e tomate que extendem produto que consequentemente precisa utilizar o mesmo construtor, ai nos criamos a interface taxavel onde tem um unico metodo que se chama calcular imposto, quando chegamos agora na classe produto e vermos que Produto implements Taxavel estamos falando que agora produto e taxavel, consequentemente ele precisa implementar o metodo calcularImposto();, entao demos Override no metodo dentro da classe computador e tomate, em seguida criamos um pacote de servico onde fica as regras de negocio e colocamos dois metodos para calcular o imposto de computador e tomate, recebendo como argumento computador e tomate respectivamente e criamos nosso teste. 

    --> CLOSE 






POLIMORFISMO --> VIRADO NO JIRAYA  -> SEQUENCIA DA ANALOGIA 

        
        para explicar vamos imaginar a analogia do controle remoto, vamos imaginar um controle da sansung criado em 2019 onde possui funcionalidade -> botao da netiflix e prime video, o controle remoto da samsung vai trabalhar com uma televisao da samsung, onde teremos a televisao com netiflix e prime video, temos nosso controle onde vai mandar o sinal para televisao, ou seja clicamos no botao e a televisao ira executar a acao, entao  no caso o controle e a variavel de referencia e o objeto e a televisao. 

        ex: Computador c = new Computador();
                variavel  = objeto 

        o que significa polimorfismo? significa que podemos trocar o tipo da variavel de refencia mas ainda ficar utilizando outros objetosm, isso so e aplicado na heranca.


        ex: do que temos acima, um controle criado em 2019 com dois botoes netflix e primeVideo, quando acionado se executa em uma televisao que possui netflix e primeVideo, mas porem saiu um novo modelo de televisao da samsung porem mais moderno, ou seja uma extensao, onde temos a netflix o prime mas tambem o youtube, porem ainda estamos utilizando o controle de 2019, entao o controle da sansung de 2019, pode fazer referencia ao objeto(televisao de 2020), vamo supor que estamos no objeto de televisao 2020, se clicarmos no botao do controle (netiflix) - > quem ira executar sera objeto televisao 2020, o mesmo acontecera para prime, ou seja o controle e responsavel por mandar o sinal e quem executa e o objeto televisao 2020, 
        
        -> baseado na variavel de referencia, e possivel acessar o youtube 2020? porque nao tem como chamar porque nao existe esse botao. 
        
        --> ate agora estavamos trabalhando com o mesmo tipo de variavel de refencia e objeto, mas podemos tambem, baseado nos exemplos anotados acima de tomate e computador();

        ex: 

        public class ProdutoTeste02{
            public static void main(String[] args){
                Prodotuto produto = new Computador("Ryzen 9", 3000);

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
                return this.valor = IMPOSTO_POR_CENTO;
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


    
