import entities.EstadiaEntity;
import enums.TipoVeiculo;
import service.EstacionamentoService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        EstacionamentoService service = new EstacionamentoService();
        System.out.println("*** Estacionamento ***");

        TipoVeiculo carro1 = TipoVeiculo.valueOf("CARRO");
        service.registrarEntrada(carro1, "OHO-9940", LocalDateTime.now());

        TipoVeiculo carro = TipoVeiculo.valueOf("CARRO");
        service.registrarEntrada(carro, "OCU-8816", LocalDateTime.now());
        System.out.println("\n*** Veículos estacionados ***");
        for (EstadiaEntity entity : service.listarVeiculos()) {
            System.out.println("Placa: " + entity.getPlaca());
            System.out.println("Tipo: " + entity.getTipoVeiculo());
            System.out.println("Entrada: " + entity.getEntradaVeiculo());
            System.out.println("--------------------------");
        }



    }
}