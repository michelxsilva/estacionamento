package rules;

import enums.TipoVeiculo;

public class RegraVeiculoFactory {

    public static RegraVeiculo criar(TipoVeiculo tipoVeiculo){
        return switch (tipoVeiculo){
            case CARRO -> new RegraCarro();
            case MOTO -> new RegraMoto();
        };
    }
}
