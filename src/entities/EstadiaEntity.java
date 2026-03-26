package entities;

import enums.TipoVeiculo;

import javax.swing.*;
import java.time.LocalDateTime;

public class EstadiaEntity extends VeiculoEntity {
    private LocalDateTime entradaVeiculo;
    private LocalDateTime saidaVeiculo;

    public EstadiaEntity(

    ){
        super();
    }

    public EstadiaEntity(TipoVeiculo tipoVeiculo, String placa, LocalDateTime entradaVeiculo) {
        super(tipoVeiculo, placa);
        this.entradaVeiculo = entradaVeiculo;
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
}
