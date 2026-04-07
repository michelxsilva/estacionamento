package entities;

import enums.StatusPermanencia;
import enums.TipoVeiculo;

import javax.swing.*;
import java.time.LocalDateTime;

public class EstadiaEntity  {
    private VeiculoEntity veiculo;
    private LocalDateTime entradaVeiculo;
    private LocalDateTime saidaVeiculo;
    private StatusPermanencia statusPermanencia;
    public EstadiaEntity(){}
    public EstadiaEntity(VeiculoEntity veiculo, LocalDateTime entradaVeiculo, StatusPermanencia statusPermanencia) {
        this.veiculo = veiculo;
        this.entradaVeiculo = entradaVeiculo;
        this.statusPermanencia = statusPermanencia;
    }

    public VeiculoEntity getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoEntity veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDateTime getEntradaVeiculo() {
        return entradaVeiculo;
    }

    public void setEntradaVeiculo(LocalDateTime entradaVeiculo) {
        this.entradaVeiculo = entradaVeiculo;
    }

    public LocalDateTime getSaidaVeiculo() {
        return saidaVeiculo;
    }

    public void setSaidaVeiculo(LocalDateTime saidaVeiculo) {
        this.saidaVeiculo = saidaVeiculo;
    }

    public StatusPermanencia getStatusPermanencia() {
        return statusPermanencia;
    }

    public void setStatusPermanencia(StatusPermanencia statusPermanencia) {
        this.statusPermanencia = statusPermanencia;
    }
}
