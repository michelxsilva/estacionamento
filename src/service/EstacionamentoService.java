package service;

import entities.EstadiaEntity;
import entities.VeiculoEntity;
import enums.StatusPermanencia;
import enums.TipoVeiculo;
import rules.RegraCarro;
import rules.RegraVeiculo;
import rules.RegraVeiculoFactory;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class EstacionamentoService {
    private Integer vagasCarro = 3;
    private Integer vagasMoto = 2;
    private List<EstadiaEntity> estadias = new ArrayList<>();


    public void entrada(TipoVeiculo tipoVeiculo, String placa, LocalDateTime horaEntrada){
        if(validarEstadiaAtiva(placa)){
            System.out.println("Veículo já está no estacionamento!");
            return;
        }
        RegraVeiculo regra = RegraVeiculoFactory.criar(tipoVeiculo);
        if (!regra.vagaDisponivel(this)){
            System.out.println("Sem vagas disponiveis para " + tipoVeiculo);
            return;
       }

        VeiculoEntity veiculo = new VeiculoEntity(tipoVeiculo, placa);
        regra.ocuparVaga(this);
        estadias.add(new EstadiaEntity(veiculo, horaEntrada, StatusPermanencia.ATIVA));
        System.out.println("Entrada registrada com sucesso." + tipoVeiculo);

    }
    public void saida(String placa, LocalDateTime horaSaida){
            EstadiaEntity estadiaAtiva = null;
       for (EstadiaEntity e: estadias){
           if(e.getVeiculo().getPlaca().equalsIgnoreCase(placa) && e.getStatusPermanencia().equals(StatusPermanencia.ATIVA)){
            estadiaAtiva = e;
            break;
           }
       }
       estadiaAtiva.setSaidaVeiculo(horaSaida);
       estadiaAtiva.setStatusPermanencia(StatusPermanencia.ENCERRADA);
       RegraVeiculo regra = RegraVeiculoFactory.criar(estadiaAtiva.getVeiculo().getTipoVeiculo());
       regra.liberarVaga(this);
       System.out.println("Saída libera com sucesso!");

    }

    public boolean validarEstadiaAtiva(String placa){
        for (EstadiaEntity e: estadias){
            if(e.getVeiculo().getPlaca().equalsIgnoreCase(placa) &&
            e.getStatusPermanencia().equals(StatusPermanencia.ATIVA)){
                return true;
            }
        }
        return  false;
    }


    public Integer getVagasCarro() {
        return vagasCarro;
    }

    public void setVagasCarro(Integer vagasCarro) {
        this.vagasCarro = vagasCarro;
    }

    public Integer getVagasMoto() {
        return vagasMoto;
    }

    public void setVagasMoto(Integer vagasMoto) {
        this.vagasMoto = vagasMoto;
    }

    public List<EstadiaEntity> getEstadias() {
        return estadias;
    }

    public void setEstadias(List<EstadiaEntity> estadias) {
        this.estadias = estadias;
    }
}





