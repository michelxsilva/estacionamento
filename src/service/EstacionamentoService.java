package service;

import entities.EstadiaEntity;
import entities.VeiculoEntity;
import enums.StatusPermanencia;
import enums.TipoVeiculo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class EstacionamentoService {
    private Integer vagasCarro = 3;
    private Integer vagasMoto = 2;
    private List<EstadiaEntity> estadias = new ArrayList<>();


    public Integer entrada(TipoVeiculo tipoVeiculo, String placa, LocalDateTime horaEntrada){

        statusPermanencia(placa);
       if(tipoVeiculo.equals(TipoVeiculo.CARRO) && vagasCarro > 0 ){
           VeiculoEntity veiculo = new VeiculoEntity(TipoVeiculo.CARRO, placa);
           estadias.add(new EstadiaEntity(veiculo, horaEntrada, StatusPermanencia.ATIVA));
           vagasCarro--;
           return vagasCarro;
       }
          else if(tipoVeiculo.equals(TipoVeiculo.MOTO)&& vagasMoto > 0){
           VeiculoEntity veiculo = new VeiculoEntity(TipoVeiculo.MOTO, placa);
           estadias.add(new EstadiaEntity(veiculo, horaEntrada, StatusPermanencia.ATIVA));
           vagasMoto--;
           return vagasMoto;

       }
        else {  return  vagasMoto + vagasCarro;}
    }
    public EstadiaEntity saida(String placa, LocalDateTime horarioSaida){
        EstadiaEntity entity = new EstadiaEntity();
        StatusPermanencia statusPermanencia = statusPermanencia(placa);
        if(statusPermanencia == StatusPermanencia.ATIVA){
            for (EstadiaEntity e : estadias){
                e.setSaidaVeiculo(horarioSaida);
                e.setStatusPermanencia(StatusPermanencia.ENCERRADA);
                 vagasMoto++;
                return e;
            }

        } return entity;
    }

    public StatusPermanencia statusPermanencia(String placa){
        for (EstadiaEntity e : estadias){
            if (placa == e.getVeiculo().getPlaca()){
                return e.getStatusPermanencia();
            }
        }
        return StatusPermanencia.ENCERRADA;
    }



}





