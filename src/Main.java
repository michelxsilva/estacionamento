
import enums.TipoVeiculo;
import service.EstacionamentoService;

import java.time.LocalDateTime;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        EstacionamentoService estacionamentoService = new EstacionamentoService();


        TipoVeiculo carro1 = TipoVeiculo.valueOf("CARRO");
        TipoVeiculo carro2 = TipoVeiculo.valueOf("CARRO");
        TipoVeiculo carro3 = TipoVeiculo.valueOf("CARRO");
        TipoVeiculo carro4 = TipoVeiculo.valueOf("CARRO");

        estacionamentoService.entrada(carro1, "OHO-9940", LocalDateTime.now());
        estacionamentoService.entrada(carro2, "OHO-9941", LocalDateTime.now());
        estacionamentoService.entrada(carro3, "OHO-9942", LocalDateTime.now());
        estacionamentoService.entrada(carro4, "OHO-3989", LocalDateTime.now());


        estacionamentoService.estadiaAtiva("OHO-9940");

    }

}