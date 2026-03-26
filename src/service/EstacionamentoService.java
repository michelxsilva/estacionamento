package service;

import entities.EstadiaEntity;
import enums.TipoVeiculo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class EstacionamentoService {
    private Integer vagasCarro = 3;
    private Integer vagasMoto = 2;
    private Double precoCarro = 5.5;
    private Double precoMoto = 3.5;
    private List<EstadiaEntity> estadias = new ArrayList<>();


    public void registrarEntrada(TipoVeiculo tipoVeiculo, String placa, LocalDateTime entrada){

        if(tipoVeiculo == TipoVeiculo.CARRO && vagasCarro > 0) {
            EstadiaEntity entity = new EstadiaEntity(tipoVeiculo, placa, entrada);
            estadias.add(entity);
            vagasCarro--;
            System.out.println("Entrada carro registrada!");
            System.out.println("Tipo Veiculo: " + entity.getTipoVeiculo());
            System.out.println("Placa: " + entity.getPlaca());
            System.out.println("Data-Horario: " + entity.getEntradaVeiculo());
        }
        else if (tipoVeiculo == TipoVeiculo.MOTO && vagasMoto >0){
            EstadiaEntity entity = new EstadiaEntity(tipoVeiculo,placa,entrada);
            vagasMoto--;
            estadias.add(entity);
            System.out.println("Entrada moto registrada");
            System.out.println("Tipo Veiculo: " + entity.getTipoVeiculo());
            System.out.println("Placa: " + entity.getPlaca());
            System.out.println("Data-Horario: " + entity.getEntradaVeiculo());
        }
        else {
            System.out.println("Entrada não autorizada");
        }
    }

    public Double pagamentoCarro(TipoVeiculo tipoVeiculo, LocalDateTime entrada, LocalDateTime saida){
        long minutos = Duration.between(entrada, saida).toMinutes();
       if(tipoVeiculo == TipoVeiculo.CARRO && minutos <= 60) {
           return precoCarro;

       } else  {
           long minutoExcentes = minutos - 60;
           long fracoes = (long) Math.ceil(minutoExcentes / 15.0);
           return precoCarro + (fracoes * 2.5);

       }

    }
    public  List<EstadiaEntity> listarVeiculos(){
       return  estadias;
    }
}
