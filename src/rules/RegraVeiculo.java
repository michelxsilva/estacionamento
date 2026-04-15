package rules;

import entities.EstadiaEntity;
import service.EstacionamentoService;

public abstract class RegraVeiculo {

    public abstract boolean vagaDisponivel(EstacionamentoService estacionamentoService);

    public abstract  void ocuparVaga(EstacionamentoService estacionamentoService);

    public abstract  void liberarVaga(EstacionamentoService estacionamentoService);

    public abstract  Double precoEstadia(EstadiaEntity entity);
}
