package service;

import entities.EstadiaEntity;
import interfaces.PagamentoInterface;

import java.time.LocalDateTime;

public class PagamentoCarroService implements PagamentoInterface {
    private Double precoHora = 5.0;
    private LocalDateTime horaSaida;
    private Double fracao;

    @Override
    public Double valorCobrado() {
        return 0.0;
    }
}
