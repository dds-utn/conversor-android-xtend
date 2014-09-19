package org.unq.conversor.app.domain;

public class Conversor {
  private Double kilometros;
  private Double millas;

  public void convertir() {
    this.setMillas(this.getKilometros() * 0.62137119);
  }

  public Double getKilometros() {
    return kilometros;
  }

  public void setKilometros(double kilometros) {
    this.kilometros = kilometros;
  }

  public Double getMillas() {
    return millas;
  }

  private void setMillas(double millas) {
    this.millas = millas;
  }
}
