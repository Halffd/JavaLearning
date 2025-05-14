package com.half.javalearning.referencia;

/**
 * Class to demonstrate object references in Java
 * This example shows how multiple references can point to the same object
 */
public class Referencia {
    // Main class to demonstrate reference behavior
    public static void main(String[] args) {
        // Create student objects
        Aluno a1 = new Aluno("Carlos", 22);
        Aluno a2 = new Aluno("Ana", 20);

        // Display initial student information
        System.out.println("Nome do aluno a1 é " + a1.recuperarNome());
        System.out.println("Nome do aluno a2 é " + a2.recuperarNome());

        // Demonstrate reference reassignment - a1 now points to a2's object
        a1 = a2;
        System.out.println("Nome do aluno a1 é " + a1.recuperarNome());

        // Modify the object through a1 reference
        manipulaAluno(a1);

        // Show that changes affect both references since they point to the same object
        System.out.println("Nome do aluno a1 é " + a1.recuperarNome());
        System.out.println("Nome do aluno a2 é " + a2.recuperarNome());

        // Create a new reference pointing to a new object
        Referencia r = new Referencia();
        System.out.println("Demonstração concluída.");
    }

    /**
     * Manipulates a student object by changing its name
     * @param aluno The student object to be modified
     */
    public static void manipulaAluno(Aluno aluno) {
        // Change the student's name
        aluno.definirNome("Márcia");
    }
}

/**
 * Class representing a student with name and age
 */
class Aluno {
    private String nome;
    private int idade;

    /**
     * Constructor for creating a student with name and age
     * @param nome The student's name
     * @param idade The student's age
     */
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * Sets the student's name
     * @param nome The new name to assign
     */
    public void definirNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retrieves the student's name
     * @return The student's name
     */
    public String recuperarNome() {
        return this.nome;
    }

    /**
     * Retrieves the student's age
     * @return The student's age
     */
    public int recuperarIdade() {
        return this.idade;
    }
}
