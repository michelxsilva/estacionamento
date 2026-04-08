
import enums.TipoVeiculo;
import service.EstacionamentoService;

import java.time.LocalDateTime;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {


        EstacionamentoService estacionamentoService = new EstacionamentoService();


        /*TipoVeiculo carro1 = TipoVeiculo.valueOf("CARRO");
        TipoVeiculo carro2 = TipoVeiculo.valueOf("CARRO");
        TipoVeiculo carro3 = TipoVeiculo.valueOf("CARRO");
        TipoVeiculo carro4 = TipoVeiculo.valueOf("CARRO");

        estacionamentoService.entrada(carro1, "OHO-9940", LocalDateTime.now());
        estacionamentoService.entrada(carro2, "OHO-9941", LocalDateTime.now());
        estacionamentoService.entrada(carro3, "OHO-9942", LocalDateTime.now());
        estacionamentoService.entrada(carro4, "OHO-3989", LocalDateTime.now());*/

        TipoVeiculo moto1 = TipoVeiculo.valueOf("MOTO");
        TipoVeiculo moto2 = TipoVeiculo.valueOf("MOTO");
        TipoVeiculo moto3 = TipoVeiculo.valueOf("MOTO");



        System.out.println(estacionamentoService.entrada(moto1, "PHP-4568", LocalDateTime.now()));
        System.out.println(estacionamentoService.entrada(moto2, "PYT-4568", LocalDateTime.now()));
        System.out.println(estacionamentoService.entrada(moto3, "NDS-4568", LocalDateTime.now()));
        System.out.println(estacionamentoService.entrada(moto1, "PHP-4568", LocalDateTime.now()));
        System.out.println(estacionamentoService.statusPermanencia("PHP-4568"));

        estacionamentoService.saida("PHP-4568", LocalDateTime.of(2026, 04, 07, 23, 59));
        System.out.println(estacionamentoService.statusPermanencia("PHP-4568"));
    }

}