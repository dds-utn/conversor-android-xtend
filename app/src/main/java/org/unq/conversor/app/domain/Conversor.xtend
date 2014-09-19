package org.unq.conversor.app.domain

class Conversor {
  public Double kilometros
  public Double millas

  val factorConversion = 0.62137119

  def convertir() {
    this.millas = this.kilometros * factorConversion
  }
}
