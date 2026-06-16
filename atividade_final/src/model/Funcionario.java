package model;

public class Funcionario {

    private int id;
    private String nome;
    private String cargo;
    private double salario;
    private int faltas;

    public Funcionario(int id, String nome, String cargo, double salario, int faltas) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.faltas = faltas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public int getFaltas() {
        return faltas;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                ", faltas=" + faltas +
                '}';
    }
}

