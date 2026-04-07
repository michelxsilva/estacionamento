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


    public void entrada(TipoVeiculo tipoVeiculo, String placa, LocalDateTime horaEntrada){

       if(tipoVeiculo.equals(TipoVeiculo.CARRO) && vagasCarro > 0 ){
           System.out.println("Vagas carros disponiveis " + vagasCarro);
           VeiculoEntity veiculo = new VeiculoEntity(TipoVeiculo.CARRO, placa);
           estadias.add(new EstadiaEntity(veiculo, horaEntrada, StatusPermanencia.ATIVA));
           vagasCarro--;
       }

       else if(tipoVeiculo.equals(TipoVeiculo.MOTO)&& vagasMoto > 0){
           System.out.println("Vagas motos disponiveis " + vagasMoto);
           VeiculoEntity veiculo = new VeiculoEntity(TipoVeiculo.MOTO, placa);
           estadias.add(new EstadiaEntity(veiculo, horaEntrada, StatusPermanencia.ATIVA));
           vagasMoto--;

       }
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





