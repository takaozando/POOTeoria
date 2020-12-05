package com.example.af_poo.service;

import java.util.List;
import java.util.Optional;

import com.example.af_poo.dto.VeiculoDTO;
import com.example.af_poo.model.Veiculo;
import com.example.af_poo.repository.VeiculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServise 
{
    @Autowired
    private VeiculoRepository repositorio;

    public Veiculo fromDTO(VeiculoDTO dto)
    {
        Veiculo veiculo = new Veiculo();
        veiculo.setValorDiaria(dto.getValorDiaria());
        return veiculo;
    }

    public List<Veiculo> getTodosVeiculos()
    {
        return repositorio.getTodosVeiculos();
    }

    public Veiculo getVeiculoPorId(int id)
    {
        Optional<Veiculo> op = VeiculoRepository..getVeiculoPorId(id);
        return op;
    }

    public Veiculo salvar(Veiculo veiculo)
    {
        return repositorio.salvar(veiculo);
    }

    public void removePorId(int id)
    {
        repositorio.remove(getVeiculoPorId(id));
    }

    public Veiculo atualizar(Veiculo veiculo)
    {
        getVeiculoPorId(veiculo.getId());
        return repositorio.atualizar(veiculo);
    }

}
