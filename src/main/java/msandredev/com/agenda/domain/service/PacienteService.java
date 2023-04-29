package msandredev.com.agenda.domain.service;

import lombok.RequiredArgsConstructor;
import msandredev.com.agenda.domain.entity.Paciente;
import msandredev.com.agenda.domain.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class PacienteService {

    // Utilizando o @Transactional do Spring para não precisar utilizar o @Autowired
    private final PacienteRepository repository;

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listarTodos() {
        return repository.findAll();
    }

    public Optional<Paciente> buscarPorId(Long id) {
        return repository.findById(id);
    }
    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
