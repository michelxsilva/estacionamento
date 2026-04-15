package rules;

import entities.EstadiaEntity;
import service.EstacionamentoService;

public class RegraCarro extends RegraVeiculo {
    @Override
    public boolean vagaDisponivel(EstacionamentoService estacionamentoService) {
      return estacionamentoService.getVagasCarro() > 0;
    }

    @Override
    public void ocuparVaga(EstacionamentoService estacionamentoService) {
        estacionamentoService.setVagasCarro(estacionamentoService.getVagasCarro() - 1);
    }

    @Override
    public void liberarVaga(EstacionamentoService estacionamentoService) {
        estacionamentoService.setVagasCarro(estacionamentoService.getVagasCarro() + 1);
    }

    @Override
    public Double precoEstadia(EstadiaEntity entity) {
        return 0.0;
    }
}
