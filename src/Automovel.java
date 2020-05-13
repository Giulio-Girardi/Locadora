
public class Automovel {

  private String placa;
  private int ano;
  protected double valorBase;
  protected double valorDiaria;
  private boolean disponivel;
  public Modelo modeloAutomovel;
  public Nacionalidade nacionalidade; //Injencao de dependencias

  Automovel(String placa) {
    this.placa = placa;
    disponivel = true;
  }

  public double getValorFixo() {
    return nacionalidade.getValorFixo(getValorBase());
  }

  public double getValorBase() {
    return valorBase;
  }

  

  public double getValorDiaria() {
    return valorDiaria;
  }


  public void setValorDiaria(double valorDiaria) {
    this.valorDiaria = valorDiaria;
  }

  public Modelo getModeloAutomovel() {
    return modeloAutomovel;
  }


  public void setModeloAutomovel(Modelo modeloAutomovel) {
    this.modeloAutomovel = modeloAutomovel;
  }

  public Nacionalidade getNacionalidade() {
    return nacionalidade;
  }

  public void setNacionalidade(Nacionalidade nacionalidade) {
    this.nacionalidade = nacionalidade;
  }

  public void setValorBase(double valorBase) {
    this.valorBase = valorBase;
  }

  public Modelo getModelo() {
    return modeloAutomovel;
  }

  public String getPlaca() {
    return placa;
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public int getAno() {
    return ano;
  }

  public void setAno(int ano) {
    this.ano = ano;
  }

  public boolean isDisponivel() {
    return disponivel;
  }

  public void setDisponivel(boolean disponivel) {
    this.disponivel = disponivel;
  }

}
