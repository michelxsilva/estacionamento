package entities;

import enums.TipoVeiculo;

public class VeiculoEntity {

    private TipoVeiculo tipoVeiculo;
    private String placa;

    public VeiculoEntity() {}

    public VeiculoEntity(TipoVeiculo tipoVeiculo, String placa){
        this.tipoVeiculo = tipoVeiculo;
        this.placa = placa;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
}
