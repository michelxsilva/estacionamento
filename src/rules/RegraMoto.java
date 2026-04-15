package rules;

import entities.EstadiaEntity;
import service.EstacionamentoService;

public class RegraMoto extends RegraVeiculo{
    @Override
    public boolean vagaDisponivel(EstacionamentoService estacionamentoService) {
        return estacionamentoService.getVagasMoto() > 0;
    }

    @Override
    public void ocuparVaga(EstacionamentoService estacionamentoService) {
        estacionamentoService.setVagasMoto(estacionamentoService.getVagasMoto() - 1);
    }

    @Override
    public void liberarVaga(EstacionamentoService estacionamentoService) {
        estacionamentoService.setVagasMoto(estacionamentoService.getVagasMoto() + 1);
    }

    @Override
    public Double precoEstadia(EstadiaEntity entity) {
        return 0.0;
    }
}
